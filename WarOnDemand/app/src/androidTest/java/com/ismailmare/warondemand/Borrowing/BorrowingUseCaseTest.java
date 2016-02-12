package com.ismailmare.warondemand.Borrowing;

import android.test.ActivityInstrumentationTestCase2;

import com.ismailmare.warondemand.Bid;
import com.ismailmare.warondemand.Profile;
import com.ismailmare.warondemand.Status;

/**
 * Created by ismailmare on 16-02-10.
 */
public class BorrowingUseCaseTest extends ActivityInstrumentationTestCase2{

    public BorrowingUseCaseTest(){
        super(com.ismailmare.warondemand.Borrowing.BorrowingUseCaseTest.class);
    }


    /** Use Case 19
     * 06.01.01
     */
    public void ViewBorrowedItems(){
        Profile chris = new Profile();
        Profile ismail =  new Profile();
        ismail.createProfile("ismail", "7802422122");
        chris.createProfile("chris","7802453455");

        //chris is the owner
        chris.getBids();
        chris.add("offered");

        Status status= new Status();
        Bid pendingBid = new Bid();
        ismail.getBids();
        ismail.add("offered");
        status.setStatus("declined");


        //assertEquals(ismail.getBids(), size(), 1);

    }


    /** Use Case 20
     * 06.02.01
     */
    public void ViewItemsBorrowed(){
        Profile chris = new Profile();
        Profile ismail =  new Profile();
        ismail.createProfile("ismail", "7802422122");
        chris.createProfile("chris","7802453455");

        //chris is the owner
        chris.getBids();
        chris.add("offered");

        Status status= new Status();
        Bid pendingBid = new Bid();
        ismail.getBids();
        ismail.add("offered");
        status.setStatus("declined");


        //assertEquals(ismail.getBids(), size(), 1);


    }


}
