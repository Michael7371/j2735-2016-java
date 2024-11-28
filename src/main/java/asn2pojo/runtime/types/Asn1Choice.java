package asn2pojo.runtime.types;

import asn2pojo.runtime.serialization.SerializationUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Optional;

public abstract class Asn1Choice implements Asn1Type {

    final boolean hasExtensionMarker;

    public Asn1Choice(boolean hasExtensionMarker) {
        this.hasExtensionMarker = hasExtensionMarker;
    }

    /**
     * Validates if one and only one option is selected for the choice
     */
    protected boolean isValid() {
        var types = listTypes();
        long numChosen = types.stream().filter(Optional::isPresent).count();
        return numChosen == 1;
    }

    /**
     * Ref ITU-T X.691 (02/2021) Section 23
     * @return the index of the chosen alternative
     */
    protected int chosenIndex() {
        List<Optional<Asn1Type>> types = listTypes();
        for (int i = 0; i < types.size(); i++) {
            if (types.get(i).isPresent()) return i;
        }
        return -1;
    }

    protected int maxIndex() {
        return listTypes().size() - 1;
    }

    abstract protected List<Optional<Asn1Type>> listTypes();


//    @Override
//    public BitSet toUper() {
//        if (!isValid()) {
//            throw new RuntimeException("The CHOICE is not valid.  The number of chosen items is not 1.");
//        }
//
//        List<Boolean> bits = new ArrayList<>();
//
//        if (hasExtensionMarker) {
//            // Add the extension marker, which is always 0 because extensions are not supported
//            bits.add(false);
//        }
//
//        // Add the chosen index encoded as a constrained integer
//        final int chosenIndex = chosenIndex();
//        Asn1Integer index = new Asn1Integer(0, maxIndex());
//        index.setValue(chosenIndex);
//        BitSet uperIndex = index.toUper();
//        appendBits(bits, uperIndex);
//
//        // Add the chosen field
//        var types = listTypes();
//        BitSet chosen = types.get(chosenIndex).get().toUper();
//        appendBits(bits, chosen);
//
//        return getBitSet(bits);
//    }

//    @Override
//    public BitSet fromUper(BitSet bits) {
//        return null;
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
