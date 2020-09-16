package ru.kozhevnikov.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kozhevnikov.domain.ItemStatus;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDTO {

    private Integer id;

    private Integer numberItem;

    private String description;

    private ItemStatus itemStatus;

    private LocalDateTime createDate;

    private LocalDateTime closeDate;


}
