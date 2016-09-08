package fpt.com.vn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fpt.com.vn.model.EduAndOccupation;
import fpt.com.vn.model.Person;

public class test1 {
	
	public static final String PATH ="src/resources/adult.data2.txt";
	public static final Map<String,List<Person>> educations = new HashMap<>();
	public static final Map<EduAndOccupation,List<Person>> eduAndOcc = new HashMap<>();
	public static final List<Person> persons = new ArrayList<Person>();
	
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		InputStream in = new FileInputStream(new File(PATH));
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
				
		String line;
		while((line = reader.readLine())!= null){
			
			String[] raw = line.split(", ");
			if(raw.length > 14){
			Person person = new Person();
			person.setAge(Integer.valueOf(raw[0]));
			person.setWorkclass(raw[1]);
			person.setFnlwgt(Integer.valueOf(raw[2]));
			person.setEducation(raw[3]);
			person.setEducationNum(Integer.valueOf(raw[4]));
			person.setMaritalStatus(raw[5]);
			person.setOccupation(raw[6]);
			person.setRelationship(raw[7]);
			person.setRace(raw[8]);
			person.setSex(raw[9]);
			person.setCapitalGain(Integer.valueOf(raw[10]));
			person.setCapitalLoss(Integer.valueOf(raw[11]));
			person.setHoursPerWeek(Integer.valueOf(raw[12]));
			person.setNativeCountry(raw[13]);
			person.setIncome(raw[14]);
			persons.add(person);
			educationIncome(person);
			educationAndOccupationIncome(person);
			}		
		}
		reader.close();
		
		printResultTest2();		
		//printResultTest3();
		
	}
	
	// Begin test 2
	/* Filter data and put in map*/
	public static void educationIncome(Person person){				
		List<Person> persons = educations.get(person.getEducation());
		if(">50K".equals(person.getIncome().trim())){
			if(persons == null){
				persons = new ArrayList<Person>();
				educations.put(person.getEducation(), persons);
			}
			persons.add(person);
		}	
	}
	
	@SuppressWarnings("rawtypes")
	public static void printResultTest2(){
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("--- Counting and grouping by education level, where income >50K ---");
		Integer totalpersons = test1.persons.size();
		Integer totalresult = 0;
		for (Map.Entry entry : educations.entrySet()) {
			List<Person> persons = (List<Person>) entry.getValue();
			totalresult += persons.size();
			double percent = (double)(persons.size()*100)/totalpersons;
			System.out.println("["+entry.getKey()+"] " + "groupSize = " + persons.size()+" takes "+df.format(percent)+"% in total");
			System.out.println(".................................................................................................");
		} 
		double percenttotal = (double)totalresult*100/totalpersons;
		System.out.println("Total persons that incom >50K = "+totalresult+" takes "+df.format(percenttotal)+"% in total");
		System.out.println("Total persons = "+totalpersons);
	}
	// End of Test2
	
	//Begin of Test3
	/* Filter data and put in map*/
	public static void educationAndOccupationIncome(Person person){
		EduAndOccupation eduAndOccupation = new EduAndOccupation();
		eduAndOccupation.setEducation(person.getEducation());
		eduAndOccupation.setOccupation(person.getOccupation());
		
		List<Person> persons = eduAndOcc.get(eduAndOccupation);
		if("<=50K".equals(person.getIncome().trim())){
			if(persons == null){
				persons = new ArrayList<Person>();				
				eduAndOcc.put(eduAndOccupation, persons);
			}
			persons.add(person);
		}		
	}
	
	@SuppressWarnings("rawtypes")
	public static void printResultTest3(){
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("--- Counting and grouping by Education And Occupation, where income <=50K ---");
		Integer totalpersons = test1.persons.size();
		Integer totalresult = 0;
		
		EduAndOccupation minkey = new EduAndOccupation();
		List<Person> minvalue = persons;
		
		for (Map.Entry entry : eduAndOcc.entrySet()) {			
			List<Person> persons = (List<Person>) entry.getValue();
			EduAndOccupation key = (EduAndOccupation)entry.getKey();
			totalresult += persons.size();
			if(persons.size() < minvalue.size()){
				minvalue = persons;
				minkey = key;
			}						
			double percent = (double)(persons.size()*100)/totalpersons;
			System.out.println("["+key.getEducation()+", "+key.getOccupation() +"] " + "groupSize = " + persons.size()+" takes "+df.format(percent)+"% in total");
			System.out.println(".................................................................................................");
		} 
		double percenttotal = (double)totalresult*100/totalpersons;
		double percentmin = (double)minvalue.size()*100/totalpersons;
		
		System.out.println("Min is ["+minkey.getEducation()+", "+ minkey.getOccupation()+"] takes "+df.format(percentmin)+"% in total");
		System.out.println("Total persons that incom >50K = "+totalresult+" takes "+df.format(percenttotal)+"% in total");
		System.out.println("Total persons = "+totalpersons);
	}
	//end of test 3
	
}
