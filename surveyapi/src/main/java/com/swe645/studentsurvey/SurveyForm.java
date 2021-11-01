package com.swe645.studentsurvey;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SurveyForm {
	//Fields of SurveyForm
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private Integer zip;
	private String telephoneNumber;
	private String email;
	private LocalDate dateOfSurvey;

	// non-required fields
	private Boolean likedStudents;
	private Boolean likedLocation;
	private Boolean likedCampus;
	private Boolean likedAtmosphere;
	private Boolean likedDormRooms;
	private Boolean likedSports;
	private String interestedBy;
	private String schoolRecommendation;
	private String raffleEntry;
	private String additionalComments;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public LocalDate getDateOfSurvey() {
		return dateOfSurvey;
	}
	public void setDateOfSurvey(LocalDate dateOfSurvey) {
		this.dateOfSurvey = dateOfSurvey;
	}
	public Boolean getLikedStudents() {
		return likedStudents;
	}
	public void setLikedStudents(Boolean likedStudents) {
		this.likedStudents = likedStudents;
	}
	public Boolean getLikedLocation() {
		return likedLocation;
	}
	public void setLikedLocation(Boolean likedLocation) {
		this.likedLocation = likedLocation;
	}
	public Boolean getLikedCampus() {
		return likedCampus;
	}
	public void setLikedCampus(Boolean likedCampus) {
		this.likedCampus = likedCampus;
	}
	public Boolean getLikedAtmosphere() {
		return likedAtmosphere;
	}
	public void setLikedAtmosphere(Boolean likedAtmosphere) {
		this.likedAtmosphere = likedAtmosphere;
	}
	public Boolean getLikedDormRooms() {
		return likedDormRooms;
	}
	public void setLikedDormRooms(Boolean likedDormRooms) {
		this.likedDormRooms = likedDormRooms;
	}
	public Boolean getLikedSports() {
		return likedSports;
	}
	public void setLikedSports(Boolean likedSports) {
		this.likedSports = likedSports;
	}
	public String getInterestedBy() {
		return interestedBy;
	}
	public void setInterestedBy(String interestedBy) {
		this.interestedBy = interestedBy;
	}
	public String getSchoolRecommendation() {
		return schoolRecommendation;
	}
	public void setSchoolRecommendation(String schoolRecommendation) {
		this.schoolRecommendation = schoolRecommendation;
	}
	public String getRaffleEntry() {
		return raffleEntry;
	}
	public void setRaffleEntry(String raffleEntry) {
		this.raffleEntry = raffleEntry;
	}
	public String getAdditionalComments() {
		return additionalComments;
	}
	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}
	@Override
	public int hashCode() {
		return Objects.hash(additionalComments, city, dateOfSurvey, email, firstName, id, interestedBy, lastName,
				likedAtmosphere, likedCampus, likedDormRooms, likedLocation, likedSports, likedStudents, raffleEntry,
				schoolRecommendation, state, streetAddress, telephoneNumber, zip);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SurveyForm other = (SurveyForm) obj;
		return Objects.equals(additionalComments, other.additionalComments) && Objects.equals(city, other.city)
				&& Objects.equals(dateOfSurvey, other.dateOfSurvey) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(interestedBy, other.interestedBy) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(likedAtmosphere, other.likedAtmosphere)
				&& Objects.equals(likedCampus, other.likedCampus)
				&& Objects.equals(likedDormRooms, other.likedDormRooms)
				&& Objects.equals(likedLocation, other.likedLocation) && Objects.equals(likedSports, other.likedSports)
				&& Objects.equals(likedStudents, other.likedStudents) && Objects.equals(raffleEntry, other.raffleEntry)
				&& Objects.equals(schoolRecommendation, other.schoolRecommendation)
				&& Objects.equals(state, other.state) && Objects.equals(streetAddress, other.streetAddress)
				&& Objects.equals(telephoneNumber, other.telephoneNumber) && Objects.equals(zip, other.zip);
	}
	@Override
	public String toString() {
		return "SurveyForm [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state + ", zip=" + zip + ", telephoneNumber="
				+ telephoneNumber + ", eMail=" + email + ", dateOfSurvey=" + dateOfSurvey + ", likedStudents="
				+ likedStudents + ", likedLocation=" + likedLocation + ", likedCampus=" + likedCampus
				+ ", likedAtmosphere=" + likedAtmosphere + ", likedDormRooms=" + likedDormRooms + ", likedSports="
				+ likedSports + ", interestedBy=" + interestedBy + ", schoolRecommendation=" + schoolRecommendation
				+ ", raffleEntry=" + raffleEntry + ", additionalComments=" + additionalComments + "]";
	}
	
	

}
