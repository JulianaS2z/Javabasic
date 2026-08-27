package pet2;

public class Main {
    static void main() {

        Pet pet1 = new Pet("Simba",6,"Felina");
        Pet pet2 = new Pet("Shanny",18,"Felina");
        Cliente cliente1 = new Cliente("Juliana",22,pet1);
        Cliente cliente2 = new Cliente("Juliana",22,pet2);

        System.out.println("=============Dados do Petshop===============");
        System.out.println(pet1);
        System.out.println("=============++++++++++++++++===============");
        System.out.println("=============Dados do Petshop===============");
        System.out.println(pet2);
        System.out.println("=============++++++++++++++++===============");
    }
}
