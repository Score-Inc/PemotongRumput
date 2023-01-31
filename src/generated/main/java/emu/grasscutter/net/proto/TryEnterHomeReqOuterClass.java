// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterHomeReq.proto

package emu.grasscutter.net.proto;

public final class TryEnterHomeReqOuterClass {
  private TryEnterHomeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TryEnterHomeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TryEnterHomeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 targetPoint = 11;</code>
     * @return The targetPoint.
     */
    int getTargetPoint();

    /**
     * <code>bool isTransferToSafePoint = 4;</code>
     * @return The isTransferToSafePoint.
     */
    boolean getIsTransferToSafePoint();

    /**
     * <code>uint32 targetUid = 6;</code>
     * @return The targetUid.
     */
    int getTargetUid();
  }
  /**
   * Protobuf type {@code TryEnterHomeReq}
   */
  public static final class TryEnterHomeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TryEnterHomeReq)
      TryEnterHomeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TryEnterHomeReq.newBuilder() to construct.
    private TryEnterHomeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TryEnterHomeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TryEnterHomeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code TryEnterHomeReq.PIDLCBDIAGA}
     */
    public enum PIDLCBDIAGA
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4455;</code>
       */
      PEPPOHPHJOJ(1, 4455),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final PIDLCBDIAGA DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final PIDLCBDIAGA EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4455;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4455;
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
      public static PIDLCBDIAGA valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static PIDLCBDIAGA forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4455: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<PIDLCBDIAGA>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          PIDLCBDIAGA> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PIDLCBDIAGA>() {
              public PIDLCBDIAGA findValueByNumber(int number) {
                return PIDLCBDIAGA.forNumber(number);
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
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final PIDLCBDIAGA[] VALUES = getStaticValuesArray();
      private static PIDLCBDIAGA[] getStaticValuesArray() {
        return new PIDLCBDIAGA[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static PIDLCBDIAGA valueOf(
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

      private PIDLCBDIAGA(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TryEnterHomeReq.PIDLCBDIAGA)
    }

    public static final int TARGETPOINT_FIELD_NUMBER = 11;
    private int targetPoint_ = 0;
    /**
     * <code>uint32 targetPoint = 11;</code>
     * @return The targetPoint.
     */
    @java.lang.Override
    public int getTargetPoint() {
      return targetPoint_;
    }

    public static final int ISTRANSFERTOSAFEPOINT_FIELD_NUMBER = 4;
    private boolean isTransferToSafePoint_ = false;
    /**
     * <code>bool isTransferToSafePoint = 4;</code>
     * @return The isTransferToSafePoint.
     */
    @java.lang.Override
    public boolean getIsTransferToSafePoint() {
      return isTransferToSafePoint_;
    }

    public static final int TARGETUID_FIELD_NUMBER = 6;
    private int targetUid_ = 0;
    /**
     * <code>uint32 targetUid = 6;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
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
      if (isTransferToSafePoint_ != false) {
        output.writeBool(4, isTransferToSafePoint_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(6, targetUid_);
      }
      if (targetPoint_ != 0) {
        output.writeUInt32(11, targetPoint_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isTransferToSafePoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isTransferToSafePoint_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, targetUid_);
      }
      if (targetPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, targetPoint_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other = (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) obj;

      if (getTargetPoint()
          != other.getTargetPoint()) return false;
      if (getIsTransferToSafePoint()
          != other.getIsTransferToSafePoint()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
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
      hash = (37 * hash) + TARGETPOINT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoint();
      hash = (37 * hash) + ISTRANSFERTOSAFEPOINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferToSafePoint());
      hash = (37 * hash) + TARGETUID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq prototype) {
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
     * Protobuf type {@code TryEnterHomeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TryEnterHomeReq)
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.newBuilder()
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
        targetPoint_ = 0;
        isTransferToSafePoint_ = false;
        targetUid_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq build() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq buildPartial() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.targetPoint_ = targetPoint_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isTransferToSafePoint_ = isTransferToSafePoint_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.targetUid_ = targetUid_;
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
        if (other instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) {
          return mergeFrom((emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other) {
        if (other == emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance()) return this;
        if (other.getTargetPoint() != 0) {
          setTargetPoint(other.getTargetPoint());
        }
        if (other.getIsTransferToSafePoint() != false) {
          setIsTransferToSafePoint(other.getIsTransferToSafePoint());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
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
              case 32: {
                isTransferToSafePoint_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 48: {
                targetUid_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 88: {
                targetPoint_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 88
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

      private int targetPoint_ ;
      /**
       * <code>uint32 targetPoint = 11;</code>
       * @return The targetPoint.
       */
      @java.lang.Override
      public int getTargetPoint() {
        return targetPoint_;
      }
      /**
       * <code>uint32 targetPoint = 11;</code>
       * @param value The targetPoint to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPoint(int value) {
        
        targetPoint_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetPoint = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPoint() {
        bitField0_ = (bitField0_ & ~0x00000001);
        targetPoint_ = 0;
        onChanged();
        return this;
      }

      private boolean isTransferToSafePoint_ ;
      /**
       * <code>bool isTransferToSafePoint = 4;</code>
       * @return The isTransferToSafePoint.
       */
      @java.lang.Override
      public boolean getIsTransferToSafePoint() {
        return isTransferToSafePoint_;
      }
      /**
       * <code>bool isTransferToSafePoint = 4;</code>
       * @param value The isTransferToSafePoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferToSafePoint(boolean value) {
        
        isTransferToSafePoint_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isTransferToSafePoint = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferToSafePoint() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isTransferToSafePoint_ = false;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 targetUid = 6;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 targetUid = 6;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 targetUid = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        targetUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TryEnterHomeReq)
    }

    // @@protoc_insertion_point(class_scope:TryEnterHomeReq)
    private static final emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq();
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TryEnterHomeReq>
        PARSER = new com.google.protobuf.AbstractParser<TryEnterHomeReq>() {
      @java.lang.Override
      public TryEnterHomeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<TryEnterHomeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TryEnterHomeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TryEnterHomeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TryEnterHomeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TryEnterHomeReq.proto\"\272\001\n\017TryEnterHome" +
      "Req\022\023\n\013targetPoint\030\013 \001(\r\022\035\n\025isTransferTo" +
      "SafePoint\030\004 \001(\010\022\021\n\ttargetUid\030\006 \001(\r\"`\n\013PI" +
      "DLCBDIAGA\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\347\"\022\017\n" +
      "\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIA" +
      "BGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TryEnterHomeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TryEnterHomeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TryEnterHomeReq_descriptor,
        new java.lang.String[] { "TargetPoint", "IsTransferToSafePoint", "TargetUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
