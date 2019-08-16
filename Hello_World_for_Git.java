package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "Hello_World_for_Git (Blocks to Java)", group = "")
public class Hello_World_for_Git extends LinearOpMode {

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    ElapsedTime LoopTimer;

    // Put initialization blocks here.
    LoopTimer = new ElapsedTime(ElapsedTime.Resolution.MILLISECONDS);
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      LoopTimer.reset();
      while (LoopTimer.time() < 1000 && opModeIsActive()) {
        // Put loop blocks here.
        telemetry.addData("Hello World", "for Git");
        telemetry.update();
      }
    }
  }
}
