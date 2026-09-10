package app;

import java.util.Random;

public class SzemelyStatisztika {

    public static void main(String[] args) {
        kiiratas();
    }

    private static void kiiratas() {
        String nev = "Bernadette";
        int szulEv = 1964;
        int aktualisEv = 2026;
        int eletEv = eletkor(szulEv,aktualisEv);
        int nyugdij = 65;
        int hatralevoEv = nyugdijEv(eletEv, nyugdij);
        
        rnd = new Random();
        
        if (!megfeleloEletEv(eletEv)){
            throw new IllegalArgumentException("Az élet év nem lehet kisebb mint 0!");
        }
        
        if (!marNyugdijas(eletEv,nyugdij)){
            throw new IllegalArgumentException("Már nyugdíjas vagy!");
        }
        
        System.out.println(koszontes(nev));
        System.out.println("Életkor: " + eletEv);
        System.out.println("Nyugdíjig hátralévő évek száma: " + hatralevoEv);
        
        /* metódusok:
        köszöntés
        életkor: 2026 -
        nyugdíjig hátrelévő évek száma: 65
        */
    }
    
    private static Random rnd;

    static String koszontes(String nev) {
        return "Hello %s!".formatted(nev);
    }
    
    static String koszontes(String nev, String[] koszontesek){
        /*String[] koszontesek = {"Szia ", "Helló ", "Jó napot "};*/
        return ":)";
    }

    private static int eletkor(int szulEv, int aktualisEv) {
        return aktualisEv-szulEv;
    }

    private static int nyugdijEv(int eletEv, int nyugdij) {
        return nyugdij-eletEv;
    }
    
    private static boolean megfeleloEletEv(int eletEv){
        return eletEv<=0;
    }
    
    private static boolean marNyugdijas(int eletEv, int nyugdij){
        return eletEv<nyugdij;
    }
}
