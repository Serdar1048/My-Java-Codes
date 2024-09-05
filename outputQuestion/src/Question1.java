
public class Question1 {
	String str;
	int num;

	public Question1(String str, int num) {
		this.num = ++num;
		this.str = str;
	}

	public static void main(String[] args) {
		int num = 5;
		String str = "Hello";
		Question1 q = new Question1(str, num);
		foo(q, num, str);
		System.out.println(q.str + ", " + str + ", " + q.num + ", " + num);
	}

	public static void foo(Question1 q, int num, String str) {
		str = "Merhaba";
		q.str = str;
		q.num = ++num;
		q = new Question1("Hola", num);
	}
}