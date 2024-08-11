class Bank_Account
{
	String Account_Holder_Name;
    	String Account_Number;
    	char Account_Type; // 'S' for savings, 'C' for current
    	double balance;
	Bank_Account(String name, String number, char type, double initial_balance) 
	{
        	this.Account_Holder_Name = name;
        	this.Account_Number = number;
        	this.Account_Type = type;
        	this.balance = initial_balance;
	}
	void deposit_money(double amount) 
	{
        	if (amount > 0) {
            		balance += amount;
            		System.out.println("Deposited: " + amount);
            		System.out.println("New Balance: " + balance);
		}
                else {
            		System.out.println("Invalid deposit amount");
		}
        }
	void withdraw_money(double amount) 
	{
        	if (amount > 0 && amount <= balance) {
            		balance -= amount;
            		System.out.println("Withdrew: " + amount);
            		System.out.println("Remaining Balance: " + balance);
                }
		else { 
            		System.out.println("Invalid withdrawal amount");
		}
        }
}
class Demo5
{
	public static void main(String[] args) 
	{
        // Creating a new bank account
        Bank_Account account = new Bank_Account("John Doe", "123456789", 'S', 500.0);

        // Deposit money
        account.deposit_money(200.0);

        // Withdraw money
        account.withdraw_money(150.0);
       }
}
