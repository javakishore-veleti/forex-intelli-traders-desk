package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.trades;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.TradeEntity;

import java.util.Optional;

public interface TradeService {
    Optional<TradeEntity> findById(String tradeId);
}
