package com.ossovita.recyclerviewpractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Car> cars;
    private RecyclerView recyclerView;
    private CarRecyclerAdapter carRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSettings();
        fillTheArray();
        carRecyclerAdapter.notifyDataSetChanged();

    }

    private void fillTheArray() {
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.audi,"AUDİ","2020"));
        cars.add(new Car(R.drawable.mercedes,"Mercedes","2020"));
        cars.add(new Car(R.drawable.honda,"Honda","2020"));
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.lamborghini,"Lamborghini","2020"));
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.audi,"AUDİ","2020"));
        cars.add(new Car(R.drawable.mercedes,"Mercedes","2020"));
        cars.add(new Car(R.drawable.honda,"Honda","2020"));

    }

    private void viewSettings() {
        recyclerView = findViewById(R.id.recyclerView);
        cars = new ArrayList<>();
        carRecyclerAdapter = new CarRecyclerAdapter(cars);
        recyclerView.setAdapter(carRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}