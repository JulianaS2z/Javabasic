package unidade_federativa;

public class Main {
    static void main() {

        Endereco endereco1 = new Endereco("Rua dos Cornos","105","Casa","4004-777","Salvador",Unidade.BAHIA);
        Pessoa pessoa1 = new Pessoa(1,"juju",22,"71 99610-5069","jujubis@gmail.com",Sexo.FEMININO,endereco1);

        System.out.println(pessoa1);
    }
}
