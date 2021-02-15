
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
	}

}
