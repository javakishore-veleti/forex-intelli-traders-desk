package com.jk.ref_impls.trades.forex.trade_blotter_ai.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@Data
@Table(name = "trade_line")
@Entity
public class TradeLineEntity extends BaseEntity {

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "from_currency")
    private String fromCurrency;

    @Column(name = "to_currency")
    private String toCurrency;

    @Column(name = "trade_dt")
    private LocalDateTime tradeDate;

    @Column(name = "trade_line_dt")
    private LocalDateTime tradeLineDate;

    @Column(name = "cancel_date")
    private LocalDateTime cancelDate;

    @Column(name = "status")
    private String status;
}
