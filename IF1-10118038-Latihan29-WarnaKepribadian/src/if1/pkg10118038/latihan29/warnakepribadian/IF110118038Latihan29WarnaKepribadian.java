/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan29.warnakepribadian;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Warna Kepribadian
 */
public class IF110118038Latihan29WarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU " + CYAN + "DARI " + PURPLE + "WARNA " + BLUE + "FAVORITMU" + RESET);	
	System.out.println(WHITE);
        System.out.println(RED_BACKGROUND + "\t MERAH \t\t");
	System.out.println(GREEN_BACKGROUND + "\t HIJAU \t\t");
	System.out.println(YELLOW_BACKGROUND + "\t KUNING \t");
	System.out.println(BLUE_BACKGROUND + "\t BIRU \t\t");
	System.out.println(PURPLE_BACKGROUND + "\t UNGU \t\t");
        System.out.println(RESET);
        
       String[][] kepribadian = {
			{ 
                            "Menyenangkan,",
                            "Bijaksana,",
                            "Pembawaan diri tenang saat menghadapi masalah,",
                            "Dinamis,",
                            "Senang Berbagi,",
                            "Bersahabat,",
                            "Tidak terlalu suka menjadi sorotan banyak orang,",
                            "Menyembunyikan persaan karena karakternya yang cenderung mencari jalan damai."
			},
			{
                            "Periang,",
                            "Pemberani,",
                            "Berani mengambil risiko dalam setiap langkah,",
                            "Menyukai tantangan,",
                            "Kurang sabar,",
                            "Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,",
                            "Memiliki energi kehangatan dan cinta."
			},
			{
                            "Optimis,",
                            "Suka bergaul,",
                            "Periang,",
                            "Senang menolong,",
                            "Lincah dan Aktif,",
                            "Tidak suka meremehkan kekurangan orang lain,",
                            "Loyal,",
                            "Hangat,",
                            "Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,",
                            "Cenderung penakut."
			},
			{
                            "Optimis,",
                            "Tidak pernah ragu,",
                            "Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,",
                            "Memiliki ambisi yang besar,",
                            "Memiliki empati yang besar,",
                            "Memiliki sisi misterius sebab seringkali menutupi persaannya,",
                            "Terkadang bersikap keras kepala dan angkuh."
			},
			{
                            "Romantis,",
                            "Menyukai hal yang berbau alami dan keindahan,",
                            "Teguh pada prinsip,",
                            "Menginginkan Kesempurnaan,",
                            "Mudah Cemburu,",
                            "Mudah merasa iri,",
                            "Menjunjung tinggi suatu nilai toleransi dan kepercayaan."
			}
        };
	int[] pnjg = {8, 7, 10, 7, 7};   
        System.out.print("PILIH WARNA FAVORITMU : ");
        String favorit = sc.nextLine().toUpperCase() ; 
        System.out.print("NAMA KAMU : ");
        String Nama = sc.nextLine();
        System.out.print("\n===HASIL TEST KEPRIBADIAN " + Nama + "===" + "\nWarna favoritmu adalah : ");
        
        int pilih = 0;
		switch(favorit) {
			case "BIRU":
				pilih = 0;
				System.out.print(BLUE);
				break;
			case "MERAH":
				pilih = 1;
				System.out.print(RED);
				break;
			case "KUNING":
				pilih = 2;
				System.out.print(YELLOW);
				break;
			case "UNGU":
				pilih = 3;
				System.out.print(PURPLE);	
				break;
			case "HIJAU":
				pilih = 4;
				System.out.print(GREEN);
				break;
			default:
				pilih = 5;
				break;
				
		}
                System.out.println(favorit);
                if(pilih == 5)
                    System.out.println("Oops.. Belum teridentifikasi");
                
                else {
                    for(int i = 0; i < pnjg[pilih]; i++) {
                        System.out.println((i+1) + ". " + kepribadian[pilih][i]);
                        }
            }
    }
}
