package ru.kozhevnikov.service;

import org.springframework.stereotype.Service;
import ru.kozhevnikov.dto.ItemDTO;

@Service
public interface ItemService {

    ItemDTO addItem(ItemDTO itemDTO);

    boolean removeById(ItemDTO itemDTO);

    ItemDTO updateItem(ItemDTO itemDTO);
}
