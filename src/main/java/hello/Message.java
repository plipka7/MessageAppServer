package hello;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Message implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String message;
	private String senderUsername;
	private String receiverUsername;
	private Long timeStamp;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSenderUsername() {
		return senderUsername;
	}

	public void setSenderUsername(String username) {
		this.senderUsername = username;
	}

	public String getReceiverUsername() {
		return receiverUsername;
	}

	public void setReceiverUsername(String username) {
		this.receiverUsername = username;
	}
	
	public Long getTimeStamp() {
		return this.timeStamp;
	}
	
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}