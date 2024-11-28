package j2735.ITIS;

import asn2pojo.runtime.types.Asn1Sequence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import asn2pojo.runtime.types.Asn1Choice;
import java.util.List;
import java.util.Optional;
import asn2pojo.runtime.types.Asn1Type;
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
public class ITIScodesAndTextSequence extends Asn1Sequence {

	@Asn1Property(tag = 0)
	private ItemChoice item;

	@JsonInclude(Include.NON_NULL)
	public static class ItemChoice extends Asn1Choice {
		@Asn1Property(tag = 0)
		private ITIScodes itis;
		@Asn1Property(tag = 1)
		private ITIStext text;

		ItemChoice() {
			super(false);
		}

		public ITIScodes getItis() {
			return itis;
		}

		public void setItis(ITIScodes itis) {
			this.itis = itis;
		}

		public ITIStext getText() {
			return text;
		}

		public void setText(ITIStext text) {
			this.text = text;
		}

		@Override
		protected List<Optional<Asn1Type>> listTypes() {
			return null;
		}
	}

	public ItemChoice getItem() {
		return item;
	}

	public void setItem(ItemChoice item) {
		this.item = item;
	}

	ITIScodesAndTextSequence() {
		super(false);
	}
}