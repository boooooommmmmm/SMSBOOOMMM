package svenboom.smsbooommm;

import android.telephony.SmsManager;
import android.widget.EditText;
import android.widget.TextView;

public class SendMessageManager {

    public void messageSending() {
        SmsManager sms = SmsManager.getDefault();
        EditText phoneNumberEdit = (EditText) findViewById(R.id.PhoneNumber);
        TextView displayMessage = (TextView) findViewById(R.id.DisplayText);
        String phoneNumberStr = phoneNumberEdit.getText().toString();


        String message = "Test message";
        displayMessage.setText("Message had sent: ");
        sms.sendTextMessage(phoneNumberStr, null, message, null, null);
    }
}
