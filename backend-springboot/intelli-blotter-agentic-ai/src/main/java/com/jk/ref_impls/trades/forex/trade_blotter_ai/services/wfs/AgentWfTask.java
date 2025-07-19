package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;

public interface AgentWfTask {

    int execute(UserQueryReq req, UserResp resp);
}
