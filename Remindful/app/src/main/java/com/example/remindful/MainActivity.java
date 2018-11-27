package com.example.remindful;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.remindful.adapter.CategoryAdapter;
import com.example.remindful.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private CategoryAdapter mAdapter;
    private List<Category> mCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting the recyclerview from xml
        mRecyclerView = (RecyclerView) findViewById(R.id.idRecyclerView);
        //mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //populate the products
        mCategoryList = new ArrayList<>();
        mCategoryList.add(new Category("Food", R.drawable.food));
        mCategoryList.add(new Category("Self Care", R.drawable.care));
        mCategoryList.add(new Category("Household", R.drawable.house));
        mCategoryList.add(new Category("Pets", R.drawable.pet));

        //set adapter to recyclerview
        mAdapter = new CategoryAdapter(mCategoryList, this);
        mRecyclerView.setAdapter(mAdapter);
    }
}
