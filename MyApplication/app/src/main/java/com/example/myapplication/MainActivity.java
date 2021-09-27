package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    int c1 = 0,c2 = 0,c3 = 0,c4 = 0,c5 = 0;
    int amount = 0;
    int tc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void removeTW(View view) {
        if (c1<=0){
            Toast.makeText(this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            TextView totalVehPassed = findViewById(R.id.number);
            TextView totalAmnt = findViewById(R.id.Amount);
            TextView tvTW = (TextView)findViewById(R.id.tvTw);
            c1--;
            amount = amount - 10;
            tc--;
            totalVehPassed.setText(""+tc);
            tvTW.setText(""+c1);
            totalAmnt.setText(""+amount);
        }
    }

    public void addTW(View view) {
        TextView totalVehPassed = findViewById(R.id.number);
        TextView totalAmnt = findViewById(R.id.Amount);
        TextView tvTW = (TextView)findViewById(R.id.tvTw);
        c1++;
        amount = amount+10;
        tvTW.setText(""+c1);
        Toast.makeText(this, "The amount is Rs.10", Toast.LENGTH_SHORT).show();
        tc++;
        totalVehPassed.setText(""+tc);
        totalAmnt.setText(""+amount);
    }

    public void removeFW(View view) {
        if (c2<=0){
            Toast.makeText(this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            TextView totalVehPassed = findViewById(R.id.number);
            TextView totalAmnt = findViewById(R.id.Amount);
            TextView tvFW = (TextView)findViewById(R.id.tvFW);
            c2--;
            tc--;
            totalVehPassed.setText(""+tc);
            amount = amount - 20;
            tvFW.setText(""+c2);
            totalAmnt.setText(""+amount);
        }
    }

    public void addFW(View view) {
        TextView totalVehPassed = findViewById(R.id.number);
        TextView totalAmnt = findViewById(R.id.Amount);
        TextView tvFW = (TextView)findViewById(R.id.tvFW);
        tc++;
        c2++;
        amount = amount+20;
        tvFW.setText(""+c2);
        Toast.makeText(this, "The amount is Rs.20", Toast.LENGTH_SHORT).show();
        totalVehPassed.setText(""+tc);
        totalAmnt.setText(""+amount);
    }

    public void removeTB(View view) {
        if (c3<=0){
            Toast.makeText(this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            TextView totalVehPassed = findViewById(R.id.number);
            TextView totalAmnt = findViewById(R.id.Amount);
            TextView tvTB = (TextView)findViewById(R.id.tvTB);
            c3--;
            tc--;
            totalVehPassed.setText(""+tc);
            amount = amount - 40;
            tvTB.setText(""+c3);
            totalAmnt.setText(""+amount);
        }
    }

    public void addTB(View view) {
        TextView totalVehPassed = findViewById(R.id.number);
        TextView totalAmnt = findViewById(R.id.Amount);
        TextView tvTB = (TextView)findViewById(R.id.tvTB);
        tc++;
        c3++;
        amount = amount+40;
        tvTB.setText(""+c3);
        Toast.makeText(this, "The amount is Rs.40", Toast.LENGTH_SHORT).show();
        totalVehPassed.setText(""+tc);
        totalAmnt.setText(""+amount);
    }


    public void removeVIP(View view) {
        if (c4<=0){
            Toast.makeText(this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            TextView totalVehPassed = findViewById(R.id.number);
            TextView totalAmnt = findViewById(R.id.Amount);
            TextView tvVIP = (TextView)findViewById(R.id.tvVIP);
            c4--;
            tc--;
            totalVehPassed.setText(""+tc);
            amount = amount - 0;
            tvVIP.setText(""+c4);
            totalAmnt.setText(""+amount);
        }
    }

    public void addVIP(View view) {
        TextView totalVehPassed = findViewById(R.id.number);
        TextView totalAmnt = findViewById(R.id.Amount);
        TextView tvVIP = (TextView)findViewById(R.id.tvVIP);
        tc++;
        c4++;
        amount = amount+0;
        tvVIP.setText(""+c4);
        Toast.makeText(this, "You shall pass", Toast.LENGTH_SHORT).show();
        totalVehPassed.setText(""+tc);
        totalAmnt.setText(""+amount);
    }


    public void removeRFID(View view) {
        TextView tvRFID = (TextView)findViewById(R.id.tvRFID);
        if (c5<=0){
            Toast.makeText(this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            TextView totalVehPassed = findViewById(R.id.number);
            TextView totalAmnt = findViewById(R.id.Amount);
            c5--;
            tc--;
            totalVehPassed.setText(""+tc);
            amount = amount - 50;
            tvRFID.setText(""+c5);
            totalAmnt.setText(""+amount);
        }
    }

    public void addRFID(View view) {
        TextView totalVehPassed = findViewById(R.id.number);
        TextView totalAmnt = findViewById(R.id.Amount);
        TextView tvRFID = (TextView)findViewById(R.id.tvRFID);
        c5++;
        tc++;
        amount = amount+50;
        tvRFID.setText(""+c5);
        Toast.makeText(this, "The amount is Rs.50", Toast.LENGTH_SHORT).show();
        totalVehPassed.setText(""+tc);
        totalAmnt.setText(""+amount);
    }
}