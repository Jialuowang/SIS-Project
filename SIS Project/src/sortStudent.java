import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.*;
public abstract class sortStudent implements Comparator<Student>
	{
		public static void main(String[] args) throws IOException
		{
		askChoice();
		}
		public static void askChoice()
			{
				System.out.println("Would you like to sort a student by:");
				System.out.println("1) Sort by last name");
				System.out.println("2) Sort by GPA");
				System.out.println("3) Sort by class period");
				
				Scanner selection = new Scanner(System.in);
				int pick  = selection.nextInt();
				if(pick == 1)
					{
					System.out.println("");
					lastName();	
					}
				else if(pick == 2)
					{
					System.out.println("");
					gradeSort();
					}
				else if(pick == 3)
					{
					System.out.println("");
					classPeriod();
					}
				else
					{
						System.out.println(pick + " is not a number");
						askChoice();
					}
				
			}
		private static void lastName()
			{
				
				for (int k = 0; k < mainMenu.roster.size(); k++)
					{
					for (int j = k; j < mainMenu.roster.size(); j++)
						{
						
						String first = mainMenu.roster.get(j).getFirstName();
						String last = mainMenu.roster.get(j).getLastName();
						String firstP = mainMenu.roster.get(j).getFirstPeriod();
						String secondP = mainMenu.roster.get(j).getSecondPeriod();
						String thirdP = mainMenu.roster.get(j).getThirdPeriod();
						double average = mainMenu.roster.get(j).getGradeAverage();
						mainMenu.roster.add(new Student(first, last, firstP, secondP, thirdP, average));					}
					Collections.sort(mainMenu.roster, new NameSorter());
					for (int o = 0; o < mainMenu.roster.size(); o++)
						{
						System.out.println(mainMenu.roster.get(o).getFirstName() + " " + mainMenu.roster.get(o).getLastName());
						}
					System.out.println(" ");
					}
			    }	
		private static void gradeSort()
			{
				
				
			}
		private static void classPeriod()
			{
			System.out.println("What class period would you like to be sorted:");
			System.out.println("1) 1st Period");
			System.out.println("2) 2nd Period");
			System.out.println("3) 3rd Period");
			Scanner choose = new Scanner(System.in);
			int cool  = choose.nextInt();
			if(cool == 1)
				{
					
				}
			else if(cool == 2)
				{
					
				}
			else if(cool == 3)
				{
					
				}
			else
				{
				System.out.println(cool + " was not an option");
				}
				
			}
	}
