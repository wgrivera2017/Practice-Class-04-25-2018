import java.util.Scanner;

public class Two_sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] su = new int[10];

		int sum = 0;

		System.out.println("Input 10 numbers");

		for(int i=0; i<su.length; i++) {

			su[i] = scanner.nextInt();

			sum = su[i] + sum;
		}

		System.out.println(sum);
		scanner.close();
	}

}
