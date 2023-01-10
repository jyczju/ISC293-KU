/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project81;
import java.util.Scanner;

/**
 *
 * @author 15148
 */
public class Project81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Months;
        int AdultRabbits = 2;
        int BabyRabbits = 0;
        int TotalRabbits;
        int i = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the number of months:"); 
        Months = input.nextInt();

        AdultRabbits = 2;
        BabyRabbits = 0;
        TotalRabbits = AdultRabbits + BabyRabbits;
        
        for(i=1;i<=Months;i++){
            BabyRabbits = AdultRabbits;
            AdultRabbits = TotalRabbits;
            TotalRabbits = AdultRabbits + BabyRabbits;
            System.out.print("Month " + i + ": AdultRabbits: " + AdultRabbits + "; BabyRabbits: " + BabyRabbits);
            System.out.println(" TotalRabbits: " + TotalRabbits);
        }
    }
    
}
