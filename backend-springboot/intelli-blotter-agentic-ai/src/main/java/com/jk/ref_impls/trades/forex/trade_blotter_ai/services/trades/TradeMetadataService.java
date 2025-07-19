package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.trades;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;

public interface TradeMetadataService {

    int enrichTrade(UserQueryReq req, UserResp resp, UserQueryCtx userQueryCtx);
}
