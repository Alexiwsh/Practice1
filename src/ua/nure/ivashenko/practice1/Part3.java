package ua.nure.ivashenko.practice1;

public class Part3 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("No agruments");
			return;
		}
		for(String S : args) {
			System.out.print(S + " ");
		}
		System.out.println();

	}

}
