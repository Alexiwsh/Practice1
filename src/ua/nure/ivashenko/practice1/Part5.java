package ua.nure.ivashenko.practice1;

public class Part5 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("No arguments");
			return;
		}
		try {
			int sum = 0;
			for(int i = 0; i < args[0].length(); i++) {
				char c = args[0].charAt(i);
				sum += Integer.parseInt(Character.toString(c));
			}
			System.out.println(sum);
		} catch(NumberFormatException e) {
			System.out.println("Invalid arguments");
		}
	}

}
