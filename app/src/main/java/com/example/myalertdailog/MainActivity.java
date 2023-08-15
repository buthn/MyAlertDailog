package com.example.myalertdailog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Wlcome To Android Studio");
                alertDialog.setMessage("Thank you for order");

                alertDialog.setPositiveButton("YES", new DialogPreference(MainActivity.this) {
                    @Override
                    public void setDialogTitle(CharSequence dialogTitle) {

                    }
                });

                alertDialog.setNegativeButton("NO", new DialogPreference(MainActivity.this) {
                    @Override
                    public void setDialogTitle(CharSequence dialogTitle) {

                    }
                });

                alertDialog.show();
            }
        });
    }
}