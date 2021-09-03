package com.ahmtkzk.JPAcrudsimple.Controllers;

import com.ahmtkzk.JPAcrudsimple.Services.Operations;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Add")
@AllArgsConstructor
public class AddController {

    @Autowired
    private Operations operations;

    @PostMapping(path = ("/Submit"))
    public String addNote(@RequestParam(name = "noteN") String note){
        operations.insertOp(note);
        return "Redirect";
    }

}
