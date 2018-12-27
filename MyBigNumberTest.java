import javaapplication1.MyBigNumber;
import java.util.*;

/**
 *
 * @author Phuc Nguyen
 * This file is using for user to enter 2 string from keyboard and see the step by step of sum method
 */

class  MyBigNumberTest{
    public static void main(String[]args){	
        MyBigNumber mb = new MyBigNumber();
	Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1: ");
        String s1 = sc.nextLine();
        
        System.out.println("Enter number 2: ");
	String s2 = sc.nextLine();
	
        System.out.println("Result: "+ mb.sum(s1,s2));
	}
}
