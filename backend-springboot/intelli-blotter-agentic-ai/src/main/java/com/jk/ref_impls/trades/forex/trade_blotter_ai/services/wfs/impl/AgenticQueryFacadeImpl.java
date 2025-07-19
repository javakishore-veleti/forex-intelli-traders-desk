package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.config.AppApplnCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgentWfTask;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgenticQueryFacade;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl.tasks.CopilotInvocationTask;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl.tasks.EnrichmentTask;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenticQueryFacadeImpl implements AgenticQueryFacade {

    @Autowired
    AppApplnCtx appApplnCtx;

    @Autowired
    private List<AgentWfTask> tasks;

    @Override
    public UserResp execute(UserQueryReq queryReq, UserResp userResp, UserQueryCtx userQueryCtx) {
        tasks.forEach(task -> task.execute(queryReq, userResp, userQueryCtx));
        return userResp;
    }

    @PostConstruct
    public void setup() {
        tasks.add(AppApplnCtx.getInstance().getAppCtx().getBean(EnrichmentTask.BEAN_ID, AgentWfTask.class));
        tasks.add(AppApplnCtx.getInstance().getAppCtx().getBean(CopilotInvocationTask.BEAN_ID, AgentWfTask.class));
    }
}
