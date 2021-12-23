package ATM_Projesi;

import java.util.Scanner;

public class ATM_Projesi {

	public static void main(String[] args) {
		/*
		 * while dongusu yardimiyla bir tane ATM projesi yapmaya calsin
		 * 
		 * islemler 1.islem : Bakiye Ogrenme 2.islem : Para Cekme 3.islem : Para Yatirma
		 * Cikis : q
		 */

		Scanner scan = new Scanner(System.in);
		int bakiye = 1000;
		String islemler = "1. islem : Bakiye Ogrenme\n" + "2.islem : Para Cekme\n" + "3.islem : Para Yatirma\n"
				+ "Cikis icin q'ya basiniz";
		System.out.println("***************************");
		System.out.println(islemler);
		System.out.println("****************************");
		while (true) {
			System.out.println("islemi seciniz : ");
			String islem = scan.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan cikiliyor...");

			} else if (islem.equals("1")) {
				System.out.println("Bakiyeniz : " + bakiye);

			} else if (islem.equals("2")) {
				System.out.println("Cekmek istdiginiz tutar : ");
				int tutar = scan.nextInt();
				scan.nextLine();

				if (bakiye - tutar < 0) {
					System.out.println("yeterli bakiye yok .Bakiyeniz :" + bakiye);
				} else {
					bakiye -= tutar;
					System.out.println("yeni bakiyeniz " + bakiye);
				}

			} else if (islem.equals("3")) {
				System.out.println("Yatirmak istediginiz tutar : " + bakiye);
				int tutar = scan.nextInt();
				scan.nextLine();
				bakiye += tutar;
				System.out.println("Yeni Bakiyeniz : " + bakiye);
			} else {
				System.out.println("gecersiz islem ..");

			}
		}
	}
}
