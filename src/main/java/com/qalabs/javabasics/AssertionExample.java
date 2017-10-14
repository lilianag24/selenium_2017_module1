package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 27;
        String cad1="Hola";
        assert age >= 18;
        //assert  1 > 5: "Un minuto no menos 5 minutos";
        //assert cad1.equals("ola"): "No son iguales los textos";
        assert age>=10 && age<=20: "No esta dentro del rango";
        assert cad1.equals(age): "No son el mismo tipo de dato";

    }
}



