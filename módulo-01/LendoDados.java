import java.util.Scanner;

public class LendoDados{
	public static void main(String[] args){
		/* Criação de um objeto da classe Scanner e a sua instanciação */
		Scanner input = new Scanner(System.in);

		int n1=0, n2=0, res=0;
		String nome = "";

		System.out.println("Digite seu nome:");
		nome = input.nextLine(); /* O nextLine equivale ao "str(input())" do Python */

		System.out.printf("Olá %s, digite um número:%n", nome);
		n1 = input.nextInt(); /* o nextInt é equivalente ao "int(input())" do Python */
		System.out.println("Digite outro número:");
		n2 = input.nextInt();
		res = n1 + n2;

		System.out.printf("A soma de %d e %d é igual a %d.%n", n1, n2, res);
	}
}
