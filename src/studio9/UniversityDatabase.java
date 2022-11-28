package studio9;

import assignment7.Student;
import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	private final Map<String, Student> dataBase;
	
	public UniversityDatabase() {
		this.dataBase = new HashMap<>();
	}

	public void addStudent(String accountName, Student student) {
		dataBase.put(accountName, student);
	}

	public int getStudentCount() {
		
		return dataBase.size();
	}

	public String lookupFullName(String accountName) {
		
		if (dataBase.get(accountName) == null) {
			return null;
		}
		return dataBase.get(accountName).getFullName();
	}

	public double getTotalBearBucks() {
		
		int total = 0;
		for (String accountName: dataBase.keySet()) {
			Student s = dataBase.get(accountName);
			total += s.getBearBucksBalance();
		}
		return total;
	}
}
