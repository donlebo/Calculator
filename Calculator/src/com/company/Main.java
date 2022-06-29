package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n0) Exit \n1) Calcolatrice");
        System.out.print("\nFai la tua scelta: ");

        int menu;

        try {
            menu = input.nextInt();
        } catch (Exception e) {
            menu = 2;
            System.out.println("Nessun numero è stato inserito.");
        }

        switch (menu) {
            case 0: {
                System.out.println("Chiusura programma.");
                break;
            }
            case 1: {
                System.out.println("Avvio calcolatrice.");
                scelta();
                break;
            }
            default: {
                System.out.println("\nScelta inestistente, riprova");
                scelta();
                break;
            }
        }
    }

    public static void scelta() {
        Scanner input = new Scanner(System.in);
        boolean termina = false;
        do {
            calcolatrice();
            String s;
            do {
                System.out.print("\nContinuare? [y/N]: ");
                s = input.nextLine();
            } while (!(s.equalsIgnoreCase("n") || s.equalsIgnoreCase("y")));
            termina = "n".equalsIgnoreCase(s);
        } while(!termina);
        System.out.println("Chiusura programma");
    }

    public static int numeroElementi(){
        Scanner numeriInput = new Scanner(System.in);
        System.out.print("\nInserire numero elementi: ");

        return numeriInput.nextInt();
    }

    public static float[] inputElementi(int len){
        Scanner numeriInput = new Scanner(System.in);
        float[] arr = new float[len];

        for(int i = 0; i < len; i++){
            System.out.print("Inserisci elemento: ");
            arr[i] = numeriInput.nextInt();
        }
        return arr;
    }

    public static void calcolatrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n1) Somma\n2) Sottrazione\n3) Moltiplicazione\n4) Divisione");
        System.out.print("\nFai la tua scelta: ");
        int scelta = input.nextInt();

        switch(scelta) {
            case 1: {
                somma(inputElementi(numeroElementi()));
                break;
            }
            case 2: {
                sottrazione(inputElementi(numeroElementi()));
                break;
            }
            case 3: {
                moltiplicazione(inputElementi(numeroElementi()));
                break;
            }
            case 4: {
                divisione(inputElementi(numeroElementi()));
                break;
            }
            default: {
                System.out.println("Scelta inesistente.");
                break;
            }
        }
    }

    public static float somma(float[] arr) {
        System.out.println("\nHai scelto somma.");

        float sommaNumeri = 0;
        for (int i = 0; i < arr.length; i++) {
            sommaNumeri += arr[i];
        }

        System.out.println("Il risultato della somma è: " + sommaNumeri);

        return sommaNumeri;
    }

    public static float sottrazione(float[] arr) {
        System.out.println("\nHai scelto sottrazione.");

        float sottrazioneNumeri = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sottrazioneNumeri -= arr[i];
        }

        System.out.println("Il risultato della sottrazione è: " + sottrazioneNumeri);

        return sottrazioneNumeri;
    }

    public static float moltiplicazione(float[] arr) {
        System.out.println("\nHai scelto moltiplicazione.");

        float moltiplicazioneNumeri = arr[0];
        for (int i = 1; i < arr.length; i++) {
            moltiplicazioneNumeri *= arr[i];
        }

        System.out.println("Il risultato della moltiplicazione è: " + moltiplicazioneNumeri);

        return moltiplicazioneNumeri;
    }

    public static float divisione(float[] arr) {
        System.out.println("\nHai scelto divsione.");

        float divisioneNumeri = arr[0];
        for (int i = 1; i < arr.length; i++) {
            divisioneNumeri /= arr[i];
        }

        System.out.println("Il risultato della divisione è: " + divisioneNumeri);

        return divisioneNumeri;
    }
}