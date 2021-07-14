package JavaAssignments3.parkingLot;

import java.util.Objects;

public class token {
	int floor;
	int section;
	int slot;
	
	@Override
	public int hashCode() {
		return Objects.hash(floor,section,slot);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		token other = (token) obj;
		return floor == other.floor && section == other.section && slot == other.slot;
	}

	public token(int floor, int section, int slot) {
		super();
		this.floor = floor;
		this.section = section;
		this.slot = slot;
	}

	@Override
	public String toString() {
		return "token [floor=" + floor + ", section=" + section + ", slot=" + slot + "]";
	}
	
	

}
