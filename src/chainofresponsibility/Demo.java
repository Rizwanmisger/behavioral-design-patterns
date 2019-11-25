
package chainofresponsibility;

public class Demo {

	public static void main(String[] args) {

		DirectorHandler dir = new DirectorHandler();
		VPHandler vp = new VPHandler();
		CEOHandler ceo = new CEOHandler();
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		Request conf = new Request(RequestType.CONFERENCE, 300);
		dir.handleRequest(conf);
		Request purchase1 = new Request(RequestType.PURCHASE, 700);
		dir.handleRequest(purchase1);
		Request purchase2 = new Request(RequestType.PURCHASE, 7000);
		dir.handleRequest(purchase2);
	}
}
