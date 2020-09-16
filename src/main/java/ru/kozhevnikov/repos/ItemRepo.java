package ru.kozhevnikov.repos;

import org.springframework.data.repository.CrudRepository;
import ru.kozhevnikov.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepo extends CrudRepository<Item, Integer> {

    Optional<Item> findById(Integer id);

    Optional<Item> findByNumberItem(Integer numberItem);

    List<Item> findItemsByDescription(String description);

    List<Item> findItemsByItemStatus(String itemStatus);

    List<Item> findItemsByCreateDate(String createDate);

    List<Item> findItemsByCloseDate(String closeDate);

}
