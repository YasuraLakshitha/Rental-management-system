package edu.icet.rms.rentalmanagementsystem.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.rms.rentalmanagementsystem.dto.Item;
import edu.icet.rms.rentalmanagementsystem.entity.ItemEntity;
import edu.icet.rms.rentalmanagementsystem.repository.ItemRepository;
import edu.icet.rms.rentalmanagementsystem.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    private final ObjectMapper mapper;

    @Override
    public void addItem(Item item) {
        Objects.requireNonNull(item,()->{
            throw new IllegalStateException("Item cannot be null");
        } );
        repository.save(mapper.convertValue(item, ItemEntity.class));
    }

    @Override
    public void updateItem(Item item) {
        repository.save(mapper.convertValue(item, ItemEntity.class));
    }

    @Override
    public void deleteItem(Item item) {
        repository.delete(mapper.convertValue(item, ItemEntity.class));
    }

    @Override
    public Item findById(Long id) {
        Objects.requireNonNull(id,()->{
            throw new IllegalStateException("Id cannot be null");
        } );
        return mapper.convertValue(repository.findById(id), Item.class);
    }

    @Override
    public List<Item> getAllItems() {
        return repository.findAll().stream()
                .map(itemEntity -> mapper.convertValue(itemEntity, Item.class))
                .toList();
    }
}
