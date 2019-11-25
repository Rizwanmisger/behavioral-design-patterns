
package chainofresponsibility;

public class DirectorHandler extends Handler {

	@Override
	public void handleRequest(Request request) {

		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Director can approve conference requests");
		} else {
			successor.handleRequest(request);
		}
	}
}
