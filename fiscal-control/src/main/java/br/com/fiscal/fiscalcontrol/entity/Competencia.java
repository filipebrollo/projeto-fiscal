package br.com.fiscal.fiscalcontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name = "tb_competencia")
public class Competencia {


    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int mes;
    
    private int ano;




}
