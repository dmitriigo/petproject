package com.example.databases.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name = "purses")
public class Purse {

    @Id
    @Column(name = "purse_id")
    private Integer id;

    private String currency;
}
