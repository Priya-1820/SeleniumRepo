package week4.day1;

public class Connection implements DatabaseConnection{

	public static void main(String[] args) 
	{
      Connection c = new Connection(); 
      c.connect();
      c.disconnect();
      c.executeUpdate();

	}

	@Override
	public void connect() 
	{
		System.out.println("Connect the DB");
	}

	@Override
	public void disconnect() 
	{
		System.out.println("Disconnect the DB");
		
	}

	@Override
	public void executeUpdate() 
	{
		System.out.println("execute the DB");
		
	}

}
