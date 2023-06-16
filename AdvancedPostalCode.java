/**
* Validate Postal Code
*
* @author Ekamjit Singh Sidhu and StNum: 3114221
*/
import java.util.Random;
import java.util.Scanner;

public class AdvancedPostalCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a Postal Code:");
        String postalCode = scanner.nextLine();
        boolean valid1,valid2,valid3,valid4,valid5,valid6,valid7=false;
        
        if (postalCode.length()==7) {
        	
        if (Character.isLetter(postalCode.charAt(0))) {
        	valid1=true;
        	}else {
        		valid1=false;
        		System.out.println("Character X at 0 is not right");}
        if (Character.isDigit(postalCode.charAt(1))) {
        	valid2=true;
        	}else {
        		valid2=false;
        		System.out.println("Number at 1  is not right");}
        if (Character.isLetter(postalCode.charAt(2))) {
        	valid3=true;
        	}else {
        		valid3=false;
        		System.out.println("Character X at 2 is not right");}
        if (Character.isWhitespace(postalCode.charAt(3))) {
        	valid4=true;
        	}else {
        		valid4=false;
        		System.out.println("Value at 5 is not right");}
        if (Character.isDigit(postalCode.charAt(4))) {
        	valid5=true;
        	}else {
        		valid5=false;
        		System.out.println("Number at 4  is not right");}        
        if (Character.isLetter(postalCode.charAt(5))){
        	valid6=true;
        	}else {
        		valid6=false;
        		System.out.println("Character X at 5 is not right");}
        if (Character.isDigit(postalCode.charAt(6))) {
        	valid7=true;
           }else {
                valid7=false;
            	System.out.println("Number at 6  is not right");}
        	
        
        if (valid1==true && valid2==true && valid3==true && valid4==true && valid5==true && valid6==true && valid7==true) {
         System.out.println("The postal code is valid.");
        }else {
         System.out.println("The postal code is not valid.");
        }
        }else {
        	System.out.println("The length of the postal code is not correct");
        }
	}
}
