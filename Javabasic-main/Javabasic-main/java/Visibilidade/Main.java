package Visibilidade;

public class Main {
    static void main() {
////       String nome = "Juliana";
////       int idade = 22;
//
////        Clientes cliente1 = new Clientes();
////
////        cliente1.nome = "Juliana";
////        cliente1.idade = 22;
//
          Clientes cliente1 = new Clientes("juju",22);
//        cliente1.setNome("Juju");
//        cliente1.setIdade(16);
//
            System.out.println("Nome: " + cliente1.getNome());
            System.out.println("Idade: " + cliente1.getIdade());
            System.out.println("=====================================");
//// FUNCIONÁRIOS
          Funcionarios funcionario1 = new Funcionarios("Juju",22,"Juliana323.dos.santos@gmail.com");
//        funcionario1.setNome("Juliana");
//        funcionario1.setEmail("juliana323.dos.santos@gmail.com");
//        funcionario1.setIdade(22);
//
            System.out.println("Nome: " + funcionario1.getNome());
            System.out.println("Idade: " + funcionario1.getIdade());
            System.out.println("Nome: " + funcionario1.getEmail());

        // Produtos
        System.out.println("=====================================");

        Produtos produto1 = new Produtos("Pizza",1,55.50);
//        produto1.setNome("Pizza");
//        produto1.setQuantidade(1);
//        produto1.setPreco(55.50);

        System.out.println("Nome: "+ produto1.getNome());
        System.out.println("quantidade: "+ produto1.getQuantidade());
        System.out.println("preçoR$: "+ produto1.getPreco());

        System.out.println("=====================================");
    }
}

