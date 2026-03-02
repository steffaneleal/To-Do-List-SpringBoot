// Tudo o que for do usuário será acessado por aqui, como criar um usuário, deletar um usuário, etc.
package br.com.steffaneleal.todolist.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/users")
public class UserController {
    // dados do usuário que será cadastrado
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel){ // O UserModel virá de dentro de uma requisição, então é necessário usar o @RequestBody para que o Spring saiba que ele deve pegar os dados do corpo da requisição e colocar dentro do UserModel
        System.out.println(userModel.name);
    }
}