package com.example.atividades23;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        Animal gato = new Animal("Gato", "Miau");
        Animal cachorro = new Animal("Cachorro", "Au Au");
        Animal vaca = new Animal("Vaca", "Muuu");


        AnimalDomestico gato1 = new AnimalDomestico("Gato", "Miau", "Zé");
        AnimalDomestico cachorro1 = new AnimalDomestico("Cachorro"," Au Au", "Paula");



        System.out.println("Dono do Gato: " + gato1.getDono());
        gato.emitirSom();
        System.out.println("Dono do Cachorro: " + cachorro1.getDono());
        cachorro.emitirSom();


        vaca.emitirSom();




    }
}