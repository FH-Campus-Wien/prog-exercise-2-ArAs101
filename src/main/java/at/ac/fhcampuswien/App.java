package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        float maximum = 0;
        do {
            System.out.print("Number 1: ");
            float number = scanner.nextFloat();
            if (number <= 0) {              // 1. Zahl <= 0
                System.out.println("No number entered.");
                return;
            } else maximum = number;
            for (int i = 2; i >= 2; i++) {
                System.out.print("Number " + i + ": ");
                number = scanner.nextFloat();
                if (number > maximum) {
                    maximum = number;
                }
                if (number <= 0) {                              // Ende der Eingabe zeigt größte Zahl
                    //The following line of Code has been taken from the Internet | https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java, last visit: 30.09.2022
                    System.out.printf("The largest number is " + "%.2f", maximum);
                    System.out.println();
                    return;
                }
            }
        } while (1 == 1);
    }

    //todo Task 2
    public void stairs() {
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int zeilen = scanner.nextInt();
        if (zeilen <= 0) {
            System.out.println("Invalid number!");
        } else {
            int number = 1;
            for (int CurrentLine = 0; CurrentLine < zeilen; CurrentLine++) {
                for (int Column = 0; Column <= CurrentLine; Column++) {
                    System.out.print(number + " ");
                    number += 1;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        int reihen = 6;
        int sterne = 1;
        for (int reihe = 0; reihe < reihen; reihe++) {
            int blanks = (11-sterne)/2;
            for (int i = 0; i < blanks; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < sterne; j++) {
                System.out.print("*");
            }
            System.out.println();
            sterne += 2;
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);
        if (h % 2 == 0) {
            System.out.println("Invalid number!");
            return;
        }

        for (int i = 0; i < 1; i++) {               // Anfang und Ende der Raute
            System.out.print("  ");
            System.out.println(c);
            System.out.print(" ");
            String tempAufbau = (char) (c - 1) + "" + c + "" + (char) (c - 1);
            System.out.println(tempAufbau);
            for (int zeileAufbau = 2; zeileAufbau <= (h-1)/2; zeileAufbau++) {
                tempAufbau = (char) (c - zeileAufbau) + tempAufbau + (char) (c - zeileAufbau);
                System.out.println(tempAufbau);
            }

            String tempAbbau = tempAufbau;
            for (int zeileAbbau = -1 + ((h-1)/2); zeileAbbau >= 2; zeileAbbau--) {
                int j = 1;
                j++;
                tempAbbau = tempAbbau.substring(j);
                System.out.println(tempAbbau);

                tempAbbau = tempAbbau.substring(0, tempAbbau.length()-1);
                System.out.println("  " + tempAbbau);
            }
            System.out.print(" ");
            System.out.println( (char) (c - 1) + "" + c + "" + (char) (c - 1));
            System.out.print("  ");
            System.out.println(c);
        }
    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        double grades = 0;
        int NegMarks = 0;
        for (int i = 1; i >= 0; i++) {
            System.out.print("Mark " + i + ": ");
            int grade = scanner.nextInt();

            if (grade > 0 && grade < 6) {
                grades += grade;
            }
            if (grade == 5) {
                NegMarks += 1;
            }
            if (grade > 5) {
                System.out.println("Invalid mark!");
                System.out.print("Mark " + (i) + ": ");
                grade = scanner.nextInt();
                if (grade == 5) {
                    NegMarks += 1;
                }
                grades += grade;
            }
            if (grade == 0 && grades == 0) {
                float average = 0;
                System.out.print("Average: ");          // The following line of Code has been taken from the Internet | https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java, last visit: 02.10.2022
                System.out.printf("%.2f", average);
                System.out.println();
                System.out.println("Negative marks: " + NegMarks);
                return;
            } else if (grade == 0 && i > 0) {
                    float average = (float) grades/(i-1);
                    System.out.print("Average: ");      // The following line of Code has been taken from the Internet | https://stackoverflow.com/questions/2538787/how-to-print-a-float-with-2-decimal-places-in-java, last visit: 02.10.2022
                    System.out.printf("%.2f", average);
                    System.out.println();
                    System.out.println("Negative marks: " + NegMarks);
                    return;
                }
        }
    }

    //todo Task 6
    public void happyNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int summe = 0;

        int hunderterstelle = n / 100;
        int zehnerstelle = (n / 10) % 10;
        int einerstelle = n % 10;
        summe = hunderterstelle * hunderterstelle + zehnerstelle * zehnerstelle + einerstelle * einerstelle;

        for (int i = 0; i <= 20; i++) {
            hunderterstelle = summe / 100;
            zehnerstelle = (summe / 10) % 10;
            einerstelle = summe % 10;

            summe = hunderterstelle * hunderterstelle + zehnerstelle * zehnerstelle + einerstelle * einerstelle;

            if (summe == 1) {
                System.out.println("Happy number!");
                return;
            }
            if (summe == 4) {
                System.out.println("Sad number!");
                return;
            }
        }
    }

    public static void main(String[] args) {
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}