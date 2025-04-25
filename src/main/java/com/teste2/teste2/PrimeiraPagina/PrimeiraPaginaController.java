package com.teste2.teste2.PrimeiraPagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PrimeiraPaginaController {

    @GetMapping("primeira")
    public String primeiraPaginaHtml(Model model) {
        model.addAttribute("mensagemDaController",
                "Primeira mensagem do controller");
        return "primeiraPagina";
    }

    @PostMapping("criar")
    public String create(Criar criar, Model model) {
        System.out.println("Nome" +criar.nome);
        System.out.println("Email" + criar.email);
        System.out.println("Usuario" + criar.usuario);
        model.addAttribute("criar", criar);
        return "candidate/info";
    }
    record Criar(String nome, String email, String usuario) {}
}
}
