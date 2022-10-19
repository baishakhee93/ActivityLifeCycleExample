package com.baishakhee.activitylifecycleexample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG="SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,"SecondActivity : onCreate invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG," SecondActivity : onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG," SecondActivity : onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG," SecondActivity : onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG," SecondActivity : onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG," SecondActivity : onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG," SecondActivity : onDestroy invoked");
    }

    public void nextMethods(View view) {
        // define Intent object with action attribute as ACTION_SEND
        Intent intent = new Intent(Intent.ACTION_SEND);

        // add three fields to intent using putExtra function
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"emailsend"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "emailsubject");
        intent.putExtra(Intent.EXTRA_TEXT, "emailbody");

        // set type of intent
        intent.setType("message/rfc822");

        // startActivity with intent with chooser as Email client using createChooser function
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));

    }


   /* public void alertDialogShow(View view){
        //Uncomment the below code to Set the message and title from the strings.xml file
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Alert Message") .setTitle("Alert Show");

        //Setting message manually and performing action on button click
        builder.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        Toast.makeText(getApplicationContext(),"you choose yes action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        //Creating dialog box
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.setTitle("AlertDialogExample");
        alert.show();
    }*/


}