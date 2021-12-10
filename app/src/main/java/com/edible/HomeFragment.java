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


                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment_container,new HomeGrocery());
                fragmentTransaction.commit();

                if (getFragmentManager().getBackStackEntryCount() > 0){
                    boolean done = getFragmentManager().popBackStackImmediate();

                }


            }
        });

        Meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment_container,new HomeMeat());
                fragmentTransaction.commit();

                if (getFragmentManager().getBackStackEntryCount() > 0){
                    boolean done = getFragmentManager().popBackStackImmediate();

                }
            }
        });

        Bakery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment_container,new HomeBakery());
                fragmentTransaction.commit();

                if (getFragmentManager().getBackStackEntryCount() > 0){
                    boolean done = getFragmentManager().popBackStackImmediate();

                }
            }
        });

        Drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment_container,new HomeDrinks());
                fragmentTransaction.commit();

                if (getFragmentManager().getBackStackEntryCount() > 0){
                    boolean done = getFragmentManager().popBackStackImmediate();

                }
            }
        });

        return v;









    }






}



