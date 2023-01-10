/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatureconvert;

/**
 *
 * @author 15148
 */
public class TemperatureConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float fahr, cels;
        int lower,upper,step;
        
        lower = 0;
        upper = 300;
        step = 20;
        
        fahr = lower;
        System.out.println("Fahr To Cels");
        while(fahr <= upper)
        {
            cels = 5*(fahr-32)/9;
            System.out.print(fahr);
            System.out.print("  ");
            System.out.println(cels);
            fahr = fahr + step;
        }
    }
    
}
