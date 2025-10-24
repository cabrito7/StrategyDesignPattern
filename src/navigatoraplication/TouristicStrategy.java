/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navigatoraplication;

import java.util.List;

/**
 *
 * @author carlosmamut1
 */
public class TouristicStrategy implements RouteStrategy{
    private List<String> attractions;

    public TouristicStrategy(List<String> attractions) {
        this.attractions = attractions;
    }

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building a *touristic* route from " + start + " to " + end);
        System.out.println("Visiting attractions along the way:");
        for (String attraction : attractions) {
            System.out.println(" - " + attraction);
        }
    }
    
}
