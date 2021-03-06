import java.io.*;
import java.util.*;

public class mainMenu
	{
		static ArrayList <Student> roster = new ArrayList <Student>();
		public static void main(String[] args) throws IOException
			{
			promptUser();
			
			}
		public static void addStudents() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String line = file.nextLine();
						String [] catcher = line.split(" ");
						double gpa = 0;
						String fpg = catcher[3];
						String spg = catcher[5];
						String tpg = catcher[7];
						
						switch(fpg)
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
						switch(spg)
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
						switch(tpg)
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
						roster.add(new Student(catcher[0], catcher[1], catcher[2], catcher[3], catcher[4], catcher[5], catcher[6], catcher[7], gpa));
					}

				
			}
		private static void promptUser() throws IOException
			{
			System.out.println("Welcome to the Gradebook! Would you like to:");
			System.out.println("1: Add or Delete a Student");
			System.out.println("2: Switch Classes for a Student");
			System.out.println("3: Look at Student List");
			Scanner selection = new Scanner(System.in);
			int choice = selection.nextInt();
			switch(choice)
			{
				case 1:
					{
					addStudents();
					subMenus.runner();
					break;
					}
				case 2:
					{
					addStudents();
					switchClasses.switchClasses();	
					break;
					}
				case 3:
					{
					addStudents();
					sortStudent.askChoice();	
					break;
					}
				default:
					{
					System.out.println("That's not a valid answer.");
					promptUser();
					break;
					}
			}
				
			}

	}
