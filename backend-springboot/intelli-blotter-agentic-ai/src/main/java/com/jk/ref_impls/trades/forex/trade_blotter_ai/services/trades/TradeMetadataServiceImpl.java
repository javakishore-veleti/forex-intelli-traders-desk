package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.trades;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.constants.AppWfConstants;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.model.TradeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.LinkedHashMap;

@Component
public class TradeMetadataServiceImpl implements TradeMetadataService {

    @Autowired
    private TradeService tradeService;


    @Override
    public int enrichTrade(UserQueryReq req, UserResp resp, UserQueryCtx userQueryCtx) {
        TradeEntity trade = tradeService.findById(req.getTradeId())
                .orElseThrow(() -> new RuntimeException("Trade not found: " + req.getTradeId()));

        Map<String, String> metadata = new LinkedHashMap<>();
        metadata.put("tradeId", trade.getId());
        metadata.put("customerId", trade.getCustomerId());
        metadata.put("tradingBook", trade.getTradingBook());
        metadata.put("status", trade.getStatus());
        metadata.put("tradeDate", trade.getTradeDate().toString());

        if (trade.getCancelDate() != null) {
            metadata.put("cancelDate", trade.getCancelDate().toString());
        }

        return AppWfConstants.SUCCESS;
    }
}
