/**
 * 
 */
package TrainingCodes;

/**
 * @author user
 *
 */
import java.util.Scanner;
public class ArrayCode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the count of Classes :");
		Scanner sc=new Scanner(System.in);
		int cls=sc.nextInt();
		System.out.println("Enter the count of Students in each Classe :");
		int stu=sc.nextInt();

		int arr[][] = new int [cls][stu];
		
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the Marks  of Student "+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("-----------------------------------------------------");
		for(int i=0;i<cls;i++) {
			System.out.println("Inside the class"+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println("Enter the Marks  of Student "+(j+1)+ "is "+arr[i][j]);
			}
		}
	}

}
