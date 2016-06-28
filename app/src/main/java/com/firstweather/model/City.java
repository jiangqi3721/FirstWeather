package com.firstweather.model;

/**
 * Created by jq on 2016/6/28.
 */
public class City {
    private int id;
    private String name;
    private String code;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return name;
    }
    public void setCityName(String name){
        this.name = name;
    }
    public String getCityCode(){
        return code;
    }
    public void setCityCode(String code){
        this.code = code;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
