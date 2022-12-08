package vitals.BatteryComponents.types;

import vitals.BatteryComponents.Battery;
import vitals.BatteryComponents.constants.BatteryHealthConstants;

public class LiionBattery extends Battery{
	
	public LiionBattery(){
		minTemperature= BatteryHealthConstants.MIN_TEMPERATURE;
		maxTemperature= BatteryHealthConstants.MAX_TEMPERATURE;
		minSoc=BatteryHealthConstants.MIN_STATE_OF_CHARGE;
		maxSoc=BatteryHealthConstants.MAX_STATE_OF_CHARGE;
		minChargeRate=BatteryHealthConstants.MIN_RATE_OF_CHARGE;
		maxChargeRate=BatteryHealthConstants.MAX_RATE_OF_CHARGE;
	}

	public LiionBattery(int temperature, int soc, double chargeRate) {
		this();
		this.temperature=temperature;
		this.soc=soc;
		this.chargeRate=chargeRate;
	}
	
}