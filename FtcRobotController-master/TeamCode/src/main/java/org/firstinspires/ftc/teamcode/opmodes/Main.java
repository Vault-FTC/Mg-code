package DavidArmCodeFTC;

public class Main {
    // Arm One's CURRENT known values
    static double arm_one_len = 4; // Inches
    static double arm_one_ang = 30; // Degrees


    // Where Arm One needs to be
    static double arm_one_ang_goal;


    // Arm Two's CURRENT known values
    static double arm_two_len = 4; // Inches
    static double arm_two_ang = 30; // Degrees


    // Where Arm Two needs to be
    static double arm_two_ang_goal;


    // The dimensions of our CURRENT ROBOT
    static double x_space_available = 18; // Inches
    static double y_space_available = 12; // Inches
    static double robot_base_height = 3; // Inches; Distance from the ground to the start of the Linear Slide

    // Robot Intake details
    static double intake_cutoff_dist = 8; // Inches
    static double intake_angle = 10; // Degrees; The slope of the intake before cutoff
    static double intake_spinner_height = 3; // Inches
    static double intake_spinner_radius = 5; // Inches

    // Linear Slide CURRENT known values
    static double min_len_of_slide = 10.5; // Inches; Size of the Linear Slide fully compressed
    static double max_len_of_slide = 23; // Inches; Size of the Linear Slide fully enlarged
    static double slide_dist_from_intake = 11; // Inches; The distance from the intake edge of the robot to the base of the Linear Slide

}
