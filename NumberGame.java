import java.util.Scanner;
import java.util.*;
import java.util.Random;	
class test{
    static void numbergame(){
        // List<Integer> list =new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int select,n;
        // for(int i=1;i<=100;i++){
        //     list.add(i);
        // }
        Random rand=new Random();
        select=rand.nextInt(100)+1;
        // System.out.println("random number is: "+select);
        for(int j=0;j<3;j++){
        System.out.println("Please enter your guess number: ");
        n=sc.nextInt();
        if(n==select){
        System.out.println("WIN");
        break;
        }
        else if(n<select)
        System.out.println("Too Small");
        else 
        System.out.println("Too Large"); 
        if(j==2)
        System.out.println("YOU LOST");
        }      
    }
}
class NumberGame {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    test.numbergame();
   
   int i=1;

   while(i>0){
    System.out.println("Are You Want To Play Again ?  (Y/N)");
    String s=sc.next();
    if(s.equalsIgnoreCase("Y")){
        test.numbergame();
    }
    else {
        System.out.println("Thanks For Playing");
    break;

        }
            i++;
   }
}
}