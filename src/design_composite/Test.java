package design_composite;

public class Test {
	public static void main(String[] args) {
		Employee ceo = new Employee();

		Employee programmer = new Employee("小明", "programmer", "10000");
		Employee pro1 = new Employee("pro1", "pro1", "1000");
		Employee pro2 = new Employee("pro2", "pro2", "1000");

		Employee producter = new Employee();
		Employee p1 = new Employee("P1", "P1", "1000");
		Employee p2 = new Employee("P2", "P2", "2000");

		ceo.add(pro1);
		ceo.add(pro2);

		producter.add(p1);
		producter.add(p2);

		for (Employee e : ceo.getSubordinates()) {
			System.out.println(e);
		}
		System.out.println("-------------------------");

		for (Employee e : producter.getSubordinates()) {
			System.out.println(e);
		}
	}
}
