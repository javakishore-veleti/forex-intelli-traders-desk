package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.trades;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.TradeEntity;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.repository.TradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Override
    public Optional<TradeEntity> findById(String tradeId) {
        return tradeRepository.findById(tradeId);
    }
}
