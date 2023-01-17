package abc;

public class candidate{
public void checkmarks(int marks) throws Exception{
	if(marks<30)
	{
		throw new Exception("marks Invalid");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			candidate a=new candidate();
			a.checkmarks(10);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
