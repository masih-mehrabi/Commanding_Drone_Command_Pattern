package command_pattern;

public class UpwardCommand implements Command {
	
	private Drone drone;
	
	private float upwardSpeed;
	
	
	public UpwardCommand(float upwardSpeed, Drone drone) {
		this.drone = drone;
		this.upwardSpeed = upwardSpeed;
	}
	
	@Override
	public void execute() {
	drone.flyUpward(upwardSpeed);
	drone.setFlying(true);
	}
}
