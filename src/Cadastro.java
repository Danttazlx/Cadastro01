

class Pessoa {


    private String nome;
    private String email;
    private int idade;
    private String Cpf;


    public Pessoa(String nome, String email, int idade, String cpf) {

        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.Cpf = cpf;
    }

    public void exibir() {

        System.out.println("Nome: " + nome);
        System.out.println("email: " + email);
        System.out.println("idade: " + idade + " anos");
        System.out.println("CPF: " + Cpf);


        System.out.println("-----------------------");

        System.out.println("Cadastro Concluido com sucesso!!");
    }


}