package in.asif.mohammad.projectone.example.repository;

import in.asif.mohammad.projectone.example.model.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for {@link Menu} entities. Provides basic CRUD operations inherited from CrudRepository.
 */
@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {
    /**
     * Finds a list of menus by their title.
     * @param title the title of the menu
     * @return iterable collection of menus matching the title
     */
    Iterable<Menu> findByTitle(String title);
}
