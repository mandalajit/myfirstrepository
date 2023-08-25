package com.example.online.news.controller;

import com.example.online.news.pojo.TodoList;
import com.example.online.news.repo.TodoListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TodoListRepo todoListRepo ;

@GetMapping("/home")
    public String home(Model model){

   
    return "home";
}

}
