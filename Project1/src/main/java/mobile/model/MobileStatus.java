package mobile.model;

public class MobileStatus {
	
	private int statusCode;
	private String message;
	private Mobile mobile;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	public MobileStatus(int statusCode, String message, Mobile mobile) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.mobile = mobile;
	}
	public MobileStatus() {
		// TODO Auto-generated constructor stub
	}
	
	

}
