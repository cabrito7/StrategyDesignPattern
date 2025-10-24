/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navigatoraplication;

/**
 *
 * @author carlosmamut1
 */
public class RoadStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building road route from " + start + " to " + end + "\n Start at 123 Oak Street and head east on Oak street for 600 meters " + 
                "\n Turn right onto Pine Avenue and walk 1.2 kilometers " + "\n Continue straight through the roundabout to stay on Pine Avenue for another 800 meters" + 
                "\n Turn left onto Main Street and walk 2 kilometers - You'll pass the library and a small coffee shop on your right" + "\n Turn right onto Bridge road and cross the Willow River (about 400 meters) "
                + "\n" + end + " will be on your left, just pass the playground entrance" + "\n Total distance: about 6km \n Estimated time: 1 hour and 10 minutes"
                );
    }
}
