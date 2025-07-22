import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardHome } from './dashboard-home/dashboard-home';
import { DashboardRoutingModule } from './dashboard-routing-module';

@NgModule({
  imports: [
    CommonModule,
    DashboardRoutingModule,
    DashboardHome 
  ]
})
export class DashboardModule {}
