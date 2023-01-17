package file;
import java.io.RandomAccessFile;
public class randomfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"Apple","Kiwi","Mango"};
		try
		{
			RandomAccessFile f=new RandomAccessFile("C:\\Users\\CNAGAHAR\\Documents\\Read.txt","rw");
			for(String a:arr)
			{
				f.writeUTF(a);
			}
			f.seek(2);
			String s=f.readLine();
			System.out.println(s);
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
      
	}

}
