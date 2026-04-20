package com.example;

public class App {
    
    static final int XX = 5;

    public static void main(String[] args) {
    
        Persona persona = new Persona("Alex Eduardo", 1.80,
         "Pilicita", "pili@gmail.com");

        Persona persona2 = Persona.builder()
            .correo("mmm@gmail.com")
            .nombre("Duglas")
            .build();
    }
}
