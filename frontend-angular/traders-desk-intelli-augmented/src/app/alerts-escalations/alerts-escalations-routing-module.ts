import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AlertsEscalations } from './alerts-escalations';

const routes: Routes = [{ path: '', component: AlertsEscalations }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AlertsEscalationsRoutingModule { }
