package TrainingCodes;
/**
 * 
 */

/**
 * @author user
 *
 */
import java.util.Scanner;
public class Program8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("$ ");
			}
				else {
					System.out.println("- ");
				}
			}
			System.out.println();
		}

	}

}
