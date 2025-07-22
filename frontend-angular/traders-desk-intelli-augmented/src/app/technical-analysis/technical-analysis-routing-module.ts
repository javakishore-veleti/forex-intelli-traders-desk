import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TechnicalAnalysis } from './technical-analysis';

const routes: Routes = [{ path: '', component: TechnicalAnalysis }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TechnicalAnalysisRoutingModule { }
