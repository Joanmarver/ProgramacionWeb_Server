package daw.jmv.helloworld.controller;
import daw.jmv.helloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
// Cuando accedamos a esta URL, accederemos a este controlador.http://127.0.0.1:8080/info
   /* @GetMapping("/greeting")
    public String userGreeting(Model model) { // Nombre del controlador
        model.addAttribute("message", "¡Bienvenido!"); // Envíamos un String message a la plantilla
        User userObject = new User("joan", "joamarver3@alu.edu.gva.es"); // Accedemos al modelo para crear un objeto
        model.addAttribute("userObject", userObject); // Envíamos un objeto a la plantilla
        return "user-greeting"; // Plantilla que utilizará este controlador
    }*/

    @GetMapping("/helloworld")
    public String greeting(@RequestParam(required = false) String username,  @RequestParam(required = false) String name2, Model model) {
        model.addAttribute("message", "Hola " + username + "\n" + "Hola " + name2);
        return "user-greeting";
    }
}

