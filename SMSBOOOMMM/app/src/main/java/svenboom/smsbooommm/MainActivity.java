package svenboom.smsbooommm;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numberOfMessages = 5;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSendSMS = (Button) findViewById(R.id.SendSMS);
        TextView displayMessage = (TextView) findViewById(R.id.DisplayText);


        btnSendSMS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    sendSMS();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }


    private void sendSMS() throws InterruptedException {
        TextView messageTime = (TextView) findViewById(R.id.MessageTime);
        numberOfMessages = Integer.parseInt(messageTime.getText().toString());
        for (i = 0; i < numberOfMessages; i++) {
            messageSending();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {

                }
            }, 1000);
        }
    }

    private void messageSending() {
        SmsManager sms = SmsManager.getDefault();
        EditText phoneNumberEdit = (EditText) findViewById(R.id.PhoneNumber);
        TextView displayMessage = (TextView) findViewById(R.id.DisplayText);
        String phoneNumberStr = phoneNumberEdit.getText().toString();


        String message = "Test message" + i;
        displayMessage.setText("Message had sent: " + i);
        sms.sendTextMessage(phoneNumberStr, null, message, null, null);
    }
}
