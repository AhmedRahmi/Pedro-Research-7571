package pedroPathing.constants;

import com.pedropathing.localization.*;
import com.pedropathing.localization.constants.*;

public class LConstants { // hi james
    static {
        ThreeWheelConstants.forwardTicksToInches = 100.0/134466.0;
        ThreeWheelConstants.strafeTicksToInches = 100.0/134466.0;
        ThreeWheelConstants.turnTicksToInches = 100.0/134466.0;
        ThreeWheelConstants.leftY = -2.618;
        ThreeWheelConstants.rightY = 2.618;
        ThreeWheelConstants.strafeX = -2.618;
        ThreeWheelConstants.leftEncoder_HardwareMapName = "br";
        ThreeWheelConstants.rightEncoder_HardwareMapName = "fl";
        ThreeWheelConstants.strafeEncoder_HardwareMapName = "fr";
        ThreeWheelConstants.leftEncoderDirection = Encoder.FORWARD;
        ThreeWheelConstants.rightEncoderDirection = Encoder.REVERSE;
        ThreeWheelConstants.strafeEncoderDirection = Encoder.REVERSE;
    }
}




