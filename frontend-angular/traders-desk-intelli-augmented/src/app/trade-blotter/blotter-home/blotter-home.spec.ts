import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlotterHome } from './blotter-home';

describe('BlotterHome', () => {
  let component: BlotterHome;
  let fixture: ComponentFixture<BlotterHome>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [BlotterHome]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BlotterHome);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
