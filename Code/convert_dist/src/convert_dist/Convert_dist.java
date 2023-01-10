/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convert_dist;
import java.util.Scanner;

/**
 *
 * @author 15148
 */
public class Convert_dist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int option,feet,inch;
        float meter,totalfeet;
        System.out.println("Plz input option:");
        option = input.nextInt();
        
        if(option == 1){
            System.out.println("Plz input feet:");
            feet = input.nextInt();
            System.out.println("Plz input inch:");
            inch = input.nextInt();
            meter = (float)(feet*0.3048) + (float)(inch*0.0254);
            System.out.print("Meter:");
            System.out.println(meter);
        }
        if(option == 2){
            System.out.println("Plz input meter:");
            meter = input.nextInt();
            feet = (int)(meter/0.3048);
            totalfeet = (float)(meter/0.3048);
            inch = (int)((totalfeet - feet)*12);
            System.out.print("Feet Inches:");
            System.out.println(feet+", "+inch);
        }
        
        
    }
    
}
