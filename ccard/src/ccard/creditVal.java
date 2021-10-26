package ccard;

//sus
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class creditVal
	{
	static long  num[]  = new long[16];
	static int valid =0;
	static int ivalid=0;

		public static void main(String[]args) throws IOException
		{
			
getNum();
	
		
			}
		public static void getNum() throws IOException
		{
			System.out.println("d");
			Scanner myFile = new Scanner( new File ("creditnums.txt"));
			while(myFile.hasNextLong());
				{
					long number = myFile.nextLong();
					for(int i = 15; i>= 0; i--)
						{

							num[i]= number%10;
							number = number/10;
							
						}
					changeNumber();
					checkReal();
				}
			
			
		}
		public static void changeNumber()
		{
			for(int i =0; i < num.length; i=+2)
			{
				num[i]=num[i]*2;
				if(num[i]>9)
				{
					long one = num[i]%10;
					long two = num[i]/10;
					num[i]=one+two;
				}
			}
		}
		public static void checkReal()
		{
			int fin =0;
			for(int i =0; i<num.length; i++)
			{
				fin +=  num[i];
			}
			if(fin%10 == 0)
			{
				valid++;
				for(int i = 0; i<16; i++)
				{
					System.out.println(num[i]);
				}
			}
			else
			{
				ivalid++;
			}
		}
}
		
		

	






