import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';

@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private s1:CustService) { }
  
  ngOnInit(): void {
  }
  insertcustdata(insertform:{value:any;})
{
    return this.s1.insertservice(insertform.value).subscribe();
}
}

