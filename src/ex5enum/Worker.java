package ex5enum;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	
	private Double baseSalary;
	
	private WorKerLevel level;

	private Department department;
	
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, Double baseSalary, WorKerLevel level, Department department) {
		this.name = name;
		this.baseSalary = baseSalary;
		this.level = level;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public WorKerLevel getLevel() {
		return level;
	}

	public void setLevel(WorKerLevel level) {
		this.level = level;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract Contract) {
		
		if(contracts.contains(Contract) == true) {
			contracts.remove(Contract);
		}else {
			System.out.println("contrato não encontrado");
		}
		
	}
	
	/* inplementar ainda -> public Double income(Integer year, Integer month) {
		return 
	}*/
}
