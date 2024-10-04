package regestrationsystem;
import java.util.Scanner;
public class regestrationsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
String myUsername= "kakande";
String mypassword= "milaad";
int maxattempts= 4;

int attempt = 0;
while(attempt< maxattempts) {
	System.out.println("Enter username:");
	String username = scanner.next();
	System.out.println("Enter password:");
	String password = scanner.nextLine();
	
	if(username.equals (username)&& password.equals(mypassword)) {
	System.out.println("Login successful!");
	break;
	}else {
		attempt++;
		System.out.println("Incorrect username or password. Attempts left:" + (maxattempts));
		
	}
	if(attempt== maxattempts) {
		System.out.println("maximum attempts reached. access denied");
	}
}
	}

}
