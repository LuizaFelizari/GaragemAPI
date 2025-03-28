
package br.eti.luiza.garagem.controllers;

import br.eti.luiza.garagem.entities.Veiculo;
import br.eti.luiza.garagem.services.GaragemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    
    @GetMapping("/garagem")
    public List<Veiculo> findAll() {
        List<Veiculo> result = garagemService.findAll();
        return result;
    }
}
