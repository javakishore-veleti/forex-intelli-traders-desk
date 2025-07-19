package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl.tasks;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.constants.AppWfConstants;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgentWfTask;
import org.springframework.stereotype.Component;

@Component(EnrichmentTask.BEAN_ID)
public class EnrichmentTask implements AgentWfTask {

    public static final String BEAN_ID = "enrichmentTask";

    @Override
    public int execute(UserQueryReq req, UserResp resp) {
        return AppWfConstants.SUCCESS;
    }
}
