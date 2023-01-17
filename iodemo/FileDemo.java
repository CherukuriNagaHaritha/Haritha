package iodemo;
import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream f=new FileInputStream("C://Users//CNAGAHAR//Documents://file");
			byte[] ba=new byte[f.available()];
			f.read(ba);
			for(byte b:ba)
			{
				System.out.print((char)b);
			}
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
