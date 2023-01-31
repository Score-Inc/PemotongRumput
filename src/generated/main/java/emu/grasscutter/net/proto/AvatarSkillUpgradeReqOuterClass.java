// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarSkillUpgradeReq.proto

package emu.grasscutter.net.proto;

public final class AvatarSkillUpgradeReqOuterClass {
  private AvatarSkillUpgradeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarSkillUpgradeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarSkillUpgradeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 avatarSkillId = 10;</code>
     * @return The avatarSkillId.
     */
    int getAvatarSkillId();

    /**
     * <code>uint64 avatarGuid = 2;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();

    /**
     * <code>uint32 oldLevel = 12;</code>
     * @return The oldLevel.
     */
    int getOldLevel();
  }
  /**
   * Protobuf type {@code AvatarSkillUpgradeReq}
   */
  public static final class AvatarSkillUpgradeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarSkillUpgradeReq)
      AvatarSkillUpgradeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarSkillUpgradeReq.newBuilder() to construct.
    private AvatarSkillUpgradeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarSkillUpgradeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarSkillUpgradeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.internal_static_AvatarSkillUpgradeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.internal_static_AvatarSkillUpgradeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.class, emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.Builder.class);
    }

    /**
     * Protobuf enum {@code AvatarSkillUpgradeReq.APLOEPHODPD}
     */
    public enum APLOEPHODPD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1029;</code>
       */
      PEPPOHPHJOJ(1, 1029),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final APLOEPHODPD DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final APLOEPHODPD EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1029;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1029;
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
      public static APLOEPHODPD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static APLOEPHODPD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1029: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<APLOEPHODPD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          APLOEPHODPD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<APLOEPHODPD>() {
              public APLOEPHODPD findValueByNumber(int number) {
                return APLOEPHODPD.forNumber(number);
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
        return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final APLOEPHODPD[] VALUES = getStaticValuesArray();
      private static APLOEPHODPD[] getStaticValuesArray() {
        return new APLOEPHODPD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static APLOEPHODPD valueOf(
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

      private APLOEPHODPD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:AvatarSkillUpgradeReq.APLOEPHODPD)
    }

    public static final int AVATARSKILLID_FIELD_NUMBER = 10;
    private int avatarSkillId_ = 0;
    /**
     * <code>uint32 avatarSkillId = 10;</code>
     * @return The avatarSkillId.
     */
    @java.lang.Override
    public int getAvatarSkillId() {
      return avatarSkillId_;
    }

    public static final int AVATARGUID_FIELD_NUMBER = 2;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatarGuid = 2;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }

    public static final int OLDLEVEL_FIELD_NUMBER = 12;
    private int oldLevel_ = 0;
    /**
     * <code>uint32 oldLevel = 12;</code>
     * @return The oldLevel.
     */
    @java.lang.Override
    public int getOldLevel() {
      return oldLevel_;
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
      if (avatarGuid_ != 0L) {
        output.writeUInt64(2, avatarGuid_);
      }
      if (avatarSkillId_ != 0) {
        output.writeUInt32(10, avatarSkillId_);
      }
      if (oldLevel_ != 0) {
        output.writeUInt32(12, oldLevel_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, avatarGuid_);
      }
      if (avatarSkillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, avatarSkillId_);
      }
      if (oldLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, oldLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq other = (emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq) obj;

      if (getAvatarSkillId()
          != other.getAvatarSkillId()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
      if (getOldLevel()
          != other.getOldLevel()) return false;
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
      hash = (37 * hash) + AVATARSKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarSkillId();
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (37 * hash) + OLDLEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getOldLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq prototype) {
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
     * Protobuf type {@code AvatarSkillUpgradeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarSkillUpgradeReq)
        emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.internal_static_AvatarSkillUpgradeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.internal_static_AvatarSkillUpgradeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.class, emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.newBuilder()
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
        avatarSkillId_ = 0;
        avatarGuid_ = 0L;
        oldLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.internal_static_AvatarSkillUpgradeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq build() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq buildPartial() {
        emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq result = new emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.avatarSkillId_ = avatarSkillId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.avatarGuid_ = avatarGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.oldLevel_ = oldLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq other) {
        if (other == emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq.getDefaultInstance()) return this;
        if (other.getAvatarSkillId() != 0) {
          setAvatarSkillId(other.getAvatarSkillId());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
        }
        if (other.getOldLevel() != 0) {
          setOldLevel(other.getOldLevel());
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
              case 16: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 80: {
                avatarSkillId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 80
              case 96: {
                oldLevel_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 96
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

      private int avatarSkillId_ ;
      /**
       * <code>uint32 avatarSkillId = 10;</code>
       * @return The avatarSkillId.
       */
      @java.lang.Override
      public int getAvatarSkillId() {
        return avatarSkillId_;
      }
      /**
       * <code>uint32 avatarSkillId = 10;</code>
       * @param value The avatarSkillId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarSkillId(int value) {
        
        avatarSkillId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatarSkillId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarSkillId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        avatarSkillId_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 2;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 2;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        avatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private int oldLevel_ ;
      /**
       * <code>uint32 oldLevel = 12;</code>
       * @return The oldLevel.
       */
      @java.lang.Override
      public int getOldLevel() {
        return oldLevel_;
      }
      /**
       * <code>uint32 oldLevel = 12;</code>
       * @param value The oldLevel to set.
       * @return This builder for chaining.
       */
      public Builder setOldLevel(int value) {
        
        oldLevel_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 oldLevel = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        oldLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AvatarSkillUpgradeReq)
    }

    // @@protoc_insertion_point(class_scope:AvatarSkillUpgradeReq)
    private static final emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq();
    }

    public static emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarSkillUpgradeReq>
        PARSER = new com.google.protobuf.AbstractParser<AvatarSkillUpgradeReq>() {
      @java.lang.Override
      public AvatarSkillUpgradeReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarSkillUpgradeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarSkillUpgradeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarSkillUpgradeReqOuterClass.AvatarSkillUpgradeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarSkillUpgradeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarSkillUpgradeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AvatarSkillUpgradeReq.proto\"\266\001\n\025Avatar" +
      "SkillUpgradeReq\022\025\n\ravatarSkillId\030\n \001(\r\022\022" +
      "\n\navatarGuid\030\002 \001(\004\022\020\n\010oldLevel\030\014 \001(\r\"`\n\013" +
      "APLOEPHODPD\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\205\010\022" +
      "\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJ" +
      "IABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarSkillUpgradeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarSkillUpgradeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarSkillUpgradeReq_descriptor,
        new java.lang.String[] { "AvatarSkillId", "AvatarGuid", "OldLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
