package shrikant;

public class InvalidBrowserError extends Error {
	private String msg;

	public InvalidBrowserError(String browserName) {
		msg = " InvalidBrowserError   " + browserName;
	}

	@Override
	public String toString() {
		return msg;
	}

}
