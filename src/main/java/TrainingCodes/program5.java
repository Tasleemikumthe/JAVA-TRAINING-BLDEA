package TrainingCodes;
/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class program5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		
		if(age < 18) {
			System.out.println("you are still minor.");
		}
		else if(age > 65) {
			System.out.println("you are senior citizen");
		}
		else {
			System.out.println("congratulation yor are eligible...:)");
		}
	}

}
