/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personalaccounts;
import java.util.Scanner;

/**
 *
 * @author 15148
 */
public class PersonalAccounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        Scanner input = new Scanner(System.in);
//        short ClientID;
//        String ClientName;
//        byte Age;
//        char Gender;
//        String DateofBirth;
//        String ClientPostalAddress;
//        int AccountNumber;
//        float AccountBalance;
//        boolean PremiumAccount;
//        
//        ClientID = 21555;
//        ClientName = "Mr John Smith";
//        Age = 24;
//        Gender = 'M';
//        DateofBirth = "21/03/1990";
//        ClientPostalAddress = "New York, USA";
//        AccountNumber = 65000;
//        PremiumAccount = true;
//        AccountBalance = 1236700.80f;
//        
//        System.out.println("....................");
//        System.out.println("Client ID = "+ClientID);
//        
//        System.out.println("Please Type ClientID:");
//        ClientID = input.nextShort();
//        input.nextLine();
//        System.out.println("Client ID = "+ClientID);

   
        int [] Ages;
        int i;
int Max=30, Min=18;Ages = new int [ 10] ;
for(i=0 ;i<5;i++) Ages [i]=i+Min;
for(i=5;i<10;i++) Ages[i]=Max-i;
Max=0;
for (i=0;i<10 ;i++)
{ if(Ages [ i ] >Max) Max=Ages [ i] ;if(Ages [i]<Min) Min=Ages [ i];}
System.out.println ( "The values in the array are: ") ;
for (i=0 ; i<10 ;i++)
{ System.out.print (Ages [ i] );
System.out.print ( "-—") ;}
System.out.println ( "The Min Age is :"+Min) ;
System.out.println ( "The Max Age is : "+Max) ;
        
        
        
        
    }
    
}
