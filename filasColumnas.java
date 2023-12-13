import java.util.Scanner;

class filasColumnas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String ast = " * ";

		//Demanar valor de files i columnes
		System.out.println("Introdueix el número de files");
		int files = sc.nextInt();

		System.out.println("Introdueix el número de columnes");
		int columnes = sc.nextInt();

		String horiz = "";
		
		
		for (int i = 0;i < columnes;i++) {
			horiz = horiz + ast;
		}

		for (int i = 0;i < files;i++) {
			System.out.println(horiz);
		}

		sc.close();
	}
}
