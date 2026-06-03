# A3 - Projeto Integrador: Sistema de Gestão de Equipes e Projetos (MVC)

Este repositório contém a solução desenvolvida para a A3 (Avaliação Curricular) do curso de Bacharelado em Sistemas de Informação do Centro Universitário IBMR.

---

## Proposta do Projeto

O objetivo principal da atividade é aplicar os conceitos de Programação Orientada a Objetos e estruturas de dados em Java para resolver um problema real de gestão corporativa, atendendo aos seguintes requisitos de negócio:
1. **Cadastro de Usuários:** Recolha de Nome Completo, CPF, E-mail, Cargo, Login e Senha, com atribuição de perfis de acesso restritos (administrador, gerente ou colaborador).
2. **Cadastro de Projetos:** Definição de Nome, Descrição, Data de Início, Data de Término Prevista, Status (planejado, em andamento, concluido, cancelado) e associação obrigatória a um Gerente responsável.
3. **Cadastro de Equipes:** Mapeamento de Nome, Descrição e Usuários vinculados, permitindo que uma mesma equipe atue em múltiplos projetos simultaneamente.

---

## Solução Desenvolvida e Arquitetura

O sistema foi totalmente reestruturado seguindo o padrão de arquitetura **MVC (Model-View-Controller)**, garantindo a separação de responsabilidades, organização do código e manutenibilidade:

* **Model (Camada de Modelo):** Contém as classes `Usuario.java`, `Equipe.java` e `Projeto.java`, que encapsulam os atributos solicitados e as regras de associação entre as entidades.
* **Controller (Camada de Controlo):** A classe `GerenciadorController.java` centraliza as regras de negócio, métodos de busca por correspondência e a persistência de dados em memória volátil através da estrutura nativa `ArrayList`.
* **View (Camada de Visão):** A classe `Main.java` atua como a interface do utilizador via console, processando o menu interativo e capturando os dados de entrada de forma segura com `Scanner`.

---

## Tecnologias Utilizadas

* Linguagem: Java (JDK 26)
* Gerenciador de Dependências: Apache Maven
* IDE: Apache NetBeans

---

## Como Executar o Projeto

1. Certifique-se de ter o JDK e o Maven instalados na sua máquina.
2. Clone este repositório:
   git clone https://github.com/gabrielmudv/A3_projeto_gestao_equipes.git
3. Abra o projeto no Apache NetBeans.
4. Execute o projeto (atalho F6). O NetBeans está configurado para iniciar a execução a partir do pacote de visão (`view.Main`).
