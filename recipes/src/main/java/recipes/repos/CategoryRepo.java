package recipes.repos;

import org.springframework.data.repository.CrudRepository;
import recipes.models.Category;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
