package cl.securityApp.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.securityApp.models.User;
import cl.securityApp.services.UserServiceImpl;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserApiRestController {
	
	@Autowired
    private final UserServiceImpl userServiceImpl;


    @RequestMapping("/obtener/usuario")
    public Optional<User> obtenerUsuario(@RequestParam(value="id",required = true) Long id) {
        return userServiceImpl.getUserById(id);
    }

}
