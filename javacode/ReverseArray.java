package ajavacode;

public class ReverseArray {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9,10};
		for (int i =num.length-1; i>=0; i--) {
		System.out.println(num[i]);
	}
		System.out.println("__");
		System.out.println(num.length);
		System.out.println("__");
		System.out.println("-----------------------");
		System.out.println("First index"+" = "+num[0]);
		System.out.println("Last  index"+" = "+num[3]);
		}
}