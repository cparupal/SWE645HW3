import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Information } from '../information.model';
import { SurveyService } from '../survey.service';

@Component({
  selector: 'app-listsurveys',
  templateUrl: './listsurveys.component.html',
  styleUrls: ['./listsurveys.component.scss']
})
export class ListSurveysComponent {

  public info: Array<Information>;
  constructor(private route: ActivatedRoute, private sService: SurveyService) { 
    this.info = [];
    sService.loadSurveys(this.setInfo, this);
  }

  setInfo(data: Array<Information>, component: ListSurveysComponent) {
    component.info = data;
  }

}
