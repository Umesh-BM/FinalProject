import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';

@Component({
  selector: 'app-viewdata',
  templateUrl: './viewdata.component.html',
  styleUrls: ['./viewdata.component.css']
})
export class ViewdataComponent implements OnInit {

  data:any;
  constructor(private s1:CustService) { }

  ngOnInit(): void 
  {
    let response = this.s1.viewservice();
    response.subscribe((data1)=>this.data=data1)
    
  }

}
