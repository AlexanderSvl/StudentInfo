import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
	
	DecimalFormat df = new DecimalFormat("#.00");

	private int age;
	private String name;
	
	private List<String> interests = new ArrayList<String>();
	private List<Double> grades = new ArrayList<Double>();
 	private double averageGrade = 0.00;
 	
 	public Student(int Age, String Name) {
 		this.age = Age;
 		this.name = Name;
 	}
	 
	public String SayHello() {
		return String.format("Hello! My name is %s and i am %d years old!", name, age);
	}
	
	public void AddGrades(Double[] gradesToAdd) {
		Double[] temp = gradesToAdd;
		List<Double> doubleList = new ArrayList<Double>(temp.length);
		
		for (Double i : temp)
		{
		    doubleList.add(i);
		}
		
		this.grades.addAll(doubleList);
	}
	
	public void AddInterests(String[] interestsToAdd) {
		String[] temp = interestsToAdd;
		List<String> doubleList = new ArrayList<String>(temp.length);
		
		for (String item : temp)
		{
		    doubleList.add(item);
		}
		 
		this.interests.addAll(doubleList);
	}
	
	public String PrintAverageGrade() {
		double sum = 0.00;
		
	    for (int i = 0; i < this.grades.size(); i++) {
			sum += this.grades.get(i); 
		}
	    
	    return "Average grade is " + df.format(sum/ this.grades.size());
	}

	public String PrintInterests() {
		if(interests.isEmpty()) {
			return "Student has no interests.";
		}
		else {
			return "Interests: " + Arrays.toString(interests.toArray()).replaceAll("[\\[|\\]]", "");
		}
	}
	
	public String PrintGrades() {
		if (grades.isEmpty()) {
			return "Student has no grades.";
		}
		else {
			Double[] temp = new Double[grades.size()];
			temp = grades.toArray(temp);
			
			String[] str = new String[grades.size()];
			
			Integer index = 0;
			
			for(Double d : temp) {
				str[index] = df.format(d);
				index++;
			}

			return "Grades: " + Arrays.toString(str).replaceAll("[\\[|\\]]", "");
		}
	}
	
}
