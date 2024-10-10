package javaCurso2024;

public class Employee {
	protected String name;
	protected double salary;

	// Classe construtora:
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Método para calcular o bônus de 10% do salário:
	public double calculateBonus() {
		return this.salary * 0.10;

	}

	// Método para exibir os dados do empregado:
	public void showEmployeeData() {
		System.out.println("Nome:" + name);
		System.out.println("Salário:" + salary);
		System.out.println("Bônus:" + calculateBonus());
		System.out.println("Salario total: " + ( salary + calculateBonus()));
	}

}