package com.bk.springit.model;

import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@ToString
public class Vote {

    @Id
    @GeneratedValue
    private Long id;
    private int vote;
//    private User user;
    private Link link;
}