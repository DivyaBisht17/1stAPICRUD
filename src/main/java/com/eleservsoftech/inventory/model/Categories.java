package com.eleservsoftech.inventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table( name="categories")
@DynamicUpdate
@DynamicInsert
public class Categories  {
    @Id
    private Long c_id;
   // @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String name;
    private Timestamp created_At;
    private Timestamp modified_at;
    private String created_by;
    private String Last_Modified_by;
    private Boolean isdelete;


}
