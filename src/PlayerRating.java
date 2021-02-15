
public class PlayerRating 
{
	int shooting;
	int dribble;
	int defense;
	int rating;
	String name;
	
	public PlayerRating(String name, int shooting, int dribble, int defense, int rating)
	{
		this.shooting = shooting;
		this.dribble = dribble;
		this.defense = defense;
		this.name = name;
		this.rating = rating;
	}
	
	void display()
	{
		System.out.println("Name: " + this.name + "\nrating: " + this.rating + "\nshooting: " + this.shooting + "\ndribble:" + this.dribble + "\nDefense: " + this.defense);
	}
}
