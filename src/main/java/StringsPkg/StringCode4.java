/**
 * 
 */
package StringsPkg;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class StringCode4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String-1: ");
		String str1=sc.next(); 
		System.out.println("Enter the String-2: ");
		String str2=sc.next();
		
		if(str1.equalsIgnoreCase(str2)==true) {
			System.out.println("strings are Equal. ");
		}
		else {
			System.out.println("strings are not equal.");
		}
	}

}
