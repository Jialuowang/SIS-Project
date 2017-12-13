import java.io.*;
import java.util.*;

public class mainMenu
	{
		static ArrayList <Student> roster = new ArrayList <Student>();
		public static void main(String[] args) throws IOException
			{
			addStudents();
			}
		private static void addStudents() throws IOException
			{
				Scanner file = new Scanner(new File("studentList.txt"));
				while(file.hasNextLine())
					{
						String line = file.nextLine();
						System.out.println(line);
						String [] catcher = line.split(" ");
						int yes = 0;
						roster.add(new Student(catcher[0], catcher[1], catcher[2], catcher[3], catcher[4], catcher[5], catcher[6], catcher[7], yes));
					}
			}

	}
