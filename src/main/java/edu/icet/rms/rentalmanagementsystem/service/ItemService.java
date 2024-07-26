package edu.icet.rms.rentalmanagementsystem.service;

import edu.icet.rms.rentalmanagementsystem.dto.Item;

import java.util.List;

public interface ItemService {
    void addItem(Item item);
    void updateItem(Item item);
    void deleteItem(Item item);
    Item findById(Long id);
    List<Item> getAllItems();
}
