package command_pattern;

public class CapturePhotoCommand implements Command {
	
	private Camera camera;
	
	public CapturePhotoCommand(Camera camera) {
		this.camera = camera;
	}
	@Override
	public void execute() {
		
		getCamera().takePicture();
		
	}
	
	public Camera getCamera() {
		return camera;
	}
}
