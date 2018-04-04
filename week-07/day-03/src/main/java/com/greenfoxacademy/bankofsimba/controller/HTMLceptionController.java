package com.greenfoxacademy.bankofsimba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLceptionController {

  @RequestMapping(value = "htmlception")
  public String showHtmlception(Model model) {
    model.addAttribute("example", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }
}
