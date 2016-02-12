package com.ismailmare.warondemand;

/**
 * Created by unkno on 2016-02-12.
 */

import android.app.Application;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ApplicationTestCase;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import junit.framework.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ItemTest extends ActivityInstrumentationTestCase2 {
    public ItemTest() {
        super(Application.class);
    }

    private void addItem(String testName,String testDesc) {
        //Simulate button click here.
    }
    private void deleteItem(String testName){
        //Simulate button click.
    }
    private void editItem(String newText){
        //Simulate button click.
    }
    private void viewItems(){
        //Simulate button click that views items.
    }

    public void testAddItem(){
        /*Intent intent = new Intent();
        TestActivity ta = (TestActivity) getActivity();
        int oldLength = ta.getAdapter().getCount();
        ArrayAdapter<WarItem> arrayAdapter = ta.getAdapter();
        addItem("Test name", "Test description");
        assertEquals(oldLength + 1, arrayAdapter.getCount());*/
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        items.add(warItem);
        assertTrue(items.hasItem(warItem));
    }
    public void testViewItems(){
        //Test will fail, because not properally integrated backend.
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        items.add(warItem);
        Intent intent = new Intent();
        setActivityIntent(intent);
        viewActivity ta = (viewActivity) getActivity();

        TextView textView = (TextView) ta.findViewById(R.id.intentText);
        assertEquals("The text should be displayed!", warItem.getName(), textView.getText().toString());
         //Unsure what to do here.

    }
    public void testViewItem() {
        //Not sure if correct.
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        items.add(warItem);
        WarItem returnedItem = items.getItem(0);
        assertEquals(returnedItem.getName(),warItem.getName());
        assertEquals(returnedItem.getDesc(), warItem.getDesc());
        assertEquals(returnedItem.getStatus(), warItem.getStatus());

    }
    public void testEditItem(){
/*        Intent intent = new Intent();
        TestActivity ta = (TestActivity) getActivity();
        ArrayAdapter<WarItem> arrayAdapter = ta.getAdapter();
        addItem("Test name", "Test description");
        int oldLength = ta.getAdapter().getCount();
        editItem("new Test");
        assertEquals(oldLength, arrayAdapter.getCount());
        assertEquals()*/
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        items.add(warItem);
        String editedText = "New Text";
        items.editItemName(editedText, 0);
        assertEquals(items.getItem(0).getName(), editedText);
    }
    public void testDeleteItem(){
/*        Intent intent = new Intent();
        TestActivity ta = (TestActivity) getActivity();
        int oldLength = ta.getAdapter().getCount();
        deleteItem("Test Name");
        ArrayAdapter<WarItem> arrayAdapter = ta.getAdapter();
        assertEquals(oldLength - 1, arrayAdapter.getCount());*/
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        items.add(warItem);
        items.delete(warItem);
        assertFalse(items.hasItem(warItem));
    }
    public void testSetReturn(){
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        warItem.setStatus("Borrowed");
        items.add(warItem);
        String editedText = "Available";
        items.editItemStatus(editedText, 0);
        assertEquals(items.getItem(0).getStatus(), editedText);
    }
    public void testOffline(){
        //Similar to AddItem.
        ItemList items = new ItemList();
        WarItem warItem = new WarItem("Test Item");
        //added when offline.
        //When online
        items.add(warItem);
        assertTrue(items.hasItem(warItem));
    }
}