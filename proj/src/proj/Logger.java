package proj;

public class Logger {
	private StringBuilder s = new StringBuilder();
	public void log(String msg) {
		s.append(msg);
		s.append("sdfkjsdkfsdf");
		s.append("12242342");
	}
	
	public String getContents() {
		return s.toString();
	}
}
