package com.edible;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment1 extends Fragment  {

    RecyclerView mRecyclerView;

    MyAdapter1 myAdapter1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home1,container,false);

         mRecyclerView = (RecyclerView)v.findViewById(R.id.recyclerView1);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myAdapter1 = new MyAdapter1(getContext(),getMyList());
        mRecyclerView.setAdapter(myAdapter1);
        return v;
    }

    private ArrayList<Model1> getMyList(){

        ArrayList<Model1> models = new ArrayList<>();

        Model1 m = new Model1();
        m.setTitle("Grocery");
        m.setImg(R.drawable.grocery);
        models.add(m);

        m = new Model1();
        m.setTitle("Meat");
        m.setImg(R.drawable.meat);
        models.add(m);

        m = new Model1();
        m.setTitle("Bakery");
        m.setImg(R.drawable.bakery);
        models.add(m);

        m = new Model1();
        m.setTitle("Drinks");
        m.setImg(R.drawable.soft_drink);
        models.add(m);


        return models;




    }
}




















