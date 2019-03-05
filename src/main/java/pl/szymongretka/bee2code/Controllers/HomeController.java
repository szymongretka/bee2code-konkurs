package pl.szymongretka.bee2code.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping({"", "/"})
public class HomeController {

    public String getHomePage(){
        return "home";
    }

}
