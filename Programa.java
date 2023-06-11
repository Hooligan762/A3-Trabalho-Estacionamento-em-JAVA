import java.util.Scanner;

public class Programa {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Declarando o Scanner
        Estacionamento GH_carros = new Estacionamento(); // Criando um estacionamento
        Detran detran = new Detran(); // Criando o detran
        Carro thayna = new Carro("Fiesta 2010", "123", "Thayna", "Preto");

        int opcao = -1; // Variável para armazenar a opção do menu
        int opcao_anterior = -1; // Variável para armazenar a opção anterior

        while (opcao != 0) {
            // Verifica se a opção anterior foi a opção 5 (DETRAN)
            if (opcao == 5) {
                // Menu DETRAN
                System.out.println("=====DETRAN====");
                System.out.println("[1] - Deseja Cadastrar um veiculo?");
                System.out.println("[2] - Deseja apagar um veiculo?");
                System.out.println("[3] - Deseja procurar por um veiculo?");
                System.out.println("[0] - Voltar ");
                int optionDetran = scan.nextInt();

                switch (optionDetran) {
                    case 1:
                        detran.Cadastrar();
                        break;
                    case 2:
                        detran.Apagar();
                        break;
                    case 3:
                        detran.Buscar();
                        break;
                    case 0:
                        // Define a opção anterior como -1 para retornar ao menu principal
                        opcao = -1;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            } else {
                // Menu principal
                System.out.println("=====MENU=====");
                System.out.println("Bem-vindo ao estacionamento do GH Carros");
                System.out.println("[1] - Deseja estacionar um carro?");
                System.out.println("[2] - Deseja visualizar todos os carros já estacionados?");
                System.out.println("[3] - Deseja remover um carro do estacionamento?");
                System.out.println("[4] - Deseja procurar por um carro?");
                System.out.println("[5] - Deseja ir ao DETRAN?");
                System.out.println("[6] - Verificar vagas disponíveis");
                System.out.println("[0] - Fechar programa");
                opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        GH_carros.Estacionar();
                        break;
                    case 2:
                        GH_carros.mostrarTodos();
                        break;
                    case 3:
                        GH_carros.Remover();
                        break;
                    case 4:
                        GH_carros.Buscar();
                        break;
                    case 5:
                        opcao = 5;
                        break;
                    case 6:
                        int vagasDisponiveis = GH_carros.vagasDisponiveis();
                        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
                        break;
                    case 0:
                        System.out.println("Sistema Finalizado.");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }
    }
}
