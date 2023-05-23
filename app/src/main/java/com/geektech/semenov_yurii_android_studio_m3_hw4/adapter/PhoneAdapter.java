package com.geektech.semenov_yurii_android_studio_m3_hw4.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektech.semenov_yurii_android_studio_m3_hw4.OnClick;
import com.geektech.semenov_yurii_android_studio_m3_hw4.Phone;
import com.geektech.semenov_yurii_android_studio_m3_hw4.R;

import java.util.ArrayList;
import java.util.List;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneViewHolder> {

    ArrayList<Phone> phoneList;
    OnClick adapterOnClick;

    public PhoneAdapter(ArrayList<Phone> newPhoneList, OnClick onClick) {
        phoneList = newPhoneList;
        this.adapterOnClick = onClick;
    }

    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhoneViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_phone, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        holder.onBind(phoneList.get(position));
        holder.itemView.setOnClickListener(view -> {
            adapterOnClick.onClick(phoneList.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }
}
