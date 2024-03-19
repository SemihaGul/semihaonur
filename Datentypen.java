
public class Datentypen {

     public static void main(String[] args) {

        //textdatei
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Name eingeben");
        String text = eingabe.next();
        System.out.println("Hallo " + text + "!");

        //zahl eingabe
        System.out.println("Gib eine Zahl ein: ");
        text = eingabe.next();
        int zahl = Integer.parseInt(text);
        System.out.println("Zahl: " + zahl);

        //möglichkeit 1
        System.out.println("Gib eine Zahl ein: " );
        zahl = eingabe.nextInt();
        System.out.println("Zahl: " + zahl);

        //möglichkeit 2
        System.out.println("Gib eine Zahl ein: ");
        double dZahl = eingabe.nextdouble();
        system.out.println("Zahl: " + dZahl);

        //richtig, falsch
        boolean istWahr = false;
        System.out.println(istWahr);
        istWahr = true;
        System.out.println(istWahr);


        System.out.println("Text eingeben ");
        text = eingabe.next();
        System.out.println(text);
        char erstesZeichen = text.charAt(0);
        System.out.println(erstesZeichen);
        erstesZeichen = text.charAt(1);
        System.out.println(erstesZeichen);

      }


}
