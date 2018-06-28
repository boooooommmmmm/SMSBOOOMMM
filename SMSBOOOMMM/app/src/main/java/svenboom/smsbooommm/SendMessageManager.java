package svenboom.smsbooommm;

import android.telephony.SmsManager;

public class SendMessageManager {

    public void messageSending(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();

        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }
}
