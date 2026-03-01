# Controller
Em uma arquitetura MVC (Model-View-Controller), o Controller é responsável por receber as requisições HTTP enviadas pelo cliente. Ele decide o que deve ser feito com elas e devolve uma resposta ao usuário.


## @RestController vs @Controller

### @RestController
**@RestController** é a combinação de **@Controller** e **@ResponseBody**. Ela indica que o retorno dos métodos deve ser enviado diretamente par ao corpo da resposta HTTP (geralmente em JSON ou String), é ideal para **construir APIs REST**

### @Controller
**@Controller** geralmente é usada quando a aplicação trabalha com páginas (como HTML), onde o retorno do método indica o nome de um arquivo template.



## Mapeamento de Rotas
A anotação **@RequestMapping()** define o endereço base da classe. Isso significa que qualquer método dentro desta classe só será acessado se a URL começar com o endpoint definido dentro do parâmetro.

Exemplo:
```java
@RequestMapping("/primeiraRota")
```
Neste caso, os métodos serão acessados se o usuário acessar a URL http://localhost:8080/primeiraRota


## Métodos e Verbos HTTP
Cada método dentro de um Controller representa um "endpoint" (um ponto de acesso). O Spring utiliza anotações específicas para mapear as intenções do usuário:

Anotação | Verbo HTTP | Objetivo Principal
@GetMapping | GET | **Buscar** ou recuperar informações
@PostMapping | POST | **Criar** ou enviar novos dados
@PutMapping | PUT | **Atualizar** um objeto completo
@PatchMapping | PATCH | **Atualizar parcialmente** um objeto
@DeleteMapping | DELETE | **Remover** uma informação

Exemplo: 
```java
@GetMapping("/primeiroMetodo")
public String primeiraMensagem() {
    return "Funcionou";
}
```

Para acessar esse método, a URL completa seria: http://localhost:8080/primeiraRota/primeiroMetodo


## Resumo do Fluxo
Utilizando a seguinte classe controller como base:
```java
package br.com.steffaneleal.todolist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/primeiraRota") 

public class MinhaPrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
```


1. **Requisição**: O cliente faz um ```GET``` para ```/primeiraRota/primeiroMetodo```.
2. **Roteamento**: O Spring Boot identifica que a classe ```MinhaPrimeiraController``` é a responsável.
3. **Execução**: O método ```primeiraMensagem()``` é executado.
4. **Resposta**: O texto ```Funcionou``` é enviado de volta ao cliente com o status HTTP 200 (OK).