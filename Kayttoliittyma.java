import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Kayttoliittyma {

    private ArrayList<String> sanat;
    private String sana;
    


    public Kayttoliittyma() {
        this.sanat = new ArrayList<>();
    }

    public void lueTiedosto() {
        try (Scanner lukija = new Scanner(Paths.get("tiedot.txt"))) {

            while (lukija.hasNextLine()) {
                String rivi = lukija.nextLine();
                this.sanat.add(rivi);                             
            }

        }  catch (Exception e) {
            System.out.println("Virhe: tiedostoa ei löydy!" + e.getMessage());
        }              
    }

    public String randomSana() {
        return this.sanat.get((int) Math.random() * this.sanat.size());
    }



}