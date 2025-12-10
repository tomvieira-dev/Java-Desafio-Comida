package desafio;

public class Pessoa {
    
    String nome = "";
    double peso = 0;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida){
        if(comida != null){
            this.peso += comida.peso;
        }

    }

    String apresentar(){
        return this.nome + " pesa " + this.peso + " kg.";
    }

}


