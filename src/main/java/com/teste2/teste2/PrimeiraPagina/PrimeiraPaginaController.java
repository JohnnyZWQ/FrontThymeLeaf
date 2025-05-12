package com.teste2.teste2.PrimeiraPagina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeira")
public class PrimeiraPaginaController {

    @Autowired
    private PrimeiraPaginaRepository primeiraPaginaRepository;

    @GetMapping("teste")
    public String primeiraPaginaHtml(Model model) {
        model.addAttribute("mensagemDaController",
                "Insira os dados abaixo:");
        return "primeiraPagina";
    }
/* 
    @PostMapping("criar")
    public String create(Criar criar, Model model) {
        System.out.println("Nome" +criar.nome);
        System.out.println("Email" + criar.email);
        System.out.println("Usuario" + criar.usuario);
        model.addAttribute("criar", criar);
        return "candidate/info";
    }
    record Criar(String nome, String email, String usuario) {}
    */

      @PostMapping("/criar")
    public void criar(PrimeiraPaginaModel primeiraPaginaModel ) {
        System.out.println("Ta aqui");
        var save=this.primeiraPaginaRepository.save(primeiraPaginaModel);
        System.out.println(save);
    }
}