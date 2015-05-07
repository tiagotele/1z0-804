import java.io.*;
import java.sql.SQLException;

class Teste{

	static void myMethod() throws SQLException , IOException{
		System.out.println("myMethod");
	}

	public static void main(String ... args){
		System.out.println("Hello World!");
		try{
			myMethod();
		}catch(Exception e){

		}
		
	}
}