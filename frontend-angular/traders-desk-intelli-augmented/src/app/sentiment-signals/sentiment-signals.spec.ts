import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SentimentSignals } from './sentiment-signals';

describe('SentimentSignals', () => {
  let component: SentimentSignals;
  let fixture: ComponentFixture<SentimentSignals>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SentimentSignals]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SentimentSignals);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
