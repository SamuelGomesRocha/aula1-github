package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();// limpando buffer de leitura;
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char check = sc.next().charAt(0);

		if (check == 'y') {
			double initialDeposit;
			System.out.print("Enter intial deposit value: $");
			initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
			System.out.println();
			balance(sc, account);

		} else if (check == 'n') {
			System.out.println();
			account = new Account(number, holder);// sobrecarga
			balance(sc, account);
		}

		
		sc.close();

	}

	public static void balance(Scanner sc, Account account) {
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: $");
		account.enterDeposit(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a withdraw value: $");
		account.withdrawValue(sc.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
	}
}
