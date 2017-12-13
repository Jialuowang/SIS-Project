import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public abstract class sortStudent implements Comparator<Student>
	{
		public static void main(String[] args)
		{
		askChoice();
		lastName();
		gradeSort();
		classPeriod();
		}
		private static void askChoice()
			{
				System.out.println("Would you like to sort a student by:");
				System.out.println("1) Sort by last name");
				System.out.println("2) Sort by GPA");
				System.out.println("3) Sort by class period");
				
				Scanner selection = new Scanner(System.in);
				int pick  = selection.nextInt();
				if(pick == 1)
					{
					lastName();	
					}
				else if(pick == 2)
					{
					gradeSort();
					}
				else if(pick == 3)
					{
					classPeriod();
					}
				else
					{
						System.out.println("This is not a number");
						askChoice();
					}
				
			}
		private static void lastName()
			{
				for (int i = 0; i < roster.size(); i++) {
			        for (int j = 0; j < roster.size(); j++) {
			            Collections.sort(roster, new Comparator() {

			                public int compare(Student o1, Student o2) {
			                    Student p1 = (Student) o1;
			                    Student p2 = (Student) o2;
			                    return p1.getLastName().compareToIgnoreCase(p2.getLastName());
			                }
			            });
			        }

			    }	
			}
		private static void gradeSort()
			{
				
				
			}
		private static void classPeriod()
			{
				
				
			}
	}
