
package br.eti.luiza.garagem.services;

import br.eti.luiza.garagem.DTO.VeiculoMinDTO;
import br.eti.luiza.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.eti.luiza.garagem.repositories.GaragemRepository;
import java.util.Optional;

@Service
public class GaragemService {

    @Autowired
    private GaragemRepository garagemRepository;

    public List<Veiculo> findAll() {

        List<Veiculo> result = garagemRepository.findAll();
        return result;
    }

    public Optional<Veiculo> findById(long id) {
        Optional<Veiculo> result = garagemRepository.findById(id);
        return result;
    }

    public List<VeiculoMinDTO> findByColor(String cor) {
        List<Veiculo> resultGaragem = garagemRepository.findByCorIgnoreCase(cor);
      
        List<VeiculoMinDTO> resultDTO = resultGaragem.stream()
                .map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
    }
    
    public List<VeiculoMinDTO> findByYear(String ano) {
        List<Veiculo> resultGaragem = garagemRepository.findByAnoIgnoreCase(ano);
        
        List<VeiculoMinDTO> resultDTO = resultGaragem.stream()
                .map(x -> new VeiculoMinDTO(x)).toList();
        
        return resultDTO;
    }
}

