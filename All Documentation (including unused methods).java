//All Documentation (including unused methods)


/////TO DO
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
//import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.Encoder;
//import edu.wpi.first.wpilibj.PWM;
//import edu.wpi.first.wpilibj.BuiltInAccelerometer;

/////DONE
//import edu.wpi.first.wpilibj.TimedRobot;
//import edu.wpi.first.wpilibj.CounterBase.EncodingType;
//import edu.wpi.first.wpilibj.interfaces.Accelerometer;



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

///Unused:

//void setRange​(Accelerometer.Range range)
//Common interface for setting the measuring range of an accelerometer.
//range - The maximum acceleration, positive or negative, that the accelerometer will measure. Not all accelerometers support all ranges.



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






