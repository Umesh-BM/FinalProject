import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  constructor(private s1 : CustService) { }

  ngOnInit(): void {
  }
  updatedata(updateform:{value:any;})
  {
      return this.s1.updateservice(updateform.value).subscribe();
  }

}
