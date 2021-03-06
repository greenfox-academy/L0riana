package com.greenfoxacademy.list.controller;

import com.greenfoxacademy.list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;

  @GetMapping({"/", "/list"})
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
