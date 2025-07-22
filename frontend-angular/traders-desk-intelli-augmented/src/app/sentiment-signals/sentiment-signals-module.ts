import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { SentimentSignalsRoutingModule } from './sentiment-signals-routing-module';
import { SentimentSignals } from './sentiment-signals';


@NgModule({
  declarations: [
    SentimentSignals
  ],
  imports: [
    CommonModule,
    SentimentSignalsRoutingModule
  ]
})
export class SentimentSignalsModule { }
