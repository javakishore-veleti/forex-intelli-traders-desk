package com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.impl;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgenticQueryFacade;
import org.springframework.stereotype.Service;

@Service
public class AgenticQueryFacadeImpl implements AgenticQueryFacade {

    @Override
    public UserResp execute(UserQueryReq queryReq, UserResp userResp) {
        return null;
    }
}
