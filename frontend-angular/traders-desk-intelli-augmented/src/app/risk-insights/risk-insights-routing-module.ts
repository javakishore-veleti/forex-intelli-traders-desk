import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RiskHome } from './risk-home/risk-home';

const routes: Routes = [
  { path: '', component: RiskHome }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class RiskInsightsRoutingModule {}
