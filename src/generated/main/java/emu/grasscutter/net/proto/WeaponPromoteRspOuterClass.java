// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WeaponPromoteRsp.proto

package emu.grasscutter.net.proto;

public final class WeaponPromoteRspOuterClass {
  private WeaponPromoteRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WeaponPromoteRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WeaponPromoteRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 curPromoteLevel = 13;</code>
     * @return The curPromoteLevel.
     */
    int getCurPromoteLevel();

    /**
     * <code>uint64 targetWeaponGuid = 2;</code>
     * @return The targetWeaponGuid.
     */
    long getTargetWeaponGuid();

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 oldPromoteLevel = 10;</code>
     * @return The oldPromoteLevel.
     */
    int getOldPromoteLevel();
  }
  /**
   * Protobuf type {@code WeaponPromoteRsp}
   */
  public static final class WeaponPromoteRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WeaponPromoteRsp)
      WeaponPromoteRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WeaponPromoteRsp.newBuilder() to construct.
    private WeaponPromoteRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WeaponPromoteRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WeaponPromoteRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.class, emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code WeaponPromoteRsp.IPJIMHOCLKL}
     */
    public enum IPJIMHOCLKL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 688;</code>
       */
      PEPPOHPHJOJ(1, 688),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final IPJIMHOCLKL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 688;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 688;
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
      public static IPJIMHOCLKL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IPJIMHOCLKL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 688: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IPJIMHOCLKL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IPJIMHOCLKL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IPJIMHOCLKL>() {
              public IPJIMHOCLKL findValueByNumber(int number) {
                return IPJIMHOCLKL.forNumber(number);
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
        return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final IPJIMHOCLKL[] VALUES = getStaticValuesArray();
      private static IPJIMHOCLKL[] getStaticValuesArray() {
        return new IPJIMHOCLKL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static IPJIMHOCLKL valueOf(
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

      private IPJIMHOCLKL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:WeaponPromoteRsp.IPJIMHOCLKL)
    }

    public static final int CURPROMOTELEVEL_FIELD_NUMBER = 13;
    private int curPromoteLevel_ = 0;
    /**
     * <code>uint32 curPromoteLevel = 13;</code>
     * @return The curPromoteLevel.
     */
    @java.lang.Override
    public int getCurPromoteLevel() {
      return curPromoteLevel_;
    }

    public static final int TARGETWEAPONGUID_FIELD_NUMBER = 2;
    private long targetWeaponGuid_ = 0L;
    /**
     * <code>uint64 targetWeaponGuid = 2;</code>
     * @return The targetWeaponGuid.
     */
    @java.lang.Override
    public long getTargetWeaponGuid() {
      return targetWeaponGuid_;
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OLDPROMOTELEVEL_FIELD_NUMBER = 10;
    private int oldPromoteLevel_ = 0;
    /**
     * <code>uint32 oldPromoteLevel = 10;</code>
     * @return The oldPromoteLevel.
     */
    @java.lang.Override
    public int getOldPromoteLevel() {
      return oldPromoteLevel_;
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
      if (targetWeaponGuid_ != 0L) {
        output.writeUInt64(2, targetWeaponGuid_);
      }
      if (oldPromoteLevel_ != 0) {
        output.writeUInt32(10, oldPromoteLevel_);
      }
      if (curPromoteLevel_ != 0) {
        output.writeUInt32(13, curPromoteLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetWeaponGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, targetWeaponGuid_);
      }
      if (oldPromoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, oldPromoteLevel_);
      }
      if (curPromoteLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, curPromoteLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp other = (emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp) obj;

      if (getCurPromoteLevel()
          != other.getCurPromoteLevel()) return false;
      if (getTargetWeaponGuid()
          != other.getTargetWeaponGuid()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getOldPromoteLevel()
          != other.getOldPromoteLevel()) return false;
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
      hash = (37 * hash) + CURPROMOTELEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getCurPromoteLevel();
      hash = (37 * hash) + TARGETWEAPONGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetWeaponGuid());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + OLDPROMOTELEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getOldPromoteLevel();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp prototype) {
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
     * Protobuf type {@code WeaponPromoteRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WeaponPromoteRsp)
        emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.class, emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.newBuilder()
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
        curPromoteLevel_ = 0;
        targetWeaponGuid_ = 0L;
        retcode_ = 0;
        oldPromoteLevel_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.internal_static_WeaponPromoteRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp build() {
        emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp buildPartial() {
        emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp result = new emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.curPromoteLevel_ = curPromoteLevel_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.targetWeaponGuid_ = targetWeaponGuid_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.oldPromoteLevel_ = oldPromoteLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp) {
          return mergeFrom((emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp other) {
        if (other == emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp.getDefaultInstance()) return this;
        if (other.getCurPromoteLevel() != 0) {
          setCurPromoteLevel(other.getCurPromoteLevel());
        }
        if (other.getTargetWeaponGuid() != 0L) {
          setTargetWeaponGuid(other.getTargetWeaponGuid());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getOldPromoteLevel() != 0) {
          setOldPromoteLevel(other.getOldPromoteLevel());
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
                targetWeaponGuid_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 80: {
                oldPromoteLevel_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 104: {
                curPromoteLevel_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 104
              case 112: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 112
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

      private int curPromoteLevel_ ;
      /**
       * <code>uint32 curPromoteLevel = 13;</code>
       * @return The curPromoteLevel.
       */
      @java.lang.Override
      public int getCurPromoteLevel() {
        return curPromoteLevel_;
      }
      /**
       * <code>uint32 curPromoteLevel = 13;</code>
       * @param value The curPromoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setCurPromoteLevel(int value) {
        
        curPromoteLevel_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 curPromoteLevel = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurPromoteLevel() {
        bitField0_ = (bitField0_ & ~0x00000001);
        curPromoteLevel_ = 0;
        onChanged();
        return this;
      }

      private long targetWeaponGuid_ ;
      /**
       * <code>uint64 targetWeaponGuid = 2;</code>
       * @return The targetWeaponGuid.
       */
      @java.lang.Override
      public long getTargetWeaponGuid() {
        return targetWeaponGuid_;
      }
      /**
       * <code>uint64 targetWeaponGuid = 2;</code>
       * @param value The targetWeaponGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetWeaponGuid(long value) {
        
        targetWeaponGuid_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 targetWeaponGuid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetWeaponGuid() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetWeaponGuid_ = 0L;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000004);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int oldPromoteLevel_ ;
      /**
       * <code>uint32 oldPromoteLevel = 10;</code>
       * @return The oldPromoteLevel.
       */
      @java.lang.Override
      public int getOldPromoteLevel() {
        return oldPromoteLevel_;
      }
      /**
       * <code>uint32 oldPromoteLevel = 10;</code>
       * @param value The oldPromoteLevel to set.
       * @return This builder for chaining.
       */
      public Builder setOldPromoteLevel(int value) {
        
        oldPromoteLevel_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 oldPromoteLevel = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearOldPromoteLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oldPromoteLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WeaponPromoteRsp)
    }

    // @@protoc_insertion_point(class_scope:WeaponPromoteRsp)
    private static final emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp();
    }

    public static emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WeaponPromoteRsp>
        PARSER = new com.google.protobuf.AbstractParser<WeaponPromoteRsp>() {
      @java.lang.Override
      public WeaponPromoteRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<WeaponPromoteRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WeaponPromoteRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WeaponPromoteRspOuterClass.WeaponPromoteRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WeaponPromoteRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WeaponPromoteRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WeaponPromoteRsp.proto\"\300\001\n\020WeaponPromo" +
      "teRsp\022\027\n\017curPromoteLevel\030\r \001(\r\022\030\n\020target" +
      "WeaponGuid\030\002 \001(\004\022\017\n\007retcode\030\016 \001(\005\022\027\n\017old" +
      "PromoteLevel\030\n \001(\r\"O\n\013IPJIMHOCLKL\022\010\n\004NON" +
      "E\020\000\022\020\n\013PEPPOHPHJOJ\020\260\005\022\017\n\013DCDNILFDFLB\020\000\022\017" +
      "\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WeaponPromoteRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WeaponPromoteRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WeaponPromoteRsp_descriptor,
        new java.lang.String[] { "CurPromoteLevel", "TargetWeaponGuid", "Retcode", "OldPromoteLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
