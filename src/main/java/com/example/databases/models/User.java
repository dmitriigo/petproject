package com.example.databases.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "user_id")
    private Integer id;

    private String country;

    private String name;

   /* @ManyToMany(fetch = FetchType.EAGER)
    private List<Purse> purses;*/

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "from", targetEntity = Payment.class)
    private List<Payment> paymentsFrom;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "to", targetEntity = Payment.class)
    private List<Payment> paymentsTo;

}
