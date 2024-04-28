package com.codingnomads.springweb.resttemplate.GET.models;

import lombok.Data;

@Data
public class Activity {
    private String activity;
    private float accessibility;
    private String type;
    private long participants;
    private float price;
    //String link;
    private long key;

}
