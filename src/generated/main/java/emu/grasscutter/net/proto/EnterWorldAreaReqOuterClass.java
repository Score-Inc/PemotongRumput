// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterWorldAreaReq.proto

package emu.grasscutter.net.proto;

public final class EnterWorldAreaReqOuterClass {
  private EnterWorldAreaReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterWorldAreaReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterWorldAreaReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 areaId = 1;</code>
     * @return The areaId.
     */
    int getAreaId();

    /**
     * <code>uint32 areaType = 11;</code>
     * @return The areaType.
     */
    int getAreaType();
  }
  /**
   * Protobuf type {@code EnterWorldAreaReq}
   */
  public static final class EnterWorldAreaReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterWorldAreaReq)
      EnterWorldAreaReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterWorldAreaReq.newBuilder() to construct.
    private EnterWorldAreaReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterWorldAreaReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterWorldAreaReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.class, emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.Builder.class);
    }

    /**
     * Protobuf enum {@code EnterWorldAreaReq.GNDHGLBEFEL}
     */
    public enum GNDHGLBEFEL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 242;</code>
       */
      PEPPOHPHJOJ(1, 242),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GNDHGLBEFEL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final GNDHGLBEFEL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 242;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 242;
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
      public static GNDHGLBEFEL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GNDHGLBEFEL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 242: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GNDHGLBEFEL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GNDHGLBEFEL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GNDHGLBEFEL>() {
              public GNDHGLBEFEL findValueByNumber(int number) {
                return GNDHGLBEFEL.forNumber(number);
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
        return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final GNDHGLBEFEL[] VALUES = getStaticValuesArray();
      private static GNDHGLBEFEL[] getStaticValuesArray() {
        return new GNDHGLBEFEL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static GNDHGLBEFEL valueOf(
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

      private GNDHGLBEFEL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EnterWorldAreaReq.GNDHGLBEFEL)
    }

    public static final int AREAID_FIELD_NUMBER = 1;
    private int areaId_ = 0;
    /**
     * <code>uint32 areaId = 1;</code>
     * @return The areaId.
     */
    @java.lang.Override
    public int getAreaId() {
      return areaId_;
    }

    public static final int AREATYPE_FIELD_NUMBER = 11;
    private int areaType_ = 0;
    /**
     * <code>uint32 areaType = 11;</code>
     * @return The areaType.
     */
    @java.lang.Override
    public int getAreaType() {
      return areaType_;
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
      if (areaId_ != 0) {
        output.writeUInt32(1, areaId_);
      }
      if (areaType_ != 0) {
        output.writeUInt32(11, areaType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (areaId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, areaId_);
      }
      if (areaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, areaType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq other = (emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq) obj;

      if (getAreaId()
          != other.getAreaId()) return false;
      if (getAreaType()
          != other.getAreaType()) return false;
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
      hash = (37 * hash) + AREAID_FIELD_NUMBER;
      hash = (53 * hash) + getAreaId();
      hash = (37 * hash) + AREATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAreaType();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq prototype) {
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
     * Protobuf type {@code EnterWorldAreaReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterWorldAreaReq)
        emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.class, emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.newBuilder()
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
        areaId_ = 0;
        areaType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.internal_static_EnterWorldAreaReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq build() {
        emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq buildPartial() {
        emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq result = new emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.areaId_ = areaId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.areaType_ = areaType_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq) {
          return mergeFrom((emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq other) {
        if (other == emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq.getDefaultInstance()) return this;
        if (other.getAreaId() != 0) {
          setAreaId(other.getAreaId());
        }
        if (other.getAreaType() != 0) {
          setAreaType(other.getAreaType());
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
                areaId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 88: {
                areaType_ = input.readUInt32();
                bitField0_ |= 0x00000002;
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

      private int areaId_ ;
      /**
       * <code>uint32 areaId = 1;</code>
       * @return The areaId.
       */
      @java.lang.Override
      public int getAreaId() {
        return areaId_;
      }
      /**
       * <code>uint32 areaId = 1;</code>
       * @param value The areaId to set.
       * @return This builder for chaining.
       */
      public Builder setAreaId(int value) {
        
        areaId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 areaId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        areaId_ = 0;
        onChanged();
        return this;
      }

      private int areaType_ ;
      /**
       * <code>uint32 areaType = 11;</code>
       * @return The areaType.
       */
      @java.lang.Override
      public int getAreaType() {
        return areaType_;
      }
      /**
       * <code>uint32 areaType = 11;</code>
       * @param value The areaType to set.
       * @return This builder for chaining.
       */
      public Builder setAreaType(int value) {
        
        areaType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 areaType = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearAreaType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        areaType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterWorldAreaReq)
    }

    // @@protoc_insertion_point(class_scope:EnterWorldAreaReq)
    private static final emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq();
    }

    public static emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterWorldAreaReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterWorldAreaReq>() {
      @java.lang.Override
      public EnterWorldAreaReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<EnterWorldAreaReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterWorldAreaReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterWorldAreaReqOuterClass.EnterWorldAreaReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterWorldAreaReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterWorldAreaReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027EnterWorldAreaReq.proto\"\227\001\n\021EnterWorld" +
      "AreaReq\022\016\n\006areaId\030\001 \001(\r\022\020\n\010areaType\030\013 \001(" +
      "\r\"`\n\013GNDHGLBEFEL\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJO" +
      "J\020\362\001\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017" +
      "\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterWorldAreaReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterWorldAreaReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterWorldAreaReq_descriptor,
        new java.lang.String[] { "AreaId", "AreaType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
