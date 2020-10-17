import java.util.*;
import java.util.Date;
public class palindrome
{
	public static void main (String[] args){
    Date date = new Date();
    System.out.println("Printing current date:"+date);
    Scanner a = new Scanner(System.in);
    System.out.print("enter any number: ");
    System.out.println("Hello Im coming from gomathi branch");

    System.out.println("================================");
    int num = a.nextInt();
    int reversednumber=0; int remainder,originalnumber;
    originalnumber = num; 
    while(num!=0){
    	remainder = num%10;
    	reversednumber=reversednumber*10+remainder;
    	num=num/10;
    }
if(originalnumber==reversednumber){
	System.out.println("THE GIVEN NUMBER IS A PALINDROME");
}
else{
	System.out.println("THE GIVEN NUMBER IS NOT A PALINDROME");
	System.out.println("from remote branch");
}
}

//Adding new comment
/*
*
*   Author: Sankar
*/
//adding a new commit number1

}
