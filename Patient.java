package study.isa;

import study.hasa.MyDate;

public class Patient extends Person
{
	String bloodGroup;
	int bP;
	int heartRate;
	
	public Patient() {}
	
	public Patient(String name, MyDate dob, String bloodGroup, int bP, int heartRate) 
	{
		super(name, dob);
		this.bloodGroup = bloodGroup;
		this.bP = bP;
		this.heartRate = heartRate;
	}
	
	public boolean equals(Object o)
	{
//		if(super.equals(o))
//		{
		Patient tmp =(Patient)o;
		if(o instanceof Patient)
		{
			if(this.bloodGroup.equals(tmp.bloodGroup) && (this.bP == tmp.bP) &&(this.heartRate == tmp.heartRate))
				return true;
			else
				return false;
		}
		else
			return false;
//		}
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getbP() {
		return bP;
	}

	public void setbP(int bP) {
		this.bP = bP;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	@Override
	public String toString() 
	{
		String str= super.toString()+" Patient [bloodGroup=" + bloodGroup + ", bP=" + bP + ", heartRate=" + heartRate + "]";
		return str;
	}
	
	
	
}
