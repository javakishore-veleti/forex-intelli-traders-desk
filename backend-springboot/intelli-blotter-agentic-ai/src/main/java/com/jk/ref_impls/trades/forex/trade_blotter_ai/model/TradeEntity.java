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
@Table(name = "trade")
@Entity
public class TradeEntity  extends BaseEntity {

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "trading_book")
    private String tradingBook;

    @Column(name = "status")
    private String status;

    private LocalDateTime tradeDate;
    private LocalDateTime cancelDate;
}
