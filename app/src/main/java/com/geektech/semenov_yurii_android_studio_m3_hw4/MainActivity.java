package com.geektech.semenov_yurii_android_studio_m3_hw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.geektech.semenov_yurii_android_studio_m3_hw4.adapter.PhoneAdapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClick {

    ArrayList<Phone> phones = new ArrayList<>();
    RecyclerView recyclerView;
    PhoneAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generatePhoneList();
        adapter = new PhoneAdapter(phones, this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);

    }

    private void generatePhoneList() {
        phones.add(new Phone(R.drawable.ic_galaxy, "Samsung Galaxy A12",
                "Galaxy A12 оснащен быстрым процессором и вместительным хранилищем. Улучшенный 8-ядерный процессор и оперативная память 3/4ГБ обеспечат плавную и эффективную работу любых приложений. Благодаря 32/64 ГБ встроенной памяти и поддержкой microSD карты до 1ТБ можно сохранить еще больше контента."
                , "15090", "black"));
        phones.add(new Phone(R.drawable.ic_iphone, "Iphone 14 Pro Max",
                "фронтальная камера: 12 Мп, 23 мм (экв.), f/1,9; поддержка 4G и 5G, Wi-Fi 6, Bluetooth 5.0, Lightning; A-GPS, ГЛОНАСС, GALILEO, BDS, QZSS; аккумулятор 4323 мА·ч, несъёмный, поддерживается быстрая проводная зарядка 18 Вт, беспроводная зарядка MagSafe 15 Вт."
                , "129 990", "Silver"));
        phones.add(new Phone(R.drawable.ic_xiaome, "Xiaomi 12X",
                "Xiaomi 12X отлично смотрится: это небольшой и удобный смартфон с ярким экраном 120 Гц. У него неплохая камера, отличные динамики и качественный вибромоторчик. Начинка почти флагманская. Процессор стабильно работает и хорошо тянет игры, оперативной памяти хватает, есть быстрая зарядка."
                , "45 900", "black"));
    }

    @Override
    public void onClick(Phone phone) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("phone", phone);
        startActivity(intent);
    }
}