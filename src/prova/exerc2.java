package prova;
import java.util.Scanner;
public class exerc2 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	int md1, md2, md3;
	
	System.out.println("Digite a 1° medida: ");
	md1 = ler.nextInt();
	
	System.out.println("Digite a 2° medida: ");
	md2 = ler.nextInt();
	
	System.out.println("Digite a 3° medida: ");
	md3 = ler.nextInt();
	
	
	if ( (md1 == md2) && (md2 == md3) )  
	{
		System.out.println("O triangulo é Equilatero!");
	}else if (md1 == md2)
	{
		System.out.println("O triangulo é isósceles!");		
	}else
	{
		System.out.println("o triangulo é Escaleno!");
	}
	
	
	
}
	
	
}
