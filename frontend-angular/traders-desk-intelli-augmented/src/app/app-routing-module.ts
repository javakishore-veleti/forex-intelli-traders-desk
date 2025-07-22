import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [{ path: 'dashboard', loadChildren: () => import('./dashboard/dashboard-module').then(m => m.DashboardModule) }, { path: 'trade-blotter', loadChildren: () => import('./trade-blotter/trade-blotter-module').then(m => m.TradeBlotterModule) }, { path: 'risk-insights', loadChildren: () => import('./risk-insights/risk-insights-module').then(m => m.RiskInsightsModule) }, { path: 'technical-analysis', loadChildren: () => import('./technical-analysis/technical-analysis-module').then(m => m.TechnicalAnalysisModule) }, { path: 'agent-console', loadChildren: () => import('./agent-console/agent-console-module').then(m => m.AgentConsoleModule) }, { path: 'alerts-escalations', loadChildren: () => import('./alerts-escalations/alerts-escalations-module').then(m => m.AlertsEscalationsModule) }, { path: 'sentiment-signals', loadChildren: () => import('./sentiment-signals/sentiment-signals-module').then(m => m.SentimentSignalsModule) }, { path: 'governance-log', loadChildren: () => import('./governance-log/governance-log-module').then(m => m.GovernanceLogModule) }, { path: 'user-context', loadChildren: () => import('./user-context/user-context-module').then(m => m.UserContextModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
