import java.util.Scanner;

public class switchClasses
	{
		public static void switchClasses()
		{
			System.out.println("1) change grades(teachers only)");
			System.out.println("2) switch class");
			Scanner userInput = new Scanner(System.in);
			int chooser = userInput.nextInt();
			if(chooser == 1)
				{
					boolean t = true;
					System.out.println("who's grades you want to change? please put first name in");
					String i1 = userInput.nextLine();
					System.out.println("please put in last name");
					String i2 = userInput.nextLine();
					for(int n = 0; n < studentList.size(); n++)
						{
							if(i1.equals(studentList(n).getFirstName)&&i2.equals(studentList(n).getFirstName))
								{
									t = false;
								}
						}
					if(t == false)
						{
							System.out.println("can't find this student");
						}
					
				}
			else if(chooser == 2)
				{
					
				}
			else
				{
					System.out.println("null");
				}
		}
	}
