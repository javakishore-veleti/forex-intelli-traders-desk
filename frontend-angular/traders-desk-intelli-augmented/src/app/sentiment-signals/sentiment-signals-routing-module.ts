import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SentimentSignals } from './sentiment-signals';

const routes: Routes = [{ path: '', component: SentimentSignals }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class SentimentSignalsRoutingModule { }
