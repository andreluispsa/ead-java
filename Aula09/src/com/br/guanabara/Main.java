package com.br.guanabara;

public class Main {

    public static void main(String[] args) {
	 Pessoa[] p = new Pessoa[2];
	 Livro[] l = new Livro[3];

	 p[0] = new Pessoa("André", 40, "M");
	 p[1] = new Pessoa("Ellen", 30, "F");
	 l[0] = new Livro("Aprendendo Java", "José da Silva", 450, p[0]);
	 l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 400, p[0]);
	 l[2] = new Livro("Java Avançado", "Maria Candido", 550, p[1]);

		System.out.println(l[0].detalhes());
		System.out.println(l[1].detalhes());
		System.out.println(l[2].detalhes());

    }

}
