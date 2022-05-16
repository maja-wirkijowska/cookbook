package recipes.repos;

import org.springframework.data.repository.CrudRepository;
import recipes.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepo extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);

}
