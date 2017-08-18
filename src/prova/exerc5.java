package prova;
import java.util.Scanner;
import java.util.Random;
public class exerc5 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	int result;
	
	System.out.println("Jokenpo");
	System.out.println("Escolha uma opção:");
	System.out.println("0 - Pedra");
	System.out.println("1 - Papel");
	System.out.println("2 - Tesoura");
 
	result = ler.nextInt();

	Random rand = new Random();		
    int randomNum = rand.nextInt((2 - 0) + 1) + 0;
    
                	
	
    if ( ( result == 0) && ( randomNum == 1) )
	{
		System.out.println("Papel - Computador Ganhou!");
		
	}
    else if ( ( result == 0) && ( randomNum == 0) )
	{
		System.out.println("Empatou!");
	}
    
    else if ( ( result == 0) && ( randomNum == 2) )
	{
		System.out.println("Pedra - Computador ganhou!");
		
	}
    
    else if ( ( result == 1) && ( randomNum == 0) )
	{
		System.out.println("Pedra - Jogador ganhou!");
		
	}
    
    else if ( ( result == 1) && ( randomNum == 1) )
	{
		System.out.println("Empate!");
		
	}
    
    else if ( ( result == 1) && ( randomNum == 2) )
	{
		System.out.println("Tesoura - Computador ganhou!");
	}
    
    else if ( ( result == 2) && ( randomNum == 1) )
	{
		System.out.println("Tesoura - Jogador ganhou!");
	}
	
    else if ( ( result == 2) && ( randomNum == 2) )
	{
		System.out.println("Empate!");
	}
	
    else if ( ( result == 2) && ( randomNum == 0) )
	{
		System.out.println("Pedra - Computador ganhou!");
	}else
	{
		System.out.println("Opção não encontrada!");
	}
	
    System.out.println("jogador: " + result);
	System.out.println("Computador: " + randomNum);
    
}
	
	
}
