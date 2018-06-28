package svenboom.smsbooommm;

import android.telephony.SmsManager;

public class SendMessageManager implements Runnable {

    String phoneNumber = "";
    String message = "";

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void messageSending() {
        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }

    @Override
    public void run() {

        messageSending();
    }
}
