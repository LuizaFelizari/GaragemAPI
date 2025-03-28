
package br.eti.luiza.garagem.services;

import br.eti.luiza.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.luiza.garagem.repositories.GaragemRepository;

@Service
public class GaragemService {

    @Autowired
    private GaragemRepository garagemRepository;

    public List<Veiculo> findAll() {

        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }

    public List<Veiculo> findById(long id) {
        List<Veiculo> result = garagemRepository.findById(id);
        return result;
    }

}
