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
 * @version 1.2, 6/18/2014
 */

import java.util.*;
class SensorMaxAltitude
{
    private double maximumAltitude;
    
    /**
     * MaximumAltitudeMethod takes arguments, given by the user, and calculates maximum altitude from those inputs.
     * 
     * @param  w   parameter w corresponds to the length or width of the camera footprint, given by the user
     * @param  angleView   parameter angleView is the field of view in radians (horizonal or vertical) of the sensor payload, given by the user
     * @param  angleTile   parameter angleTilt is the angle of tilt in radians of the sensor payload at some time, given by the user
     * @return     the result for maximumAltitude
     */
    public double maximumAltitudeMethod(double w, double angleTilt, double angleView, String unit)
    {
        maximumAltitude = ((Math.cos(angleTilt)) * ((w / 2) / (Math.sin((angleView / 2)))) * (Math.cos((angleTilt + angleView / 2))));
        System.out.println("Given those inputs, your maximum altitude is " + maximumAltitude + " " + unit + "!");
        return maximumAltitude;
    }
    
    public static void main (String[] args)
    {
        // Initializing scanner
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter, without quotation marks, 'feet' if ft are your unit or 'meters' if m is your unit:");
        String unit = in.next();
        
        // Requesting user input the angle of view (either horizonal or vertical) in radians
        System.out.println("Please enter the angle of view of your sensor payload (either horizontal or vertical) in RADIANS:");
        double angleView = in.nextDouble();
        
        // Requesting user input the angle of tilt in radians
        System.out.println("Please enter the angle of tilt in RADIANS:");
        double angleTilt = in.nextDouble();
        
        // Requesting user input the length or width of the camera footprint
        System.out.println("Please enter the horizontal or vertical component (length or width) of your camera footprint in " + unit + ":");
        System.out.println("This must correspond to whether you gave the horizontal or vertical component for angle of view.");
        double w = in.nextDouble();
        
        SensorMaxAltitude rh = new SensorMaxAltitude(); //creating new instance of SensorMaxAltitudeMethods to enable using non-static method in a static context
        rh.maximumAltitudeMethod(w, angleTilt, angleView, unit); //passing user input as args into the maximumAltitudeMethod method
    }
}