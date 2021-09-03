package com.ahmtkzk.JPAcrudsimple.Controllers;

import com.ahmtkzk.JPAcrudsimple.Services.Operations;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class IndexController {

    @Autowired
    private Operations operations;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("note", operations.getAllOp());
        return "index";
    }

    @GetMapping("/Add")
    public String addMap(){
        return "add";
    }


}
