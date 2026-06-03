package view;

import controller.GerenciadorController;
import model.Usuario;
import model.Equipe;
import model.Projeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorController controller = new GerenciadorController();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE GESTAO DE EQUIPES E PROJETOS (MVC) ---");
            System.out.println("1 - Cadastrar Usuario (Completo)");
            System.out.println("2 - Listar Usuarios");
            System.out.println("3 - Cadastrar Equipe");
            System.out.println("4 - Listar Equipes e Vinculos");
            System.out.println("5 - Cadastrar Projeto (Com Gerente)");
            System.out.println("6 - Listar Projetos");
            System.out.println("7 - Vincular Colaborador a uma Equipe");
            System.out.println("8 - Vincular Equipe a um Projeto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opcao invalida.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Nome Completo: "); String nome = scanner.nextLine();
                    System.out.print("CPF: "); String cpf = scanner.nextLine();
                    System.out.print("E-mail: "); String email = scanner.nextLine();
                    System.out.print("Cargo: "); String cargo = scanner.nextLine();
                    System.out.print("Login: "); String login = scanner.nextLine();
                    System.out.print("Senha: "); String senha = scanner.nextLine();
                    System.out.print("Perfil (administrador / gerente / colaborador): "); String perfil = scanner.nextLine();
                    controller.cadastrarUsuario(nome, cpf, email, cargo, login, senha, perfil);
                    System.out.println("Usuario cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Usuarios Cadastrados ---");
                    for (Usuario u : controller.listarUsuarios()) {
                        System.out.println("Nome: " + u.getNomeCompleto() + " | Cargo: " + u.getCargo() + " | Perfil: " + u.getPerfil());
                    }
                    break;

                case 3:
                    System.out.print("Nome da Equipe: "); String nomeE = scanner.nextLine();
                    System.out.print("Descricao da Equipe: "); String descE = scanner.nextLine();
                    controller.cadastrarEquipe(nomeE, descE);
                    System.out.println("Equipe cadastrada com sucesso!");
                    break;

                case 4:
                    System.out.println("\n--- Equipes Cadastradas ---");
                    for (Equipe e : controller.listarEquipes()) {
                        System.out.println("Equipe: " + e.getNomeEquipe() + " (" + e.getDescricao() + ")");
                        System.out.println("  -> Qtd Membros: " + e.getMembros().size());
                        System.out.print("  -> Projetos em que atua: ");
                        if(e.getProjetosAtuantes().isEmpty()) System.out.println("Nenhum associado ainda.");
                        for(Projeto pr : e.getProjetosAtuantes()) System.out.print("[" + pr.getNomeProjeto() + "] ");
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.print("Nome do Projeto: "); String nomeP = scanner.nextLine();
                    System.out.print("Descricao do Projeto: "); String descP = scanner.nextLine();
                    System.out.print("Data de Inicio: "); String dataIn = scanner.nextLine();
                    System.out.print("Data de Termino Prevista: "); String dataFim = scanner.nextLine();
                    System.out.print("Status (planejado / em andamento / concluido / cancelado): "); String status = scanner.nextLine();
                    System.out.print("Nome do Gerente Responsavel: "); String nomeG = scanner.nextLine();
                    
                    Usuario gerente = controller.buscarUsuarioPorNome(nomeG);
                    if (gerente != null && gerente.getPerfil().equalsIgnoreCase("gerente")) {
                        controller.cadastrarProjeto(nomeP, descP, dataIn, dataFim, status, gerente);
                        System.out.println("Projeto cadastrado e vinculado ao gerente com sucesso!");
                    } else {
                        System.out.println("Erro: Usuario nao encontrado ou nao possui perfil de 'gerente'. Projeto nao criado.");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Projetos Cadastrados ---");
                    for (Projeto p : controller.listarProjetos()) {
                        System.out.println("Projeto: " + p.getNomeProjeto() + " | Status: " + p.getStatus());
                        System.out.println("  Descricao: " + p.getDescricao());
                        System.out.println("  Cronograma: " + p.getDataInicio() + " ate " + p.getDataTerminoPrevista());
                        System.out.println("  Gerente Responsavel: " + p.getGerenteResponsavel().getNomeCompleto());
                    }
                    break;

                case 7:
                    System.out.print("Nome do Colaborador: "); String colabNome = scanner.nextLine();
                    System.out.print("Nome da Equipe: "); String eqNome = scanner.nextLine();
                    Usuario uVinculo = controller.buscarUsuarioPorNome(colabNome);
                    Equipe eVinculo = controller.buscarEquipePorNome(eqNome);
                    
                    if (uVinculo != null && eVinculo != null) {
                        eVinculo.adicionarMembro(uVinculo);
                        System.out.println("Colaborador vinculado à equipe com sucesso!");
                    } else {
                        System.out.println("Erro: Usuario ou Equipe nao encontrados.");
                    }
                    break;

                case 8:
                    System.out.print("Nome da Equipe: "); String eqProjNome = scanner.nextLine();
                    System.out.print("Nome do Projeto: "); String projNome = scanner.nextLine();
                    Equipe eqProj = controller.buscarEquipePorNome(eqProjNome);
                    Projeto pProj = controller.buscarProjetoPorNome(projNome);
                    
                    if (eqProj != null && pProj != null) {
                        eqProj.associarProjeto(pProj);
                        System.out.println("Equipe associada ao projeto com sucesso (Multiplos projetos permitidos)!");
                    } else {
                        System.out.println("Erro: Equipe ou Projeto nao encontrados.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        scanner.close();
    }
}