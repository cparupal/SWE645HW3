import {
  HttpClient,
  HttpErrorResponse,
  HttpParams,
} from "@angular/common/http";
import { Injectable } from "@angular/core";
import {
  ActivatedRouteSnapshot,
  Resolve,
  Router,
  RouterStateSnapshot,
} from "@angular/router";
import { environment } from "src/environments/environment.prod";

@Injectable({
  providedIn: "root",
})
export class SurveyService {
  constructor(private client: HttpClient) {}

  sendSurvey(data: any, callback: Function, router: Router) {
    var apiUrl: string = "http://3.88.211.147//surveys/surveyForm";

    this.client
      .post(
        apiUrl,
        this.genBody(data),
        {
          headers: {
            "Access-Control-Allow-Methods": "OPTIONS,POST,GET",
            "Content-Type": "application/json",
            "Access-Control-Allow-Headers" : "Content-Type",
            "Access-Control-Allow-Origin": "http://localhost:4200/",
          },
          observe: "response",
          responseType: "json",
        }
      )
      .pipe()
      .subscribe(
        (res) => {
          callback(res.clone(), router);
        },
        (err) => {
          this.handleError(err);
        }
      );
    //
  }

  loadSurveys(callback: Function, component: any) {
    var apiUrl: string = "http://3.88.211.147/surveys/surveyForms";
    this.client
      .get(
        apiUrl,
        {
          headers: {
            "Access-Control-Allow-Methods": "OPTIONS,POST,GET",
            "Content-Type": "application/json",
            "Access-Control-Allow-Headers" : "Content-Type",
            "Access-Control-Allow-Origin": "http://localhost:4200/",
          },
          observe: "response",
          responseType: "json",
        }
      )
      .pipe()
      .subscribe(
        (res) => {
          callback(res.clone().body, component);
        },
        (err) => {
          this.handleError(err);
        }
      );
  }

  private genBody(data: any) {
    //console.log(data);
    if(data.likedStudents == ""){
      data.likedStudents = false;
    }
    if(data.likedLocation == ""){
      data.likedLocation = false;
    }
    if(data.likedCampus == ""){
      data.likedCampus = false;
    }
    if(data.likedAtmosphere == ""){
      data.likedAtmosphere = false;
    }
    if(data.likedDormRooms == ""){
      data.likedDormRooms = false;
    }
    if(data.likedSports == ""){
      data.likedSports = false;
    }
    /*var params: HttpParams = new HttpParams()
      .set("firstName", data.firstName)
      .set("lastName", data.lastName)
      .set("streetAddress", data.streetAddress)
      .set("city", data.city)
      .set("state", data.state)
      .set("zip", data.zip)
      .set("telephoneNumber", data.telephoneNumber)
      .set("email", data.email)
      .set("dateOfSurvey", data.dateOfSurvey)
      .set("likedStudents", data.likedStudents)
      .set("likedLocation", data.likedLocation)
      .set("likedCampus", data.likedCampus)
      .set("likedAtmosphere", data.likedAtmosphere)
      .set("likedDormRooms", data.likedDormRooms)
      .set("likedSports", data.likedSports)
      .set("interestedBy", data.interestedBy)
      .set("schoolRecommendation", data.schoolRecommendation)
      .set("raffleEntry", data.raffleEntry)
      .set("additionalComments", data.additionalComments);
      console.log("data: " + data); */
      var jsonObjData: any = <JSON>data;
      return JSON.stringify(jsonObjData);
      //return params;
  }

  private handleError(error: HttpErrorResponse) {
    if (error.status === 0) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error("An error occurred:", error.error);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong.
      console.error(
        `Backend returned code ${error.status}, body was: `,
        error.error
      );
    }
    // Return an observable with a user-facing error message.
    return alert("Something bad happened; please try again later.");
  }
}
