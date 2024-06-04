package org.example;

public class NavegadorFirefox extends Navegador{

    public NavegadorFirefox() {
        super("Firefox");
    }

    @Override
    public void localizarElemento(String selector) {
        System.out.println("Firefox: Localizando elemento con selector: " + selector);
    }

    @Override
    public void hacerClic(String selector) {
        System.out.println("Firefox: Haciendo clic en el elemento con selector: " + selector);
    }

    @Override
    public void ingresarTexto(String selector, String texto) {
        System.out.println("Firefox: Ingresando texto '" + texto + "' en el elemento con selector: " + selector);
    }

}
