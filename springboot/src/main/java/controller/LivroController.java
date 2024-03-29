package controller;

import entity.Categoria;
import entity.Livro;
import entity.Modelo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;
import org.springframework.stereotype.Controller;


@Controller
    @ResponseBody
public class LivroController {
    @RequestMapping("/livros")
    public List<Livro> listar(){
        Livro livro = new Livro(123L, "Helo Word", "Hieat", Categoria.economia, Modelo.EBOOK);

        return Arrays.asList(livro, livro, livro);
    }
}
