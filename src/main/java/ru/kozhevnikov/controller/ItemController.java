package ru.kozhevnikov.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kozhevnikov.service.ItemService;
import ru.kozhevnikov.dto.ItemDTO;

@Controller
@RequestMapping("/tracker")
@AllArgsConstructor
@Log
public class ItemController {

    private ItemService itemService;

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
    @GetMapping("/menu")
    public String main() {
        return "menu";
    }
    @GetMapping("/create")
    public String create(
    ) {
        return "create";
    }
    @GetMapping("/delete")
    public String delete(
    ) {
        return "delete";
    }
    @GetMapping("/update")
    public String update(
    ) {
        return "update";
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemDTO> createNewItem(@RequestBody ItemDTO itemDTO) {
        ItemDTO resItemDTO = itemService.addItem(itemDTO);
        return new ResponseEntity(resItemDTO, HttpStatus.OK);
    }


    @PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemDTO> removeById(@RequestBody ItemDTO itemDTO) {
        boolean delItemDTO = itemService.removeById(itemDTO);
        return new ResponseEntity(delItemDTO, HttpStatus.OK);
    }

    @PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ItemDTO> updateItem(@RequestBody ItemDTO itemDTO) {
        ItemDTO updateItemDTO = itemService.updateItem(itemDTO);
        return new ResponseEntity(updateItemDTO, HttpStatus.OK);
    }

//    @GetMapping("/greeting")
//    public String greeting(
//            @RequestParam(name="name", required=false, defaultValue="World") String name,
//            Map<String, Object> model
//    ) {
//        model.put("name", name);
//        return "greeting";
//    }
//    @GetMapping
//    public String main(Map<String, Object> model) {
//        Iterable<Item> item = itemRepo.findById(1);
//        model.put("messages", item);
//        return "main";
//    }
}
  /* @GetMapping("/create")
    public ItemDTO saveUsers(@RequestBody ItemDTO itemDTO) throws ValidationException {
        log.info("Handling save users: " + itemDTO);
        return itemService.addItem(itemDTO);
    }*/
  /* @PostMapping("/add")
    public ItemDTO addItem(@RequestBody ItemDTO itemDTO) throws ValidationException{
        log.info("123"+ itemDTO);
        return itemService.addItem(itemDTO);
    }*/