import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número para a Sequência de Fibonacci:\n");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.printf("\n");
        System.out.println(a);
        System.out.println(b);

        for(int i=3; i<=num; i++){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

        System.out.println("\nDigite uma letra abaixo:\n");
        Scanner sc2 = new Scanner(System.in);
        String key = sc2.nextLine();
        int low_a = 0;
        int up_a = 0;

        int j = 0;
        while(j < key.length()){
            char caracter = key.charAt(j);
                if (caracter == 'a') {
                    low_a ++;
                }
                if (caracter == 'A') {
                    up_a ++;
                }
            j++;
        }
            if (low_a > 0){
                System.out.println("\n'a' minúsculo aparece " +low_a+ " vezes");
            }
            if (up_a > 0){
                System.out.println("\n'A' maiúsculo aparece " +up_a+ " vezes");
            }
            
            //int INDICE = 12, SOMA = 0, K = 1; 
            //enquanto K < INDICE 
            //faça { K = K + 1; SOMA = SOMA + K; } 
            //imprimir(SOMA);

            //Ao final do processamento, qual será o valor da variável SOMA?
            //RESPOSTA://  
                // Indice é 12, K começa sendo 1 e será incrementado até o valor do Indice
                // SOMA receberá o seu valor anterior mais o valor de K a cada iteração
                // O Resultado final de SOMA será 

            int idx = 12;
            int soma = 0;
            int k = 1;
            System.out.println("\nVariáveis: INDICE = 12, SOMA = 0, K = 1\nenquanto K < INDICE");
            System.out.println("\nfaça { K = K + 1; SOMA = SOMA + K; }\nimprimir(SOMA)\n");
                while (k < idx) {
                    k++;
                    soma = soma + k;
                }
                System.out.println("resultado de SOMA: "+soma);
        sc.close();
        sc2.close();
    }
}
