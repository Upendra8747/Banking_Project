package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank bank = new BankImp(5000);
		while(true) {
			System.out.println("1:Deposit Amount\n2:Withdraw Amount\n3:CurrentBalance Amount\n4:Exit");
			System.out.println("Enter your choice");
			int choice=scan.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println(" Enter the amount to be deposite: ");
				int amountToDeposit=scan.nextInt();
				bank.deposit(amountToDeposit);//bank.deposit(scan.nextInt();
				break;
				
			case 2:
				System.out.println(" Enter the amount to be Withdraw: ");
				int amountToWithdraw=scan.nextInt();
				bank.withdraw(amountToWithdraw);//bank.withdraw(scan.nextInt();
				break;
				
				
			case 3:	
				System.out.println("Availabe Balance: "+bank.getBalance());
				break;
				
				
			case 4:
				System.out.println("thanku visit again!! (:");
				System.exit(0);
				
			default:
				System.out.println("Invalid choiceS");
			}
			System.out.println("***********");
		}
		
	}
}
