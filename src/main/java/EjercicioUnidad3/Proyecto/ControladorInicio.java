package EjercicioUnidad3.Proyecto;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;    
import EjercicioUnidad3.Proyecto.modelo.Usuario;



@Slf4j
//@RestController
@Controller
public class ControladorInicio {
    
    @Value("${index.mensaje}")
    String dato;
    @GetMapping("/")
    public String inicio(Model modelo) {
        String mensaje="Saludos desde Spring MVC con paso de informacion";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u = new Usuario();
        u.setId("1");
        u.setPassword("123456");
        u.setName("Juan");
        u.setLast_name("Martinez");
        u.setRole("Administrador");
        u.setEmail("juan.martinez@gmail.com");
        u.setPhone("123456789");
        u.setStatus("Activo");
        u.setCreated_at("2020-01-01");  

        Usuario u2 = new Usuario();
        u2.setId("2");
        u2.setPassword("123457");
        u2.setName("Pedro");
        u2.setLast_name("Martinez");
        u2.setRole("Administrador");
        u2.setEmail("pedro.martinez@gmail.com");
        u2.setPhone("3205260116");
        u2.setStatus("Activo");
        u2.setCreated_at("2020-01-01"); 
        
        Usuario u3 = new Usuario();
        u3.setId("3");
        u3.setPassword("Carlos123458");
        u3.setName("Carlos");
        u3.setLast_name("Martinez");
        u3.setRole("Administrador");
        u3.setEmail("carlos.martinez@gmail.com");
        u3.setPhone("3205260116");
        u3.setStatus("Activo");
        u3.setCreated_at("2020-01-01"); 

        List<Usuario> listaUsuarios = Arrays.asList(u,u2,u3);
        modelo.addAttribute("usuarios", listaUsuarios);    
        modelo.addAttribute("alguien", u);        
        log.info("Ejecutando el controlador inicio MVC");
        return "index";
    }
}
