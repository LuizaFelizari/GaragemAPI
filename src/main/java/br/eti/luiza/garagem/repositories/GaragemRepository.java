
package br.eti.luiza.garagem.repositories;

import br.eti.luiza.garagem.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GaragemRepository extends JpaRepository<Veiculo, Long> {

}