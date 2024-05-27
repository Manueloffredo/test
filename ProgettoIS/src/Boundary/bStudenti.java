package Boundary;

import java.util.Scanner;

import Controller.GestoreSegreteria;
import exception.OperationException;

public class bStudenti {
	
	final static int MAX_LENGHT = 16;
	static Scanner scan = new Scanner(System.in);
	
	public static void login() throws OperationException {
		
		boolean valido = false;
		boolean risultato = false;
		String UsernameStudente = null, Password = null;
		GestoreSegreteria gestoreSegreteria = GestoreSegreteria.getIstance();
		
		System.out.println("\n--------ACCESSO--------\n");
		System.out.println("Inserisci i dati:");
		
		while(!valido) {
			try {
				System.out.println("\nInserisci l'username: ");
				UsernameStudente = scan.nextLine();
				
				if(UsernameStudente.length() > MAX_LENGHT) {
					System.out.println("\nInput non valido, riprovare... ");
				}
				else {
					valido = true;
				}	
			}catch(IllegalArgumentException e) {
				 System.out.println("\nStringa inserita non valida, riprovare...");
			}
		}
		valido = false;
		while(!valido) {
			try {
				System.out.println("\nInserisci la password: ");
				Password = scan.nextLine();
				
				if(UsernameStudente.length() > MAX_LENGHT) {
					System.out.println("\nInput non valido, riprovare. ");
				}
				else {
					valido = true;
				}	
			}catch(IllegalArgumentException e) {
				 System.out.println("\nStringa inserita non valida, riprovare...");
			}
		}
		
		risultato = gestoreSegreteria.login(UsernameStudente, Password);
		if(risultato) {
			System.out.println("\nAccesso eseguito correttamente!");
		}
		else{
			System.out.println("\nCredenziali non valide, riprovare...");
		}
	}
	
	public static void visualizzaEsamiSvolti() {
		GestoreSegreteria gestoreSegreteria = GestoreSegreteria.getIstance();
	}
}
