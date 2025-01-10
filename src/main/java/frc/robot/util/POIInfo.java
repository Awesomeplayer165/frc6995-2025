package frc.robot.util;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.DriverStation.Alliance;

public class POIInfo {
    public String name;
    public Alliance alliance;
    public Pose2d pose;

    public POIInfo(String name, Alliance alliance, Pose2d pose) {
        this.name = name;
        this.alliance = alliance;
        this.pose = pose;
    }
}
