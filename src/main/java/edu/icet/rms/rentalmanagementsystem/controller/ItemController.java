package edu.icet.rms.rentalmanagementsystem.controller;

import edu.icet.rms.rentalmanagementsystem.dto.Item;
import edu.icet.rms.rentalmanagementsystem.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping("/save")
    void persist(@RequestBody Item item) {
        itemService.addItem(item);
    }

    @PutMapping("/update")
    void updateItem(@RequestBody Item item) {
        itemService.updateItem(item);
    }

    @DeleteMapping("/remove")
    void deleteItem(@RequestBody Item item) {
        itemService.deleteItem(item);
    }

    @GetMapping("/byId")
    Item findById(@RequestParam Long id) {
        return itemService.findById(id);
    }

    @GetMapping("/items")
    List<Item> findAll(){
       return itemService.getAllItems();
    }
}
