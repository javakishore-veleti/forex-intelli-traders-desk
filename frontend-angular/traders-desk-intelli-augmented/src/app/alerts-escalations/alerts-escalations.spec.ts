import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AlertsEscalations } from './alerts-escalations';

describe('AlertsEscalations', () => {
  let component: AlertsEscalations;
  let fixture: ComponentFixture<AlertsEscalations>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [AlertsEscalations]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AlertsEscalations);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
