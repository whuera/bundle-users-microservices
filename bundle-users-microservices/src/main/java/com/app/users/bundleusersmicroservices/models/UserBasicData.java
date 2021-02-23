package com.app.users.bundleusersmicroservices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_basic_data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdUserData;
    private String typeIdentification;
    private String numberIdentification;
    private String genero;
    private int age;
}
