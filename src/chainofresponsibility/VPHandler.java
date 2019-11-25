
package chainofresponsibility;

public class VPHandler extends Handler {

	@Override
	public void handleRequest(Request request) {

		if (request.getRequestType() == RequestType.PURCHASE) {
			if (request.getAmmount() < 1500) {
				System.out.println("VP can approve purchase request for " + request.getAmmount());
			} else {
				successor.handleRequest(request);
			}
		}
	}
}
