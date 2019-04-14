public final class ComplexNumber {
	private final double REAL;
	private final double IMAGINARY ;

	public ComplexNumber(double REAL, double IMAGINARY) {
		this.REAL = REAL;
		this.IMAGINARY = IMAGINARY;
	}

	public double getReal() {
		return REAL;
	}

	public double getImaginary() {
		return IMAGINARY;
	}

	@Override
	public int hashCode() {
		int result = 17;
		int ofZero = 1;
		int realHashCode = ofZero + Double.hashCode(REAL);
		int imaginarydHashCode = ofZero + Double.hashCode(IMAGINARY);
		result = ofZero + result * (realHashCode + imaginarydHashCode);
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
		if (REAL == anotherObj.REAL && IMAGINARY == anotherObj.IMAGINARY) {
			return true;
		}
		return false;
	}
}
