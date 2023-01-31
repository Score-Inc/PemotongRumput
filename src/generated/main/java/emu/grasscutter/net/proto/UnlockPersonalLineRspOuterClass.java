// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UnlockPersonalLineRsp.proto

package emu.grasscutter.net.proto;

public final class UnlockPersonalLineRspOuterClass {
  private UnlockPersonalLineRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UnlockPersonalLineRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UnlockPersonalLineRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 personalLineId = 6;</code>
     * @return The personalLineId.
     */
    int getPersonalLineId();

    /**
     * <code>uint32 level = 3;</code>
     * @return Whether the level field is set.
     */
    boolean hasLevel();
    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return Whether the chapterId field is set.
     */
    boolean hasChapterId();
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return The chapterId.
     */
    int getChapterId();

    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.ParamCase getParamCase();
  }
  /**
   * Protobuf type {@code UnlockPersonalLineRsp}
   */
  public static final class UnlockPersonalLineRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UnlockPersonalLineRsp)
      UnlockPersonalLineRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UnlockPersonalLineRsp.newBuilder() to construct.
    private UnlockPersonalLineRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UnlockPersonalLineRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UnlockPersonalLineRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code UnlockPersonalLineRsp.IMFOFCFGBJP}
     */
    public enum IMFOFCFGBJP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 403;</code>
       */
      PEPPOHPHJOJ(1, 403),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final IMFOFCFGBJP DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 403;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 403;
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
      public static IMFOFCFGBJP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IMFOFCFGBJP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 403: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IMFOFCFGBJP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IMFOFCFGBJP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IMFOFCFGBJP>() {
              public IMFOFCFGBJP findValueByNumber(int number) {
                return IMFOFCFGBJP.forNumber(number);
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
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final IMFOFCFGBJP[] VALUES = getStaticValuesArray();
      private static IMFOFCFGBJP[] getStaticValuesArray() {
        return new IMFOFCFGBJP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static IMFOFCFGBJP valueOf(
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

      private IMFOFCFGBJP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:UnlockPersonalLineRsp.IMFOFCFGBJP)
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      LEVEL(3),
      CHAPTER_ID(14),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 3: return LEVEL;
          case 14: return CHAPTER_ID;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PERSONALLINEID_FIELD_NUMBER = 6;
    private int personalLineId_ = 0;
    /**
     * <code>uint32 personalLineId = 6;</code>
     * @return The personalLineId.
     */
    @java.lang.Override
    public int getPersonalLineId() {
      return personalLineId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    /**
     * <code>uint32 level = 3;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return paramCase_ == 3;
    }
    /**
     * <code>uint32 level = 3;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      if (paramCase_ == 3) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 14;
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return Whether the chapterId field is set.
     */
    @java.lang.Override
    public boolean hasChapterId() {
      return paramCase_ == 14;
    }
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      if (paramCase_ == 14) {
        return (java.lang.Integer) param_;
      }
      return 0;
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
      if (paramCase_ == 3) {
        output.writeUInt32(
            3, (int)((java.lang.Integer) param_));
      }
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (personalLineId_ != 0) {
        output.writeUInt32(6, personalLineId_);
      }
      if (paramCase_ == 14) {
        output.writeUInt32(
            14, (int)((java.lang.Integer) param_));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (paramCase_ == 3) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              3, (int)((java.lang.Integer) param_));
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (personalLineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, personalLineId_);
      }
      if (paramCase_ == 14) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              14, (int)((java.lang.Integer) param_));
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
      if (!(obj instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other = (emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPersonalLineId()
          != other.getPersonalLineId()) return false;
      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 3:
          if (getLevel()
              != other.getLevel()) return false;
          break;
        case 14:
          if (getChapterId()
              != other.getChapterId()) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PERSONALLINEID_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLineId();
      switch (paramCase_) {
        case 3:
          hash = (37 * hash) + LEVEL_FIELD_NUMBER;
          hash = (53 * hash) + getLevel();
          break;
        case 14:
          hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getChapterId();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp prototype) {
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
     * Protobuf type {@code UnlockPersonalLineRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UnlockPersonalLineRsp)
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.class, emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.newBuilder()
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
        retcode_ = 0;
        personalLineId_ = 0;
        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.internal_static_UnlockPersonalLineRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp build() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp buildPartial() {
        emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.personalLineId_ = personalLineId_;
        }
      }

      private void buildPartialOneofs(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp result) {
        result.paramCase_ = paramCase_;
        result.param_ = this.param_;
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
        if (other instanceof emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp other) {
        if (other == emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPersonalLineId() != 0) {
          setPersonalLineId(other.getPersonalLineId());
        }
        switch (other.getParamCase()) {
          case LEVEL: {
            setLevel(other.getLevel());
            break;
          }
          case CHAPTER_ID: {
            setChapterId(other.getChapterId());
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
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
              case 24: {
                param_ = input.readUInt32();
                paramCase_ = 3;
                break;
              } // case 24
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 40
              case 48: {
                personalLineId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 48
              case 112: {
                param_ = input.readUInt32();
                paramCase_ = 14;
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
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int personalLineId_ ;
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @return The personalLineId.
       */
      @java.lang.Override
      public int getPersonalLineId() {
        return personalLineId_;
      }
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @param value The personalLineId to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineId(int value) {
        
        personalLineId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        personalLineId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 level = 3;</code>
       * @return Whether the level field is set.
       */
      public boolean hasLevel() {
        return paramCase_ == 3;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @return The level.
       */
      public int getLevel() {
        if (paramCase_ == 3) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        paramCase_ = 3;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        if (paramCase_ == 3) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return Whether the chapterId field is set.
       */
      public boolean hasChapterId() {
        return paramCase_ == 14;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return The chapterId.
       */
      public int getChapterId() {
        if (paramCase_ == 14) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        paramCase_ = 14;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        if (paramCase_ == 14) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:UnlockPersonalLineRsp)
    }

    // @@protoc_insertion_point(class_scope:UnlockPersonalLineRsp)
    private static final emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp();
    }

    public static emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UnlockPersonalLineRsp>
        PARSER = new com.google.protobuf.AbstractParser<UnlockPersonalLineRsp>() {
      @java.lang.Override
      public UnlockPersonalLineRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<UnlockPersonalLineRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UnlockPersonalLineRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UnlockPersonalLineRspOuterClass.UnlockPersonalLineRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UnlockPersonalLineRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UnlockPersonalLineRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033UnlockPersonalLineRsp.proto\"\301\001\n\025Unlock" +
      "PersonalLineRsp\022\017\n\007retcode\030\005 \001(\005\022\026\n\016pers" +
      "onalLineId\030\006 \001(\r\022\017\n\005level\030\003 \001(\rH\000\022\024\n\ncha" +
      "pter_id\030\016 \001(\rH\000\"O\n\013IMFOFCFGBJP\022\010\n\004NONE\020\000" +
      "\022\020\n\013PEPPOHPHJOJ\020\223\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013N" +
      "NBKOLMPOEA\020\001\032\002\020\001B\007\n\005paramB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UnlockPersonalLineRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UnlockPersonalLineRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UnlockPersonalLineRsp_descriptor,
        new java.lang.String[] { "Retcode", "PersonalLineId", "Level", "ChapterId", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
