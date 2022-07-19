import java.io.*;
import java.util.*;
public class Online_exam {
Scanner input=new Scanner(System.in);
HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	public void login() {
		data.put("Deepthi",2711);
		data.put("Vishnu",1104);
		System.out.println("-----Welcome to online exam portal-----");
		String userid;
		int pwd;
		System.out.println("Login to continue.....");
		System.out.println("Enter user id");
		userid=input.next();
		System.out.println("Enter password");
		pwd=input.nextInt();
		if(data.containsKey(userid) && data.get(userid)==pwd) {
			System.out.println("Login sucessful");
				option_menu();
		}
		else {
			System.out.println("SORRY!!! Invalid Login");
			System.out.println("Try again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("Enter the option you want to perform");
		System.out.println("1.Update profile and password");
		System.out.println("2.Start the exam");
		System.out.println("3.Logout");
		select=input.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	public HashMap<String,Integer> update(){
		String uuser;
		int upwd;
		System.out.println("Welcome to Update profile");
		System.out.println("Enter user name");
		uuser=input.next();
		if(data.containsKey(uuser)) {
		System.out.println("Enter new password you to want to update to your profile");
		upwd = input.nextInt();
		data.replace(uuser, upwd);
		}
		else {
			System.out.println("User doesn't exist");
		}
		return data;
	}
public void exam() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30*1000;
	int ans_count=0;
	int ans,score;
	System.out.println("Start the exam");
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 30 seconds to answer 5 questions");
		System.out.println("Each question carries 10 marks"+" "+"-5 for wrong answer");
		System.out.println("-------->Q1. 2+1 = ?");
		System.out.println("1.11"+"\t"+"2.3"+"\t"+"3.8"+"\t"+"4.13");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("-------->Q2. 2+25 = ?");
		System.out.println("1.18"+"\t"+"2.27"+"\t"+"3.18"+"\t"+"4.29");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==2) {
			ans_count++;
		}
		System.out.println("-------->Q3. 22+33 = ?");
		System.out.println("1.55"+"\t"+"2.13"+"\t"+"3.66"+"\t"+"4.77");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		System.out.println("-------->Q4.80+20 = ?");
		System.out.println("1.191"+"\t"+"2.73"+"\t"+"3.96"+"\t"+"4.100");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==4) {
			ans_count++;
		}
		System.out.println("-------->Q5. 6-3 = ?");
		System.out.println("1.3"+"\t"+"2.9"+"\t"+"3.6"+"\t"+"4.0");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Locked...");
		if(ans==1) {
			ans_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=ans_count*10-((5-ans_count)*5);
	System.out.println("Your score is..."+" "+score);	
}
}
