import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GovernanceLog } from './governance-log';

describe('GovernanceLog', () => {
  let component: GovernanceLog;
  let fixture: ComponentFixture<GovernanceLog>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [GovernanceLog]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GovernanceLog);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
