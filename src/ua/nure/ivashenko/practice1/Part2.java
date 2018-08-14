package ua.nure.ivashenko.practice1;

public class Part2 {

	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Not enough arguments");
			return;
		}
		try {
			int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
			System.out.println(sum);
		} catch(NumberFormatException e) {
			System.out.println("Invalid agruments");
		}

	}

}
