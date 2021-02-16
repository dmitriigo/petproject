package com.example.databases.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "payments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    @Id
    @Column(name = "payment_id")
    private Integer id;

    private double amount;

    @ManyToOne
    @JoinTable(name = "users", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "from_user")})
    private User from;

}
