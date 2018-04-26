import java.util.Scanner;

public class One_array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int [] su = new int[5];

		System.out.println("Input 5 numbers");

		for(int i=0; i<su.length; i++) {

			su[i] = scanner.nextInt();

		}
		for(int z = 0; z<su.length; z++)
			if(su[z] % 5 == 0 && su[z] % 4 == 0 && su[z]>10) {
				System.out.println(su[z]);
			}

		scanner.close();

	}

}
