import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RiskHome } from './risk-home';

describe('RiskHome', () => {
  let component: RiskHome;
  let fixture: ComponentFixture<RiskHome>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [RiskHome]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RiskHome);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
