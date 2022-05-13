package recipes.repos;

import org.springframework.data.repository.CrudRepository;
import recipes.models.Recipe;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {

}
