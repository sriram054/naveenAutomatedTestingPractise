package co.PractiseSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProperties {
	public static void main(String[] args) throws IOException {
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Sainadha\\eclipse-workspace\\naveenAutomatedTestingPractise\\src\\co\\PractiseSessions\\config.properties");
		pro.load(fis);
		String Name=pro.getProperty("name");
		System.out.println(Name);
		//System.out.println("age");
	}

}
