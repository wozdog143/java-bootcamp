import java.util.Arrays;
import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        //Task 1 – Ask the user: how many historical figures will you register?
        //       – Store the value.
        int numCharacters = scan.nextInt();
        //Task 2 – Create a 2D array with a variable number of rows, and 3 values per row.         
        
        String[][] figures = new String[numCharacters][3];
        scan.nextLine();

        //Watch out for the nextLine() pitfall. 
        /* Task 3 */
        for (int i=0; i < numCharacters; i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            String name = scan.nextLine();   

            System.out.print("\t - Date of birth: ");
            String bday = scan.nextLine();

            System.out.print("\t - Occupation: ");
            String occ = scan .nextLine();

            System.out.print("\n");
            figures[i][0] = name;
            figures[i][1] = bday;
            figures[i][2] = occ;
        }
        
        
        System.out.println("These are the values you stored:"); 
        //Task 4: call print2DArray. 
        print2DArray(figures);

        System.out.print("\nWho do you want information on? ");  
        String searchName = scan.nextLine();

        for (int i=0; i<figures.length; i++) {
            if (searchName.equals(figures[i][0])) {
                System.out.println("\t" + "Name: " + figures[i][0]);
                System.out.println("\t" + "DOB: " + figures[i][1]);
                System.out.println("\t" + "Occupation: " + figures[i][2]);
            }
        }
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] figures) {
        for (String[] figure : figures) {
            System.out.println("\t" + Arrays.toString(figure));
        }
    }

}
