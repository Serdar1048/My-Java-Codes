
public class EmailLogger implements Logger {
	
//	***OVERRIDE***
	public void log() {//Kural koyucu. Override etmek zorunda.
		System.out.println("Email has been sent");
	}
}
