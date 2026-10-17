package org.example.livraria.controllers;

import org.example.livraria.models.Livro;
import org.example.livraria.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class LivrosController {
    private LivroService service = new LivroService();

    @GetMapping("/livro")
    public String livros(Model model) {
        model.addAttribute("livros", service.getTodos());
        return "livro";
    }

}
