package JavaAssignments3.chatroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chatroom {
	
	Set<User> userList = new HashSet<>();
	List<Message>chatRoomMsgList =new ArrayList<>();

	public void addUserToList(User user) {
		this.userList.add(user); //ok
	}
	public void removeUserFrmList(User user) {
		this.userList.remove(user);
	}
	public void sendMsgToChat(User user, String msg) {
		this.chatRoomMsgList.add(new Message(user,msg));//corrected
	}

	public void displayAllUser() {
		System.out.println(userList);	//ok
	}
	
	public void clearChat() {
		this.chatRoomMsgList.clear(); //corrected
	}
	
	public void deleteChatroom() {
		this.chatRoomMsgList.clear();
		this.userList.clear();//corrected
	}
	
	public boolean credCheck(User user) {
		if(this.userList.contains(user))
			return true;
		else 
			return false;
		}
	public void displayAllMsg() {//corrected
		System.out.println(this.chatRoomMsgList);
		}
	}
	
	

