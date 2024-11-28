# J2735 (2016) XER/JER Implementation in Java

This is a library containing a complete set of Java classes that are capable of being serialized and deserialized
to/from standard XER and JER using only Jackson ObjectMapper and XmlMapper.

The classes were generated from the 2016 edition of the J2735 specification using a new ASN.1 compiler for Java.

They have been tested with one example each of a SPaT and TIM message frame.
Obviously more testing of other MessageFrame types is needed.

## Packages:
* `main/j2735.*`: The generated classes.
* `main/asn2pojo.runtime`: The runtime library containing base classes, custom serializers/deserializers and annotations.
* `test/j2735/DSRC`: Unit tests

## Requires:
* Java 21 JDK

## Usage examples:

### Deserialize from XER:
```java
String XML =
        """
        <MessageFrame>
                <messageId>19</messageId>
                <value>
                    <SPAT>
                        <timeStamp>400000</timeStamp>
                        <name>Example Name</name>
                        <intersections>
                            <IntersectionState>
        ...
        """;

XmlMapper xmlMapper = new XmlMapper();
SPATMessageFrame spatMessageFrame = xmlMapper.readValue(xml, SPATMessageFrame.class);
int messageId = spatMessageFrame.getMessageId();
```

### Serialize to JER:
```java
ObjectMapper jsonMapper = new ObjectMapper();
SPATMessageFrame spat = createSpat();
String json = jsonMapper.writeValueAsString(spat);
```
Partial output:
```json
{
    "value": {
        "timeStamp": 400000,
        "name": "Example Name",
        "intersections": [
            {
                "id": {
                "region": 0,
                "id": 12111
            },
            "revision": 0,
...
```

The unit tests include more complete usage examples.
