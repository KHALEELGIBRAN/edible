package com.edible;



import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragment extends Fragment  {

   public HomeFragment(){}


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        Button Grocery = (Button) v.findViewById(R.id.Grocery);
        Button Meat = (Button) v.findViewById(R.id.Meat);
        Button Bakery = (Button) v.findViewById(R.id.Bakery);
        Button Drinks = (Button) v.findViewById(R.id.Drinks);

        Grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new HomeGrocery());
                fr.commit();
            }
        });

        Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new HomeMeat());
                fr.commit();
            }
        });

        Bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new HomeBakery());
                fr.commit();
            }
        });

        Drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new HomeDrinks());
                fr.commit();
            }
        });

        return v;





    }




}



