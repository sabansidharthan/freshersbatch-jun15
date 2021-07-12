package JavaAssignments3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Date{
	int dd;
	int mm;
	int yyyy;
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + dd;
		result = prime * result + mm;

			return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if ((dd == other.dd) && (mm != other.mm))
			return true;
		return true;
	}
	
	
}

public class DateQn4 {

	public static void main(String[] args) {
		Date date1 = new Date(11, 10,1994);
		Date date2 = new Date(11, 10,1996);
		Date date3 = new Date(1, 4,1993);
		
		Map <Date,String> list= new HashMap<>();
		
		list.put(date3, "suku");
		list.put(date2, "paaru");
		list.put(date1, "sab");
		
		System.out.println(list.get(date2));
		
	}

}
