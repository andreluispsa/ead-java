package variaveis;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Maria";
        System.out.println("Nome: " + pessoa.nome);
        System.out.println(Pessoa.ser);
        pessoa.ser = "Humano";
        System.out.println(pessoa.ser);
        System.out.println(Pessoa.ser);
    }
    
}
