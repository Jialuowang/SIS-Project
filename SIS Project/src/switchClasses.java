import java.util.Scanner;
import java.io.*;
public class switchClasses
	{
		public static void main(String[] args) throws IOException
			{
				switchClasses();
			}
		public static void switchClasses()
		{
			System.out.println("1) change grades(teachers only)");
			System.out.println("2) switch class");
			Scanner userInput = new Scanner(System.in);
			Scanner userInput2 = new Scanner(System.in);
			int chooser = userInput.nextInt();
			if(chooser == 1)
				{
					int n = 0;
					boolean t = true;
					System.out.println("who's grades you want to change? please put in first name");
					String i1 = userInput2.nextLine();
					System.out.println("please put in last name");
					String i2 = userInput2.nextLine();
					while( n < mainMenu.roster.size())
						{
							
							if(i1.equals(mainMenu.roster.get(n).getFirstName())&&i2.equals(mainMenu.roster.get(n).getLastName()))
								{
									
									
									t = false;
									break;
								}
							n++;
						}
					if(t == false)
						{
							System.out.println("which period you want to change?");
							System.out.println("period 1 : " + mainMenu.roster.get(n).getFirstPeriod());
							System.out.println("period 2 : " + mainMenu.roster.get(n).getSecondPeriod());
							System.out.println("period 3 : " + mainMenu.roster.get(n).getThirdPeriod());
								
							int p = userInput.nextInt();
							if(p==1)
								{
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getFirstPeriod() + " is " + mainMenu.roster.get(n).getFirstPeriodGrade());
									System.out.println("what grade you want to put in");
									String tc1 = userInput2.nextLine();
									mainMenu.roster.get(n).setFirstPeriodGrade(tc1);
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getFirstPeriod() + " is " + mainMenu.roster.get(n).getFirstPeriodGrade());
								}
							else if(p==2)
								{
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getSecondPeriod() + " is " + mainMenu.roster.get(n).getSecondPeriodGrade());
									System.out.println("what grade you want to put in");
									String tc2 = userInput2.nextLine();
									mainMenu.roster.get(n).setSecondPeriodGrade(tc2);
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getSecondPeriod() + " is " + mainMenu.roster.get(n).getSecondPeriodGrade());
								}
							else if(p==3)
								{
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getThirdPeriod() + " is " + mainMenu.roster.get(n).getThirdPeriodGrade());
									System.out.println("what grade you want to put in");
									String tc3 = userInput2.nextLine();
									mainMenu.roster.get(n).setThirdPeriodGrade(tc3);
									System.out.println("Now, the grade in " + mainMenu.roster.get(n).getThirdPeriod() + " is " + mainMenu.roster.get(n).getThirdPeriodGrade());
								}
							else
								{
									System.out.println("wrong selection");;
								}
						}
					if(t == true)
						{
							System.out.println("can't find this student");
						}
					switchClasses();
					
				}
			else if(chooser == 2)
				{
					int n = 0;
					boolean t = true;
					System.out.println("who's grades you want to change? please put first name in");
					String i1 = userInput2.nextLine();
					System.out.println("please put in last name");
					String i2 = userInput2.nextLine();
					System.out.println("period 1 : " + mainMenu.roster.get(n).getFirstPeriod());
					System.out.println("period 2 : " + mainMenu.roster.get(n).getSecondPeriod());
					System.out.println("period 3 : " + mainMenu.roster.get(n).getThirdPeriod());
					String fp1 = mainMenu.roster.get(n).getFirstPeriod();
					String fp2 = mainMenu.roster.get(n).getSecondPeriod();
					String fp3 = mainMenu.roster.get(n).getThirdPeriod();
					System.out.println("Please put in the new order, the first : ");
					int np1 = userInput.nextInt();
					System.out.println("Please put in the new order, the second : ");
					int np2 = userInput.nextInt();
					System.out.println("Please put in the new order, the third : ");
					int np3 = userInput.nextInt();
					if(np1 == 1)
						{
							if(np2 ==2) 
								{
									
								}
							else if(np3 == 2)
								{
									mainMenu.roster.get(n).setThirdPeriod(fp2);
									mainMenu.roster.get(n).setSecondPeriod(fp3);
								}
						}
					else if(np1 == 2)
						{
							if(np2 ==1)
								{
									mainMenu.roster.get(n).setFirstPeriod(fp2);
									mainMenu.roster.get(n).setSecondPeriod(fp1);
								}
							else if(np2 == 3)
								{
									mainMenu.roster.get(n).setFirstPeriod(fp2);
									mainMenu.roster.get(n).setSecondPeriod(fp3);
									mainMenu.roster.get(n).setThirdPeriod(fp1);
								}
						}
					else if(np1 == 3)
						{
							if(np2 ==1)
								{
									mainMenu.roster.get(n).setFirstPeriod(fp3);
									mainMenu.roster.get(n).setSecondPeriod(fp1);
									mainMenu.roster.get(n).setThirdPeriod(fp2);
								}
							else if(np2 == 2)
								{
									mainMenu.roster.get(n).setFirstPeriod(fp3);
									mainMenu.roster.get(n).setSecondPeriod(fp2);
									mainMenu.roster.get(n).setThirdPeriod(fp1);
									
								}
						}
					else
						{
							System.out.println("wrong selection");
						}
					System.out.println("here is new order of class");
					System.out.println("period 1 : " + mainMenu.roster.get(n).getFirstPeriod());
					System.out.println("period 2 : " + mainMenu.roster.get(n).getSecondPeriod());
					System.out.println("period 3 : " + mainMenu.roster.get(n).getThirdPeriod());
					switchClasses();
				}		
		
					
				
					
			else
				{
					System.out.println("wrong selection");
				}
		}
	}	
