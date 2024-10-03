import java.util.Scanner;

public class Tree {

    public static void main(String[] args){

        System.out.println("Dieses Programm malt einen Baum für dich :)");
        Scanner input = new Scanner(System.in); // Reading from System.in
        System.out.println("Wähle die Anzahl der Zacken: ");
        int zacken = input.nextInt(); // Scans the next token of the input as an int
        // Once finished
        input.close();
        int i=1;

        while (i <= zacken) {

            if (i==1){
                System.out.println(Lücken(zacken+3)+ "/\\");
                System.out.println(Lücken(zacken+2)+ "/__\\");
            }
            else{
                int j = i-1;
                while (j < i){
                    System.out.println(Lücken(zacken-j+3) +"/ "+Lücken(2*j)+"\\");
                    j++;
                }
                System.out.println(Lücken(zacken-j+3) +"/"+Striche(j*2)+"\\");
            }

            i++;

        }

        System.out.println(Lücken(zacken+3) +"_|_");
        System.out.println("Bitte sehr, dein Baum :)");
    }

    public static String Lücken(int zacken)
    {
        String space="";
        int j=1;
        while (j < zacken){
        space = space + ' ';
        j++;
        }
        return(space);
    }

    public static String Striche(int zacken)
    {
        String space="";
        int j=0;
        while (j < zacken){
        space = space + '_';
        j++;
        }
        return(space);
    }
}
