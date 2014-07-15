import java.io.Console;
import java.util.Scanner;

public class Taschenrechner {

    static String programmname = "Taschenrechner";
    static double eingabe;
    static float version = 0.1f;    
    private static void main(String args[]) {

        System.out.println(programmname + " " + version);
        
        while (eingabe != -1) {
        
            System.out.println("Was wollen Sie Berechnen? \n 1)+ \n 2)- \n 3)* \n 4)\\");
            eingabe = zahlEinlesen();
            System.out.println("Sie haben :" + eingabe + " gewählt");

            if (eingabe == 1) {
                System.out.println("Sie wollen addieren, geben Sie Zahl 1 und Zahl 2 ein");
                System.out.println("Ergebnis: "
                        + addiere(zahlEinlesen(), zahlEinlesen()) +"\n");
            }
        }
    }

    static double zahlEinlesen() {
        Scanner scan = new Scanner(System.in);       
        return Double.valueOf( scan.next() );
        }
     static double addiere(double a, double b) {

        return a + b;
    }
}
