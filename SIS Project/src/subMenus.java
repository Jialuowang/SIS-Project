import java.util.*;

public class subMenus
	{

		public static void main(String[] args)
			{
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				
				Scanner selection = new Scanner(System.in);
				int pick  = selection.nextInt();
				if(pick == 1)
				{
				Add();
				}
				else if(pick == 2)
				{
				Del();
				}
			}
		 static void Add(int pick, ArrayList roster)
		{
			//prints roster
				for(int i = 0; i < roster.size(); i++)
				{
					roster.get(i);
				}
				//all implemented prior arrayList.add(firstName, lastName,firstPeriod,firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade)
				System.out.println(pick);
		}
		 static void Del()
		 {
			//print list of arrays, at the bottom user picks which one to delete by number.
			    System.out.println("Which Student would you like to delete?");
		 }
	}
