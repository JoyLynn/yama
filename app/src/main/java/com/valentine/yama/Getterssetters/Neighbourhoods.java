package com.valentine.yama.Getterssetters;

import com.parse.Parse;
import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Wakoli on 17-Sep-15.
 */
@ParseClassName("Neighbourhoods")
public class Neighbourhoods extends ParseObject {

    public Neighbourhoods(){

    }

    public String getType(){
        return getString("location");
    }

    public void setType(String type){
        put("location", type);
    }
}
