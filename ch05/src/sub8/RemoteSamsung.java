package sub8;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("Samsung PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung PowerOff");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung Ch Up");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung Ch Down");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung Sound Up");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung Sound Down");
	}

}
