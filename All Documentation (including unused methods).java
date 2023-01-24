//All Documentation (including unused methods)


/////TO DO
//import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.PWM;
//import edu.wpi.first.wpilibj.BuiltInAccelerometer;

/////DONE
//import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.CounterBase.EncodingType;
//import edu.wpi.first.wpilibj.interfaces.Accelerometer;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


//import edu.wpi.first.wpilibj.Joystick;



//////////[TITLE]//////////

/////Import
//

/////Constructor

/////Methods

///Used:

///Unused:



//////////Timed Robot//////////

/////Import
//import edu.wpi.first.wpilibj.TimedRobot;

/////Constructor

//protected TimedRobot()
//Constructor for TimedRobot.

//protected TimedRobot​(double period)
//Constructor for TimedRobot.
//period - Period in seconds.

/////Methods

///Used:

///Unused:

//public void close()
//Specified by: close in interface AutoCloseable
//Overrides: close in class RobotBase

//public void startCompetition()
//Provide an alternate "main loop" via startCompetition().
//Specified by: startCompetition in class IterativeRobotBase

//public void endCompetition()
//Ends the main loop in startCompetition().
//Specified by: endCompetition in class RobotBase

//public void addPeriodic​(Runnable callback, double periodSeconds)
//Add a callback to run at a specific period.
//This is scheduled on TimedRobot's Notifier, so TimedRobot and the callback run synchronously. Interactions between them are thread-safe.
//callback - The callback to run.
//periodSeconds - The period at which to run the callback in seconds.

//public void addPeriodic​(Runnable callback, double periodSeconds, double offsetSeconds)
//Add a callback to run at a specific period with a starting time offset.
//This is scheduled on TimedRobot's Notifier, so TimedRobot and the callback run synchronously. Interactions between them are thread-safe.
//callback - The callback to run.
//periodSeconds - The period at which to run the callback in seconds.
//offsetSeconds - The offset from the common starting time in seconds. This is useful for scheduling a callback in a different timeslot relative to TimedRobot.



//////////Encoding Type//////////

/////Import
//import edu.wpi.first.wpilibj.CounterBase.EncodingType;

/////Methods

///Used:

///Unused:

//public static CounterBase.EncodingType[] values()
//Returns an array containing the constants of this enum type, in the order they are declared.
//Returns: an array containing the constants of this enum type, in the order they are declared

//public static CounterBase.EncodingType valueOf​(String name)
//Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.)
//name - the name of the enum constant to be returned.
// Returns: the enum constant with the specified name
//Throws:
//IllegalArgumentException - if this enum type has no constant with the specified name
//NullPointerException - if the argument is null



//////////Accelerometer//////////

/////Import
//import edu.wpi.first.wpilibj.interfaces.Accelerometer;

/////Constructor

/////Methods

///Used:

//double getX()
//Common interface for getting the x-axis acceleration.
//Returns: The acceleration along the x-axis in g-forces

//double getY()
//Common interface for getting the y-axis acceleration.
//Returns: The acceleration along the y-axis in g-forces

///Unused:

//void setRange​(Accelerometer.Range range)
//Common interface for setting the measuring range of an accelerometer.
//range - The maximum acceleration, positive or negative, that the accelerometer will measure. Not all accelerometers support all ranges.

//double getZ()
//Common interface for getting the z axis acceleration.
//Returns: The acceleration along the z axis in g-forces



//////////WPI_TalonSRX//////////

/////Import
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/////Constructor
//public WPI_TalonSRX(int deviceNumber)
//Constructor for motor controller
//deviceNumber - device ID of motor controller

/////Methods

///Used:

//public void set	(double speed)	
//Common interface for setting the speed of a simple speed controller.
//speed - The speed to set. Value should be between -1.0 and 1.0. Value is also saved for Get().

//public void setInverted(boolean isInverted)	
//Common interface for inverting direction of a speed controller.
//isInverted - The state of inversion, true is inverted.


///Unused:

//public void close()

//public void disable()	
//Common interface for disabling a motor.

//public void feed()	
//Feed the motor safety object.
//Resets the timer on this object that is used to do the timeouts.

//public double get()	
//Common interface for getting the current set speed of a speed controller.
//Return: The current set speed. Value is between -1.0 and 1.0.

//public String getDescription()	
//Return: description of controller

//public double getExpiration()	
//Retrieve the timeout value for the corresponding motor safety object.
//Return: the timeout value in seconds.

//public boolean getInverted()	
//Common interface for returning the inversion state of a speed controller.
//Return: The state of inversion, true is inverted.

//public void initSendable(SendableBuilder builder)	
//Initialize sendable
//builder - Base sendable to build on

//public boolean isAlive()	
//Determine of the motor is still operating or has timed out.
//Return: a true value if the motor is still operating normally and hasn't timed out.

//public boolean isSafetyEnabled()	
//Return the state of the motor safety enabled flag.
//Return if the motor safety is currently enabled for this device.
//Return: True if motor safety is enforced for this device

//public void set(ControlMode mode, double demand0, DemandType demand1Type, double demand1)
//mode - Sets the appropriate output on the talon, depending on the mode.
//demand0 - The output value to apply. such as advanced feed forward and/or auxiliary close-looping in firmware. In PercentOutput, the output is between -1.0 and 1.0, with 0.0 as stopped. In Current mode, output value is in amperes. In Velocity mode, output value is in position change / 100ms. In Position mode, output value is in encoder ticks or an analog value, depending on the sensor. See In Follower mode, the output value is the integer device ID of the talon to duplicate.
//demand1Type - The demand type for demand1. Neutral: Ignore demand1 and apply no change to the demand0 output. AuxPID: Use demand1 to set the target for the auxiliary PID 1. ArbitraryFeedForward: Use demand1 as an arbitrary additive value to the demand0 output. In PercentOutput the demand0 output is the motor output, and in closed-loop modes the demand0 output is the output of PID0.
//demand1 - Supplmental output value. Units match the set mode.

//public void set(ControlMode mode, double value)		
//Sets the appropriate output on the talon, depending on the mode.
//mode - The output mode to apply. In PercentOutput, the output is between -1.0 and 1.0, with 0.0 as stopped. In Current mode, output value is in amperes. In Velocity mode, output value is in position change / 100ms. In Position mode, output value is in encoder ticks or an analog value, depending on the sensor. In Follower mode, the output value is the integer device ID of the talon to duplicate.
//value - The setpoint value, as described above.

//public void setExpiration(double expirationTime)	
//Set the expiration time for the corresponding motor safety object.
//expirationTime - The timeout value in seconds.

//public void setSafetyEnabled(boolean enabled)	
//Enable/disable motor safety for this device.
//Turn on and off the motor safety option for this PWM object.
//enabled - True if motor safety is enforced for this object

//public void setVoltage(double outputVolts)	
//Sets the voltage output of the SpeedController. Compensates for the current bus voltage to ensure that the desired voltage is output even if the battery voltage is below 12V - highly useful when the voltage outputs are "meaningful" (e.g. they come from a feedforward calculation).
//NOTE: This function must be called regularly in order for voltage compensation to work properly - unlike the ordinary set function, it is not "set it and forget it."
//outputVolts - The voltage to output.

//public void stopMotor()	
//Common interface to stop the motor until Set is called again.



//////////Joystick//////////

/////Import
//import edu.wpi.first.wpilibj.Joystick;

/////Constructor
//public Joystick​(int port)
//Construct an instance of a joystick.
//Parameters:
//port - The port index on the Driver Station that the joystick is plugged into.

/////Methods

///Used:

///Unused:

//public void setXChannel​(int channel)
//Set the channel associated with the X axis.
//channel - The channel to set the axis to.

//public void setYChannel​(int channel)
//Set the channel associated with the Y axis.
//channel - The channel to set the axis to.

//public void setZChannel​(int channel)
//Set the channel associated with the Z axis.
//channel - The channel to set the axis to.

//public void setThrottleChannel​(int channel)
//Set the channel associated with the throttle axis.
//channel - The channel to set the axis to.

//public void setTwistChannel​(int channel)
//Set the channel associated with the twist axis.
//channel - The channel to set the axis to.

//public int getXChannel()
//Get the channel currently associated with the X axis.
//Return: The channel for the axis.

//public int getYChannel()
//Get the channel currently associated with the Y axis.
//Returns: The channel for the axis.

//public int getZChannel()
//Get the channel currently associated with the Z axis.
//Returns: The channel for the axis.

//public int getTwistChannel()
//Get the channel currently associated with the twist axis.
//Returns: The channel for the axis.

//public int getThrottleChannel()
//Get the channel currently associated with the throttle axis.
//Returns: The channel for the axis.

//public final double getX()
//Get the X value of the joystick. This depends on the mapping of the joystick connected to the current port.
//Returns: The X value of the joystick.

//public final double getY()
//Get the Y value of the joystick. This depends on the mapping of the joystick connected to the current port.
//Returns: The Y value of the joystick.

//public double getZ()
//Get the z position of the HID.
//Returns: the z position

//public double getTwist()
//Get the twist value of the current joystick. This depends on the mapping of the joystick connected to the current port.
//Returns: The Twist value of the joystick.

//public double getThrottle()
//Get the throttle value of the current joystick. This depends on the mapping of the joystick connected to the current port.
//Returns: The Throttle value of the joystick.

//public boolean getTrigger()
//Read the state of the trigger on the joystick.
//Returns: The state of the trigger.

//public boolean getTriggerPressed()
//Whether the trigger was pressed since the last check.
//Returns: Whether the button was pressed since the last check.

//public boolean getTriggerReleased()
//Whether the trigger was released since the last check.
//Returns: Whether the button was released since the last check.

//public BooleanEvent trigger​(EventLoop loop)
//Constructs an event instance around the trigger button's digital signal.
//loop - the event loop instance to attach the event to.
//Returns: an event instance representing the trigger button's digital signal attached to the given loop.

//public boolean getTop()
//Read the state of the top button on the joystick.
//Returns: The state of the top button.

//public boolean getTopPressed()
//Whether the top button was pressed since the last check.
//Returns: Wether the button was pressed since the last check.

//public boolean getTopReleased()
//Whether the top button was released since the last check.
//Returns: Whether the button was released since the last check.

//public BooleanEvent top​(EventLoop loop)
//Constructs an event instance around the top button's digital signal.
//loop - the event loop instance to attach the event to.
//Returns: an event instance representing the top button's digital signal attached to the given loop.

//public double getMagnitude()
//Get the magnitude of the direction vector formed by the joystick's current position relative to its origin.
//Returns: The magnitude of the direction vector

//public double getDirectionRadians()
//Get the direction of the vector formed by the joystick and its origin in radians.
//Returns: The direction of the vector in radians

//public double getDirectionDegrees()
//Get the direction of the vector formed by the joystick and its origin in degrees.
//Returns: The direction of the vector in degrees






