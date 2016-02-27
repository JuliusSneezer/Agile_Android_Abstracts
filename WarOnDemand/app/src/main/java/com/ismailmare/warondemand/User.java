package com.ismailmare.warondemand;

import java.util.ArrayList;

/**
 * Created by Chris on 2/26/2016.
 */
public class User {
    String username;
    ArrayList<String> contactInfo; //email 1st, phoneNumber 2nd, something 3rd
    ArrayList<String> notifications;
    ArrayList<WarItem> inventory;
    ArrayList<WarItem> itemsBidOn;
    ArrayList<WarItem> itemsBorrowed;

    public void createUser(String name, String email, String phoneNumber) {
        //dummy function for tests
        username = name;
        contactInfo.add(0, email);
        contactInfo.add(1, phoneNumber);
    }

    public void editUser(String name, String email, String phoneNumber) {
        //dummy function for tests
        contactInfo.set(0, email);
        contactInfo.set(1, phoneNumber);
    }

    public ArrayList returnContactInfo() {
        return contactInfo;
    }

    public void addItemToInventory(WarItem itemAdded) {
        inventory.add(itemAdded);
    }

    public void addItemToBidOn(WarItem bidOnItem){
        itemsBidOn.add(bidOnItem);
    }

    public void removeItemFromInventory(WarItem itemAdded) {
        inventory.remove(itemAdded);
    }

    public void removeItemFromBidOn(WarItem bidOnItem){
        itemsBidOn.remove(bidOnItem);
    }

    public void addItemToBorrowed(WarItem borrowed){
        itemsBorrowed.add(borrowed);
    }

    public void returnItem(WarItem returned){
        itemsBorrowed.remove(returned);
    }

    //user finding their items that are being bid on
    public ArrayList pendingBids() {
        ArrayList<WarItem> itemsBeingBidOn = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++){
            if (inventory.get(i).getStatus() == "BidOn"){
                itemsBeingBidOn.add(inventory.get(i));
            }
        }
        return itemsBeingBidOn;
    }



    /*
    //all this shit was for early test cases, may use or not, will leave until clean up later
    public int getBids(){
        return 0;
    }

    public void add(String bid){
    }

    public int getAcceptedBids(){
        return 0;
    }

    public int getDeclinedBids(){
        return 0;
    }

    public int getPendingBids(){
        return 0;
    }

    public int size(){
        return 0;
    }

    public int getBorrowedItems(){
        return 0;
    }

    public int getItemsBorrowed(){
        return 0;
    }

    public String BidForItem(){
        return "hello";
    }
    */
}
