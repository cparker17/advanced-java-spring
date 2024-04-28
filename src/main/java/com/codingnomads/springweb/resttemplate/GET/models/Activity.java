package com.codingnomads.springweb.resttemplate.GET.models;

import lombok.Data;

@Data
public class Activity {
    private String activity;
    private float accessibility;
    private String type;
    private int participants;
    private float price;
    //String link;
    private int key;

}
