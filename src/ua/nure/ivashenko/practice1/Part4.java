package ua.nure.ivashenko.practice1;

public class Part4 {
	public static void main(String[] args) {
		if(args.length < 2) {
			System.out.println("Not enough arguments");
			return;
		}
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			for(int i = num1 > num2 ? num2 : num1; i > 0; i--) {
				if(num1 % i == 0 && num2 % i == 0) {
					System.out.println(i);
					break;
				}
			}
		} catch(NumberFormatException e) {
			System.out.println("Invalid arguments");
		}
	}
}
