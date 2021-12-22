package com.edible;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter1 extends RecyclerView.Adapter<MyHolder1> {

    Context c;
    ArrayList<Model1> models;     // this array list creates a list of array which our parameter defines is our model class

    public MyAdapter1(Context c, ArrayList<Model1> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row1,null);

        return new MyHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder1 myHolder1, int i) {

        MyHolder1.mTitle.setText(models.get(i).getTitle());
        MyHolder1.mImageView.setImageResource(models.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
