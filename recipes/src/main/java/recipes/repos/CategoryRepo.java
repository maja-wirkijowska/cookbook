package recipes.repos;

import org.springframework.data.repository.CrudRepository;
import recipes.models.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
