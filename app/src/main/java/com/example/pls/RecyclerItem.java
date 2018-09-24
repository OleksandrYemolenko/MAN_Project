package com.example.pls;

import android.media.Image;

import java.util.ArrayList;
import java.util.List;

public class RecyclerItem {

    private String title;
    private String description;
    private int id;

    RecyclerItem(String title, String description) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public static List<RecyclerItem> getAlgosItem() {
        ArrayList<RecyclerItem> itemList = new ArrayList<>();

        itemList.add(new RecyclerItem("DFS", "Graph Search"));
        itemList.add(new RecyclerItem("DFp", "Graph Search1"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        itemList.add(new RecyclerItem("DFl", "Graph Search2"));
        return itemList;
    }
    public static List<RecyclerItem> getMathItem() {
        ArrayList<RecyclerItem> itemList = new ArrayList<>();

        itemList.add(new RecyclerItem("DFS", "Graph Search"));
        return itemList;
    }
    public static List<RecyclerItem> getPhysicsItem() {
        ArrayList<RecyclerItem> itemList = new ArrayList<>();

        itemList.add(new RecyclerItem("DFS", "Graph Search"));
        return itemList;
    }
}
