
package chainofresponsibility;

public class Request {

	private RequestType requestType;
	private int ammount;

	public Request(RequestType requestType, int ammount) {

		this.requestType = requestType;
		this.ammount = ammount;
	}

	public RequestType getRequestType() {

		return requestType;
	}

	public void setRequestType(RequestType requestType) {

		this.requestType = requestType;
	}

	public int getAmmount() {

		return ammount;
	}

	public void setAmmount(int ammount) {

		this.ammount = ammount;
	}
}
