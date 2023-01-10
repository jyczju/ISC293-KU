/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package time_diff;
import java.util.Scanner;
/**
 *
 * @author 15148
 */
public class Time_diff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int h1, m1, s1, h2, m2, s2, totalsec1, totalsec2, diff, hd, md, sd;
        diff = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the first time in hours, minutes and seconds");
        System.out.print("hour(1): ");
        h1 = input.nextInt();
        System.out.print("minutes(1): ");
        m1 = input.nextInt();
        System.out.print("seconds(1): ");
        s1 = input.nextInt();
        
        System.out.println("Please type the second time in hours, minutes and seconds");
        System.out.print("hour(2): ");
        h2 = input.nextInt();
        System.out.print("minutes(2): ");
        m2 = input.nextInt();
        System.out.print("seconds(2): ");
        s2 = input.nextInt();
        
        totalsec1 = 3600*h1 + 60*m1 + s1;
        totalsec2 = 3600*h2 + 60*m2 + s2;
        
        if(totalsec1 > totalsec2){
            diff = totalsec1 - totalsec2;
        }
        else{
            diff = totalsec2 - totalsec1;
        }
        
        if (diff > 0){
            hd = diff/3600;
            diff = diff -hd * 3600;
            md = diff/60;
            diff = diff -md * 60;
            sd = diff;
            System.out.print(hd+","+md+","+sd);
        }
        else{
            System.out.println("No defference, times are the same");
        }
    }
}
