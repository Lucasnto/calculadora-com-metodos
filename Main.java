import java.util.Scanner;

class Main {
	public static double soma (double n1, double n2) {
		
		return n1+n2;
	}
	public static double subtracao (double n1, double n2) {
	 
	    return n1-n2;
	}
	public static double mult (double n1, double n2) {
		 
		return n1*n2;
	}
	public static double div (double n1, double n2) {
		
		return n1/n2;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		double n2 = sc.nextDouble();
	
		sc.close();
		
		double vsoma = soma (n1, n2);
		double vsub = subtracao (n1, n2);
		double vmult = mult (n1, n2);
		double vdiv = div (n1, n2);
	
		System.out.println("Soma: "+ vsoma);
		System.out.println("Subtracao: "+ vsub);
		System.out.println("Multiplicacao: "+ vmult);
		System.out.println("Divisao: "+ vdiv);
	}

}
