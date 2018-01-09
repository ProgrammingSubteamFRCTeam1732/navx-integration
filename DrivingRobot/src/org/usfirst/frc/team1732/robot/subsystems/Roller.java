package org.usfirst.frc.team1732.robot.subsystems;

import org.usfirst.frc.team1732.robot.RobotMap;

import com.ctre.MotorControl.CANTalon;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Roller extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static final String NAME = "ROLLER";
	
	public Roller(){
		super(NAME);
	}
	
	private final Solenoid rollerPosition	= new Solenoid(RobotMap.PCM_CAN_ID, RobotMap.ROLLER_SOLENOID_DEVICE_NUMBER);
	private final CANTalon roller = new CANTalon(RobotMap.ROLLER_MOTOR_DEVICE_NUMBER);
	
	public static final boolean	UP		= false;
	public static final boolean	DOWN	= !UP;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setDown(){
    	rollerPosition.set(DOWN);
		roller.set(1);
    }
    
    public void setUp(){
    	rollerPosition.set(UP);
    	roller.set(0);
    }
}

