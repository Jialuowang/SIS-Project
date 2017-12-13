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
				Add(mainMenu.roster);
				}
				else if(pick == 2)
				{
				Del();
				}
			}
		 static void Add(ArrayList rosterStu)
		{
			
				for(int i = 0; i < rosterStu.size(); i++)
				{
					System.out.println(rosterStu.getfirstName(i) + " " + rosterStu.getlastName(i) + rosterStu.getfirstPeriod(i) + " ");
				}
				//test
				//all implemented prior arrayList.add(firstName, lastName,firstPeriod,firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade)
				
		}
		 static void Del()
		 {
			//print list of arrays, at the bottom user picks which one to delete by number.
			    System.out.println("Which Student would you like to delete?");
		 }
	}
