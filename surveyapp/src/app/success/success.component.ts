import { HttpResponse } from "@angular/common/http";
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute, Router } from "@angular/router";
import { Information } from "../information.model";
import { SurveyService } from "../survey.service";

@Component({
  selector: "app-success",
  templateUrl: "./success.component.html",
  styleUrls: ["./success.component.scss"],
})
export class SuccessComponent {
  public info: Information;

  constructor(private route: ActivatedRoute, private sService: SurveyService) {
    this.info = this.route.snapshot.params;
  }

  processRequest(response: HttpResponse<Information>) {
    if (response.body != null && response.ok) {
        this.info = response.body;
    }
  }
}
