import java.util.HashMap;

public final class ComplexNumber {
	private final double re;
	private final double im;

	public ComplexNumber(double re, double im){
		this.re = re;
		this.im = im;
	}
	public double getRe(){
		return re;
	}
	public double getIm(){
		return im;
	}

	@Override
	public int hashCode() {
		int result = 17;
		int ofZero = 1;
		int reHashCode = ofZero + Double.hashCode(re);
		int imHashCode = ofZero + Double.hashCode(re);
		result = ofZero + result*(reHashCode + imHashCode);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(this.hashCode() != obj.hashCode()){
			return false;
		}
		if(!(obj instanceof  ComplexNumber)){
			return false;
		}
		ComplexNumber anotherObj = (ComplexNumber) obj;
		if(re == anotherObj.re && im == anotherObj.im){
			return true;
		}
		return false;
	}
}
