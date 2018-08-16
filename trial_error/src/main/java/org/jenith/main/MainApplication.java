package org.jenith.main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.jenith.vo.Address;
import org.jenith.vo.Employee;
import org.jenith.vo.FunctionalInterface;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class MainApplication {
	public void print(FunctionalInterface firstInterface) {
		firstInterface.singleMethod("apple");
	}

	public static void main(String[] args) {
		
	    log.info("Starts with AS::"+"AS02".startsWith("AS"));
		final MainApplication printer = new MainApplication();

		final List<Address> empAddresses = new ArrayList<>();
		final List<Employee> employees = new ArrayList<>();
		printer.print((String param) -> {
			log.info("My lambda says " + param);
		});

		final Function<String, Integer> intConverter = Integer::parseInt;
		Function<String, Double> doubleConvertor = Double::parseDouble;
		Function<String, Double> doubleConvertorLambda = (String s) -> Double.parseDouble(s);
		log.info("double value using method reference - " + doubleConvertor.apply("0.254"));
		log.info("double value using Lambda - " + doubleConvertorLambda.apply("0.254"));
		log.info("double value using Lambda - " + intConverter.apply("254"));

		FunctionalInterface firstInterface = p -> System.out.println("Jenith");
		firstInterface.singleMethod("");

		empAddresses.add(new Address("A1", "A2", "Ci", "St", "Cy", 12324));
		empAddresses.add(new Address("B1", "B2", "Ec St", "St", "USA", 27384));
		empAddresses.add(new Address("C1", "C2", "Mc St", "St", "USA", 27384));

		Employee employee = new Employee(121, "EI121", "Duck", "DI122", empAddresses);
		employees.add(employee);
		employee = new Employee(122, "EI122", "Donald", "DI120", empAddresses);
		employees.add(employee);
		employee = new Employee(123, "EI123", "Trumps", "DI122", empAddresses);
		employees.add(employee);
		Map<String, Employee> empMap = employees.stream().collect(Collectors.toMap(p -> p.getEmpName(), p -> p));
		empMap.forEach((k, v) -> System.out.println((k + "EMPL:OYEE" + v)));

		Predicate<String> startsWithD = (startsWithDe) -> startsWithDe.startsWith("D");
		Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		Predicate<String> sixLetterLong = (n) -> n.length() == 6;

		Predicate<Integer> startssWithJ = (n) -> n<0;
		
		List<String> names = employees.stream().map(Employee::getEmpName).collect(Collectors.toList());
		empMap.forEach((k, v) -> System.out.println((k + ":" + v)));
		List<String> filterdNames = names.stream().filter(startsWithD.and(fourLetterLong).or(sixLetterLong)).collect(Collectors.toList());
		filterdNames.forEach((n) -> System.out.println("Filtered Names::Name, which starts with 'D' and four or Six letter long is : " + n));

		byte value = (byte) 131;
		System.out.println(0x7f);
		System.out.println(value);
		
		
		Map<String, String> result = new HashMap<>();
		result.put("RK1","RV1");
		result.put("RK2","RV2");
		Map<String, String> Headers = new HashMap<>();
		Headers.put("HK1", "HK1");
		Headers.put("HK2","RV2");
		
		/*Map<String, String> mx = Stream.of(result, Headers)
		        .map(Map::entrySet)          // converts each map into an entry set
		        .flatMap(Collection::stream) // converts each set into an entry stream, then
		                                     // "concatenates" it in place of the original set
		        .collect(
		            Collectors.toMap(        // collects into a map
		                Map.Entry::getKey,   // where each entry is based
		                Map.Entry::getValue        // such that if a value already exist for
		                                     // a given key, the max of the old
		                                     // and new value is taken
		            )
		        )
		    ;*/
		
		Map<String, String> hr = new HashMap<>(result);
		hr.forEach((k,v)->System.out.println("Result::"+v));
		
		//mx.forEach((k,v)->System.out.println(v));
		
		
		
		Map<String, String>
	    filtered = result.entrySet()
	                        .stream()
	                        .filter(a->Headers.entrySet()
	                                    .stream()
	                                    .anyMatch(l->l.getValue().equals(a.getValue())))
	                        .collect(Collectors.toMap(l->l.getKey(),l->l.getValue()));
		System.out.println("TEst"+filtered);
		BigDecimal newData = new BigDecimal("1234.9999404");
		System.out.println(newData.setScale(4,RoundingMode.HALF_UP).setScale(4,RoundingMode.HALF_UP).setScale(4,RoundingMode.HALF_UP).setScale(4,RoundingMode.HALF_UP).setScale(4,RoundingMode.HALF_UP));
	}
}