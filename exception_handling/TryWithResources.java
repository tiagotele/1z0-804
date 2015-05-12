import java.io.*;
import java.sql.SQLException;


class One implements AutoCloseable{
	public void close(){
		System.out.println("Close - One");
	}
}

class Two implements AutoCloseable{
	public void close(){
		System.out.println("Close - Two");
	}
}



class TryWithResources{

	void callMyMethod()throws IOException{
		try{
			newMethod();
		}catch(Exception e){
			e = new Exception();
		}
	}

	void newMethod() throws IOException{
		System.out.println("Exceção agora!");
		throw new IOException();

	}

	public void rethrow() throws SQLException, IOException {
     	try {
        	callMyMethod();
		}catch (Exception e) { 
			e = new IOException(); 
			//throw e;
		} 
	}

	public static void main(String args[]){
		System.out.println("Start");

		try/*(One one = new One() ; Two two = new Two())*/{
			System.out.println("Try");
			throw new RuntimeException();
		}catch(Exception e){
			e = new IOException();
			System.out.println("Catch");

			for(Throwable t : e.getSuppressed()){
				System.err.println("suppressed:"+t);
			}

		}finally{
			System.out.println("finally");
		}
	}
}