package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants {
    static {
        ThreeWheelConstants.forwardTicksToInches = .0008;
        ThreeWheelConstants.strafeTicksToInches = .0007;
        ThreeWheelConstants.turnTicksToInches = .0003;
        ThreeWheelConstants.leftY = 1;
        ThreeWheelConstants.rightY = -1;
        ThreeWheelConstants.strafeX = -2.5;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "fl";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "br";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "fr";
        ThreeWheelConstants.leftEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.rightEncoderDirection = Encoder.FORWARD;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
    }
}




