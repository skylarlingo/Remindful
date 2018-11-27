package com.example.remindful.model;

public class Category {
    public int categoryImage;
    public String categoryName;

    public Category(String categoryName, int categoryImage) {
        this.categoryImage = categoryImage;
        this.categoryName = categoryName;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int pCategoryImage) {
        this.categoryImage = pCategoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String pCategoryName) {
        this.categoryName = pCategoryName;
    }
}
