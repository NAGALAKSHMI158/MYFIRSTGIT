import java.util.*;
public class palindrome
{
	public static void main (String[] args){


    Scanner a = new Scanner(System.in);
    System.out.print("enter any number: ");
    System.out.println("Hello Im coming from gomathi branch");
    int num = a.nextInt();
    int reversednumber=0; int remainder,originalnumber;
    originalnumber = num; 
    while(num!=0){
    	remainder = num%10;
    	reversednumber=reversednumber*10+remainder;
    	num=num/10;
    }
if(originalnumber==reversednumber){
	System.out.println("it's a palindrome");
}
else{
	System.out.println("it's not a palindrome");
}
}
}