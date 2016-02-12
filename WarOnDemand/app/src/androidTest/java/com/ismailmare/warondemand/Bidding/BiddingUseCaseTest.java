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
        status.setStatus("offered");

        assertEquals(ismail.BidForItem(), "offfered");
        assertEquals(ismail.getBids(),1);

    }

    /**
     * Use Case = 13
     * 05.02.01
     * @return ArrayList
     */
    public void testPendingBids(){
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


        assertEquals(ismail.getPendingBids(),1);
        assertEquals(chris.getPendingBids(),1);

    }

    /**
     * Use Case 14
     * 05.03.01
     */
    public void testGetBidNotifications(){

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
        assertEquals(ismail.getBids(),1);

    }

    /**
     * Use Case 15
     * 05.04.01
     */
    public void testListItemsBidded(){
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
        assertEquals(ismail.getBids(),1);


    }



    /** Use Case 16
     * 05.05.01
     */

    public void testViewItemsBidded(){
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
        assertEquals(ismail.getPendingBids(),1);
        assertEquals(chris.getPendingBids(),1);

    }



    /**
     * Use Cases 17
     * 05.06.01
     */

    public void testAcceptBid(){
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

        assertEquals(chris.getPendingBids(),0);
        assertEquals(chris.getAcceptedBids(),1);



    }



    /**
     * Use Case 18
     * 05.07.01
     */

    public void testDeclineBid(){
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
        assertEquals(chris.getPendingBids(),0);
        assertEquals(chris.getDeclinedBids(),1);

    }

}
