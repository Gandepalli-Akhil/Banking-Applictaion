import java.util.Scanner;
class BankAccount{
	private long accountnumber;
	private String accountHolderName;
	private double balance;
	
	public void setAccountNumber(long accno){
	if(accno>=1000000000L && accno<=9999999999L)
	accountnumber=accno;
	else
	System.out.println("INVALID ACCOUNT NUMBER");
	}
	
	public void setAccountHolderName(String n){
	if(n!=null && !n.isEmpty())
	accountHolderName=n;
	else
	System.out.println("INVALID NAME");
	}
	
	public String getAccountHolderName(){
	return accountHolderName;
	}
	
	public long getAccountNumber(){
	return accountnumber;
	}
	
	public void setDeposit(double amount){
	if(amount>0)
	{
	balance+=amount;
	System.out.println("AMOUNT DEPOSITED SUCCESSFULLY!!!");
	}
	else
	System.out.println("INVALID AMOUNT");
	}
	
	public void setWithdraw(double money){
	if(money>0 && money<=balance){
	balance-=money;
	System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY!!!");
	}
	else
	System.out.println("INVALID AMOUNT");
	}
	
	public  double getBalance(){
	return balance;
	}
} 
public class  EncapsulationBankAccount{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	BankAccount bank=new BankAccount();	
	System.out.println("ENTER ACCOUNT HOLDER NAME");
	String n=sc.nextLine();
	bank.setAccountHolderName(n);
	System.out.println("ENTER THE ACCOUNT NUMBER");
	long accno=sc.nextLong();
	bank.setAccountNumber(accno);
	while(true){
	System.out.println("--------WELCOME TO BANKING---------");
	System.out.println("1.ACCOUNT DETAILS");
	System.out.println("2.DEPOSIT AMOUNT");
	System.out.println("3.WITHDRAW AMOUNT");
	System.out.println("4.BALANCE AMOUNT");
	System.out.println("5.EXIT ");
	System.out.println("please enter your choice");
	int choice=sc.nextInt();
	switch(choice){
	case 1:
		System.out.println("ACC HOLDER:-"+bank.getAccountHolderName());
		System.out.println("ACCOUNT NUMBER:-"+bank.getAccountNumber());
		break;
	case 2:
		System.out.println("ENTER AMOUNT FOR DEPOSIT");
		long amount=sc.nextLong();
		bank.setDeposit(amount);
		break;
	case 3:
		System.out.println("ENTER AMOUNT FOR WITHDRAW");
		long money=sc.nextLong();
		bank.setWithdraw(money);
		break;
	case 4:
		System.out.println("THE BALANCE AMOUNT IS :-"+bank.getBalance());
		break;
	case 5:
		System.out.println("THANK YOU!!!");
		return;
	default:
		System.out.println("INVALID CHOICE");
		break;
	}
}
}
}	
	
	
	