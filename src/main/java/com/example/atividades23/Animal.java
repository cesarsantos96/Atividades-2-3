package com.example.atividades23;

public class Animal {
    public String nome;
    public String som;

    public Animal(String nome, String som){
        this.nome = nome;
        this.som = som;
    }
    public void emitirSom(){
        System.out.println(nome + "faz o som : "+ som);
        System.out.println("-------------");
    }

}
