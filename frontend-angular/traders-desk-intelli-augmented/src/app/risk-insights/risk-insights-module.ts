import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { RiskInsightsRoutingModule } from './risk-insights-routing-module';
import { RiskInsights } from './risk-insights';
import { RiskHome } from './risk-home/risk-home';


@NgModule({
  declarations: [
    RiskInsights,
    RiskHome
  ],
  imports: [
    CommonModule,
    RiskInsightsRoutingModule
  ]
})
export class RiskInsightsModule { }
