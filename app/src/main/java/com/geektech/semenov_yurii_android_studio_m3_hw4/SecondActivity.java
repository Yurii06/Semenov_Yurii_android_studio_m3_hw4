package com.geektech.semenov_yurii_android_studio_m3_hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Phone phone;
    private ImageView imageView;
    private TextView titleText;
    private TextView descriptionText;
    private TextView priceText;
    private TextView colorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        phone = (Phone) getIntent().getSerializableExtra("phone");
        findViews();
        setContentView();

    }

    private void findViews() {
        imageView = findViewById(R.id.imageViewOne);
        titleText = findViewById(R.id.textViewTitleOne);
        descriptionText = findViewById(R.id.textViewDescriptionOne);
        colorText = findViewById(R.id.textViewColorOne);
        priceText = findViewById(R.id.textViewPriceOne);
    }

    private void setContentView() {
        imageView.setImageResource(phone.getImage());
        titleText.setText(phone.getTitle());
        descriptionText.setText(phone.getDescription());
        colorText.setText(phone.getColor());
        priceText.setText(phone.getPrice());
    }
}