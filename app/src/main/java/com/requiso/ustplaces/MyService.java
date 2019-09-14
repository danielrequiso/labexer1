package com.requiso.ustplaces;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("Place", "UST Hospital");
        Log.d("Place", "UST Field");
        Log.d("Place", "UST Arch of The Century");
        Log.d("Place", "UST Main Building");
    }
}
