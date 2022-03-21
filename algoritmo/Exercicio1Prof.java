package teste;

import java.util.Scanner;

public class Exercicio1Prof {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("digite a sua idade");
		idade = sc.nextInt();
		
		if(idade>=18) {
			System.out.println("Voto obrigatorio");
		}else if(idade<=17) {
			System.out.println("Voto opcional");
		}else if(idade<16){
			System.out.println("Não pode votar");
		}else if(idade>=70){
			System.out.println("Voto opcional");
		}
	}

}
