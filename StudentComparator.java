
import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	
	// global constant array for all sort categories
	public final String[] SORT_CATEGORIES = {"last", "first", "id", "math", "sci", "soc", "lang","comp", "percent", "letter"};
	
	public String compareType = "last"; 
	/*compareType = internal String variable to control what field of Student objects are compared.  
	 * Change this in client code to change what this comparator compares.
	 * Valid values are: 'last', 'first', 'id', 'math', 'sci', 'soc', 'lang',
	 * 'comp', 'percent', and 'letter', each of which correspond to a case in the
	 * switch statement to access a field within the Student Objects passed and compare
	 * that field to compare and sort the Student Objects as a whole.
	 */
	
	private int compareDouble(double a, double b) {
		// private method to compare double values
		if (a == b)
			return 0;  // manual returns here instead of a subtraction statement since typecasting int may render comparing doubles imprecise
		else if (a < b)
			return -1;
		else
			return 1;
	}
	
	private int compareString(String a, String b) {
		// private method to compare string values
		return a.compareTo(b);
	}
	
	public int compare(Student a, Student b) {
		int equality;
		// switch statement used to simplify what would otherwise be a very long if-else conditional statement / tests for a value of compareType in each case.
		switch(this.compareType) {
		case "last":
			equality = this.compareString(a.lastName, b.lastName);
			break;
		case "first":
			equality = this.compareString(a.firstName, b.firstName);
			break;
		case "id":
			equality = this.compareString(a.id, b.id);
			break;
		case "math":
			equality = this.compareDouble(a.classScores[0], b.classScores[0]);
			break;
		case "sci":
			equality = this.compareDouble(a.classScores[1], b.classScores[1]);
			break;
		case "soc":
			equality = this.compareDouble(a.classScores[2], b.classScores[2]);
			break;
		case "lang":
			equality = this.compareDouble(a.classScores[3], b.classScores[3]);
			break;
		case "comp":
			equality = this.compareDouble(a.classScores[4], b.classScores[4]);
			break;
		case "percent":
			equality = this.compareDouble(a.percentGrade, b.percentGrade);
			break;
		case "letter":
			equality = this.compareString(a.letterGrade, b.letterGrade);
			break;
		default:
			throw new IllegalStateException("Value of compareType: " + compareType + " is invalid.");
		}
		return equality;
	}

}
