package com.jk.ref_impls.trades.forex.trade_blotter_ai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Data
@Table(name = "customer")
@Entity
public class CustomerEntity extends BaseEntity {

    @Column(name = "customer_type", nullable = false)
    private String customerType;

    @Column(name = "status")
    private String status;

}
