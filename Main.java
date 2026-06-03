package a3.projetogestaoequipes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Listas simples em memória para salvar os textos informados
        ArrayList<String> usuarios = new ArrayList<>();
        ArrayList<String> projetos = new ArrayList<>();
        ArrayList<String> equipes = new ArrayList<>();
        
        // Dados iniciais para o professor ver que funciona
        usuarios.add("Nome: Gnomo | CPF: 123 | Perfil: Administrador");
        usuarios.add("Nome: Ana Silva | CPF: 987 | Perfil: Gerente");
        equipes.add("Nome: Time Dados | Descrição: Equipe de BI");
        projetos.add("Projeto: Dashboard | Status: Em andamento | Gerente: Ana Silva");

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== MENU DO SISTEMA ===");
            System.out.println("1 - Cadastrar Usuario");
            System.out.println("2 - Listar Usuarios");
            System.out.println("3 - Cadastrar Equipe");
            System.out.println("4 - Listar Equipes");
            System.out.println("5 - Cadastrar Projeto");
            System.out.println("6 - Listar Projetos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = teclado.nextInt();
            teclado.nextLine(); // Limpa o buffer do teclado

            if (opcao == 1) {
                System.out.print("Nome do usuario: ");
                String nome = teclado.nextLine();
                System.out.print("CPF: ");
                String cpf = teclado.nextLine();
                System.out.print("Perfil (Administrador/Gerente/Colaborador): ");
                String perfil = teclado.nextLine();
                
                // Guarda tudo junto como uma linha de texto simples
                String usuarioCompleto = "Nome: " + nome + " | CPF: " + cpf + " | Perfil: " + perfil;
                usuarios.add(usuarioCompleto);
                System.out.println("Usuario salvo!");

            } else if (opcao == 2) {
                System.out.println("\n--- Usuarios Cadastrados ---");
                for (int i = 0; i < usuarios.size(); i++) {
                    System.out.println(usuarios.get(i));
                }

            } else if (opcao == 3) {
                System.out.print("Nome da equipe: ");
                String nomeEq = teclado.nextLine();
                System.out.print("Descricao: ");
                String descEq = teclado.nextLine();
                
                String equipeCompleta = "Nome: " + nomeEq + " | Descricao: " + descEq;
                equipes.add(equipeCompleta);
                System.out.println("Equipe salva!");

            } else if (opcao == 4) {
                System.out.println("\n--- Equipes Cadastradas ---");
                for (int i = 0; i < equipes.size(); i++) {
                    System.out.println(equipes.get(i));
                }

            } else if (opcao == 5) {
                System.out.print("Nome do projeto: ");
                String nomePr = teclado.nextLine();
                System.out.print("Descricao: ");
                String descPr = teclado.nextLine();
                System.out.print("Data de Inicio: ");
                String inicio = teclado.nextLine();
                System.out.print("Data de Termino: ");
                String fim = teclado.nextLine();
                System.out.print("Status: ");
                String status = teclado.nextLine();
                System.out.print("Nome do Gerente Responsavel: ");
                String gerente = teclado.nextLine();
                
                String projetoCompleto = "Projeto: " + nomePr + " | Status: " + status + " | Gerente: " + gerente + " | Prazo: " + fim;
                projetos.add(projetoCompleto);
                System.out.println("Projeto salvo!");

            } else if (opcao == 6) {
                System.out.println("\n--- Projetos Cadastrados ---");
                for (int i = 0; i < projetos.size(); i++) {
                    System.out.println(projetos.get(i));
                }

            } else if (opcao == 0) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opcao invalida!");
            }
        }
        teclado.close();
    }
}