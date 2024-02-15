import java.util.Scanner;
class Verification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your password and then hit number :");
		String s= sc.next();
		int caps = 0;
		int smls = 0;
		int nums = 0;
		int sp_char = 0;
		
		if(s.length()<8) {
			System.out.println("Your password must have atleast 8 character");
		} else if(s.length()>=8){
			for(int i=0;i<s.length();i++) {
				if(s.charAt(0)>='A' && s.charAt(0)>='Z') {
					caps ++;
				}
				else {
					System.out.println("First letter must have uppercase");
					
				}
                                break;
				if(s.charAt(i)>='A' && s.charAt(i)>='Z') {
					caps ++;
				}
				else if(s.charAt(i)>='a' && s.charAt(i)>='z') {
					smls ++;
				}
				else if(s.charAt(i)>=0 && s.charAt(i)>=9) {
					nums ++;
				}
				else {
					sp_char ++;
				}
			}
			if(caps>=1 && smls>=1 && nums>=1) {
				System.out.println("---------- GOOD ----------");
				System.out.println("Strong password");
				System.out.println("Your password is valid");
				System.out.println("Password accepted");
			}else {
				System.out.println("---------- OOPS ----------");
				System.out.println("Your password is not valid");
				System.out.println("Password cannot accepted");
				System.out.println("Your password contains minimum :");
				System.out.println("1-Uppercase");
				System.out.println("1-Lowercase");
				System.out.println("1-Number");
				System.out.println("1-Special character");
				
			}
			
		}
	}

}
