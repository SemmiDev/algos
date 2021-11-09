import java.util.Scanner;

/**
 Nama: Sammi Aldhi Yanto
 NIM: 2003113948
 Kelas: ASD-A
 */ 
 
public class Bingo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		Scanner scan2 = new Scanner(System.in);	

		int min = 1;
		int max = 0;
		int mid = 0;

		System.out.print("Masukkan n: (1 - 100.000): ");
		max = scan.nextInt();
		
		if (max < 1 || max > 100_000) {
			System.out.println("ups... min 1 & max 100000");
			System.exit(1);
		}

		for (int i = 1; i <= max; i++) {
			System.out.print(i + " ");
		}

		System.out.println("\n\nSilahkan pilih & ingat salah satu dari angka diatas");

		boolean no = false;
		while(true) {
			mid = ((max - min) / 2) + min;
			if (no) {
				System.out.println(mid + " Bingo!");
				System.exit(1);
			}

			System.out.print("\nApakah angka yang anda ingat kurang dari " + mid + "? (y/t): ");
			if (scan2.next().equalsIgnoreCase("y")) {
				max = mid;
			}else{
				no = true;
				min = mid;
			}
		}
	}
}
