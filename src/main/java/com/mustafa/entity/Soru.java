package com.mustafa.entity;

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
@Table(name = "tbl_soru")
public class Soru {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "soru") // soru
    Long unluBilgileriId;
    @Column(name = "cevap_id")
    Long unluKisiId;
    String puan;
    String  sure;
    @ManyToOne
    Yarisma yarisma;

}
