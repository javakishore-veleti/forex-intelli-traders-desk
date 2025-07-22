import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TradeBlotterRoutingModule } from './trade-blotter-routing-module';
import { TradeBlotter } from './trade-blotter';
import { BlotterHome } from './blotter-home/blotter-home';


@NgModule({
  declarations: [
    TradeBlotter,
    BlotterHome
  ],
  imports: [
    CommonModule,
    TradeBlotterRoutingModule
  ]
})
export class TradeBlotterModule { }
