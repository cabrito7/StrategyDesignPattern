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
import java.util.List;

public class TouristicStrategy implements RouteStrategy {
    private List<Attraction> attractions;

    public TouristicStrategy(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building a *touristic* route from " + start + " to " + end);
        System.out.println("You will visit these attractions along the way:");
        for (Attraction attraction : attractions) {
            System.out.println(" - " + attraction);
        }
    }
}

