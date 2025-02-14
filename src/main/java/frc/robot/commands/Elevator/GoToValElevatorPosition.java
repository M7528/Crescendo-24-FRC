package frc.robot.commands.Elevator;

import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.Command;

public class GoToValElevatorPosition extends Command {

	private int conePosition = RobotContainer.elevator.getValConePosition();
	private boolean isCone;
	
	private int desiredPosition;


	public GoToValElevatorPosition() {
		addRequirements(RobotContainer.elevator);
	}

	// Called just before this Command runs the first time
	public void initialize() {
		isCone = RobotContainer.candleSubsystem.getIsCone();
		if (isCone == true) {
			desiredPosition = conePosition;
		}
		else {
			desiredPosition = conePosition;
		}
		RobotContainer.elevator.setTargetPosition(desiredPosition);
	}

	// Called repeatedly when this Command is scheduled to run
	public void execute() {
		RobotContainer.elevator.motionMagicControl();
	}

	// Make this return true when this Command no longer needs to run execute()
	public boolean isFinished() {
		return RobotContainer.elevator.isInPosition(desiredPosition);
	}

	// Called once after isFinished returns true
	protected void end() {

	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {

	}
}
