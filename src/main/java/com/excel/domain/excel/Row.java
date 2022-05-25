package com.excel.domain.excel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Row {
    @Id
    private Long id;
    
    private String cell1;
    private String cell2;
    private String cell3;
    private String cell4;
    private String cell5;
    private String cell6;
    private String cell7;
    private String cell8;
    private String cell9;
    private String cell10;

}
