package unicesumar.ead.prog1.dados;

public class Pessoa {
    
    public String nome;
    public String telefone;
    public int idade;
    
    public Pessoa() {
        nome = "André Sá";
        telefone = "(21) 979773888";
        idade = 40;
    }
    
    public Pessoa(String nom, String tel, int id) {
        nome = nom;
        telefone = tel;
        idade = id;
    }

    public String mostrarDados() {
        String retorno = "Nome: " + nome + " / Idade: " + idade + " / Telefone: " + telefone;
        return retorno;
    }
    

}
