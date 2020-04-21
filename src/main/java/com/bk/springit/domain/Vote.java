package com.bk.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private int vote;
//    private User user;
//    @NonNull
//    private Link link;
}