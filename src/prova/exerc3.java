package prova;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exerc3 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
float result = 0;
float totalID = 0;

List<Integer> sexo = new ArrayList();
List<String> cor = new ArrayList();
List<String> cab = new ArrayList();
List<Integer> id = new ArrayList();
	int i = 0;	
	int j = 1;
	
	while (i < 3)
	{
	System.out.print("Digite o " + j + "° sexo: (1 - Feminino | 2 - Masculino) " );
	sexo.add(ler.nextInt());
	j = j + 1;
	i = i + 1;
	}

	
	i = 0;	
	j = 1;
	while (i < 3)
	{	
	System.out.print("Digite a " + j + "°cor dos olhos: ");
	cor.add(ler.next());
	
	j = j + 1;
	i = i + 1;
	}
	
	i = 0;	
	j = 1;
	
	
	while (i < 3)
	{	
	System.out.print("Digite a " + j + "° cor do cabelo: ");
	cab.add(ler.next());
	
	j = j + 1;
	i = i + 1;
	}
	
	i = 0;	
	j = 1;
	
	while (i < 3)
	{	
	System.out.print("Digite a " + j + "° idade: ");
	id.add(ler.nextInt());
	
	j = j + 1;
	i = i + 1;
	
	}
	
			
		if ( id.get(0) > id.get(1) )
		{
			System.out.println("a pessoa mais velha é a 1°");
			System.out.println("Idade: " + id.get(0));
			
		}else if( id.get(1) > id.get(2) )
		{
			System.out.println("a pessoa mais velha é a 2°");
			System.out.println("Idade: " + id.get(1));
		}else
		{
			System.out.println("a pessoa mais velha é a 3°");
			System.out.println("Idade: " + id.get(2));
		}
		
		int num = 0;
		
		while (num < 3) 
		{
			if ( ( id.get(num) >= 18 ) && ( id.get(num) <=35 ) ) 
			{	
				if ( ( sexo.get(num) >= 18 ) && ( sexo.get(num) <=35 ) && ( cor.get(num) == "verdes" ) && ( cab.get(num) == "loiros" ) )					
				{
					result = result + 1;	
				}
				
			}
			num = num + 1;	
		}
			
		
			
	System.out.println("Porcentagem de individuos femininos com idade entre 18 e 35:");
	
	totalID =  ( ( result / 3 ) * 100 );
	
	System.out.println(totalID + "%");
			
		
		
}
	
	
	
	
}
