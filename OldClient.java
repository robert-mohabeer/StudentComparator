package Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class Client {
	public static void main(String[] args) throws FileNotFoundException {
		List<Student> list = new ArrayList<>();
		File file = new File("Student_Info_Files.csv");
		Scanner scan = new Scanner(file);
		String fileName = "Directory.txt";
		PrintWriter outputStream = new PrintWriter(fileName);
		while(scan.hasNext()) {
			Student s = new Student(scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next());
			list.add(s);
			}
		StudentComparator sc = new StudentComparator();
		System.out.println("Sorted by last names");
		sc.compareType = "last";
		Collections.sort(list, sc);
		for (Student s : list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by first names:");
		sc.compareType= "first";
		Collections.sort(list, sc);
		for(Student s : list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by id number: ");
		sc.compareType = "id";
		Collections.sort(list, sc);
		for(Student s: list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by grade percentage: ");
		sc.compareType = "percent";
		Collections.sort(list, sc);
		for (Student s : list) {
			outputStream.println(s);}
		System.out.println();
		System.out.println("Sorted by letter grades:");
		sc.compareType = "letter";
		Collections.sort(list, sc);
		for(Student s: list) {
			System.out.println(s);
			}
		System.out.println();
		System.out.println("Sorted by math grades:");
		sc.compareType = "math";
		Collections.sort(list, sc);
		for(Student s: list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by science grades:");
		sc.compareType = "sci";Collections.sort(list, sc);
		for(Student s: list) {System.out.println(s);
		}
		System.out.println();
		System.out.println("Sorted by social studies grades:");
		sc.compareType = "soc";
		Collections.sort(list, sc);
		for(Student s: list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by ELA grades:");
		sc.compareType = "lang";
		Collections.sort(list, sc);
		for(Student s: list) {
			outputStream.println(s);
			}
		System.out.println();
		System.out.println("Sorted by computer science grades:");
		sc.compareType = "comp";
		Collections.sort(list, sc);
		for(Student s: list) {
			outputStream.println(s);
			}
		outputStream.println();
		}
	}
