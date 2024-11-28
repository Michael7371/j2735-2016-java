package asn2pojo.runtime.types;

import asn2pojo.runtime.serialization.SerializationUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class Asn1Sequence implements Asn1Type {

    final boolean extensionMarker;

    public Asn1Sequence(boolean hasExtensionMarker) {
        this.extensionMarker = hasExtensionMarker;
    }

    public boolean hasExtensionMarker() {
        return extensionMarker;
    }

//    /**
//     * @return List of all fields in order for encoding, and indicating which are optional
//     */
//    abstract protected List<Asn1Field> listFields();
//
//    /**
//     * Set field values form an ordered list
//     * @param fields Ordered list of all fields
//     */
//    abstract protected void setFields(List<Asn1Field> fields);

//    /**
//     * @return BitSet indicating which optional fields are non-null.  The length
//     * indicates how many optional fields there are.
//     */
//    private BitSet optionalFields() {
//        List<Asn1Field> fields = listFields();
//        List<Asn1Field> optFields = new ArrayList<>();
//        for (Asn1Field field : fields) {
//            if (field.optional()) {
//                optFields.add(field);
//            }
//        }
//        int numOptFields = fields.size();
//        BitSet optBits = new BitSet(numOptFields);
//        if (numOptFields > 0) {
//            for (int i = 0; i < numOptFields; i++) {
//                boolean isPresent = (optFields.get(i) != null);
//                optBits.set(i, isPresent);
//            }
//        }
//        return optBits;
//    }

//    private int numberOfOptionaFields() {
//        return optionalFields().length();
//    }

//    @Override
//    public BitSet toUper() {
//        // Ref. ITU-T X.691 (02/2021) Sec. 19
//        List<Boolean> bits = new ArrayList<>();
//
//        if (hasExtensionMarker) {
//            // Add the extension marker, which is always 0 because extensions are not supported
//            bits.add(false);
//        }
//
//        // Add the preamble for optional fields
//        BitSet optionals = optionalFields();
//        if (!optionals.isEmpty()) {
//            appendBits(bits, optionals);
//        }
//
//        // Add each field that is present
//        for (Asn1Field field : listFields()) {
//            if (field.value() != null) {
//                BitSet fieldBits = field.value().toUper();
//                appendBits(bits, fieldBits);
//            }
//        }
//
//        return getBitSet(bits);
//    }

//    @Override
//    public BitSet fromUper(BitSet bits) {
//
//        BitSet remainder = bits;
//
//        // Remove the extension marker if present
//        if (hasExtensionMarker) {
//            BitSetPair popExtension = popBits(remainder, 1);
//            boolean extensionMarker = popExtension.value().get(0);
//            if (extensionMarker) {
//                throw new RuntimeException("Extensions not supported");
//            }
//            remainder = popExtension.remainder();
//        }
//
//        // Read the preamble
//        final int numOptional = numberOfOptionaFields();
//        BitSetPair popPreamble = popBits(remainder, numOptional);
//        BitSet preamble = popPreamble.value();
//        remainder = popPreamble.remainder();
//
//
//        // Read each field
//        List<Asn1Field> fields = listFields();
//        int optIndex = 0; // Index of optional fields
//        for (Asn1Field field : fields) {
//            if (field.optional()) {
//                // Check if the optional field is present in the preamble
//                if (preamble.get(optIndex)) {
//                    remainder = field.value().fromUper(remainder);
//                }
//                optIndex++;
//            } else {
//                // Not optional, just consume it
//                remainder = field.value().fromUper(remainder);
//            }
//        }
//        setFields(fields);
//
//        return remainder;
//    }

    @Override
    public String toString() {
        ObjectMapper mapper = SerializationUtil.jsonMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }
}
