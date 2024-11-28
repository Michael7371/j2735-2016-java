package asn2pojo.runtime.types;

/**
 * Character range = 0..127, UPER encoded with 7 bits per character
 * Ref: ITU-T X.691 (02/2021) Section 30
 */
public class IA5String extends Asn1CharacterString {


    public IA5String(int minLength, int maxLength) {
        super(minLength, maxLength);
    }

//    @Override
//    public BitSet toUper() {
//        return null;
//    }
//
//    @Override
//    public BitSet fromUper(BitSet bits) {
//        return null;
//    }
}
