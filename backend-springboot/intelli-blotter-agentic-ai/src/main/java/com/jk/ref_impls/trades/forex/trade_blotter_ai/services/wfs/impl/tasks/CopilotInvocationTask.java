package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl.tasks;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.constants.AppWfConstants;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgentWfTask;
import org.springframework.stereotype.Component;

@Component(CopilotInvocationTask.BEAN_ID)
public class CopilotInvocationTask implements AgentWfTask {

    public static final String BEAN_ID = "copilotInvocationTask";

    @Override
    public int execute(UserQueryReq req, UserResp resp) {
        return AppWfConstants.SUCCESS;
    }
}
