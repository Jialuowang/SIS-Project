import java.util.*;
import java.io.*;
import java.text.*;

public class subMenus
	{
		static double gpa;
		static DecimalFormat decFor = new DecimalFormat("0.0");
		public static void main(String[] args) throws IOException
			{
			runner();
			}
		 public static void runner() throws IOException
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
		public static void gpaCal(String fpG, String spG, String tpG)
				{
					 gpa = 0;
					switch(fpG)
						{
							case "A+":
									{
									gpa += 4.0;
									break;
									}
							case "A":
									{
									gpa += 4.0;
									break;
									}
							case "A-":
									{
									gpa += 3.7;
									break;
									}
							case "B+":
									{
									gpa += 3.3;
									break;
									}
							case "B":
									{
									gpa += 3.0;
									break;
									}
							case "B-":
									{
									gpa += 2.7;
									break;
									}
							case "C+":
									{
									gpa += 2.3;
									break;
									}
							case "C":
									{
									gpa += 2.0;
									break;
									}
							case "C-":
									{
									gpa += 1.7;
									break;
									}
							case "D+":
									{
									gpa += 1.3;
									break;
									}
							case "D":
									{
									gpa += 1.0;
									break;
									}
						}
					switch(spG)
					{
						case "A+":
								{
								gpa += 4.0;
								break;
								}
						case "A":
								{
								gpa += 4.0;
								break;
								}
						case "A-":
								{
								gpa += 3.7;
								break;
								}
						case "B+":
								{
								gpa += 3.3;
								break;
								}
						case "B":
								{
								gpa += 3.0;
								break;
								}
						case "B-":
								{
								gpa += 2.7;
								break;
								}
						case "C+":
								{
								gpa += 2.3;
								break;
								}
						case "C":
								{
								gpa += 2.0;
								break;
								}
						case "C-":
								{
								gpa += 1.7;
								break;
								}
						case "D+":
								{
								gpa += 1.3;
								break;
								}
						case "D":
								{
								gpa += 1.0;
								break;
								}
					}
					switch(tpG)
					{
						case "A+":
								{
								gpa += 4.0;
								break;
								}
						case "A":
								{
								gpa += 4.0;
								break;
								}
						case "A-":
								{
								gpa += 3.7;
								break;
								}
						case "B+":
								{
								gpa += 3.3;
								break;
								}
						case "B":
								{
								gpa += 3.0;
								break;
								}
						case "B-":
								{
								gpa += 2.7;
								break;
								}
						case "C+":
								{
								gpa += 2.3;
								break;
								}
						case "C":
								{
								gpa += 2.0;
								break;
								}
						case "C-":
								{
								gpa += 1.7;
								break;
								}
						case "D+":
								{
								gpa += 1.3;
								break;
								}
						case "D":
								{
								gpa += 1.0;
								break;
								}
					}
					gpa /= 3;
					
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
			
			System.out.println("Please type in the Students first period class: ");
			Scanner fpp = new Scanner(System.in);
			String fp = fpp.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students first period grade: ");
			Scanner fpGg= new Scanner(System.in);
			String fpG = fpGg.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students second period class: ");
			Scanner spp = new Scanner(System.in);
			String sp = spp.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students second period grade: ");
			Scanner spGg = new Scanner(System.in);
			String spG = spGg.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students third period grade: ");
			Scanner tpp = new Scanner(System.in);
			String tp = tpp.nextLine();
			
			System.out.println();
			
			System.out.println("Please type in the Students third period grade: ");
			Scanner tpGg = new Scanner(System.in);
			String tpG = tpGg.nextLine();
			
			
			
			System.out.println();
			gpaCal(fpG, spG, tpG);
			double stuGpa = gpa;
			System.out.println();
			
			  mainMenu.roster.add(new Student(stuName, stuLast, fp, fpG, sp, spG, tp, tpG, stuGpa));
			  
			  
			
			for(int i = 0; i < mainMenu.roster.size() - 1; i++)
				{
					System.out.println(i + 1 + ") " + mainMenu.roster.get(i).getFirstName() + " " + mainMenu.roster.get(i).getLastName() + " " + mainMenu.roster.get(i).getFirstPeriod() + " " + mainMenu.roster.get(i).getFirstPeriodGrade() + " " + mainMenu.roster.get(i).getSecondPeriod()+ " " + mainMenu.roster.get(i).getSecondPeriodGrade() + " " + mainMenu.roster.get(i).getThirdPeriod()+ " " + mainMenu.roster.get(i).getThirdPeriodGrade() + " GPA: " + decFor.format(mainMenu.roster.get(i).getGradeAverage()));
				}
			System.out.println("New Student:");
			System.out.println(25 + ") " + mainMenu.roster.get(24).getFirstName() + " " + mainMenu.roster.get(24).getLastName() + " " + mainMenu.roster.get(24).getFirstPeriod() + " " + mainMenu.roster.get(24).getFirstPeriodGrade() + " " + mainMenu.roster.get(24).getSecondPeriod()+ " " + mainMenu.roster.get(24).getSecondPeriodGrade() + " " + mainMenu.roster.get(24).getThirdPeriod()+ " " + mainMenu.roster.get(24).getThirdPeriodGrade() + " GPA: " + decFor.format(mainMenu.roster.get(24).getGradeAverage()));
				//all implemented prior arrayList.add(firstName, lastName,firstPeriod,firstPeriodGrade, secondPeriod, secondPeriodGrade, thirdPeriod, thirdPeriodGrade)
				
		}
		
		static void Del()
		 {
			 	System.out.println("Here is the list of Students:" );
			 	System.out.println();
			 	for(int i = 0; i < mainMenu.roster.size(); i++)
					{
						System.out.println(i + 1 + ") " + mainMenu.roster.get(i).getFirstName() + " " + mainMenu.roster.get(i).getLastName() + " " + mainMenu.roster.get(i).getFirstPeriod() + " " + mainMenu.roster.get(i).getFirstPeriodGrade() + " " + mainMenu.roster.get(i).getSecondPeriod()+ " " + mainMenu.roster.get(i).getSecondPeriodGrade() + " " + mainMenu.roster.get(i).getThirdPeriod()+ " " + mainMenu.roster.get(i).getThirdPeriodGrade() + " GPA: " + decFor.format(mainMenu.roster.get(i).getGradeAverage()));
					}
			 	System.out.println();
			    System.out.println("Which Student would you like to delete?");
			    Scanner dell = new Scanner(System.in);
			    int del = dell.nextInt();
			    
			    mainMenu.roster.remove(del - 1);
			    System.out.println("Here is the new list:");
			    for(int i = 0; i < mainMenu.roster.size(); i++)
					{
						System.out.println(i + 1 + ") " + mainMenu.roster.get(i).getFirstName() + " " + mainMenu.roster.get(i).getLastName() + " " + mainMenu.roster.get(i).getFirstPeriod() + " " + mainMenu.roster.get(i).getFirstPeriodGrade() + " " + mainMenu.roster.get(i).getSecondPeriod()+ " " + mainMenu.roster.get(i).getSecondPeriodGrade() + " " + mainMenu.roster.get(i).getThirdPeriod()+ " " + mainMenu.roster.get(i).getThirdPeriodGrade() + " GPA: " + decFor.format(mainMenu.roster.get(i).getGradeAverage()));
					}
		 }
	}
