package ru.kozhevnikov.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer numberItem;

    @Column
    private String description;

    @Column
    public ItemStatus itemStatus;

    @Column
    public LocalDateTime createDate;

    @Column
    public LocalDateTime closeDate;

//    public Item() {
//    }
//
//    public Item(Integer id, Integer numberItem, String description) {
//        this.numberItem = numberItem;
//        this.id = id;
//        this.description = description;
//        this.createDate = LocalDateTime.now();
//        this.itemStatus = ItemStatus.CREATED;
//    }


//    public int getNumberItem() {
//        return numberItem;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public ItemStatus getItemStatus() {
//        return itemStatus;
//    }
//
//    public LocalDateTime getCreateDate() {
//        return createDate;
//    }
//
//    public LocalDateTime getCloseDate() {
//        return closeDate;
//    }
//
//    public void setNumberItem(Integer numberItem) {
//        this.numberItem = numberItem;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setItemStatus(ItemStatus itemStatus) {
//        this.itemStatus = itemStatus;
//    }
//
//    @Override
//    public String toString() {
//        return "Item{" +
//                "Id=" + id +
//                ", numberItem=" + numberItem +
//                ", description='" + description + '\'' +
//                ", itemStatus=" + itemStatus +
//                ", createDate=" + createDate +
//                ", closeDate=" + closeDate +
//                '}';
//    }
}

