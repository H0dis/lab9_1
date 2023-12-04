package org.example;

public class Masina {
    private String marca;
    private int anFabricatie;
    private String culoare;
    public Masina(String marca, int anFabricatie, String culoare) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.culoare = culoare;
    }
    public void afiseazaInformatii() {
        System.out.println("Marca: " + marca);
        System.out.println("An fabricatie: " + anFabricatie);
        System.out.println("Culoare: " + culoare);
    }
    public static void main(String[] args) {
        Masina masina1 = new Masina("Ford", 1965, "alb");
        Masina masina2 = new Masina("BMW", 2006, "negru");
        Masina masina3 = new Masina("Audi", 2004, "albastru");

    }
}