import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            
		
		}catch (ParametrosInvalidosException exception) {
			System.err.println("O segundo parametro deve ser maior que o primeiro");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
        if (contagem <= 0)
        throw new ParametrosInvalidosException();

		for(int x = 1; x <= contagem; x++){
            System.err.println("imprimindo o numero " + x);
        }
	}
}
