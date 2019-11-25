
package chainofresponsibility;

public class CEOHandler extends Handler {

	@Override
	public void handleRequest(Request request) {

		System.out.println("CEO can handle everything!");
	}
}
