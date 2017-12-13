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
					for(int n = 0; n < mainMenu.studentList.size(); n++)
						{
							if(i1.equals(mainMenu.studentList.get(n).getFirstName)&&i2.equals(mainMenu.studentList(n).getLastName))
								{
									System.out.println("which period you want to change?");
									for(Student s : mainMenu.studentList)
										{
											System.out.println("period 1 : " + mainMenu.studentList.get(n).getFirstPeriod);
											System.out.println("period 2 : " + mainMenu.studentList.get(n).getSecondPeriod);
											System.out.println("period 3 : " + mainMenu.studentList.get(n).getThirdPeriod);
										}
									int p = userInput.nextInt();
									if(p==1)
										{
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getFirstPeriod + " is " + mainMenu.studentList.get(n).getFirstPeriodGrade);
											System.out.println("what grade you want to put in");
											String tc1 = userInput.nextLine();
											mainMenu.studentList.get(n).setFirstPeriodGrade(tc1);
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getFirstPeriod + " is " + mainMenu.studentList.get(n).getFirstPeriodGrade);
										}
									if(p==2)
										{
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getSecondPeriod + " is " + mainMenu.studentList.get(n).getSecondPeriodGrade);
											System.out.println("what grade you want to put in");
											String tc2 = userInput.nextLine();
											mainMenu.studentList.get(n).setFirstPeriodGrade(tc1);
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getSecondPeriod + " is " + mainMenu.studentList.get(n).getSecondPeriodGrade);
										}
									if(p==3)
										{
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getThirdPeriod + " is " + mainMenu.studentList.get(n).getThirdPeriodGrade);
											System.out.println("what grade you want to put in");
											String tc3 = userInput.nextLine();
											mainMenu.studentList.get(n).setFirstPeriodGrade(tc1);
											System.out.println("Now, the grade in " + mainMenu.studentList.get(n).getThirdPeriod + " is " + mainMenu.studentList.get(n).getThirdPeriodGrade);
										}
									else
										{
											System.out.println("wrong selection");;
										}
									
									t = false;
								}
							
						}
					if(t == true)
						{
							System.out.println("can't find this student");
						}
					
				}
			else if(chooser == 2)
				{
					boolean t = true;
					System.out.println("who's grades you want to change? please put first name in");
					String i1 = userInput.nextLine();
					System.out.println("please put in last name");
					String i2 = userInput.nextLine();
					for(int n = 0; n < mainMenu.studentList.size(); n++)
						{
							if(i1.equals(mainMenu.studentList.get(n).getFirstName)&&i2.equals(mainMenu.studentList(n).getLastName))
								{
									System.out.println("the period is:");
									for(Student s : mainMenu.studentList)
										{
											System.out.println("period 1 : " + mainMenu.studentList.get(n).getFirstPeriod);
											System.out.println("period 2 : " + mainMenu.studentList.get(n).getSecondPeriod);
											System.out.println("period 3 : " + mainMenu.studentList.get(n).getThirdPeriod);
										}
									
									t = false;
								}
				}
			else
				{
					System.out.println("null");
				}
		}
	}
