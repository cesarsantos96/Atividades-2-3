package com.example.atividades23;

public class AnimalDomestico extends Animal {

    public String dono;

    public  AnimalDomestico(String nome, String som, String dono){
        super(nome, som);
        this.dono = dono;
    }

    public String getDono(){
        return dono;

    }

}
