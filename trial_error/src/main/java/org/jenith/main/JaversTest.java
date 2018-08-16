package org.jenith.main;

import java.util.ArrayList;
import java.util.List;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Change;
import org.javers.core.diff.Diff;
import org.javers.core.diff.ListCompareAlgorithm;
import org.javers.core.diff.changetype.ValueChange;
import org.javers.core.metamodel.clazz.ValueObjectDefinitionBuilder;
import org.jenith.vo.Address;
import org.jenith.vo.Employee;

public class JaversTest {
	public static void main(String [] args){
		
		
		Address address1 = new Address("Ad1", "Ad2", "MyCity", "TN", "IN", 1234);
		List<Address> empAddresses1 = new ArrayList<>();
		empAddresses1.add(address1);
		Employee employee1 = new Employee(12, "Em123","Jenith", "DE123", empAddresses1);
		
		Address address2 = new Address("Ad21", "Ad2", "MyCity", "TN", "IN", 1234);
		List<Address> empAddresses2 = new ArrayList<>();
		empAddresses2.add(address2);
		Employee employee2 = new Employee(22, "Em223","Jenith", "DE223", empAddresses2);
		
		
		Javers javers = JaversBuilder.javers()
               /* .registerValueObject(ValueObjectDefinitionBuilder.valueObjectDefinition(Employee.class)
                .withIgnoredProperties("empAddresses").build())*/
                .withListCompareAlgorithm(ListCompareAlgorithm.LEVENSHTEIN_DISTANCE).build();
		Diff ucrStopDiference =javers.compare(employee1, employee2);
		List<Change> changes = ucrStopDiference.getChanges();
		changes.get(0).getAffectedObject().get();
		
		ucrStopDiference.getPropertyChanges("address2");
		//empAddresses
		ucrStopDiference.getPropertyChanges("empAddresses");
		ucrStopDiference.getChangesByType(ValueChange.class).get(3);
	}

}
