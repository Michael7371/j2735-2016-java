package asn2pojo.runtime.types;

public interface Asn1Enumerated extends Asn1Type {
    int getIndex();
    String getName();
    boolean hasExtensionMarker();
    int maxIndex();


//    @Override
//    default BitSet toUper() {
//        // Ref. ITU-T X.691 (02/2021) Sec. 14
//        BitSet result = new BitSet(0);
//
//        if (hasExtensionMarker()) {
//            // Add the extension marker, which is always 0 because extensions are not supported
//            BitSet ext = new BitSet(1);
//            ext.set(0, false);
//            result = appendBits(result, ext);
//        }
//
//        Asn1Integer encValue = new Asn1Integer(0, maxIndex());
//        encValue.setValue(getIndex());
//        BitSet encodedValue = encValue.toUper();
//        result = appendBits(result, encodedValue);
//
//        return result;
//    }
//
//    @Override
//    default BitSet fromUper(BitSet bits) {
//        return null;
//    }
}
