package com.jk.ref_impls.trades.forex.trade_blotter_ai.brokers;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;

public interface CopilotInvocationService {

    int execute(UserQueryReq req, UserResp resp, UserQueryCtx ctx);
}
