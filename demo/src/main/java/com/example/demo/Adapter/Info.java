package com.example.demo.Adapter;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;


}
