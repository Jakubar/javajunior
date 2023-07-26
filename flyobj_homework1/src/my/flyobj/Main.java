package my.flyobj;

import my.flyobj.objects.Airplane;
import my.flyobj.objects.Helicopter;
import my.flyobj.objects.Spacecraft;

public class Main {
    public static void main(String[] args) {
        Airplane Cesna75 = new Airplane("AU31-31");
        Helicopter Tomahawk = new Helicopter("BG-312");
        Spacecraft SpaceXShuttle = new Spacecraft("SPACEX423");

        Cesna75.fly_obj();
        Tomahawk.fly_obj();
        SpaceXShuttle.fly_obj();

    }
}