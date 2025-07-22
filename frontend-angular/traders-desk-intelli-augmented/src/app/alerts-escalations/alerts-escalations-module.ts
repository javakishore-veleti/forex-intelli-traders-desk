import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AlertsEscalationsRoutingModule } from './alerts-escalations-routing-module';
import { AlertsEscalations } from './alerts-escalations';


@NgModule({
  declarations: [
    AlertsEscalations
  ],
  imports: [
    CommonModule,
    AlertsEscalationsRoutingModule
  ]
})
export class AlertsEscalationsModule { }
