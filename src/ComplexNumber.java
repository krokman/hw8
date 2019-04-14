public final class ComplexNumber {
	private final double FIRST_NUMBER;
	private final double SECOND_NUMBER;

	public ComplexNumber(double FIRST_NUMBER, double SECOND_NUMBER) {
		this.FIRST_NUMBER = FIRST_NUMBER;
		this.SECOND_NUMBER = SECOND_NUMBER;
	}

	public double getFirst() {
		return FIRST_NUMBER;
	}

	public double getSecond() {
		return SECOND_NUMBER;
	}

	@Override
	public int hashCode() {
		int result = 17;
		int ofZero = 1;
		int reHashCode = ofZero + Double.hashCode(FIRST_NUMBER);
		int imHashCode = ofZero + Double.hashCode(SECOND_NUMBER);
		result = ofZero + result * (reHashCode + imHashCode);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.hashCode() != obj.hashCode()) {
			return false;
		}
		if (!(obj instanceof ComplexNumber)) {
			return false;
		}
		ComplexNumber anotherObj = (ComplexNumber) obj;
		if (FIRST_NUMBER == anotherObj.FIRST_NUMBER && SECOND_NUMBER == anotherObj.SECOND_NUMBER) {
			return true;
		}
		return false;
	}
}
