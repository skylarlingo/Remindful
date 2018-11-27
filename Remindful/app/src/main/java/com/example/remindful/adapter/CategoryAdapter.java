package com.example.remindful.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.remindful.R;
import com.example.remindful.model.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{
    private List<Category> categoryList;
    Context context;

    public CategoryAdapter(List<Category> categoryList, Context context) {
        this.categoryList = categoryList;
        this.context = context;
    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflate the layout file
        View categoryView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_category_card, parent, false);
        CategoryViewHolder cvh = new CategoryViewHolder(categoryView);
        return cvh;
    }

    @Override
    public void onBindViewHolder(CategoryViewHolder holder, final int position) {
        holder.imageCategoryImage.setImageResource(categoryList.get(position).getCategoryImage());
        holder.txtCategoryName.setText(categoryList.get(position).getCategoryName());

        holder.imageCategoryImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String categoryName = categoryList.get(position).getCategoryName().toString();
                Toast.makeText(context, categoryName + " is selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        ImageView imageCategoryImage;
        TextView txtCategoryName;

        public CategoryViewHolder(View view) {
            super(view);
            imageCategoryImage = view.findViewById(R.id.idCategoryImage);
            txtCategoryName = view.findViewById(R.id.idCategoryName);
        }
    }
}
