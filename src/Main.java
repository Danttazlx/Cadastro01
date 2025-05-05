import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaUsuario = new ArrayList<>();

        System.out.println("quantos usuarios voce gostaria de cadastrar: ");
        int quantidade = Scanner.nextInt();
        Scanner.nextLine();

        for (int i = 0; i <quantidade ; i++) {
            System.out.println(  (i + 1) + " Cadastro");
        }

        String nome;

        while (true) {
            System.out.println("Digite seu Nome Completo:  ");
            nome = Scanner.nextLine();

            if (nome.matches("^[a-zA-Z\s]{8,45}$")) {
                System.out.println("Valido");
                break;

            } else {
                System.out.println("tente novamente");
            }

        }

        int idade;
        while (true) {
            System.out.println("Digite sua idade: ");
            String entrada = Scanner.nextLine();

            try {
                idade = Integer.parseInt(entrada.trim());
                if (idade >= 18 && idade <= 90) {
                    System.out.println( "Idade válida" );
                    break;
                } else {
                    System.out.println("idade invalida.");
                }
            } catch (NumberFormatException erro) {
                System.out.println("Erro: você digitou algo que não é número.");
            }
        }

            String cpf;

            while (true) {
                System.out.println("Digite seu CPF: (11 Numeros");
                cpf = Scanner.nextLine();


                if (cpf.matches("\\d{11}")) {
                    System.out.println("CPF Valido.");
                    break;
                } else {
                    System.out.println("CPF Invalido!");
                }
            }

            String email;
            while (true) {

                System.out.println("Digite seu email: ");
                email = Scanner.nextLine();

                if (email.matches("^[a-zA-Z-0-9_%+-]+@[a-zA-Z.]+\\.[a-zA-Z]{2,}$"
                )) {
                    System.out.println("Email Valido!");
                    break;

                } else
                    System.out.println("Email invalido, Tente Novamente");
            }
        Pessoa pessoa2 = new Pessoa(nome,email,idade,cpf);
        listaUsuario.add(pessoa2);

        System.out.println("--- lISTA DE USUARIOS ----");
        for (Pessoa pessoa :listaUsuario){
            pessoa.exibir();
        }

            }

        }











