import java.net.URL;
import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) 
	{
		PlayerRating c1 = new PlayerRating("Karim Benzema", 80, 94, 53, 98);
		PlayerRating c2 = new PlayerRating("Lionel Messi", 42, 67, 45, 76);
		PlayerRating c3 = new PlayerRating("Cristiano Ronaldo", 76, 94, 45, 97);
		c1.display();
		c2.display();
		c3.display();
		
		String cardJson = Driver.getJSON("https://futdb.app/api/doc");
		System.out.println(cardJson);
	}
	static String getJSON(String urlString)
	{
		String line = "";
		try
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			
			while (input.hasNext())
			{
				line += input.nextLine();
			}
			
			input.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "can't connect";
		}
		return line;
	}
}

