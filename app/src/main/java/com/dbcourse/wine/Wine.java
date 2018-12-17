package com.dbcourse.wine;

import java.util.ArrayList;
import java.util.List;

public class Wine {
    private int id;
    private int imgid;
    private String title;
    private String desciption;
    private String winery;
    private String designation;
    private String variety;
    private String country;
    private String province;
    private String region_1;
    private String region_2;
    private int price;
    private int points;

    //constructor
    public Wine(int id, int imgid, String title, String desciption, String winery, String designation, String variety, String country, String province, String region_1, String region_2, int price, int points) {
        this.id = id;
        this.imgid = imgid;
        this.title = title;
        this.desciption = desciption;
        this.winery = winery;
        this.designation = designation;
        this.variety = variety;
        this.country = country;
        this.province = province;
        this.region_1 = region_1;
        this.region_2 = region_2;
        this.price = price;
        this.points = points;
    }

    public Wine(int id, String title, String variety) {
        this.id = id;
        this.title = title;
        this.variety = variety;
    }

    public Wine(int id, String title) {
        this.id = id;
        this.title = title;
    }



    public Wine() {
    }

    //getter setter

    public static List<Wine> getAllWine() {
        List<Wine> wine = new ArrayList<Wine>();
        wine.add(new Wine(R.drawable.w1, "wine1","v1"));
        wine.add(new Wine(R.drawable.w2, "wine2","v2"));
        wine.add(new Wine(R.drawable.w3, "wine3","v3"));

        return wine;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getWinery() {
        return winery;
    }

    public void setWinery(String winery) {
        this.winery = winery;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion_1() {
        return region_1;
    }

    public void setRegion_1(String region_1) {
        this.region_1 = region_1;
    }

    public String getRegion_2() {
        return region_2;
    }

    public void setRegion_2(String region_2) {
        this.region_2 = region_2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
