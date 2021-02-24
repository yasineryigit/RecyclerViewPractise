package com.ossovita.recyclerviewpractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {



    private ArrayList<Car> cars;
    private RecyclerView recyclerView;
    private CarRecyclerAdapter carRecyclerAdapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSettings();
        fillTheArray();
        carRecyclerAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);


        return super.onCreateOptionsMenu(menu);
    }

    private void fillTheArray() {
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.lamborghini,"Lamborghini","2018"));
        cars.add(new Car(R.drawable.mercedes,"Mercedes","2020"));
        cars.add(new Car(R.drawable.honda,"Honda","2020"));
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.lamborghini,"Lamborghini","2020"));
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2020"));
        cars.add(new Car(R.drawable.audi,"AUDİ","2020"));
        cars.add(new Car(R.drawable.bmwlogo,"BMW","2018"));
        cars.add(new Car(R.drawable.honda,"Honda","2020"));

    }

    private void viewSettings() {
        recyclerView = findViewById(R.id.recyclerView);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        cars = new ArrayList<>();
        carRecyclerAdapter = new CarRecyclerAdapter(cars);
        recyclerView.setAdapter(carRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        ArrayList<Car> newCars = new ArrayList<>();
        for(Car car : cars){
            if(car.getBrand().toLowerCase().contains(s.toLowerCase())){
                newCars.add(car);
            }
        }
        carRecyclerAdapter.setCars(newCars);
        carRecyclerAdapter.notifyDataSetChanged();

        return true;
    }
}