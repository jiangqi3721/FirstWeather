package com.firstweather.model;

/**
 * Created by jq on 2016/6/28.
 */
public class Province {
    private  int id;
    private String name;
    private String code;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return name;
    }
    public void setProvinceName(String name){
        this.name = name;
    }
    public String getProvinceCode(){
        return code;
    }
    public void setProvinceCode(String code){
        this.code = code;
    }
}
