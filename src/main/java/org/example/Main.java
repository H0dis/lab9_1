package org.example;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Masina masina1 = new Masina("Ford", 1965, "alb");
        Masina masina2 = new Masina("BMW", 2006, "negru");
        Masina masina3 = new Masina("Audi", 2004, "albastru");

        UtilClass utilClass = new UtilClass();

        utilClass.adaugaFisier(masina1);
        utilClass.adaugaFisier(masina2);
        utilClass.adaugaFisier(masina3);


        Masina masinaCitita1 = utilClass.citesteFisier("util1.json");
        masinaCitita1.afiseazaInformatii();

        Masina masinaCitita2 = utilClass.citesteFisier("util2.json");
        masinaCitita2.afiseazaInformatii();

        Masina masinaCitita3 = utilClass.citesteFisier("util3.json");
        masinaCitita3.afiseazaInformatii();
    }
}
