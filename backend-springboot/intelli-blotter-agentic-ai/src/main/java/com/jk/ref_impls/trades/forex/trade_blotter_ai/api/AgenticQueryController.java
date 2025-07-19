package com.jk.ref_impls.trades.forex.trade_blotter_ai.api;

import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryCtx;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserQueryReq;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.dto.UserResp;
import com.jk.ref_impls.trades.forex.trade_blotter_ai.services.wfs.AgenticQueryFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
@RequestMapping("/api/forex/trade-blotter/ai/v1/agentic")
@Tag(name = "Agentic Intelligence", description = "Endpoints for agentic AI trade query orchestration")
public class AgenticQueryController {

    @Autowired
    private AgenticQueryFacade agenticQueryFacade;

    @Operation(summary = "Submit a natural language query", description = "Augments the query with trade context and invokes Copilot to generate insight")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Copilot insight returned successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid request format"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @PostMapping("/query")
    public ResponseEntity<UserResp> handleAgenticQuery(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Natural language query with optional trade context",
                    required = true
            )
            @RequestBody UserQueryReq request
    ) {

        UserResp response = new UserResp();
        UserQueryCtx userQueryCtx = new UserQueryCtx();

        agenticQueryFacade.execute(request, response, userQueryCtx);


        return ResponseEntity.ok(response);
    }
}
