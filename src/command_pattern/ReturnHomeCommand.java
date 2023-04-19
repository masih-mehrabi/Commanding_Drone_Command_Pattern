package command_pattern;

public class ReturnHomeCommand implements Command {
	private Drone drone;
	
	
	public ReturnHomeCommand(Drone drone) {
		this.drone = drone;
	}
	
	@Override
	public void execute() {
		if (drone.isFlying()) {
			drone.flyHome();
			drone.setFlying(false);
		} else {
			System.out.println("Drone is already on the ground");
		}
	
	}
}
