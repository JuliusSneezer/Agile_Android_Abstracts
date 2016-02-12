package com.ismailmare.warondemand.Bidding;

import android.test.ActivityInstrumentationTestCase2;

import com.ismailmare.warondemand.Profile;
import com.ismailmare.warondemand.Bid;
import com.ismailmare.warondemand.Status;

/**
 * Created by ismailmare on 16-02-10.
 */
public class BiddingUseCaseTest extends ActivityInstrumentationTestCase2{

    public BiddingUseCaseTest(){
        super(com.ismailmare.warondemand.Bidding.BiddingUseCaseTest.class);
    }


    /**
     * Use Case 12
     * 05.01.01
     */
    public void testBidForItem(){
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

        //assertEquals(ismail.getBids(),size(),1);
        //assertEquals(ismail.getBids(),size(),1);

    }

    /**
     * Use Case = 13
     * 05.02.01
     * @return ArrayList
     */
    public void PendingBids(){
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


        //assertEquals(ismail.getBids(),size(),1);

    }

    /**
     * Use Case 14
     * 05.03.01
     */
    public void GetBidNotifications(){

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
        //assertEquals(ismail.getBids(),size(),1);

    }

    /**
     * Use Case 15
     * 05.04.01
     */
    public void ListItemsBidded(){
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
        //assertEquals(ismail.getBids(),size(),1);


    }



    /** Use Case 16
     * 05.05.01
     */

    public void ViewItemsBidded(){
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
        //assertEquals(ismail.getBids(),size(),1);

    }



    /**
     * Use Cases 17
     * 05.06.01
     */

    public void AcceptBid(){
        Profile chris = new Profile();
        Profile ismail =  new Profile();
        ismail.createProfile("ismail", "7802422122");
        chris.createProfile("chris", "7802453455");

        chris.getBids();
        chris.add("offered");

        Status status= new Status();
        ismail.getBids();
        ismail.add("offered");

        status.setStatus("accpeted");
        //assertEquals(ismail.getBids(),size(),1);


    }



    /**
     * Use Case 18
     * 05.07.01
     */

    public void DeclineBid(){
        Profile chris = new Profile();
        Profile ismail =  new Profile();
        ismail.createProfile("ismail", "7802422122");
        chris.createProfile("chris", "7802453455");

        //chris is the owner
        chris.getBids();
        chris.add("offered");

        Status status= new Status();
        Bid pendingBid = new Bid();
        ismail.getBids();
        ismail.add("offered");
        status.setStatus("declined");
        //assertEquals(ismail.getBids(),size(),1);

    }

}
