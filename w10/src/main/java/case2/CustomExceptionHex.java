package case2;

import java.util.Scanner;
public class CustomExceptionHex {
	public static void main(String[] args) {
        //System.out.println("Inputan untuk pengkonversian heksadesimal ke desimal: ");
        //Java program to convert hexadecimal to decimal:
        try{
        Scanner scanner=new Scanner(System.in);
        String hexDeciNumber=scanner.next();
            System.out.println("output: "+ Integer.parseInt(hexDeciNumber,16));     
	}
        catch(NumberFormatException e){
            System.out.println("Inputan Bukan Heksadesimal!");
        }
    }
}