import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserContextRoutingModule } from './user-context-routing-module';
import { UserContext } from './user-context';


@NgModule({
  declarations: [
    UserContext
  ],
  imports: [
    CommonModule,
    UserContextRoutingModule
  ]
})
export class UserContextModule { }
