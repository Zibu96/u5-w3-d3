package com.example.demo.Adapter;

import lombok.ToString;

import java.time.LocalDate;
@ToString
public class InfoAdapter implements DataSource{
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        String nomeCompleto;

        nomeCompleto= info.getNome() + " " + info.getCognome();
        return nomeCompleto;
    }

    @Override
    public int getEta() {
       int eta;
       LocalDate oggi = LocalDate.now();
       long anni = info.getDataDiNascita().toEpochDay() - oggi.toEpochDay();
       return (int) anni / 365;

    }
}
