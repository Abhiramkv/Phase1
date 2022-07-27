import java.util.*;
public class Emailvalid {

	public static void main(String[] args) {
		
		String[] s= {"kamal@gmail.com","loki@gmail.com","deepu@gmail.com","harsh@yahoo.com","benita@yaahoo.com","harsha@yahoo.com","priya123@gmail.com","John..Doe@yahoo.com"};
		
		System.out.println("Enter the EmailId\n");
		Scanner sc=new Scanner(System.in);
		String h=sc.next();
		
		
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(h)) {
				System.out.println("email validated");
				break;
			}
			
			else {
				System.out.println("email not validated");
				break;
			}
			
	

        

	}
}
}

