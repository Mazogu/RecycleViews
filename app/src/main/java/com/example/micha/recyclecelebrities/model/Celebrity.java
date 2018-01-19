package com.example.micha.recyclecelebrities.model;

/**
 * Created by micha on 1/18/2018.
 */

public class Celebrity {
    private String name,age,gender,favorite, imageID;

    public Celebrity(String name, String age, String gender, String imageID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.favorite = "0";
        this.imageID = imageID;
    }

    @Override
    public String toString() {
        return "Celebrity{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", favorite='" + favorite + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavorite() {
        return favorite;
    }

    public String getImageID(){
        return imageID;
    }

    public void setImageID(String imageID){
        this.imageID = imageID;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }
}
