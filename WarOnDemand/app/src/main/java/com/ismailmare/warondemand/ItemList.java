package com.ismailmare.warondemand;

import java.util.ArrayList;

/**
 * Created by unkno on 2016-02-12.
 */
public class ItemList {
    private ArrayList<WarItem> items = new ArrayList<WarItem>();

    public void add(WarItem warItem){
        items.add(warItem);
    }
    public WarItem getItem(int index){
        return items.get(index);
    }
    public void delete(WarItem warItem){
        items.remove(warItem);
    }
    public boolean hasItem(WarItem warItem){
        return items.contains(warItem);
    }
    public void editItemName(String newText, int index){
        items.get(index).setName(newText);
    }
    public void editItemDesc(String newText, int index){
        items.get(index).setDesc(newText);
    }
    public void editItemStatus(String newText, int index){
        items.get(index).setStatus(newText);
    }
}
