// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerPropChangeReasonNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerPropChangeReasonNotifyOuterClass {
  private PlayerPropChangeReasonNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerPropChangeReasonNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerPropChangeReasonNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 propType = 6;</code>
     * @return The propType.
     */
    int getPropType();

    /**
     * <code>float oldValue = 12;</code>
     * @return The oldValue.
     */
    float getOldValue();

    /**
     * <code>float curValue = 9;</code>
     * @return The curValue.
     */
    float getCurValue();

    /**
     * <code>.PropChangeReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.PropChangeReason reason = 1;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason();
  }
  /**
   * Protobuf type {@code PlayerPropChangeReasonNotify}
   */
  public static final class PlayerPropChangeReasonNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerPropChangeReasonNotify)
      PlayerPropChangeReasonNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerPropChangeReasonNotify.newBuilder() to construct.
    private PlayerPropChangeReasonNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerPropChangeReasonNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerPropChangeReasonNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.class, emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerPropChangeReasonNotify.FKHLDBGKFKK}
     */
    public enum FKHLDBGKFKK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1214;</code>
       */
      PEPPOHPHJOJ(1, 1214),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final FKHLDBGKFKK DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1214;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1214;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static FKHLDBGKFKK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static FKHLDBGKFKK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1214: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FKHLDBGKFKK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FKHLDBGKFKK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FKHLDBGKFKK>() {
              public FKHLDBGKFKK findValueByNumber(int number) {
                return FKHLDBGKFKK.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final FKHLDBGKFKK[] VALUES = getStaticValuesArray();
      private static FKHLDBGKFKK[] getStaticValuesArray() {
        return new FKHLDBGKFKK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static FKHLDBGKFKK valueOf(
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

      private final int index;
      private final int value;

      private FKHLDBGKFKK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerPropChangeReasonNotify.FKHLDBGKFKK)
    }

    public static final int PROPTYPE_FIELD_NUMBER = 6;
    private int propType_ = 0;
    /**
     * <code>uint32 propType = 6;</code>
     * @return The propType.
     */
    @java.lang.Override
    public int getPropType() {
      return propType_;
    }

    public static final int OLDVALUE_FIELD_NUMBER = 12;
    private float oldValue_ = 0F;
    /**
     * <code>float oldValue = 12;</code>
     * @return The oldValue.
     */
    @java.lang.Override
    public float getOldValue() {
      return oldValue_;
    }

    public static final int CURVALUE_FIELD_NUMBER = 9;
    private float curValue_ = 0F;
    /**
     * <code>float curValue = 9;</code>
     * @return The curValue.
     */
    @java.lang.Override
    public float getCurValue() {
      return curValue_;
    }

    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_ = 0;
    /**
     * <code>.PropChangeReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.PropChangeReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
      emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.forNumber(reason_);
      return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
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
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        output.writeEnum(1, reason_);
      }
      if (propType_ != 0) {
        output.writeUInt32(6, propType_);
      }
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        output.writeFloat(9, curValue_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        output.writeFloat(12, oldValue_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (propType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, propType_);
      }
      if (java.lang.Float.floatToRawIntBits(curValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(9, curValue_);
      }
      if (java.lang.Float.floatToRawIntBits(oldValue_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(12, oldValue_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify other = (emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify) obj;

      if (getPropType()
          != other.getPropType()) return false;
      if (java.lang.Float.floatToIntBits(getOldValue())
          != java.lang.Float.floatToIntBits(
              other.getOldValue())) return false;
      if (java.lang.Float.floatToIntBits(getCurValue())
          != java.lang.Float.floatToIntBits(
              other.getCurValue())) return false;
      if (reason_ != other.reason_) return false;
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
      hash = (37 * hash) + PROPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPropType();
      hash = (37 * hash) + OLDVALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getOldValue());
      hash = (37 * hash) + CURVALUE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getCurValue());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify prototype) {
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
     * Protobuf type {@code PlayerPropChangeReasonNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerPropChangeReasonNotify)
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.class, emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        propType_ = 0;
        oldValue_ = 0F;
        curValue_ = 0F;
        reason_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify build() {
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify result = new emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.propType_ = propType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.oldValue_ = oldValue_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.curValue_ = curValue_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.reason_ = reason_;
        }
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
        if (other instanceof emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify.getDefaultInstance()) return this;
        if (other.getPropType() != 0) {
          setPropType(other.getPropType());
        }
        if (other.getOldValue() != 0F) {
          setOldValue(other.getOldValue());
        }
        if (other.getCurValue() != 0F) {
          setCurValue(other.getCurValue());
        }
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
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
              case 8: {
                reason_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 8
              case 48: {
                propType_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 77: {
                curValue_ = input.readFloat();
                bitField0_ |= 0x00000004;
                break;
              } // case 77
              case 101: {
                oldValue_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 101
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

      private int propType_ ;
      /**
       * <code>uint32 propType = 6;</code>
       * @return The propType.
       */
      @java.lang.Override
      public int getPropType() {
        return propType_;
      }
      /**
       * <code>uint32 propType = 6;</code>
       * @param value The propType to set.
       * @return This builder for chaining.
       */
      public Builder setPropType(int value) {
        
        propType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 propType = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPropType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        propType_ = 0;
        onChanged();
        return this;
      }

      private float oldValue_ ;
      /**
       * <code>float oldValue = 12;</code>
       * @return The oldValue.
       */
      @java.lang.Override
      public float getOldValue() {
        return oldValue_;
      }
      /**
       * <code>float oldValue = 12;</code>
       * @param value The oldValue to set.
       * @return This builder for chaining.
       */
      public Builder setOldValue(float value) {
        
        oldValue_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>float oldValue = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        oldValue_ = 0F;
        onChanged();
        return this;
      }

      private float curValue_ ;
      /**
       * <code>float curValue = 9;</code>
       * @return The curValue.
       */
      @java.lang.Override
      public float getCurValue() {
        return curValue_;
      }
      /**
       * <code>float curValue = 9;</code>
       * @param value The curValue to set.
       * @return This builder for chaining.
       */
      public Builder setCurValue(float value) {
        
        curValue_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>float curValue = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        curValue_ = 0F;
        onChanged();
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.PropChangeReason reason = 1;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.PropChangeReason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        reason_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason getReason() {
        emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason result = emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.forNumber(reason_);
        return result == null ? emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.PropChangeReason reason = 1;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.PropChangeReasonOuterClass.PropChangeReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.PropChangeReason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        bitField0_ = (bitField0_ & ~0x00000008);
        reason_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:PlayerPropChangeReasonNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerPropChangeReasonNotify)
    private static final emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify();
    }

    public static emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerPropChangeReasonNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerPropChangeReasonNotify>() {
      @java.lang.Override
      public PlayerPropChangeReasonNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerPropChangeReasonNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerPropChangeReasonNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerPropChangeReasonNotifyOuterClass.PlayerPropChangeReasonNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPropChangeReasonNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"PlayerPropChangeReasonNotify.proto\032\026Pr" +
      "opChangeReason.proto\"\310\001\n\034PlayerPropChang" +
      "eReasonNotify\022\020\n\010propType\030\006 \001(\r\022\020\n\010oldVa" +
      "lue\030\014 \001(\002\022\020\n\010curValue\030\t \001(\002\022!\n\006reason\030\001 " +
      "\001(\0162\021.PropChangeReason\"O\n\013FKHLDBGKFKK\022\010\n" +
      "\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\276\t\022\017\n\013DCDNILFDFLB" +
      "\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "PropType", "OldValue", "CurValue", "Reason", });
    emu.grasscutter.net.proto.PropChangeReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
