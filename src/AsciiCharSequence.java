public class AsciiCharSequence implements CharSequence {
	private final byte[] array;

	public AsciiCharSequence(byte[] array) {
		this.array = array.clone();
	}

	@Override
	public int length() {
		return array.length;
	}

	@Override
	public char charAt(int index) {
		return Character.toChars(array[index])[0];
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		byte[] buffer = new byte[end-start];
		int j = 0;
		for (int i = start; i < end; i++) {
			buffer[j] = array[i];
			j++;
		}
		AsciiCharSequence out = new AsciiCharSequence(buffer);
		return out;
	}

	@Override
	public String toString() {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			buffer.append(charAt(i));
		}
		return buffer.toString();
	}
}
