package basicJavaPrograms;

import java.util.Scanner;

public class ReverseTheLettersPresentInTheGivenString {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your String to Reverse It : ");
		String str = sc.nextLine();
		String[] strArray = str.split(" ");
		for (String temp: strArray){
		System.out.println(temp);
		}
		for(int i=0; i<3; i++){ char[] s1 = strArray[i].toCharArray(); for (int j = s1.length-1; j>=0; j--)
		{System.out.print(s1[j]);}
		System.out.print(" ");
		}
		}
}
