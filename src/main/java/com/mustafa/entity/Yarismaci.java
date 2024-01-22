package com.mustafa.entity;

import com.mustafa.entity.enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarismaci")
public class Yarismaci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column( name = "ad_soyad", nullable = false,length = 150 )
    String ad;
    String username;
    String avatarURL;
    String email;
    @Enumerated
    Cinsiyet cinsiyet;
    @ManyToOne
    Yarisma yarisma;
}
