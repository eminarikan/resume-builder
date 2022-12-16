package dev.eminarikan.resumebuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.eminarikan.resumebuilder.model.Person;

@Controller
public class MainController {

    @Autowired
    private Person person;

    
    @GetMapping(path = {"","/","/home","/resume"})
    public String index(ModelMap map){

        map.addAttribute("person", person);

        return "resume";
    }

    @GetMapping("/person")
    @ResponseBody
    public Person getPerson(){
        return person;
    }

}
