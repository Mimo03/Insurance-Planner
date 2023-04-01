import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Lets a PLAY a game of *HAND CRICKET* :)");
		System.out.println("Now choose ODD or EVEN:");
		String ch=sc.next();
		
		
		
		int playerMove=getPlayerMove();
		int computerMove=getComputerMove();
		
		if(ch=="ODD")
		{
		    if((playerMove+computerMove)%2!=0)
		    {
		        System.out.println("Nice play!! Thats an ODD :)");
		    }
		    else
		    {
		        System.out.println("Better luck next time..coz Thats EVEN :)");
		    }
		    
		}
        else
        {
            if((playerMove+computerMove)%2!=0)
            {
                System.out.println("Better luck next time..coz Thats ODD :)");
            }
            else
            {
                System.out.println("Nice play!! Thats an EVEN :)");
            }
        }

		public int getComputerMove()
		{
		    Random random=new Random();
		    int input=random.nextInt(10);
		    System.out.println("Computers move: "+input);
		    return input;
		}
		
		public int getPlayerMove()
		{
		    System.out.println("Play your turn!!");
		    int int1=sc.nextInt();
		    System.out.println("Your move: "+int1);
		    return int1;
		}
	}
}
