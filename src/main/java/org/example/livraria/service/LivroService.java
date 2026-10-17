package org.example.livraria.service;


import org.example.livraria.models.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroService {

    private static List<Livro> LIVROS = new ArrayList<>();

    public LivroService() {
        if (LIVROS.isEmpty()) {
            Livro livro1 = new Livro();
            livro1.setTitulo("O Cortiço");
            livro1.setAutor("Aluísio Azevedo");
            livro1.setQuantidade(3);
            LIVROS.add(livro1);

            Livro livro2 = new Livro();
            livro2.setTitulo("Vidas secas");
            livro2.setAutor("Graciliano Ramos");
            livro2.setQuantidade(12);
            LIVROS.add(livro2);
        }
    }

    public List<Livro> getTodos() {
        return LIVROS;
    }

    public void adicionar(Livro livro) {
        LIVROS.add(livro);
    }
}
