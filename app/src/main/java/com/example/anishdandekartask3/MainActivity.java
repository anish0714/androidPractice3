package com.example.anishdandekartask3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPressMaths(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 16 weeks Cost : $40", Toast.LENGTH_SHORT);
        showToast.show();
    }

    public void onPressPhysics(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 17 weeks Cost : $50", Toast.LENGTH_SHORT);
        showToast.show();
    }
    public void onPressChemistry(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 14 weeks Cost : $30", Toast.LENGTH_SHORT);
        showToast.show();
    }
    public void onPressBiology(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 10 weeks Cost : $20", Toast.LENGTH_SHORT);
        showToast.show();
    }
    public void onPressGeography(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 18 weeks Cost : $100", Toast.LENGTH_SHORT);
        showToast.show();
    }
    public void onPressFrench(View view) {
        Toast showToast = Toast.makeText(getApplicationContext(),"Duration : 20 weeks Cost : $500", Toast.LENGTH_SHORT);
        showToast.show();
    }
}