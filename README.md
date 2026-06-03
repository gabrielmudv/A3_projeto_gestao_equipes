# A3 - Projeto Integrador: Sistema de Gestão de Equipes e Projetos

Este repositório contém a solução desenvolvida para a A3 (Avaliação Curricular) do curso de Bacharelado em Sistemas de Informação do Centro Universitário IBMR.

---

## Proposta do Projeto

O objetivo principal da atividade era aplicar os conceitos fundamentais de lógica de programação e estruturas de dados em Java para resolver um problema real de gestão corporativa. 

A proposta exigia a criação de um sistema capaz de gerenciar os fluxos de trabalho de uma organização, cobrindo os seguintes requisitos essenciais:
1. Cadastro e Listagem de Usuários: Diferenciando perfis de acesso (Administrador, Gerente e Colaborador).
2. Cadastro e Listagem de Equipes: Permitindo agrupar colaboradores para focar em objetivos comuns.
3. Cadastro e Listagem de Projetos: Vinculando prazos, status de entrega e um Gerente responsável pelo andamento.

---

## Solução Desenvolvida

Com o foco em entregar um código objetivo, funcional e de fácil manutenção, a solução optou por um modelo de arquitetura linear e simplificado, ideal para cenários de validação rápida de regras de negócio (PoC - Prova de Conceito).

### Destaques da Implementação:

* Abordagem Linear (Single File): Todo o fluxo de execução, interface de usuário e persistência temporária foram centralizados na classe Main.java. Isso elimina o acoplamento desnecessário de pastas e facilita a distribuição do código-fonte.
* Persistência em Memória Volátil: Utilização da estrutura nativa ArrayList do Java para armazenar e consultar dinamicamente os registros de usuários, equipes e projetos durante a execução do programa.
* Interface via Console Interativa: Um menu numérico construído com a estrutura de repetição while e condicionais if/else, capturando as entradas do usuário em tempo real através da classe Scanner.
* Carga Inicial de Dados (Seed): O sistema já inicia com registros previamente carregados na memória (como usuários de teste), permitindo que o avaliador teste as listagens e vínculos imediatamente, sem a necessidade de preencher dados do zero.

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
3. Abra o projeto na sua IDE de preferência (recomendado: Apache NetBeans).
4. Execute a classe principal Main.java (atalho F6 no NetBeans).
5. Interaja com o sistema através do menu exibido no console do terminal.
