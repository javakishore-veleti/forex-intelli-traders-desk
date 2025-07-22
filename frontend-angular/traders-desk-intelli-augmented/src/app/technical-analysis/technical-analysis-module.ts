import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TechnicalAnalysisRoutingModule } from './technical-analysis-routing-module';
import { TechnicalAnalysis } from './technical-analysis';


@NgModule({
  declarations: [
    TechnicalAnalysis
  ],
  imports: [
    CommonModule,
    TechnicalAnalysisRoutingModule
  ]
})
export class TechnicalAnalysisModule { }
