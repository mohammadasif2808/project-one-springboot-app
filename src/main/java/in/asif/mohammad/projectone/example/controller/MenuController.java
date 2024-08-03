package in.asif.mohammad.projectone.example.controller;

import in.asif.mohammad.projectone.example.model.Menu;
import in.asif.mohammad.projectone.example.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuController(MenuRepository pageRepository) {
        this.menuRepository = pageRepository;
    }

    @GetMapping("/menu")
    public ResponseEntity<Iterable<Menu>> getAllMenus() {
        Iterable<Menu> menus = menuRepository.findAll();
        return ResponseEntity.ok(menus);
    }

    @PostMapping("/menu")
    public ResponseEntity<String> saveMenu(@RequestBody Menu menu) {
        menuRepository.save(menu);
        return ResponseEntity.status(HttpStatus.CREATED).body("Menu Added Successfully");
    }

}
