package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Billing_Page extends AppCompatActivity {
    TextView tvTW, tvFW, tvTB, tvVIP, tvRFID;
    Button removeTW, removeFW, removeTB, removeVIP, removeRFID;
    Button addTW, addFw, addTB, addVIP, addRFID;
    Button billingBtn;
    int totalCount = 0;
    int count = 0;
    int amount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing_page);
        billingBtn = (Button)findViewById(R.id.billingBtn);
        tvTW = (TextView)findViewById(R.id.tvTw);
        tvFW = (TextView)findViewById(R.id.tvFW);
        tvTB = (TextView)findViewById(R.id.tvTB);
        tvVIP = (TextView)findViewById(R.id.tvVIP);
        tvRFID = (TextView)findViewById(R.id.tvRFID);


        totalCount = count;

    }

    public void removeTW(View view) {
        if (count<=0){
            Toast.makeText(Billing_Page.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            count--;
            amount = amount - 10;
            tvTW.setText(""+count);
        }
    }

    public void addTW(View view) {
        count++;
        amount = amount+10;
        tvTW.setText(""+count);
        Toast.makeText(Billing_Page.this, "The amount is Rs.10", Toast.LENGTH_SHORT).show();
    }

    public void removeFW(View view) {
        if (count<=0){
            Toast.makeText(Billing_Page.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            count--;
            amount = amount - 20;
            tvFW.setText(""+count);
        }
    }

    public void addFW(View view) {
        count++;
        amount = amount+20;
        tvFW.setText(""+count);
        Toast.makeText(Billing_Page.this, "The amount is Rs.20", Toast.LENGTH_SHORT).show();
    }

    public void removeTB(View view) {
        if (count<=0){
            Toast.makeText(Billing_Page.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            count--;
            amount = amount - 40;
            tvFW.setText(""+count);
        }
    }

    public void addTB(View view) {
        count++;
        amount = amount+40;
        tvFW.setText(""+count);
        Toast.makeText(Billing_Page.this, "The amount is Rs.40", Toast.LENGTH_SHORT).show();
    }


    public void removeVIP(View view) {
        if (count<=0){
            Toast.makeText(Billing_Page.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            count--;
            amount = amount - 0;
            tvFW.setText(""+count);
        }
    }

    public void addVIP(View view) {
        count++;
        amount = amount+0;
        tvFW.setText(""+count);
        Toast.makeText(Billing_Page.this, "You shall pass", Toast.LENGTH_SHORT).show();
    }


    public void removeRFID(View view) {
        if (count<=0){
            Toast.makeText(Billing_Page.this, "The Count cannot be reduced", Toast.LENGTH_SHORT).show();
        } else {
            count--;
            amount = amount - 50;
            tvFW.setText(""+count);
        }
    }

    public void addRFID(View view) {
        count++;
        amount = amount+50;
        tvFW.setText(""+count);
        Toast.makeText(Billing_Page.this, "The amount is Rs.50", Toast.LENGTH_SHORT).show();
    }

    public void goToDashboard(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("totalVehCount", totalCount);
        intent.putExtra("amount", amount);
        startActivity(intent);
    }
}