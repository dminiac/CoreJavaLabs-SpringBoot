class Game
{
	private String player1;
	private String player2;

	 public Game(String player1,String player2)
	{
		 this.player1=player1;	
		 this.player2=player2;
	}
	public String getPlayer1()
	{
		return player1;	
	}
	public String getPlayer2()
	{
		return player2;	
	}
}
class PlayMonitor
{
	Game game;
	String winningTracking="";
	
	public int playerValidate(Game game) 
	{
		String player1=game.getPlayer1();
		String player2=game.getPlayer2();
		boolean v1=validateName(player1);
		boolean v2=validateName(player2);
		 
		if(v1&&v2)
			return 10;
		else if(v1||v2)
			return 5;
		else
			return 0; 
	}
  public int matchWin(String winningTracking)
	{ 
		this.winningTracking=winningTracking;
		int total=0;
		int win=0;
		for(int i=0;i<winningTracking.length();i++)
		{
			if(winningTracking.charAt(i)==',')
			{
				 total=total+Character.getNumericValue(winningTracking.charAt(i-1));
				 win=win+Character.getNumericValue(winningTracking.charAt(i+1));
			}
		} 
		 int percentage=win*100/total;
		return percentage;
	}
	private boolean validateName(String str)
	{
		if(str.charAt(0)>='A' && str.charAt(0)<='Z')
		{
			for(int i=1;i<str.length();i++)
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z'||str.charAt(i)=='-' || str.charAt(i)==' ')
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		 else
		{
			return false;	
		}	 
	}
}
public class GameWinning
{
	public static void main(String[] args)
	{
		Game g1=new Game("Harsha","Sai");
		PlayMonitor p=new PlayMonitor();
		System.out.println("Player Validation:-"+p.playerValidate(g1));
		System.out.println("Winning Percentage:-"+p.matchWin("3,2:5,2:2,0"));
		
	}

}