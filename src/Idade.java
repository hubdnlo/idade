
public class Idade {

	public static void main(String[] args) {
	String Nome = "Danilo";
	String Cargo = "Developer";
	int Ano_Nascimento = 1988;
	int Ano_Atual = 2022;
	System.out.println("O funcion�rio "+Nome+" que trabalha na fun��o de "+Cargo+" tem "+(Ano_Atual - Ano_Nascimento)+" anos.");
	System.out.printf("O funcionario %s, que trabalha na fun��o de %s"+" tem "+(Ano_Atual - Ano_Nascimento)+" anos.", Nome, Cargo);
	int idade = (Ano_Atual - Ano_Nascimento);
	if(idade<18){
		System.out.println("Funcion�rio menor de idade");
		
	}else {
		System.out.println("Funcion�rio maior de idade");
	}
	}
	

}
