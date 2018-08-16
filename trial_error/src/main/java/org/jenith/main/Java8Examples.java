package org.jenith.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;
@Log4j
public class Java8Examples { 
   public static void main(String[] args) { 
	   List<String> numbers = Arrays.asList("1","2","3","4","5","6","7");
	   log.info("Original Numbers:: "+numbers);
	   List<Integer> evenNumbers = numbers.stream().map(num->Integer.valueOf(num)).filter(num->num%2==0).collect(Collectors.toList());
	   log.info("Even Numbers:: "+evenNumbers);
      Predicate<Student> p1 = s -> s.stuName.startsWith("A"); 
      Predicate<Student> p2 = s -> s.stuAge < 40; 
      Predicate<Student> p3 = s -> s.stuAge < 40 && s.stuName.startsWith("P");
      List<Student> list = Student.getStudents();

      /* allMatch() method returns true if all the elements of stream satisfy the 
       * given predicate, else it returns false 
       */ 

      /* This will return false because all student names do not start with "A"  
       */ 
      boolean b1 = list.stream().allMatch(p1); 
      log.info("list.stream().allMatch(p1):: "+b1); 

      boolean b51 = Stream.of(4,5).allMatch(object ->object>0); 
      log.info("list.stream().allMatch(p51):: "+b51);
      
      /* This will return true because all students have age less than 40  
       */ 
      boolean b2 = list.stream().allMatch(p2); 
      log.info("list.stream().allMatch(p2):: "+b2); 

      /* This will return false because all the students do not satisfy the predicate: 
       * Age must be less than 40 and name starts with letter "P" 
       */ 
      boolean b3 = list.stream().allMatch(p3); 
      log.info("list.stream().allMatch(p3):: "+b3);
      
      String phoneNumberstr = "Tel: 00971-557890-999";
      String numberRefined = phoneNumberstr.replaceAll("[^\\d]", "");
      
      System.out.println("phoneNumberstr::"+phoneNumberstr+":::"+numberRefined);
      
      System.out.println("Enter Inputs::");
      Scanner scanner = new Scanner(System.in);
      while(scanner.hasNext()){
    	  System.out.println(scanner.next());
      }
   }
}
class Student{
	   int stuId; 
	   int stuAge;  
	   String stuName;  
	   Student(int id, int age, String name){
	      this.stuId = id;   
	      this.stuAge = age;  
	      this.stuName = name;  
	   }  
	   public int getStuId() { 
	      return stuId;  
	   }  
	   public int getStuAge() {  
	      return stuAge;  
	   } 
	   public String getStuName() {  
	      return stuName;  
	   }  
	   public static List<Student> getStudents(){ 
	      List<Student> list = new ArrayList<>(); 
	      list.add(new Student(11, 28, "Lucy")); 
	      list.add(new Student(28, 27, "Tim")); 
	      list.add(new Student(32, 30, "Daniel")); 
	      list.add(new Student(49, 27, "Steve")); 
	      return list; 
	   }
	}