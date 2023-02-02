package com.fundamentals;

public class Dog {
        private String  breed;
        private String  sex;
        private int age;

        public Dog() {
            System.out.println("This is the default constructor.");
        }

        public Dog(String breed) {
            this(breed, "female", 2);
            System.out.println("The dog is a "+ breed);
        }

        public Dog(String breed, String sex, int age) {
            this.breed = breed;
            this.sex = sex;
            this.age = age;
        }
        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


