class Teste{

	static String minhaFuncao(){
		System.out.println("Ela n faz nada!");
		return "String da minha funcao";
	}

	public static void main(String ... args){
		int a = 10;
		assert(true);
		//assert(false):"Nada ok";
		assert(false):minhaFuncao() + true + null + 10.9f;	
		System.out.println("Hello World!");
	}
}