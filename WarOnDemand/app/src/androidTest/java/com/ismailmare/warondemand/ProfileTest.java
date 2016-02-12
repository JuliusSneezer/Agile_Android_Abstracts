package com.ismailmare.warondemand;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Chris on 2/11/2016.
 */
public class ProfileTest extends ActivityInstrumentationTestCase2 {

    public ProfileTest() {
        super(ProfileTest.class);
    }

    public void testCreateProfile() {
        Profile profile = new Profile();
        String username = "user";
        String contactInfo = "780-2212";

        profile.createProfile(username, contactInfo);
    }

    public void testReturnContactInfo(){
        Profile profile = new Profile();
        String username = "user";
        String contactInfo = "780-2212";

        profile.createProfile(username, contactInfo);

        assertEquals(profile.returnContactInfo(), contactInfo);
    }

    public void testEditProfile(){
        Profile profile = new Profile();
        String username = "user";
        String contactInfo = "780-2212";
        String contactInfo2 = "780-2222";

        profile.createProfile(username, contactInfo);

        profile.editProfile(contactInfo2);

        assertEquals(profile.returnContactInfo(), contactInfo2);
    }



}
