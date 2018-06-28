package svenboom.smsbooommm;

import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.TextView;

public class SendMessageManager {

    public void messageSending(String phoneNumber, String message) {
        SmsManager sms = SmsManager.getDefault();

        String message = "Test message";

        sms.sendTextMessage(phoneNumberStr, null, message, null, null);
    }
}
