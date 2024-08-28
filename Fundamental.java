import java.util.*;
public class Fundamental {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println("positive or not:");
        if(number>0){
            System.out.println("Positive numbers");
        }
        else if(number>0){
            System.out.println("Negative numbers");
        }
        else{
            System.out.println("Zero");
        }
        System.out.println("switch ");
        switch (number) {
            case 0:
                System.out.println("Monday");
                break;
                case 1:
                System.out.println("Tuesday");
                break;
                case 2:
                System.out.println("wednesday");
                break;    
                case 3:
                System.out.println("Thursday");
                break;
                case 4:
                System.out.println("Friday");
                break;
                case 5:
                System.out.println("Saturday");
                break;
                case 6:
                System.out.println("Sunday");
                break;
          default:
          System.out.println("Invalid input");
                break;
        }
        System.out.println("for loop");
      for(int i=1;i<=number;i++){
        System.out.println(i+"");
      } 
      System.out.println(" while loop");
      int i=number;
      while(i>0){
        System.out.println(i+"");
        i--;
      }
      System.out.println("do while loop");
      int j=1;
      do{
        System.out.println(j+" ");
        j++;
      }while(j<=number);

    }
    
}
