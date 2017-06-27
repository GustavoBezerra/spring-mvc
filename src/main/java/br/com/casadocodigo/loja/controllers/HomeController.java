package br.com.casadocodigo.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Gustavo on 27/06/2017.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(){
        System.out.println("Entrando na home do CAC");
        return "home";
    }
}
