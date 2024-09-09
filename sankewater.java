import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int round=sc.nextInt();
		sc.nextLine();
		String str=sc.nextLine();
		System.out.print(game(round,str));
	}
	static int game(int round,String str)
	{
	    int p1Score=0;
	    int index=0;
	    for(int i=0;i<round;i++)
	    {
	        String p1Move="";
	        if(str.startsWith("sanke",index))
	        {
	            p1Move="snake";
	            index+=5;
	        }
	        else if(str.startsWith("gun",index))
	        {
	            p1Move="gun";
	            index+=3;
	        }
	        else if(str.startsWith("water",index))
	        {
	            p1Move="water";
	            index+=5;
	        }
	        String p2Move="";
	        if(str.startsWith("sanke",index))
	         {
	             p2Move="snake";
	             index+=5;
	         }
	         else if(str.startsWith("gun",index))
	         {
	          p2Move="gun";
	          index+=3;
	         }
	         else if(str.startsWith("water",index))
	        {
	            p2Move="water";
	            index+=5;
	        }
	        if(p1Move.equals("snake") && p2Move.equals("water"))
	        p1Score++;
	        else if(p1Move.equals("water") && p2Move.equals("gun"))
	        p1Score++;
	        else if(p1Move.equals("gun")  && p2Move.equals("snake"))
	        	        p1Score++;
	    }
	    return p1Score;
	        
	         
	         


	        }
	    }
	

