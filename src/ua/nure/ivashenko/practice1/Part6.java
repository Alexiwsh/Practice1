package ua.nure.ivashenko.practice1;

public class Part6 {

	private static boolean isSimpleNum(int num) {
		for(int i = 2; i < 6; i++)
			if(num % i == 0 && num != i)
				return false;
		return true;
	}
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("No arguments");
			return;
		}
		int arrSize = 0;
		try {
			arrSize = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {System.out.println("Invalid Argument");}
		int arr[] = new int[arrSize];
		int lastNum = 2;
		for(int i = 0; i < arr.length; i++) {
			while(arr[i] == 0) {
				if(isSimpleNum(lastNum))
					arr[i] = lastNum;
				lastNum++;
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
