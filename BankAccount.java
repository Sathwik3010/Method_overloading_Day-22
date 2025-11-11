package com.codegnan.Overload;

public class BankAccount {

	private double balance;

	public BankAccount(double openingBalance) {
		this.balance = openingBalance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited ₹" + amount + " by cash.");
		} else {
			System.out.println("Invalid amount for cash deposit.");
		}
	}

	public void deposite(double amount, String chequeNumber) {
		if (amount > 0 && chequeNumber != null && !chequeNumber.isEmpty()) {
			balance += amount;
			System.out.println("Deposited ₹" + amount + " by cheque(Cheque No: " + chequeNumber + ").");
		} else {
			System.out.println("Invalid details for cheque deposit.");
		}
	}

	public void deposite(double amount, String transactionId, String bankName) {
        if (amount > 0 && transactionId != null && !transactionId.isEmpty() && bankName != null && !bankName.isEmpty()) {
        	balance += amount;
			System.out.println("Deposited ₹" + amount + " via online transfer(Txn ID: "+transactionId+", Bank: "+bankName+").");

        }else {
            System.out.println("Invalid details for online transfer.");
        }

	}
	
	public void showBalance() {
		System.out.println("Current Account Balance: ₹"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount(50000);
		account.deposite(20000);
		account.deposite(15000, "CHQ987654");
		account.deposite(30000, "TXN112233", "HDFC Bank");
		
		account.showBalance();
	}

}
