package TrainingCodes;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author user
 *
 */
public class Program21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		int count=1;
		for(int i=1; i<=n; i++) {
			count=i;
			for(int j=1; j<=n; j++) {
				System.out.print(count+"  ");
				count=count+5;
			}
			System.out.println();
		}
	}

}
