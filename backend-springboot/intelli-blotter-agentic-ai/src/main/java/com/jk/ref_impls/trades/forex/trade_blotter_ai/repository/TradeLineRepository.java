package com.jk.ref_impls.trades.forex.trade_blotter_ai.repository;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.TradeEntity;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.TradeLineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeLineRepository extends CrudRepository<TradeLineEntity, String> {
}
