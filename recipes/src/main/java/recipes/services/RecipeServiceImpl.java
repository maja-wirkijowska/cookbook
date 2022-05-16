package recipes.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import recipes.repos.RecipeRepo;
import recipes.models.Recipe;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepo recipeRepository;

    public RecipeServiceImpl(RecipeRepo recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("I'm in the RecipeServiceImpl");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
