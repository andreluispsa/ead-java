package com.br.guanabara;

public interface Publicacao {
    void abrir();
    void fechar();
    void folhear(int p);
    void avancarPag(int p);
    void voltarPag();
}
