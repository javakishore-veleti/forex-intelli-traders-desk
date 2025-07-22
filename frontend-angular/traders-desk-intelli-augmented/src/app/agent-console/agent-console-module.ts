import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AgentConsoleRoutingModule } from './agent-console-routing-module';
import { AgentConsole } from './agent-console';


@NgModule({
  declarations: [
    AgentConsole
  ],
  imports: [
    CommonModule,
    AgentConsoleRoutingModule
  ]
})
export class AgentConsoleModule { }
