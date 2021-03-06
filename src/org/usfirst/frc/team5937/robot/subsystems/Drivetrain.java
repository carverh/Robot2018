package org.usfirst.frc.team5937.robot.subsystems;

import org.usfirst.frc.team5937.robot.devices.Wheel;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


// Abstract class for a drive train. Drive train classes should extend this.
public abstract class Drivetrain extends Subsystem {

	private Wheel frontRight;
	private Wheel frontLeft;
	private Wheel backRight;
	private Wheel backLeft;
	
	public double speed = 1.0;
	
	public Drivetrain() {
	}

	public Drivetrain(String name) {
		super(name);
	}

	@Override
	protected void initDefaultCommand() {
	}
	
	public void moveForwards() {
	}
	
	public void moveBackwards() {
	}
	
	public void moveRight() {
		
	}
	
	public void moveLeft() {
		
	}
	
	public void turnRight() {
		
	}

	public void turnLeft() {
		
	}
	
	public void stop() {
		frontRight.stop();
		frontLeft.stop();
		backRight.stop();
		backLeft.stop();
	}
	
	public void doMotion(double fr, double fl, double br, double bl) {
		frontRight.set(fr*this.speed);
		frontLeft.set(fl*this.speed);
		backRight.set(br*this.speed);
		backLeft.set(bl*this.speed);
	}
}
