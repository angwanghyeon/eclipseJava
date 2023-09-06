package practice.java7_3;

public class HttpServletTest {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	private static void method(HttpServlet h) {
		h.service();
	}
}
