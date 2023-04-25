import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { InsertComponent } from './insert/insert.component';
import { UpdateComponent } from './update/update.component';
import { DeleteComponent } from './delete/delete.component';
import { HomeComponent } from './home/home.component';
import { ViewdataComponent } from './viewdata/viewdata.component';
import { ImageComponent } from './image/image.component';

const routes: Routes = [ { path:'', redirectTo:'image', pathMatch: 'full'},
{path:'home', component:HomeComponent},
{path:'insert', component:InsertComponent},
{path:'update', component:UpdateComponent},
{path:'delete', component:DeleteComponent},
{path:'viewdata', component:ViewdataComponent},
{path:'image', component:ImageComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
