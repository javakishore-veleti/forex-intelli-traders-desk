import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GovernanceLogRoutingModule } from './governance-log-routing-module';
import { GovernanceLog } from './governance-log';


@NgModule({
  declarations: [
    GovernanceLog
  ],
  imports: [
    CommonModule,
    GovernanceLogRoutingModule
  ]
})
export class GovernanceLogModule { }
