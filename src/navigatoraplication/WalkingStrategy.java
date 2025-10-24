/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navigatoraplication;

/**
 *
 * @author carlosmamut1
 */
public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building walking route from " + start + " to " + end + "\nGo 2 km straight down Maple Street." +
"\n" +
"Turn right and walk 1.5 km past the old bakery." +
"\n" +
"Take a left at the traffic light and continue 3 km." +
"\n" +
"Cross the bridge and go 0.5 km straight." +
"\n" +
"Turn right again and walk 2 km alongside the river." +
"\n" +
"Finally, turn left into Park Avenue and walk 1 km — the park will be on your right."
+  "\n Total distance: about 10km \n Estimated time: 1 hour and 45 minutes (at an easy pace)");
    }
}
