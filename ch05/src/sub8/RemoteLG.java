package sub8;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG PowerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("LG PowerOff");
	}

	@Override
	public void chUp() {
		System.out.println("LG Ch Up");
	}

	@Override
	public void chDown() {
		System.out.println("LG Ch Down");
	}

	@Override
	public void soundUp() {
		System.out.println("LG Sound Up");
	}

	@Override
	public void soundDown() {
		System.out.println("LG Sound Down");
	}

	
}
