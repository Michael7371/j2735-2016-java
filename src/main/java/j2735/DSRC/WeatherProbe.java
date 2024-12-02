package j2735.DSRC;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.annotations.Asn1Property;

/**
 * 
 * <p>
 * This source code was generated by a tool. Manual edits are futile.
 * </p>
 * <p>
 * asn1jvm v1.0-SNAPSHOT
 * </p>
 * <p>
 * ASN.1 source files:
 * </p>
 * 
 * <pre>
 * J2735_201603DA.ASN
 * </pre>
 * 
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherProbe extends Asn1Sequence {

	@Asn1Property(tag = 0, optional = true)
	private AmbientAirTemperature airTemp;
	@Asn1Property(tag = 1, optional = true)
	private AmbientAirPressure airPressure;
	@Asn1Property(tag = 2, optional = true)
	private WiperSet rainRates;

	public AmbientAirTemperature getAirTemp() {
		return airTemp;
	}

	public void setAirTemp(AmbientAirTemperature airTemp) {
		this.airTemp = airTemp;
	}

	public AmbientAirPressure getAirPressure() {
		return airPressure;
	}

	public void setAirPressure(AmbientAirPressure airPressure) {
		this.airPressure = airPressure;
	}

	public WiperSet getRainRates() {
		return rainRates;
	}

	public void setRainRates(WiperSet rainRates) {
		this.rainRates = rainRates;
	}

	WeatherProbe() {
		super(true);
	}
}