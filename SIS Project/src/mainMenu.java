import java.io.*;
import java.util.*;

public class mainMenu
	{
		ArrayList <Student> roster = new ArrayList <Student>();
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
						
						
					}
				
				
			}

	}
