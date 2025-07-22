import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BlotterHome } from './blotter-home/blotter-home';

const routes: Routes = [
  { path: '', component: BlotterHome }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class TradeBlotterRoutingModule {}
