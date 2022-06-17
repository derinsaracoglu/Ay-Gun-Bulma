import java.util.Scanner;

public class AyGun {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Ayi giriniz:");
		
		
		
		int ay = scan.nextInt();
		int gun = 0;
		
		switch(ay) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			gun = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			gun = 30;
			break;
		case 2:
			gun =28;
			break;
		default:
			System.out.println("Gecersiz ay.");
			break;
			
		}
		
		System.out.println("Girdiginiz ay " + gun +" ceker.");
		

	}

}
