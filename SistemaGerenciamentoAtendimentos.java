// Classe Atendimento
public class Atendimento {
    private String nomeAtendido;
    private String dataAtendimento;
    private String descricaoAtendimento;

    // Construtor
    public Atendimento(String nomeAtendido, String dataAtendimento, String descricaoAtendimento) {
        this.nomeAtendido = nomeAtendido;
        this.dataAtendimento = dataAtendimento;
        this.descricaoAtendimento = descricaoAtendimento;
    }

    // Getters e Setters
    public String getNomeAtendido() {
        return nomeAtendido;
    }

    public void setNomeAtendido(String nomeAtendido) {
        this.nomeAtendido = nomeAtendido;
    }

    public String getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(String dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public String getDescricaoAtendimento() {
        return descricaoAtendimento;
    }

    public void setDescricaoAtendimento(String descricaoAtendimento) {
        this.descricaoAtendimento = descricaoAtendimento;
    }

    // Método para exibir informações do atendimento
    public void exibirAtendimento() {
        System.out.println("Nome: " + nomeAtendido);
        System.out.println("Data: " + dataAtendimento);
        System.out.println("Descrição: " + descricaoAtendimento);
    }
}

// Classe principal para executar o sistema
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaGerenciamentoAtendimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Atendimento> atendimentos = new ArrayList<>();

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Atendimentos");
            System.out.println("1. Adicionar Atendimento");
            System.out.println("2. Listar Atendimentos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            if (opcao == 1) {
                System.out.print("Nome do Atendido: ");
                String nome = scanner.nextLine();
                System.out.print("Data do Atendimento (dd/MM/yyyy): ");
                String data = scanner.nextLine();
                System.out.print("Descrição do Atendimento: ");
                String descricao = scanner.nextLine();

                Atendimento atendimento = new Atendimento(nome, data, descricao);
                atendimentos.add(atendimento);
                System.out.println("Atendimento adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.println("\nLista de Atendimentos:");
                for (Atendimento atendimento : atendimentos) {
                    atendimento.exibirAtendimento();
                    System.out.println("----------------------------");
                }
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema.");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
