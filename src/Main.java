import java.util.*;
public class Main
{
	char a[][] =new char [3][3];
	void initializer()
	{
		int i , j;
		for( i= 0;i<3;i++)
		{
			for(j = 0;j<3;j++)
			{
				a[i][j] ='_';
			}
		}
	}
	
	void display()
	{
		int m , b;
		for( m= 0;m<3;m++)
		{
			for(b = 0;b<3;b++)
			{
				System.out.print(" "+ a[m][b] + " ");
			}
			System.out.println(" ");
		}
	}
	class CPUTurn
	{
		void cpufirstturn()
		{
			/*
			int m1, b1;
			for( m1= 0;m1<3;m1++)
			{
				for(b1 = 0;b1<3;b1++)
				{
					System.out.print(" "+ a[m1][b1] + " ");
				}
				System.out.println(" ");
			}
			*/
			if(a[1][1]!='o')
			{
				a[1][1]= 'x';
			}
			Main mc = new Main();
			mc.display();
			
		}
	}
	
	class UserTurn
	{
		void entry()
		{
			System.out.println("Enter the i,j value of matrix starting from 0 ");
			int ur ,uc;
			Scanner se =new Scanner(System.in);
			ur =se.nextInt();
			uc =se.nextInt();
			
			a[ur][uc]='o';
			Main mu = new Main();
			mu.display();
		}
	}
	public static void main(String [] args)
	{
		System.out.println("Welcome to game :)   ");
		Main m =new Main();
		m.initializer();
		m.display();
		
		System.out.println("First turn will be of user :)");
		System.out.println("CPU Takes 'x'");
		System.out.println("Enjoy!");
		
		
		
	}
}
