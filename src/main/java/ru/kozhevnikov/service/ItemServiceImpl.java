package ru.kozhevnikov.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kozhevnikov.domain.Item;
import ru.kozhevnikov.dto.ItemDTO;
import ru.kozhevnikov.repos.ItemRepo;

import java.time.LocalDateTime;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepo itemRepo;

    @Autowired
    public ItemServiceImpl(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    @Override
    public ItemDTO addItem(ItemDTO itemDTO) {

        return convertToItemDTO(
                itemRepo.save(
                        Item.builder()
                                //.id(itemDTO.getId())
                                .numberItem(itemDTO.getNumberItem())
                                .createDate(LocalDateTime.now())
                                .description(itemDTO.getDescription())
                                .build())
        );
    }

    @Override
    public boolean removeById(ItemDTO itemDTO) {
        itemRepo.deleteById(itemDTO.getId());
        return itemRepo.existsById(itemDTO.getId());
    }

    @Override

    public ItemDTO updateItem(ItemDTO itemDTO) {
        return convertToItemDTO(
                itemRepo.save(
                        Item.builder()
                                .id(itemDTO.getId())
                                .numberItem(itemDTO.getNumberItem())
                                .createDate(LocalDateTime.now())
                                .description(itemDTO.getDescription())
                                .build())
        );
    }

    private ItemDTO convertToItemDTO(Item item) {
        return ItemDTO.builder()
                .id(item.getId())
                .itemStatus(item.itemStatus)
                .numberItem(item.getNumberItem())
                .description(item.getDescription())
                .build();
    }
}
