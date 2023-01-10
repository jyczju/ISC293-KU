package exam3.jiang_yancheng;
import java.util.Scanner;

public class Exam3JIANG_Yancheng {
    public static void main(String[] args) {
        int hour,minute;
        float fee;
        Scanner input = new Scanner(System.in);

// method 1
//        System.out.print("Please input the number of hours in parking:");
//        hour = input.nextInt();
//        System.out.print("Please input the number of minutes in parking:");
//        minute = input.nextInt();
//        
//        while ((hour > 24) || (hour < 0) || (minute > 59) || (minute < 0)){
//            System.out.println("Please input valid values! ");
//            System.out.print("Please input the number of hours in parking:");
//            hour = input.nextInt();
//            System.out.print("Please input the number of minutes in parking:");
//            minute = input.nextInt();
//        }
        
//method 2
        do{
            System.out.println("Please input valid values for hours and minutes: ");
            System.out.print("Please input the number of hours in parking:");
            hour = input.nextInt();
            System.out.print("Please input the number of minutes in parking:");
            minute = input.nextInt();
        }while ((hour > 24) || (hour < 0) || (minute > 59) || (minute < 0));
  
        
        if ((hour <= 0) && (minute <= 0)){
           fee = 0;
        }
        else{
            if(minute > 0){
                hour ++;
            }
            fee = 7;
            if((hour >= 2)&&(hour <= 5)){
                fee = fee+(hour-1)*5;
            }
            if(hour>5){
                fee = fee+4*5+(hour-5)*10;
            }
        }
        System.out.print("The Total Parking Fee is: ");
        System.out.println(fee); 
    }
}
