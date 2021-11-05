import { Component } from '@angular/core';
import { SurveyService } from './survey.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'angularK8ReadyStudentSurvey';
  
  constructor(private sService: SurveyService, private router: Router){ }

}
