package com.example.hashi.zooanimal.beans;

    public class Animal
    {
        private String animalName;
        private String type;

        public Animal(String animalName, String type) {
            this.animalName = animalName;
            this.type = type;
        }

        public String getAnimalName() {
            return animalName;
        }

        public String getType() {
            return type;
        }
    }
