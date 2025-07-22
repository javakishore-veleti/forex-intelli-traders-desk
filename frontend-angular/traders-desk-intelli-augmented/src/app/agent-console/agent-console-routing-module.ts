import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AgentConsole } from './agent-console';

const routes: Routes = [{ path: '', component: AgentConsole }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AgentConsoleRoutingModule { }
