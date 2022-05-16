package recipes.models;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // no cascade here, if we delete notes, recipe stays
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
