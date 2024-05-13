
public class AtividadeCinco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro númeoro real para a operação: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número real: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o símbolo desejado para a operação (+, - ,/ ou ^): ");
        char simbolo = scanner.next().charAt(0);
      
        char subtração = '-';
        char soma = '+';
        char multiplicação = '*';
        char divisao = '/';
        char raiz = '^';
     
        if (simbolo == soma) {
            System.out.println("O resultado da soma desses números é: " + (numero1 + numero2));
        } else if (simbolo == subtração) {
            System.out.println("O resultado da subtração desses números é: " + (numero1 - numero2));
        } else if (simbolo == multiplicação) {
            System.out.println("O resultado da multiplicação desses números é: " + (numero1 * numero2));   
        } else if (simbolo == raiz) {
            System.out.println("A elevação desses números é: " +  Math.pow(numero1, numero2));
        } else if (simbolo == divisao && numero1 != 0 && numero2 != 0) {
            System.out.println("O resultado da divisão desses números é: " + (numero1 / numero2));
        } else if (numero1 == 0) {
            System.out.println("Não é possível a divisão por 0.");
            return;
        } else {
            System.out.println("Não é possível a divisão por 0.");
            return;
        }

        scanner.close();
    }

}