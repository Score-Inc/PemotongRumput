// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StrengthenPointData.proto

package emu.grasscutter.net.proto;

public final class StrengthenPointDataOuterClass {
  private StrengthenPointDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StrengthenPointDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StrengthenPointData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_NNKPOLLBLDO = 8;</code>
     * @return The unk3300NNKPOLLBLDO.
     */
    int getUnk3300NNKPOLLBLDO();

    /**
     * <code>uint32 Unk3300_HIKDEKIPCPB = 3;</code>
     * @return The unk3300HIKDEKIPCPB.
     */
    int getUnk3300HIKDEKIPCPB();
  }
  /**
   * Protobuf type {@code StrengthenPointData}
   */
  public static final class StrengthenPointData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StrengthenPointData)
      StrengthenPointDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StrengthenPointData.newBuilder() to construct.
    private StrengthenPointData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StrengthenPointData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StrengthenPointData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.class, emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.Builder.class);
    }

    public static final int UNK3300_NNKPOLLBLDO_FIELD_NUMBER = 8;
    private int unk3300NNKPOLLBLDO_ = 0;
    /**
     * <code>uint32 Unk3300_NNKPOLLBLDO = 8;</code>
     * @return The unk3300NNKPOLLBLDO.
     */
    @java.lang.Override
    public int getUnk3300NNKPOLLBLDO() {
      return unk3300NNKPOLLBLDO_;
    }

    public static final int UNK3300_HIKDEKIPCPB_FIELD_NUMBER = 3;
    private int unk3300HIKDEKIPCPB_ = 0;
    /**
     * <code>uint32 Unk3300_HIKDEKIPCPB = 3;</code>
     * @return The unk3300HIKDEKIPCPB.
     */
    @java.lang.Override
    public int getUnk3300HIKDEKIPCPB() {
      return unk3300HIKDEKIPCPB_;
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
      if (unk3300HIKDEKIPCPB_ != 0) {
        output.writeUInt32(3, unk3300HIKDEKIPCPB_);
      }
      if (unk3300NNKPOLLBLDO_ != 0) {
        output.writeUInt32(8, unk3300NNKPOLLBLDO_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300HIKDEKIPCPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, unk3300HIKDEKIPCPB_);
      }
      if (unk3300NNKPOLLBLDO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, unk3300NNKPOLLBLDO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData other = (emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData) obj;

      if (getUnk3300NNKPOLLBLDO()
          != other.getUnk3300NNKPOLLBLDO()) return false;
      if (getUnk3300HIKDEKIPCPB()
          != other.getUnk3300HIKDEKIPCPB()) return false;
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
      hash = (37 * hash) + UNK3300_NNKPOLLBLDO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300NNKPOLLBLDO();
      hash = (37 * hash) + UNK3300_HIKDEKIPCPB_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300HIKDEKIPCPB();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData prototype) {
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
     * Protobuf type {@code StrengthenPointData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StrengthenPointData)
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.class, emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.newBuilder()
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
        unk3300NNKPOLLBLDO_ = 0;
        unk3300HIKDEKIPCPB_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.internal_static_StrengthenPointData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData build() {
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData buildPartial() {
        emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData result = new emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.unk3300NNKPOLLBLDO_ = unk3300NNKPOLLBLDO_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.unk3300HIKDEKIPCPB_ = unk3300HIKDEKIPCPB_;
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
        if (other instanceof emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData) {
          return mergeFrom((emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData other) {
        if (other == emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData.getDefaultInstance()) return this;
        if (other.getUnk3300NNKPOLLBLDO() != 0) {
          setUnk3300NNKPOLLBLDO(other.getUnk3300NNKPOLLBLDO());
        }
        if (other.getUnk3300HIKDEKIPCPB() != 0) {
          setUnk3300HIKDEKIPCPB(other.getUnk3300HIKDEKIPCPB());
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
                unk3300HIKDEKIPCPB_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 64: {
                unk3300NNKPOLLBLDO_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 64
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

      private int unk3300NNKPOLLBLDO_ ;
      /**
       * <code>uint32 Unk3300_NNKPOLLBLDO = 8;</code>
       * @return The unk3300NNKPOLLBLDO.
       */
      @java.lang.Override
      public int getUnk3300NNKPOLLBLDO() {
        return unk3300NNKPOLLBLDO_;
      }
      /**
       * <code>uint32 Unk3300_NNKPOLLBLDO = 8;</code>
       * @param value The unk3300NNKPOLLBLDO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300NNKPOLLBLDO(int value) {
        
        unk3300NNKPOLLBLDO_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_NNKPOLLBLDO = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300NNKPOLLBLDO() {
        bitField0_ = (bitField0_ & ~0x00000001);
        unk3300NNKPOLLBLDO_ = 0;
        onChanged();
        return this;
      }

      private int unk3300HIKDEKIPCPB_ ;
      /**
       * <code>uint32 Unk3300_HIKDEKIPCPB = 3;</code>
       * @return The unk3300HIKDEKIPCPB.
       */
      @java.lang.Override
      public int getUnk3300HIKDEKIPCPB() {
        return unk3300HIKDEKIPCPB_;
      }
      /**
       * <code>uint32 Unk3300_HIKDEKIPCPB = 3;</code>
       * @param value The unk3300HIKDEKIPCPB to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300HIKDEKIPCPB(int value) {
        
        unk3300HIKDEKIPCPB_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_HIKDEKIPCPB = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300HIKDEKIPCPB() {
        bitField0_ = (bitField0_ & ~0x00000002);
        unk3300HIKDEKIPCPB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StrengthenPointData)
    }

    // @@protoc_insertion_point(class_scope:StrengthenPointData)
    private static final emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData();
    }

    public static emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StrengthenPointData>
        PARSER = new com.google.protobuf.AbstractParser<StrengthenPointData>() {
      @java.lang.Override
      public StrengthenPointData parsePartialFrom(
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

    public static com.google.protobuf.Parser<StrengthenPointData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StrengthenPointData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.StrengthenPointDataOuterClass.StrengthenPointData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StrengthenPointData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StrengthenPointData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031StrengthenPointData.proto\"O\n\023Strengthe" +
      "nPointData\022\033\n\023Unk3300_NNKPOLLBLDO\030\010 \001(\r\022" +
      "\033\n\023Unk3300_HIKDEKIPCPB\030\003 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StrengthenPointData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StrengthenPointData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StrengthenPointData_descriptor,
        new java.lang.String[] { "Unk3300NNKPOLLBLDO", "Unk3300HIKDEKIPCPB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
