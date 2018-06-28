package svenboom.smsbooommm;

import android.content.Context;
import android.telephony.SmsManager;

public class SendMessageManager {

    private Context context;
    String phoneNumber = "";
    String message = "";
    String messageConunt = "";


//    public SendMessageManager(Context context){
//        this.context=context;
//    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setMessageConunt(String messageConunt) {
        this.messageConunt = messageConunt;
    }

    public void messageSending() {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
//        TextView scheduleDisplayView = (TextView) ((Activity)context).findViewById(R.id.text);
//        scheduleDisplayView.setText("Message has send: " + messageConunt);
    }
}

