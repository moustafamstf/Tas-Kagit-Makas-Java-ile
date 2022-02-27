import java.util.Random;
import java.util.Scanner;

public class Oyun {
	
	public static void main(String [] args) {
		
		System.out.println("Tas Kagit Makas Oyunu..:))");
		
		// 1-TAS. 2-KAGIT. 3-MAKAS.
		Scanner soru = new Scanner(System.in);
		System.out.println("Tas mi Kagit mi Makas mi:\n1-Tas\n2-Kagit\n3-Makas");
		int tercih = soru.nextInt();
		
		Random rand = new Random();
		int rakip;
		rakip = rand.nextInt(3);
		
		if ( (tercih == 1) && (rakip == 1)) {
			System.out.println("Berabere, Rakipte Tas..");
		}
		else if (( tercih == 1) && (rakip == 2)) {
			System.out.println("Kaybettiniz Rakip Kagit..");
		}
		else if ((tercih == 1) && (rakip == 3)) {
			System.out.println("Kazandiniz, Tebrikler...");
		}
		else if ((tercih == 2) && (rakip == 1)) {
			System.out.println("Kazandiniz, Tebrikler...:");
		}
		else if ((tercih == 2) && (rakip == 2 )) {
			System.out.println("Berabere, Rakipte Kagit");
		}
		else if ((tercih == 2) && (rakip == 3)) {
			System.out.println("Kaybettiniz, Rakip Makas");
		}
		else if ((tercih == 3) && (rakip == 1 )) {
			System.out.println("Kaybettiniz, Rakip Tas..");
		}
		else if ((tercih == 3) && (rakip == 2 )) {
			System.out.println("Kazandiniz, Tebrikler..");
		}
		else if ((tercih == 3) && (rakip == 3)) {
            System.out.println("Berabere, rakipte Makas..");
		}
		else {
			System.out.println("bye bye");
		}
	}
}

			


