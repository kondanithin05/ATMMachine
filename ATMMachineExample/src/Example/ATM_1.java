package Example;

import java.util.Scanner;

class ATM {
	float Balance;
	int PIN = 1234;

	public void checkPIn() {
		System.out.println("Enter the PIN");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if (enterpin == PIN) {
			menu();
		} else {
			System.out.println("Enter the valid PIn");
			menu();
		}
	}

	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1.Check A/c Balance");
		System.out.println("2.Withdraw Money");
		System.out.println("3.Deposit Money");
		System.out.println("4.Exit");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		if (opt == 1) {
			checkBalance();
		} else if (opt == 2) {
			withdrawMoney();
		} else if (opt == 3) {
			depositMoney();
		} else if (opt == 4) {
			return;
		} else {
			System.out.println("Enter a valid Option");
		}
	}

	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}

	public void withdrawMoney() {
		System.out.println("Enter the Amount");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if (amount > Balance) {
			System.out.println("Insufficient Funds");
			menu();
		} else {
			Balance = Balance - amount;
			System.out.println("Withdraw Amount Sucessfully");
			menu();
		}
	}

	public void depositMoney() {
		System.out.println("Enter the Amount:");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Amount deposit Sucessfully");
		menu();
	}
}

public class ATM_1 {
	public static void main(String[] args) {
		ATM obj = new ATM();
		obj.checkPIn();
	}
}
