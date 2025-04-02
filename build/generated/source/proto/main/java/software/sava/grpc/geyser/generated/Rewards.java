// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: solana-storage.proto

// Protobuf Java Version: 3.25.5
package software.sava.grpc.geyser.generated;

/**
 * Protobuf type {@code solana.storage.ConfirmedBlock.Rewards}
 */
public final class Rewards extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:solana.storage.ConfirmedBlock.Rewards)
    RewardsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Rewards.newBuilder() to construct.
  private Rewards(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Rewards() {
    rewards_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Rewards();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_Rewards_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_Rewards_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            software.sava.grpc.geyser.generated.Rewards.class, software.sava.grpc.geyser.generated.Rewards.Builder.class);
  }

  private int bitField0_;
  public static final int REWARDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<software.sava.grpc.geyser.generated.Reward> rewards_;
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  @java.lang.Override
  public java.util.List<software.sava.grpc.geyser.generated.Reward> getRewardsList() {
    return rewards_;
  }
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends software.sava.grpc.geyser.generated.RewardOrBuilder> 
      getRewardsOrBuilderList() {
    return rewards_;
  }
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  @java.lang.Override
  public int getRewardsCount() {
    return rewards_.size();
  }
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.Reward getRewards(int index) {
    return rewards_.get(index);
  }
  /**
   * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.RewardOrBuilder getRewardsOrBuilder(
      int index) {
    return rewards_.get(index);
  }

  public static final int NUM_PARTITIONS_FIELD_NUMBER = 2;
  private software.sava.grpc.geyser.generated.NumPartitions numPartitions_;
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   * @return Whether the numPartitions field is set.
   */
  @java.lang.Override
  public boolean hasNumPartitions() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   * @return The numPartitions.
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.NumPartitions getNumPartitions() {
    return numPartitions_ == null ? software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance() : numPartitions_;
  }
  /**
   * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
   */
  @java.lang.Override
  public software.sava.grpc.geyser.generated.NumPartitionsOrBuilder getNumPartitionsOrBuilder() {
    return numPartitions_ == null ? software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance() : numPartitions_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < rewards_.size(); i++) {
      output.writeMessage(1, rewards_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getNumPartitions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < rewards_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, rewards_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getNumPartitions());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof software.sava.grpc.geyser.generated.Rewards)) {
      return super.equals(obj);
    }
    software.sava.grpc.geyser.generated.Rewards other = (software.sava.grpc.geyser.generated.Rewards) obj;

    if (!getRewardsList()
        .equals(other.getRewardsList())) return false;
    if (hasNumPartitions() != other.hasNumPartitions()) return false;
    if (hasNumPartitions()) {
      if (!getNumPartitions()
          .equals(other.getNumPartitions())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getRewardsCount() > 0) {
      hash = (37 * hash) + REWARDS_FIELD_NUMBER;
      hash = (53 * hash) + getRewardsList().hashCode();
    }
    if (hasNumPartitions()) {
      hash = (37 * hash) + NUM_PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getNumPartitions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static software.sava.grpc.geyser.generated.Rewards parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static software.sava.grpc.geyser.generated.Rewards parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static software.sava.grpc.geyser.generated.Rewards parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(software.sava.grpc.geyser.generated.Rewards prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code solana.storage.ConfirmedBlock.Rewards}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:solana.storage.ConfirmedBlock.Rewards)
      software.sava.grpc.geyser.generated.RewardsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_Rewards_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_Rewards_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              software.sava.grpc.geyser.generated.Rewards.class, software.sava.grpc.geyser.generated.Rewards.Builder.class);
    }

    // Construct using software.sava.grpc.geyser.generated.Rewards.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getRewardsFieldBuilder();
        getNumPartitionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
      } else {
        rewards_ = null;
        rewardsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      numPartitions_ = null;
      if (numPartitionsBuilder_ != null) {
        numPartitionsBuilder_.dispose();
        numPartitionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return software.sava.grpc.geyser.generated.SolanaStorage.internal_static_solana_storage_ConfirmedBlock_Rewards_descriptor;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.Rewards getDefaultInstanceForType() {
      return software.sava.grpc.geyser.generated.Rewards.getDefaultInstance();
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.Rewards build() {
      software.sava.grpc.geyser.generated.Rewards result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public software.sava.grpc.geyser.generated.Rewards buildPartial() {
      software.sava.grpc.geyser.generated.Rewards result = new software.sava.grpc.geyser.generated.Rewards(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(software.sava.grpc.geyser.generated.Rewards result) {
      if (rewardsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          rewards_ = java.util.Collections.unmodifiableList(rewards_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rewards_ = rewards_;
      } else {
        result.rewards_ = rewardsBuilder_.build();
      }
    }

    private void buildPartial0(software.sava.grpc.geyser.generated.Rewards result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numPartitions_ = numPartitionsBuilder_ == null
            ? numPartitions_
            : numPartitionsBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof software.sava.grpc.geyser.generated.Rewards) {
        return mergeFrom((software.sava.grpc.geyser.generated.Rewards)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(software.sava.grpc.geyser.generated.Rewards other) {
      if (other == software.sava.grpc.geyser.generated.Rewards.getDefaultInstance()) return this;
      if (rewardsBuilder_ == null) {
        if (!other.rewards_.isEmpty()) {
          if (rewards_.isEmpty()) {
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardsIsMutable();
            rewards_.addAll(other.rewards_);
          }
          onChanged();
        }
      } else {
        if (!other.rewards_.isEmpty()) {
          if (rewardsBuilder_.isEmpty()) {
            rewardsBuilder_.dispose();
            rewardsBuilder_ = null;
            rewards_ = other.rewards_;
            bitField0_ = (bitField0_ & ~0x00000001);
            rewardsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRewardsFieldBuilder() : null;
          } else {
            rewardsBuilder_.addAllMessages(other.rewards_);
          }
        }
      }
      if (other.hasNumPartitions()) {
        mergeNumPartitions(other.getNumPartitions());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              software.sava.grpc.geyser.generated.Reward m =
                  input.readMessage(
                      software.sava.grpc.geyser.generated.Reward.parser(),
                      extensionRegistry);
              if (rewardsBuilder_ == null) {
                ensureRewardsIsMutable();
                rewards_.add(m);
              } else {
                rewardsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getNumPartitionsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<software.sava.grpc.geyser.generated.Reward> rewards_ =
      java.util.Collections.emptyList();
    private void ensureRewardsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        rewards_ = new java.util.ArrayList<software.sava.grpc.geyser.generated.Reward>(rewards_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        software.sava.grpc.geyser.generated.Reward, software.sava.grpc.geyser.generated.Reward.Builder, software.sava.grpc.geyser.generated.RewardOrBuilder> rewardsBuilder_;

    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public java.util.List<software.sava.grpc.geyser.generated.Reward> getRewardsList() {
      if (rewardsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(rewards_);
      } else {
        return rewardsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public int getRewardsCount() {
      if (rewardsBuilder_ == null) {
        return rewards_.size();
      } else {
        return rewardsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public software.sava.grpc.geyser.generated.Reward getRewards(int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);
      } else {
        return rewardsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder setRewards(
        int index, software.sava.grpc.geyser.generated.Reward value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.set(index, value);
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder setRewards(
        int index, software.sava.grpc.geyser.generated.Reward.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.set(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder addRewards(software.sava.grpc.geyser.generated.Reward value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder addRewards(
        int index, software.sava.grpc.geyser.generated.Reward value) {
      if (rewardsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRewardsIsMutable();
        rewards_.add(index, value);
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder addRewards(
        software.sava.grpc.geyser.generated.Reward.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder addRewards(
        int index, software.sava.grpc.geyser.generated.Reward.Builder builderForValue) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.add(index, builderForValue.build());
        onChanged();
      } else {
        rewardsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder addAllRewards(
        java.lang.Iterable<? extends software.sava.grpc.geyser.generated.Reward> values) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rewards_);
        onChanged();
      } else {
        rewardsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder clearRewards() {
      if (rewardsBuilder_ == null) {
        rewards_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        rewardsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public Builder removeRewards(int index) {
      if (rewardsBuilder_ == null) {
        ensureRewardsIsMutable();
        rewards_.remove(index);
        onChanged();
      } else {
        rewardsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public software.sava.grpc.geyser.generated.Reward.Builder getRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public software.sava.grpc.geyser.generated.RewardOrBuilder getRewardsOrBuilder(
        int index) {
      if (rewardsBuilder_ == null) {
        return rewards_.get(index);  } else {
        return rewardsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public java.util.List<? extends software.sava.grpc.geyser.generated.RewardOrBuilder> 
         getRewardsOrBuilderList() {
      if (rewardsBuilder_ != null) {
        return rewardsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(rewards_);
      }
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public software.sava.grpc.geyser.generated.Reward.Builder addRewardsBuilder() {
      return getRewardsFieldBuilder().addBuilder(
          software.sava.grpc.geyser.generated.Reward.getDefaultInstance());
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public software.sava.grpc.geyser.generated.Reward.Builder addRewardsBuilder(
        int index) {
      return getRewardsFieldBuilder().addBuilder(
          index, software.sava.grpc.geyser.generated.Reward.getDefaultInstance());
    }
    /**
     * <code>repeated .solana.storage.ConfirmedBlock.Reward rewards = 1;</code>
     */
    public java.util.List<software.sava.grpc.geyser.generated.Reward.Builder> 
         getRewardsBuilderList() {
      return getRewardsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        software.sava.grpc.geyser.generated.Reward, software.sava.grpc.geyser.generated.Reward.Builder, software.sava.grpc.geyser.generated.RewardOrBuilder> 
        getRewardsFieldBuilder() {
      if (rewardsBuilder_ == null) {
        rewardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            software.sava.grpc.geyser.generated.Reward, software.sava.grpc.geyser.generated.Reward.Builder, software.sava.grpc.geyser.generated.RewardOrBuilder>(
                rewards_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        rewards_ = null;
      }
      return rewardsBuilder_;
    }

    private software.sava.grpc.geyser.generated.NumPartitions numPartitions_;
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.NumPartitions, software.sava.grpc.geyser.generated.NumPartitions.Builder, software.sava.grpc.geyser.generated.NumPartitionsOrBuilder> numPartitionsBuilder_;
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     * @return Whether the numPartitions field is set.
     */
    public boolean hasNumPartitions() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     * @return The numPartitions.
     */
    public software.sava.grpc.geyser.generated.NumPartitions getNumPartitions() {
      if (numPartitionsBuilder_ == null) {
        return numPartitions_ == null ? software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance() : numPartitions_;
      } else {
        return numPartitionsBuilder_.getMessage();
      }
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public Builder setNumPartitions(software.sava.grpc.geyser.generated.NumPartitions value) {
      if (numPartitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        numPartitions_ = value;
      } else {
        numPartitionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public Builder setNumPartitions(
        software.sava.grpc.geyser.generated.NumPartitions.Builder builderForValue) {
      if (numPartitionsBuilder_ == null) {
        numPartitions_ = builderForValue.build();
      } else {
        numPartitionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public Builder mergeNumPartitions(software.sava.grpc.geyser.generated.NumPartitions value) {
      if (numPartitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          numPartitions_ != null &&
          numPartitions_ != software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance()) {
          getNumPartitionsBuilder().mergeFrom(value);
        } else {
          numPartitions_ = value;
        }
      } else {
        numPartitionsBuilder_.mergeFrom(value);
      }
      if (numPartitions_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public Builder clearNumPartitions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numPartitions_ = null;
      if (numPartitionsBuilder_ != null) {
        numPartitionsBuilder_.dispose();
        numPartitionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public software.sava.grpc.geyser.generated.NumPartitions.Builder getNumPartitionsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getNumPartitionsFieldBuilder().getBuilder();
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    public software.sava.grpc.geyser.generated.NumPartitionsOrBuilder getNumPartitionsOrBuilder() {
      if (numPartitionsBuilder_ != null) {
        return numPartitionsBuilder_.getMessageOrBuilder();
      } else {
        return numPartitions_ == null ?
            software.sava.grpc.geyser.generated.NumPartitions.getDefaultInstance() : numPartitions_;
      }
    }
    /**
     * <code>.solana.storage.ConfirmedBlock.NumPartitions num_partitions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        software.sava.grpc.geyser.generated.NumPartitions, software.sava.grpc.geyser.generated.NumPartitions.Builder, software.sava.grpc.geyser.generated.NumPartitionsOrBuilder> 
        getNumPartitionsFieldBuilder() {
      if (numPartitionsBuilder_ == null) {
        numPartitionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            software.sava.grpc.geyser.generated.NumPartitions, software.sava.grpc.geyser.generated.NumPartitions.Builder, software.sava.grpc.geyser.generated.NumPartitionsOrBuilder>(
                getNumPartitions(),
                getParentForChildren(),
                isClean());
        numPartitions_ = null;
      }
      return numPartitionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:solana.storage.ConfirmedBlock.Rewards)
  }

  // @@protoc_insertion_point(class_scope:solana.storage.ConfirmedBlock.Rewards)
  private static final software.sava.grpc.geyser.generated.Rewards DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new software.sava.grpc.geyser.generated.Rewards();
  }

  public static software.sava.grpc.geyser.generated.Rewards getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Rewards>
      PARSER = new com.google.protobuf.AbstractParser<Rewards>() {
    @java.lang.Override
    public Rewards parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Rewards> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Rewards> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public software.sava.grpc.geyser.generated.Rewards getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

