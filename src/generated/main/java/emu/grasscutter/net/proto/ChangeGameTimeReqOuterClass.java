// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeGameTimeReq.proto

package emu.grasscutter.net.proto;

public final class ChangeGameTimeReqOuterClass {
  private ChangeGameTimeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeGameTimeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeGameTimeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 extraDays = 7;</code>
     * @return The extraDays.
     */
    int getExtraDays();

    /**
     * <code>bool isForceSet = 6;</code>
     * @return The isForceSet.
     */
    boolean getIsForceSet();

    /**
     * <code>uint32 gameTime = 9;</code>
     * @return The gameTime.
     */
    int getGameTime();
  }
  /**
   * Protobuf type {@code ChangeGameTimeReq}
   */
  public static final class ChangeGameTimeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeGameTimeReq)
      ChangeGameTimeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeGameTimeReq.newBuilder() to construct.
    private ChangeGameTimeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeGameTimeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChangeGameTimeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code ChangeGameTimeReq.ALPCPKGFHFL}
     */
    public enum ALPCPKGFHFL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 162;</code>
       */
      PEPPOHPHJOJ(1, 162),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ALPCPKGFHFL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final ALPCPKGFHFL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 162;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 162;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static ALPCPKGFHFL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ALPCPKGFHFL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 162: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ALPCPKGFHFL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ALPCPKGFHFL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ALPCPKGFHFL>() {
              public ALPCPKGFHFL findValueByNumber(int number) {
                return ALPCPKGFHFL.forNumber(number);
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
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final ALPCPKGFHFL[] VALUES = getStaticValuesArray();
      private static ALPCPKGFHFL[] getStaticValuesArray() {
        return new ALPCPKGFHFL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static ALPCPKGFHFL valueOf(
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

      private ALPCPKGFHFL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ChangeGameTimeReq.ALPCPKGFHFL)
    }

    public static final int EXTRADAYS_FIELD_NUMBER = 7;
    private int extraDays_ = 0;
    /**
     * <code>uint32 extraDays = 7;</code>
     * @return The extraDays.
     */
    @java.lang.Override
    public int getExtraDays() {
      return extraDays_;
    }

    public static final int ISFORCESET_FIELD_NUMBER = 6;
    private boolean isForceSet_ = false;
    /**
     * <code>bool isForceSet = 6;</code>
     * @return The isForceSet.
     */
    @java.lang.Override
    public boolean getIsForceSet() {
      return isForceSet_;
    }

    public static final int GAMETIME_FIELD_NUMBER = 9;
    private int gameTime_ = 0;
    /**
     * <code>uint32 gameTime = 9;</code>
     * @return The gameTime.
     */
    @java.lang.Override
    public int getGameTime() {
      return gameTime_;
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
      if (isForceSet_ != false) {
        output.writeBool(6, isForceSet_);
      }
      if (extraDays_ != 0) {
        output.writeUInt32(7, extraDays_);
      }
      if (gameTime_ != 0) {
        output.writeUInt32(9, gameTime_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isForceSet_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isForceSet_);
      }
      if (extraDays_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, extraDays_);
      }
      if (gameTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gameTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other = (emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) obj;

      if (getExtraDays()
          != other.getExtraDays()) return false;
      if (getIsForceSet()
          != other.getIsForceSet()) return false;
      if (getGameTime()
          != other.getGameTime()) return false;
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
      hash = (37 * hash) + EXTRADAYS_FIELD_NUMBER;
      hash = (53 * hash) + getExtraDays();
      hash = (37 * hash) + ISFORCESET_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsForceSet());
      hash = (37 * hash) + GAMETIME_FIELD_NUMBER;
      hash = (53 * hash) + getGameTime();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq prototype) {
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
     * Protobuf type {@code ChangeGameTimeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeGameTimeReq)
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.class, emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.newBuilder()
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
        extraDays_ = 0;
        isForceSet_ = false;
        gameTime_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.internal_static_ChangeGameTimeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq build() {
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq buildPartial() {
        emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result = new emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.extraDays_ = extraDays_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isForceSet_ = isForceSet_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gameTime_ = gameTime_;
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
        if (other instanceof emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq other) {
        if (other == emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq.getDefaultInstance()) return this;
        if (other.getExtraDays() != 0) {
          setExtraDays(other.getExtraDays());
        }
        if (other.getIsForceSet() != false) {
          setIsForceSet(other.getIsForceSet());
        }
        if (other.getGameTime() != 0) {
          setGameTime(other.getGameTime());
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
              case 48: {
                isForceSet_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 56: {
                extraDays_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 56
              case 72: {
                gameTime_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 72
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

      private int extraDays_ ;
      /**
       * <code>uint32 extraDays = 7;</code>
       * @return The extraDays.
       */
      @java.lang.Override
      public int getExtraDays() {
        return extraDays_;
      }
      /**
       * <code>uint32 extraDays = 7;</code>
       * @param value The extraDays to set.
       * @return This builder for chaining.
       */
      public Builder setExtraDays(int value) {
        
        extraDays_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 extraDays = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearExtraDays() {
        bitField0_ = (bitField0_ & ~0x00000001);
        extraDays_ = 0;
        onChanged();
        return this;
      }

      private boolean isForceSet_ ;
      /**
       * <code>bool isForceSet = 6;</code>
       * @return The isForceSet.
       */
      @java.lang.Override
      public boolean getIsForceSet() {
        return isForceSet_;
      }
      /**
       * <code>bool isForceSet = 6;</code>
       * @param value The isForceSet to set.
       * @return This builder for chaining.
       */
      public Builder setIsForceSet(boolean value) {
        
        isForceSet_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isForceSet = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsForceSet() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isForceSet_ = false;
        onChanged();
        return this;
      }

      private int gameTime_ ;
      /**
       * <code>uint32 gameTime = 9;</code>
       * @return The gameTime.
       */
      @java.lang.Override
      public int getGameTime() {
        return gameTime_;
      }
      /**
       * <code>uint32 gameTime = 9;</code>
       * @param value The gameTime to set.
       * @return This builder for chaining.
       */
      public Builder setGameTime(int value) {
        
        gameTime_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gameTime = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGameTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gameTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ChangeGameTimeReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeGameTimeReq)
    private static final emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq();
    }

    public static emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeGameTimeReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeGameTimeReq>() {
      @java.lang.Override
      public ChangeGameTimeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChangeGameTimeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeGameTimeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeGameTimeReqOuterClass.ChangeGameTimeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeGameTimeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeGameTimeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ChangeGameTimeReq.proto\"\256\001\n\021ChangeGame" +
      "TimeReq\022\021\n\textraDays\030\007 \001(\r\022\022\n\nisForceSet" +
      "\030\006 \001(\010\022\020\n\010gameTime\030\t \001(\r\"`\n\013ALPCPKGFHFL\022" +
      "\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\242\001\022\017\n\013DCDNILFDF" +
      "LB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002" +
      "\020\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeGameTimeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChangeGameTimeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeGameTimeReq_descriptor,
        new java.lang.String[] { "ExtraDays", "IsForceSet", "GameTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
