package com.example.gamerzhub;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link container_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class container_fragment extends Fragment {

    ImageView imgCart;
    ArrayList<item_model> items= new ArrayList<>();
    RecyclerView recyclerView;
    public container_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_container_fragment, container, false);
        imgCart= view.findViewById(R.id.imgCart);

        imgCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(), cart.class);
                startActivity(i);
            }
        });


        recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        // Now adding in array
//        item_model model=new item_model(R.drawable.male,"Cake rusk","20000$");
        // or
        items.add(new item_model(R.drawable.gow,"God of War","15000"));
        items.add(new item_model(R.drawable.gta,"Grand Theft Auto (V)","10000"));
        items.add(new item_model(R.drawable.far,"Far Cry","10000"));
        items.add(new item_model(R.drawable.spider,"Spider man","17000"));
        items.add(new item_model(R.drawable.ittakestwo,"It Takes Two","12000"));
        items.add(new item_model(R.drawable.cod,"Call of Duty","9000"));
        items.add(new item_model(R.drawable.guardiansofgalaxy,"Guardians of Galaxy","7000"));
        items.add(new item_model(R.drawable.hogwarts,"Hogwarts","5000"));
        items.add(new item_model(R.drawable.sackboy,"Sack Boy","8000"));
        items.add(new item_model(R.drawable.dyinglight,"Dying Light","4000"));
        items.add(new item_model(R.drawable.iron,"Iron","11000"));
        items.add(new item_model(R.drawable.miles,"Spider man miles","12000"));
        items.add(new item_model(R.drawable.jumanji,"Jumanji","13000"));
        items.add(new item_model(R.drawable.mortalcombat,"Mortal Combat","15000"));


        item_recycler_adapter adapter = new item_recycler_adapter(this,items);
        recyclerView.setAdapter(adapter);
        // Inflate the layout for this fragment
        return view;
    }
}