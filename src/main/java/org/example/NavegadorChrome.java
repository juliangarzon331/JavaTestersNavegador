package org.example;

public class NavegadorChrome extends Navegador {

    public NavegadorChrome() {
        super("Chrome");
    }

    @Override
    public void localizarElemento(String selector) {
        System.out.println("Chrome: Localizando elemento con selector: " + selector);
    }

    @Override
    public void hacerClic(String selector) {
        System.out.println("Chrome: Haciendo clic en el elemento con selector: " + selector);
    }

    @Override
    public void ingresarTexto(String selector, String texto) {
        System.out.println("Chrome: Ingresando texto '" + texto + "' en el elemento con selector: " + selector);
    }
}
