package com.ossovita.recyclerviewpractise;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarRecyclerAdapter extends RecyclerView.Adapter<CarRecyclerAdapter.MyViewHolder> {
    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    private ArrayList<Car> cars;

    public CarRecyclerAdapter(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_single_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvModel.setText(cars.get(position).getModel());
        holder.tvBrand.setText(cars.get(position).getBrand());
        holder.imgLogo.setImageResource(cars.get(position).getLogo());

    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvBrand,tvModel;
        ImageView imgLogo;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.bmwlogo);
            tvBrand = itemView.findViewById(R.id.brandText);
            tvModel = itemView.findViewById(R.id.modelText);

        }
    }

}
