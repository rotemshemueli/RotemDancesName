package com.rosol.rotemdances;

public class Dance {

    private String danceTitle;

    public Dance(){

    }

    public Dance(String danceTitle){
        this.danceTitle=danceTitle;
    }

    public String getDanceTitle(){
        return danceTitle;
    }

    public void setDanceTitle(String danceTitle){
        this.danceTitle=danceTitle;
    }
}
