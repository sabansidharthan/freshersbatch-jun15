package JavaAssignments3.chatroom;

import java.util.Objects;

public class Message {
	String message;
	User user;
	long sendTime;
	public Message( User user,String message) {
		super();
		this.message = message;
		this.user = user;
		this.sendTime = System.currentTimeMillis();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + (int) (sendTime ^ (sendTime >>> 32));
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Message other = (Message) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (sendTime != other.sendTime)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return  user + " : "+ message;
	}
	
}
