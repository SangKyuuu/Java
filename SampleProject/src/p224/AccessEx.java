package p224;

class Sample{
	public int a;
	private int b;
	int c;
}

public class AccessEx {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.a=10;
//		s.b=10;
		s.c=10;
	}

}
