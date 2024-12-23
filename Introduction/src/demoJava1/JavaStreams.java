package demoJava1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStreams {

	//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

	ArrayList<String> names=new ArrayList<String>();
	names.add("Ram");
	names.add("Sita");
	names.add("Aadhya");
	names.add("Aarav");
	names.add("Adthiya");
	
	int j=0;
	for(int i=0;i<names.size();i++) {
		
		
		if(names.get(i).startsWith("A")){
			
			j=j+1;
	}
	}
	
	
		
	}

	//@Test
	public void Streamsfilter() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ram");
		names.add("Sit");
		names.add("Badhya");
		names.add("Aarav");
		names.add("Adthiya");
		names.add("Aditi");
		
	Long actual=names.stream().filter(m->m.startsWith("A")).count();
	System.out.println(actual);
	
	//names.stream().filter(s->(s.length()>4)).forEach(s->System.out.println(s));
	names.stream().filter(s->(s.length()>4)).limit(1).forEach(s->System.out.println(s));
	
	
	
	
	
		
	}

	//@Test
	public void maps() {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Ram");
		names.add("Sit");
		names.add("Bldhya");
		names.add("Carav");
		names.add("Dzthiy");
		names.add("Aditia");
		
		String[] hitl= {"Manu","Aravan","Pradhan"}; 
		List<String> madhavan=Arrays.asList(hitl);
		
		//grab all the names which has last word as "A" and print it in UPPER CASE
		
		//IF we want to manipulate the stream we can do it via Map method and manipulate the original stream after filtering
		
		//names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//names.stream().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//grab all the names which has last word as "A" and print it in UPPER CASE and sort it
		
		//names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//MERGING TO DIFF ARRAYS AND SORTING AND PRINTING IN THE UPPER CASE
		
		//Stream.concat(names.stream(),madhavan.stream()).filter(s->s.length()>4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	boolean flag=names.stream().anyMatch(s->s.equalsIgnoreCase("Carav"));
	System.out.println(flag);
	Assert.assertTrue(flag);
		
		
		
	}

 @Test
public void collect(){
	 
	 ArrayList<String> names=new ArrayList<String>();
		names.add("Ram");
		names.add("Sit");
		names.add("Bldhya");
		names.add("Carav");
		names.add("Dzthiy");
		names.add("Aditia");
		
		List<String> point=names.stream().filter(s->s.endsWith("a")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());	
		System.out.println(point.get(0));
		
		List<Integer> values=Arrays.asList(3,2,2,1,1,8,6,5,3);
		
	//values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> thridelemet=values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(thridelemet.get(2));
		
	
}

}
