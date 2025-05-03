import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Pessoa> listaUsuario = new ArrayList<>();

        int opcao;

        System.out.println("Quantos usuários você quer cadastrar? ");
        int Quantidade = Scanner.nextInt();
        Scanner.nextLine();

        for (int i = 0; i < Quantidade; i++) {
            System.out.println((i + ""));
        }

       String NOME;

        while (true) {
            System.out.println("Digite seu Nome Completo:  ");
            NOME = Scanner.nextLine();

            if ( NOME.matches("^[a-zA-Z\s]{8,45}$")) {
                System.out.println("Valido");
                break;

            } else{
                System.out.println("tente novamente");
            }

        }

        String entrada;
        int idade = -1;

        while (idade < 0 ) {
            System.out.println("Digite sua idade: ");
            entrada = Scanner.nextLine();

            if (entrada.matches("^[0-9]{18,80}$")) {
                System.out.println("Valido");
                    break;
            }else
                System.out.println("idade invalida, (Maior de +18)");
        }


        String cpf;

        while (true){
            System.out.println("Digite seu CPF: (11 Numeros");
                cpf = Scanner.nextLine();


            if ( cpf.matches("\\d{11}")) {
                System.out.println("CPF Valido.");
                break;
            } else{
                System.out.println("CPF Invalido!");
            }
        }

        String EMAIL;
        System.out.println("Digite seu Email: ");
        String email = Scanner.nextLine();

        while (true){

            System.out.println("Digite seu email: ");
            EMAIL = Scanner.nextLine();

            if (EMAIL.matches("^[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$"
            )){
                System.out.println("Email Valido!");
                break;

            }else
                System.out.println("Email invalido, Tente Novamente");


        }


        Pessoa Usuario = new Pessoa(NOME,EMAIL,idade,cpf );
        listaUsuario.add(Usuario);


        System.out.println("\n--- Cadastro ---");
        for (Pessoa user : listaUsuario) {
            user.exibir();

            Scanner.close();


        }

    }
}











