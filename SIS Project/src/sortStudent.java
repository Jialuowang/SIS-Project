import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public abstract class sortStudent implements Comparator<Student>
	{
		public static void main(String[] args)
		{
			ArrayList <Student> roster = new ArrayList <Student>();
			System.out.println("Would you like to sort a student by:");
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by class period");
			
			Scanner selection = new Scanner(System.in);
			int pick  = selection.nextInt();
			if(pick == 1)
				{
					System.out.println("hello");
				}
			else if(pick == 2)
				{
					for(int i = roster.size() -1; i > 0; i--)
						{
						System.out.println(roster.gradeAverage()-1);	
						}
				}
			else if(pick == 3)
				{
					System.out.println("One more");
				}
			else
				{
					System.out.println("This is not a number");
				}
		}
	}
