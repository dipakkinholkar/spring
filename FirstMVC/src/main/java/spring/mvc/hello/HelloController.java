package spring.mvc.hello;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  

public class HelloController {  
@RequestMapping("/hello")  
    public String display()  
    {  
        return "index";  
    }     
}  