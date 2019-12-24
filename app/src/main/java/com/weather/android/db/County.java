package com.weather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int Id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId(){
        return Id;
    }
    public void setId(int id){
        this.Id=id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId=weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }

}
