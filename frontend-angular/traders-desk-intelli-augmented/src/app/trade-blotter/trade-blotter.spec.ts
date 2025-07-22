import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TradeBlotter } from './trade-blotter';

describe('TradeBlotter', () => {
  let component: TradeBlotter;
  let fixture: ComponentFixture<TradeBlotter>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TradeBlotter]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TradeBlotter);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
