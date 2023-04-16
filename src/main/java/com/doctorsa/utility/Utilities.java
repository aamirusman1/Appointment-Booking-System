package com.doctorsa.utility;

public class Utilities {
	public enum DoctorSpecialist {
		
		IMMUNOLOGISTS("Immunologists"),
		ANESTHESIOLOGISTS("Anesthesiologists"),
		CARDIOLOGISTS("Cardiologists"),
		DERMATOLOGISTS("Dermatologists"),
		ENDOCRINNOLOGISTS("Endocrinologists"),
		GASTROENTEROLOGISTS("Gastroenterologists"),
		HEMATOLOGISTS("Hematologists");
		
		private String type;

	    private DoctorSpecialist(String type) {
	      this.type = type;
	    }

	    public String value() {
	      return this.type;
	    }

	}
	
	public enum AppointmentTiming {
		NINE_TO_TEN_AM("09:00 - 10:00 am"),
		TEN_TO_ELEVEN_AM("10:00 - 11:00 am"),
		ELEVEN_TO_TWELLVE_AM("11:00 - 12:00 am"),
		TWELVE_TO_ONE_PM("12:00 - 01:00 pm"),
		ONE_TO_TWO_PM("01:00 - 02:00 pm"),
		TWO_TO_THREE_PM("02:00 - 03:00 pm"),
		THREE_TO_FOUR_PM("03:00 - 04:00 pm"),
		FOUR_TO_FIVE_PM("04:00 - 05:00 pm"),
		FIVE_TO_SIX_PM("05:00 - 06:00 pm");
		
		private String time;

	    private AppointmentTiming(String time) {
	      this.time = time;
	    }

	    public String value() {
	      return this.time;
	    }
	     
	}
	
	public enum Clinics{
		MAYUR_VIHAR("Mayur Vihar"),
		NEW_DELHI("New Delhi"),
		SARITA_VIHAR("Sarita Vihar");
		
		private String location;
		private Clinics(String location) {
			this.location = location;
		}
		public String value() {
			return this.location;
		}
	}

}
