package com.jk.ref_impls.trades.forex.trade_blotter_ai.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.util.Map;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Response containing Copilot-generated insight and enriched trade context")
public class UserResp {
    @Schema(description = "Insight or recommendation from Copilot", example = "Trade shows PnL of +3.2K, recommend hedge due to volatility")
    private String copilotInsight;

    @Schema(description = "Metadata enriched during query handling")
    private Map<String, Object> enrichedContext;
}
