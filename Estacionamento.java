import java.util.Scanner;
import java.util.ArrayList;

public class Estacionamento {

    Scanner scan = new Scanner(System.in);
    ArrayList<String> donos; // Array que guarda os nomes dos donos dos carros estacionados

    private int vagasDisponiveis; // Variável que guarda o número de vagas disponíveis

    public Estacionamento() {
        donos = new ArrayList<String>(10); // Criando um ArrayList com 10 vagas disponíveis
        vagasDisponiveis = 10; // Definindo o número inicial de vagas disponíveis
        System.out.println("Estacionamento criado com sucesso!");
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }

    public void Estacionar() {
        if (vagasDisponiveis == 0) {
            System.out.println("Estacionamento lotado. Não é possível estacionar.");
            return;
        }

        System.out.println("# Estacionando veiculo...");

        System.out.print("Digite o nome do dono do carro: ");
        String nome_dono = scan.nextLine();

        donos.add(nome_dono); // Adiciona o nome do dono à lista de donos

        System.out.println("Carro estacionado com sucesso!"); // Imprime a mensagem informando que o carro foi estacionado com sucesso
        vagasDisponiveis--; // Decrementa o número de vagas disponíveis, indicando que uma vaga foi ocupada
        System.out.println("Vagas disponíveis: " + vagasDisponiveis); // Imprime o número atualizado de vagas disponíveis

    }

    public void Remover() {
        System.out.println("# Removendo o veiculo");

        System.out.println("Digite o nome do dono do carro: ");
        String nome_dono = scan.nextLine();

        if (donos.contains(nome_dono)) { // Verifica se o nome do dono está na lista de donos
            donos.remove(nome_dono); // Remove o nome do dono da lista
            System.out.println("Carro encontrado e retirado com sucesso!");
            vagasDisponiveis++; // Incrementa o número de vagas disponíveis, pois um carro foi removido
            System.out.println("Vagas disponíveis: " + vagasDisponiveis);
        } else {
            System.out.println("Dono incorreto... veículo não pode ser retirado!");
        }
    }

    public void mostrarTodos() {
        System.out.println("=== Lista de Carros Estacionados ===");
        if (donos.isEmpty()) { //verifica se a lista de donos (donos) está vazia, ou seja, se não há carros estacionados.
            System.out.println("Nenhum carro estacionado no momento.");
        } else {
            for (String dono : donos) {
                System.out.println("Dono: " + dono);
            }
        }
    }

    public void Buscar() {
    }

    public int vagasDisponiveis() {// retorna o valor atual das vagas disponíveis no estacionamento. É uma função que apenas retorna o valor da variável vagasDisponiveis.
        return vagasDisponiveis;
    }
}
