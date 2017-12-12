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
					System.out.println();
				// add first name, last name, etc...
				//all implemented prior arrayList.add(firstName, lastName,firstPeriod,firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade)
				System.out.println(pick);
				}
				else if(pick == 2)
				{
				//print list of arrays, at the bottom user picks which one to delete by number.
			    System.out.println("Which Student would you like to delete?");
				}
			}

	}
