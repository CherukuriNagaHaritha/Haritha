package payroll;
import java.io.*;
public class Customer implements Serializable{
	String CustomerName;
	String address;
	
	public Customer(String customername,String address)
	{
		this.CustomerName=CustomerName;
		this.address=address;
	}
	public void showDetails()
	{
		System.out.println("Customer name: "+CustomerName);
		System.out.println("Address: "+address);
	}

}
