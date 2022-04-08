package br.com.leandrofa1980.desafiomv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.leandrofa1980.desafiomv.entities.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long>{

}
