package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Teacher lizzy = new Teacher(1, "Lizzy", 500);
		Teacher mellisa = new Teacher(2, "Melissa", 700);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);

		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith Vasudev", 12);
		Student rabbi = new Student(3, "Rabbi", 5);

		List<Student> studentsList = new ArrayList<>();
		studentsList.add(tamasha);
		studentsList.add(rakshith);
		studentsList.add(rabbi);

		School ghs = new School(teacherList, studentsList);

		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
		
		tamasha.payFees(5000);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
		
		rakshith.payFees(1200);
		rakshith.payFees(1200);
		System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
		System.out.println(rakshith.getFeesPaid());
		
		System.out.println("----------------Making School Pay Salary---------------");
		
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println("GHS has spent for salary to " + lizzy.getName()+" and now has $" + ghs.getTotalMoneyEarned());

		
		

	}

}
