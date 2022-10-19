import java.util.Scanner;

public class LojaDeBike
{
    static Scanner sc = new Scanner(System.in);
    double carrinho=0;
    public static void main(String[] args) {
        String nome;
        System.out.println("Bem-vindo ao autoatendimento da bicicletaria XPTO Bikes.");
        System.out.println("Informe seu nome: ");
        nome = sc.nextLine();
        menu();
    }
    public static void menu(){
        int opcao;
        System.out.println("Opção 1 - Ver promoções.");
        System.out.println("Opção 2 - Solicitar serviço de manutenção. ");
        System.out.println("Opção 3 - Listar carrinho de compra. ");
        System.out.println("Opção 4 - Finalizar carrinho de compra.");
        System.out.println("Opção 0 - Sair. ");
        System.out.println("Digite sua opção desejada: ");
        opcao = sc.nextInt();
        if(opcao==1){
            opcao1();
        }
    }
    public static void opcao1(int opcao,int carrinho){
        int opcaoPromocao=0;
        int carrinhoPromocao=0;
        while (opcaoPromocao!=5) {
            System.out.println("1. Código 101 - Bicicleta nova na cor amarela, aro 26, " +
                    "com 18 marchas e na promoção pelo preço de R$ 999.99. ");
            System.out.println("2. Código 102 - Bicicleta usada na cor azul, aro 26," +
                    " com 18 marchas e com o valor promocional de R$ 400,00. ");
            System.out.println("3. Código 103 - Capacete de proteção por R$59.99.");
            System.out.println("4. Código 104 - Freio a disco por R$ 89,99. ");
            System.out.println("5. Adicionar ao carrinho de compras. ");
            System.out.println("6. Voltar ");
            if(opcaoPromocao == 1){
                carrinhoPromocao+=999.99;
            }
            else if(opcaoPromocao == 2){
                carrinhoPromocao+=400;
            }
            else if(opcaoPromocao == 3){
                carrinhoPromocao+=59.99;
            }
            else if(opcaoPromocao == 4){
                carrinhoPromocao+=89.99;
            }
            else if(opcaoPromocao == 5){
                carrinho+=carrinhoPromocao;
            }
            else if(opcaoPromocao==6) {
                menu();
            }
        }

    }
}
