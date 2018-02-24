package my.packagename;

public final class NoJavaCoverage {

	private NoJavaCoverage() {
		// hide implicity public constructor
	}

	public static final boolean myMethod() {
		return true;
	}
}
