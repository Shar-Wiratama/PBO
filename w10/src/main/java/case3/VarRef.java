package case3;

public class VarRef {
    String nama;
    String nama1 = nama;
    public static void main(String[] args){
	//try {
                int angka = namaClass();
                System.out.println("Hasilnya adalah : " + nama1);
        //}catch(Exception ex) {
                System.out.println("variabel inisiasi kosong");
        //}
    }
}
