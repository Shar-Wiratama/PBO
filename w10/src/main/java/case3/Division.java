package case3;

public class Division {
    public static void main(String[] args) {
	try {
            System.out.println(7/0);
	}
	catch(Exception ex) {
            System.out.println("Hasil pembagian tidak valid / tidak diketahui");
        }
    }
}
