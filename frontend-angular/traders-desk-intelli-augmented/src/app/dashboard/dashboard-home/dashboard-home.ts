import { Component } from '@angular/core';
import { MatCard } from "@angular/material/card";

@Component({
  selector: 'app-dashboard-home',
  templateUrl: './dashboard-home.html',
  styleUrls: ['./dashboard-home.scss'],
  imports: [MatCard]
})
export class DashboardHome {
  displayedColumns: string[] = ['symbol', 'position', 'pnl'];
  dataSource = [
    { symbol: 'AAPL', position: 120, pnl: '+$1,240' },
    { symbol: 'TSLA', position: 50, pnl: '-$320' },
    { symbol: 'GOOG', position: 75, pnl: '+$980' }
  ];
}
