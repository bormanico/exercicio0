public class Teste

public static void main(String[] args)
{
	int inteiro = 20;
	double value = .035;
}

public static int soma(int inteiro)
{  
	int i = 0;
	
	int soma = 0;
	
	while (i <= inteiro){
		soma += i;
		i++;
	}

	return soma;
}