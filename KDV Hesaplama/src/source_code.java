import java.util.Scanner;

public class source_code {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double tutar;
		double oran = 18.0;
		System.out.print("Tutar Giriniz: ");
		tutar = scan.nextDouble();
		double KDVtutarı = tutar * (oran / 100);
		System.out.println("KDV Oranınız: " + KDVtutarı);
		double KDVfiyat;
		KDVfiyat = (tutar + KDVtutarı);
		System.out.println("KDV'li Yeni Fiyatı: " + KDVfiyat);
		
		

	}

}
