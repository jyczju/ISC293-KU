/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sort;
import java.util.Scanner;

/**
 *
 * @author 15148
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0, j = 0, X;
        Scanner input = new Scanner(System.in);
        System.out.println("input N:");
        int N = input.nextInt();
        int[] A = new int[N];
        for(i=0;i<N;i++){
            System.out.println("input array["+i+"]:");
            A[i] = input.nextInt();
        }
        
        for(j=1;j<N-1;j++){
            for(i=0;i<N-1;i++){
                if (A[i] > A[i+1]){
                    X = A[i];
                    A[i] = A[i+1];
                    A[i+1] = X;
                }
            }
        }
        
        System.out.println("sorted array: ");
        for(i=0;i<N;i++){
            System.out.print(A[i]+", ");
        }
        
        
    }
    
}
