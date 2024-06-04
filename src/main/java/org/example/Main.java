package org.example;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");
        Navegador chrome = new NavegadorChrome();
        Navegador firefox = new NavegadorFirefox();

        chrome.localizarElemento("#botonInicio");
        chrome.hacerClic("#botonInicio");
        chrome.ingresarTexto("#campoBusqueda", "Hola Mundo");

        firefox.localizarElemento("#botonInicio");
        firefox.hacerClic("#botonInicio");
        firefox.ingresarTexto("#campoBusqueda", "Hola Mundo");


    }
}