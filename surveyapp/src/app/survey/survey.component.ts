import { HttpResponse } from "@angular/common/http";
import { Component } from "@angular/core";
import {
  FormBuilder,
  FormControl,
  FormGroup,
  Validators,
} from "@angular/forms";
import { Router } from "@angular/router";
import { Information } from "../information.model";
import { SurveyService } from "../survey.service";

@Component({
  selector: "app-survey",
  templateUrl: "./survey.component.html",
  styleUrls: ["./survey.component.scss"],
})
export class SurveyComponent {
  constructor(private sService: SurveyService, private router: Router) {}

  onClickSubmit(data: any) {
    this.sService.sendSurvey(data, this.processRequest, this.router);
  }

  processRequest(response: HttpResponse<Information>, router: Router) {
    if (response.body != null) {
      if (response.ok) {
        router.navigate(["successful-survey", response.body]);
      } else {
        router.navigate(["error-survey"]);
      }
    }
  }
}
