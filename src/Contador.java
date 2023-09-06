import java.util.Scanner;

public class Contador {
  public static void main(String[] args){
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();
    terminal.close();
		
		try {
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
    int contagem = parametroDois - parametroUm;

    if (parametroUm > parametroDois) {
      throw new RuntimeException("-----O segundo parâmetro deve ser maior que o primeiro-----");
    } else {
      for(int x = parametroUm; x < parametroDois; x++) {
        System.out.println("Imprimindo o numero " + x);
      }
      System.out.println("O programa foi executado um total de " + contagem + " vezes.");
    }
	}
}
