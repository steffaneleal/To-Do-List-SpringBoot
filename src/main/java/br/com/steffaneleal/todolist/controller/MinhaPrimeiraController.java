package br.com.steffaneleal.todolist.controller;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller para criar uma estrutura onde tenha páginas/templates
@RestController // para entregar uma API REST
@RequestMapping("/primeiraRota") // Define a rota para acessar essa classe
public class MinhaPrimeiraController {
    /**
     * Métodos de acesso do HTTP
     * GET - Buscar uma informação
     * POST - Adicionar um dado/informação
     * PUT - Alterar um dado/informação
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte do dado/informação
     */
    @GetMapping("/primeiroMetodo") // Método de acesso do HTTP para chamar esse método
    public String primeiraMensagem() {
        return "Funcionou";
    }
}