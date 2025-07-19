package com.jk.ref_impls.trades.forex.trade_blotter_ai.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Data
@MappedSuperclass
public class BaseEntity {

    @Id
    private String id;

    private LocalDateTime createdDt;
    private LocalDateTime updatedDt;
    private String createdBy;
    private String updatedBy;
}
