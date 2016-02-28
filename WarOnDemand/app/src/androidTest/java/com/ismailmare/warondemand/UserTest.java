package com.ismailmare.warondemand;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by Chris on 2/28/2016.
 */
public class UserTest extends ActivityInstrumentationTestCase2 {

    public UserTest() {
        super(UserTest.class);
    }

    public void testCreateUser() {
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-2212";

        user.createUser(username, email, number);
    }

    public void testReturnContactInfo(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-2212";

        user.createUser(username, email, number);

        ArrayList<String> contactInfo = new ArrayList<>();
        contactInfo.add(email);
        contactInfo.add(number);

        assertEquals(user.returnContactInfo(), contactInfo);
    }

    public void testEditProfile(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String email2 = "test2@something.com";
        String number = "780-1111";
        String number2 = "780-2222";

        user.createUser(username, email, number);
        user.editUser(username, email2, number2);

        ArrayList<String> contactInfo = new ArrayList<>();

        contactInfo.add(email2);
        contactInfo.add(number2);

        assertEquals(user.returnContactInfo(), contactInfo);
    }

    public void testAddItemToInventory(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToInventory(warItem);

        ArrayList<WarItem> test = new ArrayList<>();
        test.add(warItem);

        assertEquals(user.getItemsInInventory(), test);
    }

    public void testRemoveItemInInventory(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToInventory(warItem);
        user.removeItemFromInventory(warItem);

        ArrayList<WarItem> test = new ArrayList<>();

        assertEquals(user.getItemsInInventory(), test);
    }

    public void testAddItemToBidOn(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToBidOn(warItem);

        ArrayList<WarItem> test = new ArrayList<>();
        test.add(warItem);

        assertEquals(user.getItemsBiddingOn(), test);
    }

    public void testRemoveItemFromBidOn(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToBidOn(warItem);
        user.removeItemFromBidOn(warItem);

        ArrayList<WarItem> test = new ArrayList<>();

        assertEquals(user.getItemsBiddingOn(), test);
    }

    public void testAddItemToBorrowing(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToBorrowed(warItem);

        ArrayList<WarItem> test = new ArrayList<>();
        test.add(warItem);

        assertEquals(user.getBorrowedItems(), test);
    }

    public void testRemoveItemFromBorrowing(){
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        user.addItemToBorrowed(warItem);
        user.returnItemFromBorrowed(warItem);

        ArrayList<WarItem> test = new ArrayList<>();

        assertEquals(user.getBorrowedItems(), test);
    }

    public void testPendingBids() {
        User user = new User();
        String username = "user";
        String email = "test@something.com";
        String number = "780-1111";

        user.createUser(username, email, number);

        String itemName = "item";
        String itemDesc = "new item";
        WarItem warItem = new WarItem(itemName, itemDesc);

        String itemName2 = "item2";
        String itemDesc2 = "new item 2";
        WarItem warItem2 = new WarItem(itemName2, itemDesc2);

        user.addItemToInventory(warItem);
        user.addItemToInventory(warItem2);

        warItem.setStatus(1);

        ArrayList<WarItem> test = new ArrayList<>();
        test.add(warItem);

        assertEquals(user.pendingBids(), test);
    }

}
