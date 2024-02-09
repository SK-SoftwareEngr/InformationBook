package com.saniya.informationbook;

public class ModelClass {
    private String imageName;
    private String category;

    public ModelClass(String imageName, String category) {
        this.imageName = imageName;
        this.category = category;
    }

    public String getImageName(){
        return imageName;
    }

    public String getCategory(){
        return category;
    }
}
