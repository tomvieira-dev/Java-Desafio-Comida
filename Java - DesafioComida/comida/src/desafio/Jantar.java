package desafio;

public class Jantar {

    public static void main(String[] args) {

        
        Pessoa pessoa = new Pessoa("João", 99.8);
       

        Comida comida1 = new Comida("Hamburguer", 0.4);
        Comida comida2 = new Comida("Batata Frita", 0.3);
        Comida comida3 = new Comida("Refrigerante", 0.5);
        Comida comida4 = new Comida("Salada", 0.2);
        
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida1);
        System.out.println("após comer o hamburguer: ");
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida2);
        System.out.println("após comer a batata frita: ");
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida3);
        System.out.println("após beber o refrigerante: ");
        System.out.println(pessoa.apresentar());
        pessoa.comer(comida4);
        

    
        
        

        
    }

}
