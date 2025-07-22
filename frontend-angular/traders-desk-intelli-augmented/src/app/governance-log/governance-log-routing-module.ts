import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GovernanceLog } from './governance-log';

const routes: Routes = [{ path: '', component: GovernanceLog }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GovernanceLogRoutingModule { }
