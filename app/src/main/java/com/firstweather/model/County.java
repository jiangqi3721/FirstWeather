package com.firstweather.model;

/**
 * Created by jq on 2016/6/28.
 */
public class County {
    private int id;
    private String name;
    private String code;
    private int cityId;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return name;
    }
    public void setCountyName(String name){
        this.name = name;
    }
    public String getCountyCode(){
        return code;
    }
    public void setCountyCode(String code){
        this.code = code;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
