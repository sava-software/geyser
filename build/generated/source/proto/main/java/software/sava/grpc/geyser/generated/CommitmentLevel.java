// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geyser.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

/**
 * Protobuf enum {@code geyser.CommitmentLevel}
 */
public enum CommitmentLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PROCESSED = 0;</code>
   */
  PROCESSED(0),
  /**
   * <code>CONFIRMED = 1;</code>
   */
  CONFIRMED(1),
  /**
   * <code>FINALIZED = 2;</code>
   */
  FINALIZED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PROCESSED = 0;</code>
   */
  public static final int PROCESSED_VALUE = 0;
  /**
   * <code>CONFIRMED = 1;</code>
   */
  public static final int CONFIRMED_VALUE = 1;
  /**
   * <code>FINALIZED = 2;</code>
   */
  public static final int FINALIZED_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CommitmentLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CommitmentLevel forNumber(int value) {
    switch (value) {
      case 0: return PROCESSED;
      case 1: return CONFIRMED;
      case 2: return FINALIZED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommitmentLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommitmentLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommitmentLevel>() {
          public CommitmentLevel findValueByNumber(int number) {
            return CommitmentLevel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.GeyserOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final CommitmentLevel[] VALUES = values();

  public static CommitmentLevel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommitmentLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:geyser.CommitmentLevel)
}

