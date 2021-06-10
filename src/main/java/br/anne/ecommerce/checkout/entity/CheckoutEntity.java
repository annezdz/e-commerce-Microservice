package br.anne.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@Data
@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    @Column
    private String code;

}
