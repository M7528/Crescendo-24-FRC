package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Intake.StoreObjectCommandGroup;

public class HomeStateCommandGroup extends SequentialCommandGroup {
    
    public HomeStateCommandGroup() {
        addCommands((new StoreObjectCommandGroup()));
    }

}
