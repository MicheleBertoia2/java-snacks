package org.lessons.snacks;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Snacks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//------------------------------------------ ES1
		
		/*
		 * System.out.println("inserisci un numero"); int num = sc.nextInt();
		 * 
		 * System.out.println(num % 2 == 0 ? num : num + 1);
		 */
		
		//---------------------------------------- ES2
		
//		String[] names = {"nome1", "nome2", "nome3", "nome4", "nome5", "nome6", "nome7",};
//		String[] surnames = {"cognome1", "cognome2", "cognome3", "cognome4", "cognome5", "cognome6", "cognome7", "cognome8"};
//		
//		int count = 0;
//		
//		Random ran = new Random();
//		
//				
//		if(names.length > surnames.length)
//		{
//			count = surnames.length;
//		}else
//		{
//			count = names.length;
//		}
//		
//		for(int i = 0; i < count; i++)
//		{
//			System.out.println("invitato:" + names[ran.nextInt(names.length)] + " " + surnames[ran.nextInt(surnames.length)]);
//		}
//		
		//------------------------------------- ES 3
		
//		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		int sum = 0;
//		
//		for(int i = 0; i < nums.length; i++)
//		{
//			if(!(i % 2 == 0))
//			{
//				sum += nums[i];
//			}
//		}
//		
//		System.out.println("somma: " + sum);
		
		
		// ------------------------------------------ ES 4
		
//		System.out.println("inserisci una frase");
//		String str = sc.nextLine();
//		char ch;
//		String rev = "";
//		
//		for (int i=0; i<str.length(); i++)
//	      {
//	        ch= str.charAt(i); //extracts each character
//	        rev= ch+rev; //adds each character in front of the existing string
//	      }
//		
//		if(str.equals(rev))
//		{
//			System.out.println("La parola e' palindroma");
//		}else 
//		{
//			System.out.println("La parola non e' palindroma");
//		}
		
		
		//-------------------------------- ES 5
//		boolean again = true;
//		
//		
//		while (again) {
//			System.out.println("Inserisci una frase");
//			String str = sc.nextLine();
//
//			if(str.equals("o"))
//			{
//				again = false;
//				
//			}
//
//			int lngStr = str.length();
//			int incrementoNumeri = 0;
//			int incrementoCaratteri = 0;
//
//			for(int i = 0; i < str.length(); i++)
//			{
//				Character ch = str.charAt(i);
//				if(ch.isLetter(ch))
//				{
//					incrementoCaratteri++;
//				}
//				if(ch.isDigit(ch))
//				{
//					incrementoNumeri++;
//				}
//
//			}
//
//			System.out.println("caratteri alfabetici totali: " + incrementoCaratteri );
//			System.out.println("numeri totali: " + incrementoNumeri );
//			System.out.println("caratteri non alfanumerici totali: " + (lngStr - incrementoCaratteri - incrementoNumeri) );	
//		}
		
		
		
		
		// ----------------------------------- ES6
		
				
//		System.out.println("Inserisci un numero");
//		String str = sc.nextLine();
//		
//		int output = 0;
//		
//		for(int i = 0; i < str.length(); i++)
//		{
//			int num = 0;
//			char ch = str.charAt(i);
//			
//			switch (ch) {
//			case '0': {
//				num = 0;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '1': {
//				num = 1;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '2': {
//				num = 2;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '3': {
//				num = 3;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '4': {
//				num = 4;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '5': {
//				num = 5;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '6': {
//				num = 6;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '7': {
//				num = 7;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '8': {
//				num = 8;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			case '9': {
//				num = 9;
//				output += num * Math.pow(10.0,(str.length() - (i + 1)));
//				break;
//			}
//			
//		}
//		}
//			
//			System.out.println("il numero e': " + output);
		
		//------------------------------------ ES 7
		
//		System.out.println("quanti secondi vuoi convertire?");
//		int input = sc.nextInt();
//		
//		int sec = 0;
//		int min = 0;
//		int h = 0;
//		
//		String outputSec = "";		
//		String outputMin = "";
//		String outputH = "";
//		
//		
//		if(input < 60)
//		{
//			sec = input;
//		}
//		
//		if(input > 60 && input < 3600)
//		{
//			sec = input % 60;
//			min = input / 60;			
//		}
//		
//		if(input > 3600)
//		{
//			sec = input % 60;
//			min = (input / 60) % 60;
//			h = input / 3600;
//		}
//		
//		if(sec < 10)
//		{
//			outputSec = String.format("0%s",sec);
//		}else
//		{
//			outputSec = String.format("%s",sec);
//		}
//		
//		if(min < 10)
//		{
//			outputMin = String.format("0%s",min);
//		}else
//		{
//			outputMin = String.format("%s",min);
//		}
//		
//		if(h < 10)
//		{
//			outputH = String.format("0%s",h);
//		}else
//		{
//			outputH = String.format("%s",h);
//		}
//		
//		System.out.println(input 
//				+ " secondi -> " 
//				+ outputH + "ore:" 
//				+ outputMin + "min:" 
//				+ outputSec + "sec");
		
		// ----------------------------------- ES 8
//		
//		int[] arr = new int[10];
//		Random rnd = new Random(); 
//		
//		for(int i = 0; i < 10; i++)
//		{
//			arr[i] = rnd.nextInt(100, 150);
//			System.out.println(arr[i]);
//		}
		
		
		// ---------------------------------------es 9
		
//		int sum = 0;
//		
//		while (sum < 1000) {
//			
//			System.out.println("inserisci un numero fino ad arrivare a mille");
//			int input = sc.nextInt();
//			
//			sum += input;
//			
//			System.out.println("somma: " + sum);
//		}
		
		
		//-------------------------------------- ES 10
		
		
		int[] arr = new int[10];
		Random rnd = new Random(); 
		
		for(int i = 0; i < 10; i++)
		{
			arr[i] = rnd.nextInt(100, 1000);
			System.out.println("membro array " + arr[i]);
		
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.println("elemento pari " +arr[i]);
			}
				
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(!(arr[i] % 2 == 0))
			{
				System.out.println("elemento dispari " +arr[i]);
			}
				
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(!(i % 2 == 0))
			{
				System.out.println("indice dispari " +arr[i]);
			}
				
		}
		
		for(int i = 0; i < 10; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println("indice pari " +arr[i]);
			}
				
		}
		
		
		
		//FINE ESERCIZI
		sc.close();
	}
}
