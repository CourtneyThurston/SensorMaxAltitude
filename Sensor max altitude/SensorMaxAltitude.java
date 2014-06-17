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
 * @version 1.0, 6/17/2014
 */

import java.util.*;
class SensorMaxAltitude
{
    public static void main (String[] args)
    {
        // Initializing scanner
        Scanner in = new Scanner(System.in);
        
        // Requesting user input the angle of view (either horizonal or vertical) in radians
        System.out.println("Please enter the angle of view of your sensor payload (either horizontal or vertical) in RADIANS:");
        double angleView = in.nextDouble();
        
        // Requesting user input the angle of tilt in radians
        System.out.println("Please enter the angle of tilt in RADIANS:");
        double angleTilt = in.nextInt();
        
        // Requesting user input the length or width of the camera footprint
        System.out.println("Please enter the horizontal or vertical component (length or width) of your camera footprint in FEET:");
        System.out.println("This must correspond to whether you gave the horizontal or vertical component for angle of view.");
        int w = in.nextInt();
        
        SensorMaxAltitudeMethods rh = new SensorMaxAltitudeMethods(); //creating new instance of SensorMaxAltitudeMethods to enable using non-static method in a static context
        rh.maximumAltitudeMethod(w, angleTilt, angleView); //passing user input as args into the maximumAltitudeMethod method
    }
}
