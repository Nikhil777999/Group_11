package study.ExceptionHandling;

public class MyDate implements Comparable<MyDate>
{
	private int day,month,year;
	

	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof MyDate)
		{
			MyDate tmp = (MyDate)obj;
			if(this.day==tmp.day && this.month==tmp.month && this.year==tmp.year)
				return true;
			else 
			{
				return false;
				}
		}
		else
			return false;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date ["+day+ "-" + month + "-" + year + "]";
	}

	@Override
	public int compareTo(MyDate o) 
	{
		if(this.year > o.year) return 1;
		if(this.year < o.year) return -1;
		else {
			if(this.month > o.month) return 1;
			if(this.month < o.month) return -1;
			else
			{
				if(this.day > o.day) return 1;
				if(this.day < o.day) return -1;
				else
					return 0;
			}
		}
	}
}
