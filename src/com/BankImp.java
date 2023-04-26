package com;

public class BankImp implements Bank {
	int Balance;

	BankImp(int Balance) {
		this.Balance = Balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs." + amount);
		Balance = Balance + amount;// balance+=amount;
		System.out.println("Amount Depositing Succesfully");
	}

	@Override
	public void withdraw(int amount) {
		if(amount<=Balance) {
		System.out.println("Withdrawing Rs." + amount);
		Balance -= amount;// Balance=Balance-amount;
		System.out.println("Amount Withdrawing Succesfully");
	}else {
		try {
			throw new InsufficientBalanceException("Insufficient Balance!!");
			
		}catch(InsufficientBalanceException e){
			System.out.println(e.getMessage());
		}
	}
	}

	@Override
	public int getBalance() {
		return Balance;
	}

}
