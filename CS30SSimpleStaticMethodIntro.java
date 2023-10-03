import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Simple static method intro
 * 
 *  Description:    A first example of the use of static methods
 *                  in Java
 * 
 *************************************************************/

public class CS30SSimpleStaticMethodIntro {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int n = 0;      // number to be cubed
        int cube = 0;   // the cube of the number
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        prompt = "enter an int";
        n = getIntFromKeyboard(scanner, prompt);      // calls the method getIntFromKeyboard
        //System.out.println(n);
        int n1 = getIntFromKeyboard(scanner, prompt);
        //System.out.println(n1);
        
        cube = cubeInt(n);      // call the cubeInt method
        //System.out.println("cube " + cube);
        
        // can also invoke a returning method like this
        //System.out.println(n + "^3 = " + cubeInt(n));
    
    // ***** Main Processing *****
    
        // calculate the cube of n
    
    // ***** Print Formatted Output *****
    
        printResult(n, cube);     // method call
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    public static void printResult(int number, int c){
        System.out.print(number);
        System.out.print("^3 = ");
        System.out.println(c);
    }// end printResult
    
    public static int cubeInt(int n){
        int temp = n * n * n;
        
        return temp;
    }// end cubeInt
    
    public static int getIntFromKeyboard(Scanner scanner, String p){
        // Local vars
        int n;
        
        System.out.println(p);
        n = scanner.nextInt();
        System.out.println(n);
        
        return n;
    }// end get int from keyboard
    
} // end FormatTemplate
