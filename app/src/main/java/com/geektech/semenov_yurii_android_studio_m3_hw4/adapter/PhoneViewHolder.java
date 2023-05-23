package com.geektech.semenov_yurii_android_studio_m3_hw4.adapter;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.semenov_yurii_android_studio_m3_hw4.OnClick;
import com.geektech.semenov_yurii_android_studio_m3_hw4.Phone;
import com.geektech.semenov_yurii_android_studio_m3_hw4.R;
import com.geektech.semenov_yurii_android_studio_m3_hw4.SecondActivity;

public class PhoneViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView tittleTextView;
    TextView descriptionTextView;
    TextView priceTextView;
    TextView colorTextView;

    public PhoneViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Phone phone){
        imageView = itemView.findViewById(R.id.imageView);
        tittleTextView = itemView.findViewById(R.id.textViewTitle);
        descriptionTextView = itemView.findViewById(R.id.textViewDescription);
        priceTextView = itemView.findViewById(R.id.textViewPrice);
        colorTextView = itemView.findViewById(R.id.textViewColor);

        imageView.setImageResource(phone.getImage());
        tittleTextView.setText(phone.getTitle());
        descriptionTextView.setText(phone.getDescription());
        priceTextView.setText(phone.getPrice());
        colorTextView.setText(phone.getColor());

    }
}
