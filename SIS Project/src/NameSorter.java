import java.util.Comparator;

public abstract class NameSorter implements Comparator
	{
		public int compare(Student s1, Student s2)
		{
		return s1.getLastName().compareTo(s2.getLastName());
		}
	}
