package com.example.danteBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller 
public class BoardController {
    

  @GetMapping("/")
  public String BoardHome(Model model) {
      model.addAttribute(null, model); // 게시글 정보를 

      return  "BorderHome";  // 여기에 넣어주기
  }


  @PostMapping("/write")
  public String postMethodName(@RequestBody String entity) {
      
     
      return "BorderForm";
  }
  
  
  
}
