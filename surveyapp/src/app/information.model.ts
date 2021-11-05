export class Information {
  constructor(
    public informationId?: number,
    public firstName?: string,
    public lastName?: string,
    public streetAddress?: string,
    public city?: string,
    public state?: string,
    public zip?: string,
    public telephoneNumber?: string,
    public email?: string,
    public dateOfSurvey?: string,
    public likedStudents?: string,
    public likedLocation?: string,
    public likedCampus?: string,
    public likedAtmosphere?: string,
    public likedDormRooms?: string,
    public likedSports?: string,
    public interestedBy?: string,
    public schoolRecommendation?: string,
    public raffleEntry?: string,
    public additionalComments?: string
  ) {}
}
