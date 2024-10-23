package hms.model;

import hms.record.MedicalRecord;

public class Patient extends User {
	private final MedicalRecord medicalRecord;

	public Patient(MedicalRecord medicalRecord, String password) {
		super(medicalRecord.getId(), password, medicalRecord.getName(), medicalRecord.getGender());
		this.medicalRecord = medicalRecord;
	}

	public void ViewMedicalRecord() {
	}

	public void setPhoneNumber(String phoneNumber) {
		this.medicalRecord.setPhoneNumber(phoneNumber);
	}

	public void setEmailAddress(String emailAddress) {
		this.medicalRecord.setEmailAddress(emailAddress);
	}
}