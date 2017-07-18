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
        
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j = j + (1 * i);
            System.out.println("J = " + j);
        }
        
        int i = 2;
        while (i < 20) {
            System.out.println("i = " + i);
            i = i + 2;
        }       
    }
    
}
