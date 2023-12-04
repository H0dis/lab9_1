package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class UtilClass {
    private Masina masina;

    public UtilClass() {}


    public void adaugaFisier(Masina masina) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("util1.json"), masina);
        objectMapper.writeValue(new File("util2.json"), masina);
        objectMapper.writeValue(new File("util3.json"), masina);
    }

    public Masina citesteFisier() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(Paths.get("util.json").toFile(), Masina.class);
    }


}