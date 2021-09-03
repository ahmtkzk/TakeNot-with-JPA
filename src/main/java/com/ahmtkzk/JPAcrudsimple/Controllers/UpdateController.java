package com.ahmtkzk.JPAcrudsimple.Controllers;

import com.ahmtkzk.JPAcrudsimple.Services.Operations;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("/Update")
public class UpdateController {

    private Operations operations;

    @GetMapping("/{id}")
    public String updateID(@PathVariable(name = "id") String id, Model model){
        model.addAttribute("idNote", operations.getByIDOp(id));
        return "update";
    }

    @PostMapping("/Up")
    public String updateNote(@RequestParam(name = "upupNote") String note, @RequestParam(name = "getnid") String id){
        operations.updateOp(id, note);
        return "Redirect";
    }

    @PostMapping("/Del")
    public String delNote(@RequestParam(name = "getnid") String id){
        operations.deleteOp(id);
        return "Redirect";
    }

}
