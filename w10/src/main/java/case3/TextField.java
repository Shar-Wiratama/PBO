package case3;

import java.util.Scanner;

public class TextField {
    public static void main(String[] args) {       
		Scanner input = new Scanner(System.in);
		//System.out.print("Silahkan input: ");
		try {
                        //System.out.print("Silahkan input: ");
			int integer = input.nextInt();
			System.out.println("Nilai yang diinputkan merupakan integer dengan nilai: " + integer);
		}catch(Exception ex) {
			System.out.println(" Nilai yang diinputkan bukan merupakan sebuah integer");
		}
		input.close();
	}
}
