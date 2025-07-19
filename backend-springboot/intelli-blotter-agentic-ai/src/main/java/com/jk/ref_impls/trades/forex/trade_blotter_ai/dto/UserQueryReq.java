package com.jk.ref_impls.trades.forex.trade_blotter_ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.Map;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Query request from frontend with trade context")
public class UserQueryReq {

    @Schema(description = "Trader’s natural language query", example = "What’s our exposure in USD/EUR today?")
    private String userQuery;

    @Schema(description = "Trade identifier to fetch metadata", example = "T12345")
    private String tradeId;

    @Schema(description = "Additional context from blotter UI")
    private Map<String, String> context;
}
