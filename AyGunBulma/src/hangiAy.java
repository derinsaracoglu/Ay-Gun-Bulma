import java.util.Scanner;

class hangiAy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ay numarasini giriniz:");

		int ay = scan.nextInt();
		String ayAdi = null;

		switch (ay) {

		case 1:
			ayAdi = "Ocak";
			break;
		case 2:
			ayAdi = "Subat";
			break;
		case 3:
			ayAdi = "Mart";
			break;
		case 4:
			ayAdi = "Nisan";
			break;
		case 5:
			ayAdi = "Mayis";
			break;
		case 6:
			ayAdi = "Haziran";
			break;
		case 7:
			ayAdi = "Temmuz";
			break;
		case 8:
			ayAdi = "Agustos";
			break;
		case 9:
			ayAdi = "Eylul";
			break;
		case 10:
			ayAdi = "Ekim";
			break;
		case 11:
			ayAdi = "Kasim";
			break;
		case 12:
			ayAdi = "Aralik";
			break;
		default:
			System.out.println("Gecersiz ay.");
			break;
		}

		System.out.println("Girdiginiz ay " + ayAdi + "'dir.");

	}
}