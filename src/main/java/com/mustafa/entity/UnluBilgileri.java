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
@Table(name = "tbl_unlu_bilgileri")
public class UnluBilgileri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;
    Integer yas;
    String meslek;
    String boy;
    String memleket;
    String sacTipi;
    String sacRengi;
    Boolean gozlukTakiyorMu;
    @Column(length = 800)
    String ipucu;
    Long unluKisiId;



}
