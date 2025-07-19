package com.jk.ref_impls.trades.forex.trade_blotter_ai.brokers;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.constants.AppWfConstants;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import org.springframework.stereotype.Component;

@Component
public class CopilotInvocationServiceImpl implements CopilotInvocationService {

    public int execute(UserQueryReq req, UserResp resp, UserQueryCtx ctx) {
        return AppWfConstants.SUCCESS;
    }
}
