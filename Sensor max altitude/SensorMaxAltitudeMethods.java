/**
 * SensorMaxAltitude allows the user to determine a sensor's 
 * maximum altitude given 3 inputs: angle of tilt, angle of
 * view (horizontal or vertical), and length or width (either 
 * horizontal or vertical) of the footprint.
 * 
 * Want to run this Java program, but don't have the Java JDK 
 * downloaded on your system? Visit http://www.browxy.com/ and 
 * paste this code into the white window, press 'start', and 
 * respond to the user prompts in the 'Console View' beneath it!

 * @author Courtney Thurston, www.courtneythurston.com
 * @version 6/17/2014
 */

import java.util.*;
public class SensorMaxAltitudeMethods
{
    // instance variable
    private double maximumAltitude;
    
    /**
     * MaximumAltitudeMethod takes arguments, given by the user, and calculates maximum altitude from those inputs.
     * 
     * @param  w   parameter w corresponds to the length or width of the camera footprint, given by the user
     * @param  angleView   parameter angleView is the field of view in radians (horizonal or vertical) of the sensor payload, given by the user
     * @param  angleTile   parameter angleTilt is the angle of tilt in radians of the sensor payload at some time, given by the user
     * @return     the result for maximumAltitude
     */
    public double maximumAltitudeMethod(int w, double angleTilt, double angleView)
    {
        maximumAltitude = ((Math.cos(angleTilt)) * ((w / 2) / (Math.sin((angleView / 2)))) * (Math.cos((angleTilt + angleView / 2))));
        System.out.println("Given those inputs, your maximum altitude is " + maximumAltitude + " feet!");
        return maximumAltitude;
    }
}