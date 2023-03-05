import java.util.Date;

public class Owner {
	String Name;
	String PIN;
	String Address;
	String MobileNO;
	Date DateOBirth;

	public double getAge() {
		return 0;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String PIN) {
		this.PIN = PIN;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}

	public String getMobileNO() {
		return MobileNO;
	}

	public void setMobileNO(String MobileNO) {
		this.MobileNO = MobileNO;
	}

	public Date getDateOBirth() {
		return DateOBirth;
	}

	public void setDateOBirth(Date DateOBirth) {
		this.DateOBirth = DateOBirth;
	}

	@Override
	public String toString() {
		return "Owner [Name=" + Name + ", PIN=" + PIN + ", Address=" + Address + ", MobileNO=" + MobileNO
				+ ", DateOBirth=" + DateOBirth + "]";
	}

}