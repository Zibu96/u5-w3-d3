package com.example.demo.Adapter;


import lombok.ToString;

@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;




    public void getData (DataSource ds){
        nomeCompleto= ds.getNomeCompleto();
        eta= ds.getEta();
    }
}
