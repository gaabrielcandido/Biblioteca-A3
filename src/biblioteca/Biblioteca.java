package biblioteca;
import java.util.Scanner;
public class Biblioteca {

    public static void main(String[] args) {
        //TESTES DE LIVROS PARA CADASTRO
        LivrodeCulinaria livrodeCulinaria = new LivrodeCulinaria("Este é um livro de culinária", "gabriel", "casa", 1500, "comida rapida", "mineira");
        LivrodeCulinaria livrodeCulinaria1 = new LivrodeCulinaria("Este é outro livro de culinária", "jose", "teste", 2, "aviao", "helicoptero");
        LivroDidatico livroCalculo = new LivroDidatico("Calculo Aplicado", "José", "Abril", 100, "Ensino", "Matemática", 5);
        LivroDeFiccao livroFiccao = new LivroDeFiccao("Livro de Ficcao", "Antonio", "Março", 757, "Ficcao", "Azul", "Terror");

        //CHAMANDO A FUNÇÃO QUE VAI PARA O MENU PRINCIPAL
        exibeMenu();
    }
    
    //FUNCAO QUE CONTEM O MENU PRINCIPAL E É CHAMADA SEMPRE QUANDO SE QUER VOLTAR PARA O MENU PRINCIPAL
    public static void exibeMenu() {
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        //MENU DE OPÇÕES 
        while (opcao <= 0 || opcao > 5) {
            System.out.println("+----------------------+");
            System.out.println("|      BIBLIOTECA      |");
            System.out.println("|----------------------|");
            System.out.println("|1. Inserir Livro      |");
            System.out.println("|2. Alterar Livro      |");
            System.out.println("|3. Remover Livro      |");
            System.out.println("|4. Listar Livro       |");
            System.out.println("|5. Sair               |");
            System.out.println("+----------------------+");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = validarInt(input);
        }
        //CHAMADA DA FUNÇÃO SUBMENU COM A OPÇÃO ESCILHIDA PELO USUÁRIO
        subMenu(opcao);
    }
    //FUNCAO QUE CONTEM O SUB-MENU ONDE O USUÁRIO ESCOLHE A AÇÃO QUER QUER REALIZAR
    public static void subMenu(int opcao) {
        Scanner input = new Scanner(System.in);
        String titulo, autor, editora, genero;
        int numPaginas;

        //SUBMENU
        switch (opcao) {
            case 1:
                do {
                    //SUBMENU DE CADASTRO
                    System.out.println("+----------------------+");
                    System.out.println("|Qual livro cadastrar? |");
                    System.out.println("|----------------------|");
                    System.out.println("|1.Culinária           |");
                    System.out.println("|2.Didático            |");
                    System.out.println("|3.Ficção              |");
                    System.out.println("|4.Menu Principal      |");
                    System.out.println("+----------------------+");
                    System.out.print("ESCOLHA UMA OPÇÃO: ");
                    opcao = validarInt(input);
                    input.nextLine();
                } while (opcao <= 0 || opcao > 4);

                if (opcao == 1) {
                    //CADASTRA UM NOVO LIVRO DE CULINARIA
                    System.out.println("\nLIVRO DE CULINÁRIA: ");
                    System.out.print("\nDigite o título: ");
                    titulo = input.nextLine();
                    System.out.print("Digite o autor: ");
                    autor = input.nextLine();
                    System.out.print("Digite a editora: ");
                    editora = input.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    numPaginas = validarInt(input);
                    input.nextLine();
                    System.out.print("Digite o gênero: ");
                    genero = input.nextLine();
                    System.out.print("Tipo de culinária: ");
                    String tipoCulinaria = input.nextLine();

                    //CHAMANDO A FUNÇÃO DE CADASTRO DE LIVROS DE CULINÁRIA PASSANDO OS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivrodeCulinaria livroDeCulinaria = new LivrodeCulinaria(titulo, autor, editora, numPaginas, genero, tipoCulinaria);
                    exibeMenu();//RETORNA AO MENU ASSIM QUE É FINALIZADO O CADASTRO
                } else if (opcao == 2) {
                    //CADASTRA UM NOVO LIVRO DIDATICO
                    System.out.print("\nDigite o título: ");
                    titulo = input.nextLine();
                    System.out.print("Digite o autor: ");
                    autor = input.nextLine();
                    System.out.print("Digite a editora: ");
                    editora = input.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    numPaginas = validarInt(input);
                    input.nextLine();
                    System.out.print("Digite o gênero: ");
                    genero = input.nextLine();
                    System.out.print("Disciplina: ");
                    String disciplina = input.nextLine();
                    System.out.print("Serie: ");
                    int serie = input.nextInt();
                    input.nextLine();
                    
                    //CHAMANDO A FUNÇÃO DE CADASTRO DE LIVROS DIDATICO PASSANDO OS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivroDidatico livroDidatico = new LivroDidatico(titulo, autor, editora, numPaginas, genero, disciplina, serie);
                    
                    exibeMenu();//RETORNA AO MENU ASSIM QUE É FINALIZADO O CADASTRO
                } else if (opcao == 3) {
                    
                    //CADASTRA UM NOVO LIVRO DE FICCAO
                    System.out.print("\nDigite o título: ");
                    titulo = input.nextLine();
                    System.out.print("Digite o autor: ");
                    autor = input.nextLine();
                    System.out.print("Digite a editora: ");
                    editora = input.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    numPaginas = validarInt(input);
                    input.nextLine();
                    System.out.print("Digite o gênero: ");
                    genero = input.nextLine();
                    System.out.print("Tema: ");
                    String tema = input.nextLine();
                    System.out.print("Cor do livro:: ");
                    String corDoLivro = input.nextLine();

                    //CHAMANDO A FUNÇÃO DE CADASTRO DE LIVROS DE FICCAO PASSANDO OS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivroDeFiccao livroDeFiccao = new LivroDeFiccao(titulo, autor, editora, numPaginas, genero, tema, corDoLivro);
                    exibeMenu(); //RETORNA AO MENU ASSIM QUE É FINALIZADO O CADASTRO
                } else {
                    //RETORNA AO MENU PRINCIPAL QUANDO O USUÁRIO DIGITA A OPÇÃO 4
                    exibeMenu();
                }
                break;

            case 2:
                do {
                    //SUBMENU DE ALTERAÇÃO DE LIVROS
                    System.out.println("+----------------------+");
                    System.out.println("|Qual livro alterar?   |");
                    System.out.println("|----------------------|");
                    System.out.println("|1.Culinária           |");
                    System.out.println("|2.Didático            |");
                    System.out.println("|3.Ficção              |");
                    System.out.println("|4.Menu                |");
                    System.out.println("+----------------------+");
                    System.out.print("ESCOLHA UMA OPÇÃO: ");
                    opcao = input.nextInt();
                } while (opcao <= 0 || opcao > 4);
                if (opcao == 1) {
                    
                    //CHAMADA DA FUNÇÃO QUE LISTA OS LIVROS DE CULINÁRIA DISPONÍVEIS PARA SE ALTERAR
                    LivrodeCulinaria.getListaLivrosCulinaria();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR 
                    System.out.print("Qual livro você quer alterar? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivrodeCulinaria.pegarLivroCulinaria(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    
                    //FUNÇÃO QUE SELECIONA O LIVRO DENTRO DA LISTA DE VETORES
                    LivrodeCulinaria.pegarLivroCulinaria(opcao);
                    
                    //CAMPOS DE ALTERAÇÃO
                    System.out.print("Digite a alteração do título: ");
                    String novoTitulo = input.nextLine();
                    System.out.print("Digite a alteração do autor: ");
                    String novoAutor = input.nextLine();
                    System.out.print("Digite a alteração da editora: ");
                    String novaEditora = input.nextLine();
                    System.out.print("Digite a alteração do genero: ");
                    String novoGenero = input.nextLine();
                    System.out.print("Digite a alteração do tipo de Culinaria: ");
                    String novoTipoCulinaria = input.nextLine();

                    //CHAMANDO A FUNÇÃO QUE ALTERA UM LIVRO DE CULINÁRIA PASSANDO OS NOVOS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivrodeCulinaria.alteraLivroCulinaria(opcao, novoTitulo, novoAutor, novaEditora, novoGenero, novoTipoCulinaria);
                    
                    exibeMenu(); //RETORNANDO AO MENU
                }

                if (opcao == 2) {
                    
                    //CHAMADA DA FUNÇÃO QUE LISTA OS LIVROS DIDATICOS DISPONÍVEIS PARA SE ALTERAR
                    LivroDidatico.getListaLivrosDitatico();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR
                    System.out.print("Qual livro você quer alterar? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivroDidatico.pegarLivroDidatico(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    //FUNÇÃO QUE SELECIONA O LIVRO DENTRO DA LISTA DE VETORES
                    LivroDidatico.pegarLivroDidatico(opcao);
                    
                    //CAMPOS DE ALTERAÇÃO
                    System.out.print("Digite a alteração do título: ");
                    String novoTitulo = input.nextLine();
                    System.out.print("Digite a alteração do autor: ");
                    String novoAutor = input.nextLine();
                    System.out.print("Digite a alteração da editora: ");
                    String novaEditora = input.nextLine();
                    System.out.print("Digite a alteração do genero: ");
                    String novoGenero = input.nextLine();
                    System.out.print("Digite a alteração da Disciplina: ");
                    String novaDisciplina = input.nextLine();
                    System.out.print("Digite a alteração da série: ");
                    int novaSerie = validarInt(input);
                    input.nextLine();
                    
                    //CHAMANDO A FUNÇÃO QUE ALTERA UM LIVRO DIDATICO PASSANDO OS NOVOS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivroDidatico.alteraLivroDidatico(opcao, novoTitulo, novoAutor, novaEditora, novoGenero, novaDisciplina, novaSerie);
                    exibeMenu();
                } else if (opcao == 3) {
                    
                    //CHAMADA DA FUNÇÃO QUE LISTA OS LIVROS DE FICCAO DISPONÍVEIS PARA SE ALTERAR
                    LivroDeFiccao.getListaLivrosFiccao();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR
                    System.out.print("Qual livro você quer alterar? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivroDeFiccao.pegarLivroFiccao(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    
                    //FUNÇÃO QUE SELECIONA O LIVRO DENTRO DA LISTA DE VETORES
                    LivroDeFiccao.pegarLivroFiccao(opcao);
                    
                    //CAMPOS DE ALTERAÇÃO
                    System.out.print("Digite a alteração do título: ");
                    String novoTitulo = input.nextLine();
                    System.out.print("Digite a alteração do autor: ");
                    String novoAutor = input.nextLine();
                    System.out.print("Digite a alteração da editora: ");
                    String novaEditora = input.nextLine();
                    System.out.print("Digite a alteração do genero: ");
                    String novoGenero = input.nextLine();
                    System.out.print("Digite a alteração da cor: ");
                    String novaCor = input.nextLine();
                    System.out.print("Digite a alteração do tema: ");
                    String novoTema = input.nextLine();
                    
                    //CHAMANDO A FUNÇÃO QUE ALTERA UM LIVRO DE FICCAO PASSANDO OS NOVOS PARAMETROS DIGITADOS PELO USUÁRIO
                    LivroDeFiccao.alteraLivroFiccao(opcao, novoTitulo, novoAutor, novaEditora, novoGenero, novaCor, novoTema);
                    
                    exibeMenu(); //RETORNANDO AO MENU
                } else {
                    //RETORNA AO MENU QUANDO O USUÁRIO DIGITA A OPÇÃO 4
                    exibeMenu();
                }
                break;

            case 3:
                do {
                    //SUBMENU DE OPÇÕES DE ALTERAÇÃO
                    System.out.println("+----------------------+");
                    System.out.println("|Qual livro remover?   |");
                    System.out.println("|----------------------|");
                    System.out.println("|1.Culinária           |");
                    System.out.println("|2.Didático            |");
                    System.out.println("|3.Ficção              |");
                    System.out.println("|4.Menu                |");
                    System.out.println("+----------------------+");
                    System.out.print("ESCOLHA UMA OPÇÃO: ");
                    opcao = input.nextInt();
                } while (opcao <= 0 || opcao > 4);
                if (opcao == 1) {
                    //LISTANDO OS LIVROS DE CULINÁRIA DISPONÍVEIS PARA SE REMOVER
                    LivrodeCulinaria.getListaLivrosCulinaria();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR 
                    System.out.print("Qual livro você quer remover? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivrodeCulinaria.pegarLivroCulinaria(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    
                    //CHAMANDO A FUNÇÃO QUE SELECIONA O LIVRO ESCOLHIDO PELO USUÁRIO NA LISTA DE LIVROS
                    LivrodeCulinaria.pegarLivroCulinaria(opcao);
                    
                    //CHAMANDO A FUNCÇÃO QUE REMOVE O LIVRO ESCOLHIDO PELO USUÁRIO
                    LivrodeCulinaria.removerLivroCulinaria(opcao);
                    
                    //RETORNA AO MENU DEPOIS DE REMOVER
                    exibeMenu();
                }
                if (opcao == 2) {
                    //LISTANDO OS LIVROS DIDATICOS DISPONÍVEIS PARA SE REMOVER
                    LivroDidatico.getListaLivrosDitatico();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR
                    System.out.print("Qual livro você quer remover? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivroDidatico.pegarLivroDidatico(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    
                    //CHAMANDO A FUNÇÃO QUE SELECIONA O LIVRO ESCOLHIDO PELO USUÁRIO NA LISTA DE LIVROS
                    LivroDidatico.pegarLivroDidatico(opcao);
                    
                    //CHAMANDO A FUNCÇÃO QUE REMOVE O LIVRO ESCOLHIDO PELO USUÁRIO              
                    LivroDidatico.removerLivroDidatico(opcao);
                    
                    //RETORNA AO MENU DEPOIS DE REMOVER
                    exibeMenu();
                }
                if (opcao == 3) {
                    //LISTANDO OS LIVROS DE FICCAO DISPONÍVEIS PARA SE REMOVER
                    LivroDeFiccao.getListaLivrosFiccao();
                    
                    //USUÁRIO ESCOLHE NA LISTA QUAL LIVRO QUER ALTERAR
                    System.out.print("Qual livro você quer remover? ");
                    opcao = validarInt(input);
                    input.nextLine();
                    
                    //VALIDANDO A ESCOLHA DO USUÁRIO PARA NÃO DIGITAR UMA OPÇÃO FORA DO ÍNDICE
                    while (LivroDeFiccao.pegarLivroFiccao(opcao) == null) {
                        System.out.print("Livro não encontrado, digite novamente: ");
                        opcao = validarInt(input);
                        input.nextLine();
                    }
                    //CHAMANDO A FUNÇÃO QUE SELECIONA O LIVRO ESCOLHIDO PELO USUÁRIO NA LISTA DE LIVROS
                    LivroDeFiccao.pegarLivroFiccao(opcao);
                    
                    //CHAMANDO A FUNCÇÃO QUE REMOVE O LIVRO ESCOLHIDO PELO USUÁRIO     
                    LivroDeFiccao.removerLivroFiccao(opcao);
                    
                    //RETORNA AO MENU DEPOIS DE REMOVER
                    exibeMenu();
                } else {
                    //RETORNA AO MENU CASO O USUÁRIO DIGITE A OPCAO 4
                    exibeMenu();
                }
                break;

            case 4:
                do {
                    //LISTA COM TODOS OS LIVROS
                    System.out.println("+----------------------+");
                    System.out.println("|Lista de Livros       |");
                    System.out.println("|----------------------|");
                    System.out.println("|1.Livros disponíveis  |");
                    System.out.println("|2.Menu Principal      |");
                    System.out.println("+----------------------+");
                    System.out.print("ESCOLHA UMA OPÇÃO: ");
                    opcao = validarInt(input);

                } while (opcao <= 0 || opcao > 2);

                if (opcao == 1) {
                    //CHAMADA DA FUNÇÃO QUE EXIBE A LISTA COM TODOS OS LIVROS
                    Livro.getListaLivros();
                    //EXIBINDO O MENU
                    exibeMenu();
                } else if (opcao == 2) {
                    //OPCAO QUE RETORNA AO MENU
                    exibeMenu();
                }
                break;

            case 5:
                //PARA A EXECUCAO DO PROGRAMA
                System.out.println("Tchau :)");
                break;
        }
    }

    /**
     * Valida a entrada do usuário para garantir que seja um número inteiro.
     *
     * Este método continua solicitando ao usuário que insira um valor numérico
     * até que um valor inteiro válido seja fornecido. Se o valor inserido não
     * for um número inteiro, o método exibe uma mensagem solicitando um valor
     * numérico e repete a solicitação até que uma entrada válida seja
     * fornecida.
     *
     * @param input Um objeto Scanner para ler a entrada do usuário.
     * @return O valor inteiro válido inserido pelo usuário.
     */

    public static int validarInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.print("Digite um valor numerico: ");
            input.next();
        }
        return input.nextInt();
    }
}
