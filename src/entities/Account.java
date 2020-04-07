package entities;

public class Account {
	public static final double tax = 5.00;
	
	private int number;
	private String holder;
	private double deposit;

	public Account() {//normal

	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		enterDeposit(initialDeposit);
	}

	public Account(int number, String holder) {// sobrecarregado
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public void enterDeposit(double deposit) {
		this.deposit+=deposit;
	}
	
	public void withdrawValue(double deposit) {
		this.deposit=(this.deposit - deposit)-tax;
	}

	public String toString() {
		return "Account "
				+getNumber()
				+", Holder: "
				+getHolder()
				+", Balance: $"
				+String.format("%.2f", getDeposit());
	}
}
