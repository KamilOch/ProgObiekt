package Cwiczenie5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main (String [] args){

        System.out.println("A kuku");

        List<Osoba> listaOsob = new ArrayList<Osoba>();

        Scanner odczyt = new Scanner (System.in);

        for (int i =1; i<11;i++){
            String imie;
            String nazwisko;
            System.out.println("Podaj imie dla osoby "+ i);
            imie = odczyt.nextLine();
            System.out.println("Podaj nazwisko dla osoby "+ i);
            nazwisko = odczyt.nextLine();
            listaOsob.add(new Osoba(imie,nazwisko));

        }
        System.out.println("Rozmiar listy to: "+listaOsob.size());
        System.out.println("juz mam dane");

        for (int i = listaOsob.size(); i>0; i--) {
            System.out.println("imie " + listaOsob.get(i-1).getImie() + " nazwisko " + listaOsob.get(i-1).getNazwisko());
        }
    }
}
