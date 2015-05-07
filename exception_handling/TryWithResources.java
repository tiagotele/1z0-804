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
	public static void main(String args[]){
		System.out.println("Start");

		try(One one = new One() ; Two two = new Two()){
			System.out.println("Try");
			throw new RuntimeException();
		}catch(Exception e){
			System.out.println("Catch");

			for(Throwable t : e.getSuppressed()){
				System.err.println("suppressed:"+t);
			}

		}finally{
			System.out.println("finally");
		}
	}
}