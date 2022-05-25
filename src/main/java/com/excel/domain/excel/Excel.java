package com.excel.domain.excel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Excel {
    @Id
    private Long id;

    @OneToMany
    private List<Row> rows;

    private LocalDateTime createdAt;

}
