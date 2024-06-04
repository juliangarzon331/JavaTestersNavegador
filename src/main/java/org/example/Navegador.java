package org.example;

public abstract class Navegador implements AccionesNavegador {

    protected String tipoNavegador;

    public Navegador(String tipoNavegador) {
        this.tipoNavegador = tipoNavegador;
    }

    public String getTipoNavegador() {
        return tipoNavegador;
    }
    @Override
    public abstract void localizarElemento(String selector);
    @Override
    public abstract void hacerClic(String selector);
    @Override
    public abstract void ingresarTexto(String selector, String texto);



}
