/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apabole;

/**
 *
 * @author rizki
 */
public class ApaBole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        print(100);
    }
    
    public static void print(int times) {
        StringBuilder buffer = new StringBuilder();
        for (int i = 1; i <= times; i++) {
 
            String chunk = check(i) + ", ";
            buffer.append(chunk);
        }
        System.out.print(buffer.toString());
    }
    public static String check(int number) 
    {
    	String word;
        if (((number % 3) == 0) && ((number % 5) == 0)) // bisa dibagi 3 DAN 5?
            word = "ApaBole";
        else if ((number % 3) == 0) // bisa dibagi 3?
            word = "Apa";
        else if ((number % 5) == 0) // bisa dibagi 5?
            word = "Bole";
        else
            word = String.valueOf(number)   ; // tidak bisak dibagi 3 dan 5
        return word;
    }
    
}
