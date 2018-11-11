package com.example.hashi.zooanimal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hashi.zooanimal.beans.Animal;

import java.util.List;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.CustomViewHolder>
    {
        private List<Animal> animals;

        public class CustomViewHolder extends RecyclerView.ViewHolder {
            public TextView animalName, type;

            public CustomViewHolder(View view) {
                super(view);
                animalName = (TextView) view.findViewById(R.id.animalName);
                type = (TextView) view.findViewById(R.id.type);
            }
        }

        public AnimalsAdapter(List<Animal> animals) {
            this.animals = animals;
        }

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.animals_list, parent, false);

            return new CustomViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            Animal animal = animals.get(position);
            holder.animalName.setText(animal.getAnimalName());
            holder.type.setText(animal.getType());
        }

        @Override
        public int getItemCount() {
            return animals.size();
        }

    }
