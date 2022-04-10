package br.com.leandrofa1980.desafiomv.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.leandrofa1980.desafiomv.dto.OptCollaboratorDTO;
import br.com.leandrofa1980.desafiomv.entities.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long>{
	
	@Modifying
	@Query("SELECT new br.com.leandrofa1980.desafiomv.dto.OptCollaboratorDTO(obj.collaborator, obj.breakfastChoice) "
			+ "FROM Option AS obj GROUP BY obj.collaborator, obj.breakfastChoice")
	List<OptCollaboratorDTO> breakfastChoiceGroup();

}
