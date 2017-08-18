package prova;

import java.util.Scanner;

public class exerc1 {
	
public static void main(String[] args) {
	
	String nome1, nome2, nome3;
	int id1, id2, id3;
	
	Scanner ler = new Scanner(System.in);
	
	
	System.out.print("Nome da 1° pessoa: ");
	nome1 = ler.next();
	System.out.print("idade: ");
	id1 = ler.nextInt();
	
	System.out.println("");
	
	
	System.out.print("Nome da 2° pessoa: ");
	nome2 = ler.next();
	System.out.print("idade: ");
	id2 = ler.nextInt();
	
	System.out.println("");
	
	
	System.out.print("Nome da 3° pessoa: ");
	nome3 = ler.next();
	System.out.print("idade: ");
	id3 = ler.nextInt();
	
	
	
	
	if (id1 > id2)
	{
		System.out.println("a pessoa mais velha é a 1°");
		System.out.println("Nome: " + nome1 + ",  idade: " + id1);
		
	}else if(id2 > id1)
	{
		System.out.println("a pessoa mais velha é a 3°");
		System.out.println("Nome: " + nome2 + ",  idade: " + id2);
	}else
	{
		System.out.println("a pessoa mais velha é a 3°");
		System.out.println("Nome: " + nome3 + ",  idade: " + id3);
	}
	
	
	
	if (id1 < id2)
	{
		System.out.println("a pessoa mais nova é a 1°");
		System.out.println("Nome: " + nome1 + ",  idade: " + id1);
		
	}else if(id2 < id1)
	{
		System.out.println("a pessoa mais nova é a 3°");
		System.out.println("Nome: " + nome2 + ",  idade: " + id2);
	}else
	{
		System.out.println("a pessoa mais nova é a 3°");
		System.out.println("Nome: " + nome3 + ",  idade: " + id3);
	}
	
	
}
}
