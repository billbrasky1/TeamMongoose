package com.danielbrinker.android.aca.mongoose;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText mNameText;
    public EditText mPhoneText;
    public EditText mAddressText;
    public TextView mUserInput; //Actually the output
    public Button mDisplayButton;
    public String addressText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameText = (EditText) findViewById(R.id.nameText);
        mPhoneText = (EditText) findViewById(R.id.phoneText);
        mAddressText = (EditText) findViewById(R.id.addressText);
        mUserInput = (TextView) findViewById(R.id.userInput);
        mDisplayButton = (Button) findViewById(R.id.displayButton);

        mDisplayButton.setOnClickListener(new View.OnClickListener() {
            String nameText;
            String phoneText;


            @Override
            public void onClick(View view) {


                //if (!mNameText.getText().toString().equals("")) {
                nameText = mNameText.getText().toString();


                // mUserInput.setText(nameText);


                //} else if (!mPhoneText.getText().toString().equals("")) {
                phoneText = mPhoneText.getText().toString();

                // mPhoneText.setText(phoneText);

                addressText = mAddressText.getText().toString();

                //  mAddressText.setText(addressText);

                mUserInput.setText(nameText + "\n " + phoneText + "\n" + addressText);

            }




        });

    }

    public void processClicks(View display) {
        Intent action = null;
        int id = display.getId();

        switch (id) {
            case (R.id.extraButton):
                action = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel: 248-434-5508"));
                break;
            case (R.id.mapButton):
                action = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q="+ addressText));
                break;
            default:
                break;
        }
        startActivity(action);
    }
}
