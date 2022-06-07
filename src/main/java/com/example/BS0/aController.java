package com.example.BS0;

import Class.Persona;
import org.springframework.web.bind.annotation.*;

//esto es la petición que mandamos al servidor
@RestController
public class aController {
    @GetMapping("/a")
    public String getHola()
    {
        return "Hola mundo";
    }
    @GetMapping("/b")
    public String getHola2()
    {
        return "Hola mundo B";
    }


    //endpoint para emitir un saludo concatenando al nombre de la persona
    @GetMapping("/person")
    public String welcome (@RequestParam(value="name") String name)
    {
        return "Hola " + name;
    }
    //endpoint para añadir una persona
    @PostMapping("/addperson")
    public Persona useradd (@RequestBody Persona persona) {
        persona.setEdad(persona.getEdad()+1);
        return  persona;
    }
}
