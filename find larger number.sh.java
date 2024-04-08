import java.util.Scanner;

public class Large_num
{
	public static void main(String[] args) {
		check();
	}	
	
public static void check()
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1: ");
		a=sc.nextInt();
		
		System.out.println("Enter number2: ");
		b=sc.nextInt();
		
		System.out.println("Enter number3: ");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		
		else if(b>c && b>a)
		{
			System.out.println("b is greater");
		}
		
		else {
			System.out.println("c is greater");
		}

}
}