package prova;
import java.util.Scanner;
public class exerc4 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	double salario;
	double result;
	
	System.out.println("Digite saldo médio: ");
	salario = ler.nextDouble();
	
		
	result = salario / 12;
		
	System.out.println("Média de salario: " + result);

	if ( result <= 200  )
	{
	System.out.println("Sem Créditos!");
		
	} else if ( ( result > 200) && (result <= 400) )
		
	 {
		System.out.println("20% de crédito! ");
		System.out.println("novo salario: " + (result * 1.2 + salario));
		
	} else if ( ( result > 400) && (result <= 600) )
	 
	 {
		System.out.println("30% de crédito! ");
		System.out.println("novo salario: " + (result * 1.3 + salario));
	}else
	 
	 {
		System.out.println("40% de crédito! ");
		System.out.println("novo salario: " + (result * 1.4 + salario)  );		
	}
	
	
	
}
	
	
}
