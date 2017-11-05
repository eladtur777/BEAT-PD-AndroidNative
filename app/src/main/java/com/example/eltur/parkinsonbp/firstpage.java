package com.example.eltur.parkinsonbp;

import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.widget.ImageButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;


public class firstpage extends AppCompatActivity {

    ImageButton activitiesImgBtn;
    ImageButton informationImgBtn;
    ImageButton medicinesImgBtn;
    ImageButton sleepImgBtn;
    ImageButton moodImgBtn;
    ImageButton HergelimImgBtn;
    TextView HelloLogin;
    String userid = "";
    static String getDetails = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        //Image Buttons
        activitiesImgBtn = (ImageButton) findViewById(R.id.activitiesImgBtn);
        informationImgBtn = (ImageButton) findViewById(R.id.informationImgBtn);
        medicinesImgBtn = (ImageButton) findViewById(R.id.medicienImgBtn);
        sleepImgBtn = (ImageButton) findViewById(R.id.sleepImgBtn);
        moodImgBtn = (ImageButton) findViewById(R.id.moodImgBtn);
        HergelimImgBtn = (ImageButton) findViewById(R.id.HergelimImgBtn);

        //login ID
        HelloLogin = (TextView) findViewById(R.id.Hello);
        //UserDetails = (EditText) findViewById(R.id.UserDetails);
        userid = getIntent().getStringExtra("EXTRA_SESSION_ID");
        HelloLogin.setText("שלום" +" "+ userid);

        activitiesImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Activities.class);
                intent.putExtra("EXTRA_SESSION_ID", userid);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }

                // Intent i = new Intent(firstpage.this, moodAndAction.class);
                //  startActivity(i);
               //   finish();


            }
        });

        informationImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(firstpage.this, information.class);
                startActivity(i);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                };
            }
        });


        medicinesImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Medicines.class);
                intent.putExtra("EXTRA_SESSION_ID", userid);
                startActivity(intent);
                finish();
            }
        });

        sleepImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Sleep.class);
                intent.putExtra("EXTRA_SESSION_ID", userid);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }
            }
        });

        moodImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Mood.class);
                intent.putExtra("EXTRA_SESSION_ID", userid);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }
            }
        });

        HergelimImgBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Habit.class);
                intent.putExtra("EXTRA_SESSION_ID", userid);
                startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    finishAffinity();
                }
            }
        });


    }

    @Override
    public void onBackPressed() {

        AlertDialog alertDialog = new AlertDialog.Builder(firstpage.this).create();
        alertDialog.setTitle("הודעת מערכת");
        alertDialog.setMessage("האם ברצונך לצאת?");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(firstpage.this, LogIn.class);
                        startActivity(i);
                        dialog.dismiss();
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                            finishAffinity();
                        }


                        // return;
                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "חזור",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        return;
                    }
                });
        alertDialog.show();
    }









/*
    public static void main(String args[]) throws MalformedURLException {
        String getDetails = "";
        try {
           getDetails = connectToDB.getUserDetails("1").toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String f = getDetails;

    }

*/
}