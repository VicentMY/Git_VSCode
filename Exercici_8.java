import java.util.Scanner;

class Exercici_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
	
		System.out.println("Introdueix un número");
		num = sc.nextInt();

		//comprovar si el número es 0
		if (num == 0) {
		System.out.println("El número: " + num + " no es parell ni imparell");
		}
		else {
			//comprovem si el número es parell o imparell	
			if (num % 2 == 0) {
			System.out.println("El número: " + num + " és parell");
			}
			else {
			System.out.println("El número: " + num + " no és parell");
			}
		}

		sc.close();
	}
}
