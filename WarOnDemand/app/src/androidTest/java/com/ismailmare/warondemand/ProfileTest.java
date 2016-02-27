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
        User profile = new User();
        String username = "user";
        String contactInfo = "780-2212";

        profile.createUser(username, contactInfo);
    }

    public void testReturnContactInfo(){
        User profile = new User();
        String username = "user";
        String contactInfo = "780-2212";

        profile.createUser(username, contactInfo);

        assertEquals(profile.returnContactInfo(), contactInfo);
    }

    public void testEditProfile(){
        User profile = new User();
        String username = "user";
        String contactInfo = "780-2212";
        String contactInfo2 = "780-2222";

        profile.createUser(username, contactInfo);

        profile.editUser(contactInfo2);

        assertEquals(profile.returnContactInfo(), contactInfo2);
    }



}
