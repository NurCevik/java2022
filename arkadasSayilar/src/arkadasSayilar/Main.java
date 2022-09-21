package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		    int sayi1 = 220;
	        int sayi2 = 284;
	        int toplam1 = 0;
	        int toplam2 = 0;

	        if (sayi1 < 0 || sayi2 < 0) {
	            System.out.println("pozitif sayı giriniz");
	        }
	        for (int i = 1; i < sayi1; i++) {
	            if (sayi1 % i == 0) {
	                toplam1 = i + toplam1;
	            }
	        }
	        for (int j = 1; j < sayi2; j++) {
	            if (sayi2 % j == 0) {
	                toplam2 = j + toplam2;
	            }
	        }
	        if (!(sayi1 < 0 || sayi2 < 0)) {
	            if (toplam1 == sayi2 && sayi1 == toplam2) {
	                System.out.println("arkadaş sayılar");
	            } else {
	                System.out.println("arkadaş sayı değiller");
	            }
	        }
	}

}