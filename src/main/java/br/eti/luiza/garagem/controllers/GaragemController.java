
package br.eti.luiza.garagem.controllers;

import br.eti.luiza.garagem.entities.Veiculo;
import br.eti.luiza.garagem.services.GaragemService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Veiculo> findById(@PathVariable Long id) {
        Optional<Veiculo> result = garagemService.findById(id);
        
        if(result.isPresent()){
            Veiculo veiculo = result.get();
            return ResponseEntity.ok(veiculo);
            
        } else {
            return ResponseEntity.notFound().build();
        }
 
    }

}
