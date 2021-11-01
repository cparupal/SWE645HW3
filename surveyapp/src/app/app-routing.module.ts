import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { HomeComponent } from "./home/home.component";
import { ListSurveysComponent } from "./listsurveys/listsurveys.component";
import { SuccessComponent } from "./success/success.component";
import { SurveyComponent } from "./survey/survey.component";

const routes: Routes = [
  {
    path: "successful-survey",
    component: SuccessComponent,
  },
  {
    path: "list-surveys",
    component: ListSurveysComponent,
  },
  {
    path: "survey",
    component: SurveyComponent,
  },
  {
    path: "",
    component: HomeComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
