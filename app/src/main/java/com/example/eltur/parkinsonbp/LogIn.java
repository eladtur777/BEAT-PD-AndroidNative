package com.example.eltur.parkinsonbp;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.eltur.parkinsonbp.HttpClient.HttpClient;
import com.example.eltur.parkinsonbp.ServerClass.Activity;
import com.example.eltur.parkinsonbp.ServerClass.Patient;

import org.json.JSONException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Locale;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;


public class LogIn extends AppCompatActivity {

    Button EnterButton;
    EditText UserId;
    EditText UserPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EnterButton = (Button) findViewById(R.id.button3);
        UserId = (EditText) findViewById(R.id.UserId);
        UserPassword = (EditText) findViewById(R.id.UserPassword);

      //  UserId.setBackgroundResource(Color.parseColor("#E8F5E9"));
       // UserPassword.setBackgroundResource(R.drawable.edittext);
        EnterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String userID = UserId.getText().toString();
                String password = UserPassword.getText().toString();
                if(userID.isEmpty() || password.isEmpty())
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(LogIn.this).create();
                    alertDialog.setTitle("הודעת מערכת");
                    alertDialog.setMessage("נא למלא שם משתמש וסיסמא ");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                    return;
                                }
                            });
                    alertDialog.show();
                }
                else {
                   HttpClient client = HttpClient.getClient();
                    Patient patient = new Patient(userID,password);
                    try {
                        if(client.validateCredentials(patient)){
                            Intent intent = new Intent(getBaseContext(), firstpage.class);
                            intent.putExtra("EXTRA_SESSION_ID", UserId.getText().toString());
                            startActivity(intent);
                            finish();
                        }
                        else
                            loginErrorDialog();
                    } catch (IOException| JSONException e) {
                        loginErrorDialog();
                    }
                }
            }
        });

    }
    private void loginErrorDialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(LogIn.this).create();
        alertDialog.setTitle("שגיאת מערכת");
        alertDialog.setMessage("פרטי המשתמש לא נכונים ");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        return;
                    }
                });
        alertDialog.show();
    }
    @Override
    public void onBackPressed() {

        AlertDialog alertDialog = new AlertDialog.Builder(LogIn.this).create();
        alertDialog.setTitle("הודעת מערכת");
        alertDialog.setMessage("האם ברצונך לצאת?");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);

                        // System.exit(0);
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

}


