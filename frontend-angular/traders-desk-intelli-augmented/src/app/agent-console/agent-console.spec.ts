import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AgentConsole } from './agent-console';

describe('AgentConsole', () => {
  let component: AgentConsole;
  let fixture: ComponentFixture<AgentConsole>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AgentConsole]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AgentConsole);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
