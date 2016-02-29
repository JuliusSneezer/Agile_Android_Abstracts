package com.ismailmare.warondemand;

import android.os.AsyncTask;
import android.util.Log;
import com.google.gson.Gson;
import com.searchly.jestdroid.DroidClientConfig;
import com.searchly.jestdroid.JestClientFactory;
import com.searchly.jestdroid.JestDroidClient;
//import org.apache.http.client.HttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;

/**
 * Created by esports on 2/16/16.
 */
public class DatabaseController {
    private static JestDroidClient client;
    private static Gson gson;
    //private static HttpClient http;

    
    /*TODO: A function that gets info
    public static class getInfo {
        // TODO: Get tweets

        }


    }
    */




    /* public static class addInfo{
        //@Override
        protected Void doInBackground() {
            verifyClient();

            // TODO:Add stuff in here to add data
            return null;
        }
    }
    */




    public static void verifyClient() {
        if(client == null) {
            // 2. If it doesn't, make it.
            // TODO: Put this URL somewhere it makes sense (e.g. class variable?)
            DroidClientConfig.Builder builder = new DroidClientConfig.Builder("http://cmput301.softwareprocess.es:8080");
            DroidClientConfig config = builder.build();

            JestClientFactory factory = new JestClientFactory();
            factory.setDroidClientConfig(config);
            client = (JestDroidClient) factory.getObject();
        }
    }
}