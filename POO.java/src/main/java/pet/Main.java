package pet;

public class Main {
    static void main() {

        Pet pet1 = new Pet("Simba",6,"Sianês","médio", "Ração felina");

        System.out.println("=============Dados do Petshop===============");
        System.out.println("nome " + pet1.getNome());
        System.out.println("idade " + pet1.getIdade());
        System.out.println("raça " + pet1.getRaca());
        System.out.println("porte " + pet1.getPorte());
        System.out.println("alimentação "  + pet1.getRaca());
        System.out.println("=============++++++++++++++++===============");

        Pet pet2 = new Pet("Cachorro",2,"pitbul","pequeno", "Ração canina");

        System.out.println("=============Dados do Petshop===============");
        System.out.println(pet2.toString());
        System.out.println("=============++++++++++++++++===============");

    }
}
