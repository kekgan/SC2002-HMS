package hms;

public class Medicine {
	private String name;

	public Medicine(String name) {
		this.name = name;
		this.medicineStatus = MedicineStatus.PENDING;
	}

	public String getName() {
		return this.name;
	}

	public MedicineStatus getMedicineStatus() {
		return this.medicineStatus;
	}

	public void setMedicineStatus(MedicineStatus medicineStatus) {
		this.medicineStatus = medicineStatus;
	}
}
