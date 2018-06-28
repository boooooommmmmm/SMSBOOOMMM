package svenboom.smsbooommm;

import android.os.Handler;
import android.telephony.SmsManager;
import android.util.Log;

public class SendMessageManager {

    public void messageSending(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();

        sms.sendTextMessage(phoneNumber, null, message, null, null);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("sven","sleeping....");
            }
        }, 1000);
    }
}
