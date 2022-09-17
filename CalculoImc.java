import java.util.Scanner;

public class {
	
	public static void main(String args[]){
	
	
	Scanner sc = new Scanner(System.in);
	
		double peso, altura, valorIMC; 
		
		System.out.println();
		System.out.print("Informe o seu peso corporal em Kg: ");
		peso = sc.nextDouble(); 
		
		System.out.print("Informe a sua altura em metros: ");
		altura = sc.nextDouble();
		
		valorIMC = peso / (altura * altura);
		System.out.println(valorIMC);
		
		if(valorIMC < 20){
			System.out.println();
			System.out.println("IMC :" + valorIMC + "Abaixo do peso.");
			System.out.println();
		}else if(valorIMC >= 20 && <= 24){
			System.out.println();
			System.out.println("IMC :" + valorIMC + "Peso normal.");
		}else if(valorIMC >= 25 && <= 29){
			System.out.println();
			System.out.println("IMC :" + valorIMC + "Acima do peso.");
		}else if(valorIMC >= 30 && <= 34){
			System.out.println();
			System.out.println("IMC :" + valorIMC + "Obeso.");
		}else{
			System.out.println("Muito obeso.");
		}
	}
}