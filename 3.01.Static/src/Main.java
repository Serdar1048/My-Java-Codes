
public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("abc", 100, 10);
		Student s2 = new Student("def", 250, 20);
		Student s3 = new Student("ghj", 467, 30);
		System.out.println(Student.howStudent());
		
		int[] notlar = new int[3];
		notlar[0] = s1.point;
		notlar[1] = s2.point;
		notlar[2] = s3.point;
		System.out.println(Student.calcOverall(notlar));
	}

}
