package iodemo;
import java.io.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	InputStream in=System.in;
        	byte[] b=new byte[100];
        	in.read(b);
        	PrintStream os=System.out;
        	String str="Im Fine ! How are you today ?";
        	os.write(str.getBytes());
        
        	
        }
        catch(IOException e)
        {
        	System.out.println(e);
        }
	}

}
