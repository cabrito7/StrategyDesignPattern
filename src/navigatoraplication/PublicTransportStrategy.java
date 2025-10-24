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
public class PublicTransportStrategy  implements RouteStrategy{
    private List<Schedule> transportSchedules;
    private List<Station> stations;

    public PublicTransportStrategy(List<Schedule> transportSchedules, List<Station> stations) {
        this.transportSchedules = transportSchedules;
        this.stations = stations;
    }

    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Building public transport route from " + start + " to " + end);
        System.out.println("Using " + stations.size() + " stations and " + transportSchedules.size() + " schedules.");
    }
}
