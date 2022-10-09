package com.example.laptopCRUDSecurity.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fabricante;

    private String procesador;

    public Laptop() {

    }

    public Laptop(Long id, String fabricante, String procesador) {
        this.id = id;
        this.fabricante = fabricante;
        this.procesador = procesador;
    }


    public Long getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getProcesador() {
        return procesador;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }



}
