import java.util.*;
import java.io.*;
import java.text.*;

public class subMenus
	{

		public static void main(String[] args) throws IOException
			{
				
				System.out.println("1) Add a Student");
				System.out.println("2) Delete a Student");
				mainMenu.addStudents();
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
		 private static void Add(ArrayList roster) throws IOException
		{
			System.out.println("Please type in the Students name: ");
			Scanner stuNamee = new Scanner(System.in);
			String stuName = stuNamee.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students last name: ");
			Scanner stuLastt = new Scanner(System.in);
			String stuLast = stuLastt.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students last name: ");
			Scanner fpGg = new Scanner(System.in);
			String fpG = fpGg.nextLine();
		/*	
			System.out.println();
			
			System.out.println("Please type in the Students last name: ");
			Scanner stuLastt = new Scanner(System.in);
			String stuLast = stuLastt.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students last name: ");
			Scanner stuLastt = new Scanner(System.in);
			String stuLast = stuLastt.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students last name: ");
			Scanner stuLastt = new Scanner(System.in);
			String stuLast = stuLastt.nextLine();
			
			System.out.println();
			
			System.out.println();
			*/
	//		mainMenu.roster.add(stuName, stuLast);
			DecimalFormat decFor = new DecimalFormat("0.0");
			for(int i = 0; i < mainMenu.roster.size(); i++)
				{
					System.out.println(i + 1 + ") " + mainMenu.roster.get(i).getFirstName() + " " + mainMenu.roster.get(i).getLastName() + " " + mainMenu.roster.get(i).getFirstPeriod() + " " + mainMenu.roster.get(i).getFirstPeriodGrade() + " " + mainMenu.roster.get(i).getSecondPeriod()+ " " + mainMenu.roster.get(i).getSecondPeriodGrade() + " " + mainMenu.roster.get(i).getThirdPeriod()+ " " + mainMenu.roster.get(i).getThirdPeriodGrade() + " GPA: " + decFor.format(mainMenu.roster.get(i).getGradeAverage()));
				}
			
				//all implemented prior arrayList.add(firstName, lastName,firstPeriod,firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade)
				
		}
		 static void Del()
		 {
			//print list of arrays, at the bottom user picks which one to delete by number.
			    System.out.println("Which Student would you like to delete?");
		 }
	}
