package com.touzani.voitureservice.entities;


import lombok.*;

@Getter @Setter
@Builder
@NoArgsConstructor @AllArgsConstructor
public class Client {

    private Long id;
    private String nom;
    private String prenom;
    private Float age;
}
