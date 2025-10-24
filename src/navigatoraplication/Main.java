/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package navigatoraplication;

/**
 *
 * @author carlosmamut1
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        NavigatorAplication app = new NavigatorAplication(new WalkingStrategy());
        app.buildRoute("Park", "Museum");

        app.setRouteStrategy(new RoadStrategy());
        app.buildRoute("Home", "Office");

        List<Schedule> schedules = Arrays.asList(new Schedule("08:00", "09:00"));
        List<Station> stations = Arrays.asList(new Station("Central"), new Station("Downtown"));
        app.setRouteStrategy(new PublicTransportStrategy(schedules, stations));
        app.buildRoute("Station A", "Station B");

        List<String> attractions = Arrays.asList("Old Town", "City Park", "Art Gallery");
        app.setRouteStrategy(new TouristicStrategy(attractions));
        app.buildRoute("Hotel", "Beach");
    }
}

