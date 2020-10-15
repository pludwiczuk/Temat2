package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        // Funkcja println() słóży do wyświetlania dnaych z programu na konsoli.
        // Pętla do-while wykona się przy najmniej jeden raz nie zależnie czy warunek w niej będzie prawdziwy. Pental while tylko wtedy gdy warunek będzie się zgadzał.
        // Wartość logiczną można pobrać po przez metodę nextBoolean().


        //Aby móc odpalić jakiekolwiek zadanie, należy zakomentować wszystkie inne.

        Scanner czyt = new Scanner(System.in);
        //2
        System.out.println("Podaj byte: ");
        byte b = Byte.parseByte(czyt.nextLine());
        System.out.println(b);

        System.out.println("Podaj short: ");
        short s = Short.parseShort(czyt.nextLine());
        System.out.println(s);

        System.out.println("Podaj int: ");
        int i = Integer.parseInt(czyt.nextLine());
        System.out.println(i);

        System.out.println("Podaj long: ");
        long l = Long.parseLong(czyt.nextLine());
        System.out.println(l);

        System.out.println("Podaj float: ");
        float f = Float.parseFloat(czyt.nextLine());
        System.out.println(f);

        System.out.println("Podaj double: ");
        double d = Double.parseDouble(czyt.nextLine());
        System.out.println(d);

        System.out.println("Podaj char: ");
        char c = czyt.nextLine().charAt(0);
        System.out.println(c);

        System.out.println("Podaj boolean: ");
        boolean boo = Boolean.parseBoolean(czyt.nextLine());
        System.out.println(boo);

        //3
        System.out.println("Podaj imie:");
        String imie = czyt.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko = czyt.nextLine();
        System.out.println("Podaj płeć:");
        String plec = czyt.nextLine();
        System.out.println("Podaj wiek:");
        int wiek = Integer.parseInt(czyt.nextLine());
        System.out.println("Imie: "+imie+" Nazwisko: "+nazwisko+" Płeć: "+plec+" Wiek: "+wiek);

        //4
        for(int i=-1000;i<=1001;i+=3) {
            System.out.println(i);
        }

        //5
        int[] tab = new int[3];
        System.out.println("Podaj pierwszą liczbę:");
        tab[0] = czyt.nextInt();
        System.out.println("Podaj drugą liczbę:");
        tab[1] = czyt.nextInt();
        System.out.println("Podaj trzecią liczbę:");
        tab[2] = czyt.nextInt();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<3;i++) if(tab[i]>max) max=tab[i];
        System.out.println("Maksymalna liczba to: "+max);

        //6
        String wejscie="";
        double l1;
        double l2;
        while(!wejscie.equals("q")) {

            System.out.println("Podaj pierwszą liczbę: ");
            if(!(wejscie=czyt.nextLine()).equals("q")) {
                l1=Double.parseDouble(wejscie);
                System.out.println("Podaj drugą liczbę: ");
                if(!(wejscie=czyt.nextLine()).equals("q")) {
                    l2=Double.parseDouble(wejscie);
                    System.out.println("Podaj działanie arytmetyczne:");
                    wejscie=czyt.nextLine();
                    switch(wejscie) {
                        case "+" : System.out.println("Wynik: "+(l1+l2)); break;
                        case "-" : System.out.println("Wynik: "+(l1-l2)); break;
                        case "*" : System.out.println("Wynik: "+(l1*l2)); break;
                        case "/" : System.out.println("Wynik: "+(l1/l2));
                        case "q" : break;
                    }
                }
            }
        }

        //7
        System.out.println("Podaj pirwszą liczbę: ");
        int x1 = czyt.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int x2 = czyt.nextInt();
        while(x2!=0) {
            int x3 = x1%x2;
            x1 = x2;
            x2 = x3;
        }
        System.out.println("NWD podanych liczb wynosi: "+x1);

        //8
        int[][] tab = new int[20][20];
        Random rand = new Random();
        for(int i=0;i<20;i++) {
            for(int j=0;j<20;j++) {
                tab[i][j]=rand.nextInt()%400+1;
            }
        }
        System.out.println("Podaj liczbę do znalezienia z zakresu od 1 do 400");
        int liczba=czyt.nextInt();
        boolean znaleziono=false;
        for(int i=0;i<20;i++) {
            for(int j=0;j<20;j++) {
                if(tab[i][j]==liczba) {
                    System.out.println("Wspołrzędne podanej liczby to: x="+i+" y="+j);
                    znaleziono=true;
                }
            }
        }
        if(!znaleziono) System.out.println("Nie znaleziono podanej liczby!");
    }
}
