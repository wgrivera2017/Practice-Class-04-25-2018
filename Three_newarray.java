
public class Three_newarray {

	public static void main(String[] args) {
		
		int [] arry1 = {5,2,8,23,14};
		int [] arry2 = {67,32,7,4,61};
		int [] arry3 = new int [5];
		
		for(int i = 0; i<arry3.length; i++) {
			arry3[i] = arry1[i] + arry2[i];
			
			System.out.println(arry3[i]);
		}

	}

}
