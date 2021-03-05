package aufgaben;

import java.util.Scanner;

import enums.*;

public class Aufgabe03Kaffeeautomat 
{
	public static void main(String[] args) 
	{
		System.out.println("Ich biete folgende Sorten Kaffee an:");
		for (int i = 0; i < Kaffeesorte.values().length; i++) 
		{
			System.out.println(String.format("%d - %s", i + 1, Kaffeesorte.values()[i]));
		}
		
		System.out.print("Geben Sie die gewuenschte Nummer ein: ");
		Scanner sc = new Scanner(System.in);
		
		int auswahl = sc.nextInt();
		System.out.println(String.format("Sie haben \"%s\" ausgewaehlt.", Kaffeesorte.values()[auswahl - 1]));
		
		System.out.println(String.format("Bitte zahlen Sie den Betrag von %s mit den folgenden Muenzen:", Kaffeesorte.values()[auswahl - 1].getWert()));
		
		for (int i = 0; i < Muenze.values().length; i++) 
		{
			System.out.println(String.format("%d - %s", i + 1, Muenze.values()[i]));
		}
		
		int bezahlt = 0;
		
		while (bezahlt < Kaffeesorte.values()[auswahl - 1].getWertInCent())
		{
			System.out.print("Muenze einwerfen: ");
			bezahlt += Muenze.values()[sc.nextInt() - 1].wertInCent;
		}
		sc.close();
		
		int wechselgeld = (bezahlt - Kaffeesorte.values()[auswahl - 1].getWertInCent());
		
		System.out.println(String.format("Sie haben %,.2f Euro bezahlt. Sie bekommen %,.2f Euro Wechselgeld.", bezahlt / 100., wechselgeld / 100.));
		
		while (wechselgeld > 0)
		{
			for (int i = Muenze.values().length - 1; i >= 0; i--) 
			{
				if (Muenze.values()[i].wertInCent <= wechselgeld)
				{
					System.out.println("Rueckgeld: " + Muenze.values()[i]);
					wechselgeld -= Muenze.values()[i].wertInCent;
				}
			}
		}
		
	}
}