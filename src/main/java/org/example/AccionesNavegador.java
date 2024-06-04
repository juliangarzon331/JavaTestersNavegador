package org.example;

public interface AccionesNavegador {

    void localizarElemento(String selector);
    void hacerClic(String selector);
    void ingresarTexto(String selector, String texto);

}
