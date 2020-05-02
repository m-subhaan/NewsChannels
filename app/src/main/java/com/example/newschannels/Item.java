package com.example.newschannels;

public class Item {
    private String name;
    private int image;

    public Item(String nam, int img)
    {
        this.name=nam;
        this.image=img;
    }

    public void setImage(int image){
        this.image=image;
    }
    public int getImage()
    {
        return this.image;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

}
