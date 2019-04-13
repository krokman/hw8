public class EqualHashTest {
	public static void main(String[] args) {
		ComplexNumber first = new ComplexNumber(3,2);
		ComplexNumber second = new ComplexNumber(1,2);
		System.out.println(first.hashCode() + " "  + first.equals(second));
	}
}
