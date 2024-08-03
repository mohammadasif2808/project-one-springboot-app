package in.asif.mohammad.projectone.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a menu item in the application, holding details about the menu option.
 */
@Entity
@Getter
@Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Title must not be blank")
    private String title;
    @NotBlank(message = "URL must not be blank")
    private String url;
}