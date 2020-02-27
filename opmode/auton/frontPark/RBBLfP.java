package org.firstinspires.ftc.teamcode.opmode.auton.frontPark;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.hardware.Claw;
import org.firstinspires.ftc.teamcode.hardware.Drivetrain;

@Autonomous(name="Red-Building-Blue-Loading-FrontPark")
public class RBBLfP extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    private Drivetrain drive = new Drivetrain(this);
    private Claw claw = new Claw(this);

    @Override
    public void runOpMode() throws InterruptedException {
        drive.init(hardwareMap);
        claw.init(hardwareMap);

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        runtime.reset();

        drive.driveToPos(23, 0.5);
        sleep(500);
        drive.strafe(-0.5, 1.7);
        sleep(500);
    }
}
