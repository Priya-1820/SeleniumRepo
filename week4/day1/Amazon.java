package week4.day1;

public class Amazon extends CanaraBank
{
	public static void main(String[] args) 
	{
		Amazon az = new Amazon();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
		az.recordPaymentDetails();
	
		
	}
	
	public void recordPaymentDetails() 
	{
		System.out.println("Payment details are recorded");
		
	}

	@Override
	public void cashOnDelivery() 
	{
		
		System.out.println("Cash on delivery is accepted");
		
	}

	@Override
	public void upiPayments() 
	{
		System.out.println("UPI payment is accepted");
		
	}

	@Override
	public void cardPayments() 
	{
		System.out.println("Card payment is accepted");
		
	}

	@Override
	public void internetBanking() 
	{
		System.out.println("InternetBanking is accepted");
		
	}
	
}
