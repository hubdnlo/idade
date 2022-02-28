
public class Idade {

	public static void main(String[] args) {
	String Nome = "Danilo";
	String Cargo = "Developer";
	int Ano_Nascimento = 1988;
	int Ano_Atual = 2022;
	System.out.println("O funcionário "+Nome+" que trabalha na função de "+Cargo+" tem "+(Ano_Atual - Ano_Nascimento)+" anos.");
	System.out.printf("O funcionario %s, que trabalha na função de %s"+" tem "+(Ano_Atual - Ano_Nascimento)+" anos.", Nome, Cargo);
	int idade = (Ano_Atual - Ano_Nascimento);
	if(idade<18){
		System.out.println("Funcionário menor de idade");
		
	}else {
		System.out.println("Funcionário maior de idade");
	}
	}
	

}
