package com.danielbrinker.android.aca.mongoose;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    public class MainActivity extends AppCompatActivity {

        TextView mName;
        TextView mPhone;
        TextView mAddress;
        TextView mOutputTextView;
        Button mConvertButton;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mName = (TextView) findViewById(R.id.nameText);
            mPhone = (TextView) findViewById(R.id.phoneText);
            mAddress = (TextView) findViewById(R.id.addressText);
            mOutputTextView = (TextView) findViewById(R.id.outputText);
            mDisplayButton = (Button) findViewById(R.id.displayButton);
            mMapButton = (Button) findViewById(R.id.mapButton);
            mExtraButton = (Button) findViewById(R.id.displayButton);


            mDisplayButton.setOnClickListener(new View.OnClickListener() {
                String name;
                String phoneNum;
                String yourAddress;

                @Override
                public void onClick(View view) {


                    if (!mName.getText().toString().equals("")) {
                        name = mName.getText().toString();


                        mOutputTextView.setText(name);


                    } else if (!mPhone.getText().toString().equals("")) {
                        phoneNum = mPhone.getText().toString();

                    }

                    else if (!mAddress.getText().toString().equals("")) {
                        yourAddress = mAddress.getText().toString();

                    }

                    mOutputTextView.setText(name + "\\s " + phoneNum + "\\s" + yourAddress);


                }
        });

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mEditText1 = (EditText) findViewById(R.id.editText1);
        mResultText2 = (TextView) findViewById(R.id.resultText2);


        mEditText2 = (EditText) findViewById(R.id.editText2);
        mResultText2 = (TextView) findViewById(R.id.resultText2);


        mEditText3 = (EditText) findViewById(R.id.editText3);
        mResultText3 = (TextView) findViewById(R.id.resultText3);



        mConvertButton = (Button) findViewById(R.id.convertButton);

    }

    public void processClicks(View display) {
        Intent action = null;
        int id = display.getId();

        switch (id) {
            case (R.id.imageButton):
                action = new Intent(Intent.ACTION_DIAL,
                        Uri.parse("tel: 877-446-6723"));
                break;
            case (R.id.imageButton2):
                action = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.noradsanta.org"));
                break;
            case (R.id.imageButton3):
                action = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("geo:0,0?q=101 Saint Nicholas Dr.," + " North Pole, AK"));
                break;
            default:
                break;
        }
        startActivity(action);
    } */

}}
}