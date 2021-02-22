
public class Student {
	
	// state variables kept public for easy access since they are only used in one file and there is no real need to make them private here.
	public String lastName;
	public String firstName;
	public String id;
	public double[] classScores = new double[5];  // order: math, sci, soc, lang, comp; kept as doubles in case decimal grades are given.
	public double percentGrade;
	public String letterGrade;
	
	public Student() {
		// default empty constructor
	}
	
	public Student(String[] array) {
		this(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], array[9]);
	}
	
	public Student(String last, String first, String id, 
			String math, String sci, String soc, String lang, String comp, 
			String percent, String letter) {
		/* Parameters to this object are all passed as Strings, so a scanner object in the client code
		 * can simply be called repeatedly with the .next() feature to fill out these parameters,
		 * which are processed into appropriate data types here.
		 */
		this.lastName = last;
		this.firstName = first;
		this.id = id;
		classScores[0] = Double.parseDouble(math);
		classScores[1] = Double.parseDouble(sci);
		classScores[2] = Double.parseDouble(soc);
		classScores[3] = Double.parseDouble(lang);
		classScores[4] = Double.parseDouble(comp);
		this.percentGrade = Double.parseDouble(percent);
		this.letterGrade = letter;
	}
	
	public String toString() {
		/* Uses a StringBuilder object instead of normal '+' operator for string concatenation
		 * because there are a lot of concatenations that must occur, and StringBuilder's .append()
		 * is far more efficient than the '+' operator because it reduces duplicate objects
		 * that overwhelm java's natural garbage collection system.
		 * Outputs each field separated by tabs.
		 */
		StringBuilder sb = new StringBuilder();
		sb.append(lastName);
		sb.append(",");
		sb.append(firstName);
		sb.append(",");
		sb.append(id);
		sb.append(",");
		for (int i = 0; i < 4; i ++) {
			sb.append(classScores[i]);
			sb.append(",");
		}
		sb.append(percentGrade);
		sb.append(",");
		sb.append(letterGrade);
		return sb.toString();
	}

}
