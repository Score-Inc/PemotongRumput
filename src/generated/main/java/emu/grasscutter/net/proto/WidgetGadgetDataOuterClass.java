// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetGadgetData.proto

package emu.grasscutter.net.proto;

public final class WidgetGadgetDataOuterClass {
  private WidgetGadgetDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetGadgetDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetGadgetData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @return A list containing the gadgetEntityIdList.
     */
    java.util.List<java.lang.Integer> getGadgetEntityIdListList();
    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @return The count of gadgetEntityIdList.
     */
    int getGadgetEntityIdListCount();
    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @param index The index of the element to return.
     * @return The gadgetEntityIdList at the given index.
     */
    int getGadgetEntityIdList(int index);

    /**
     * <code>uint32 gadgetId = 9;</code>
     * @return The gadgetId.
     */
    int getGadgetId();
  }
  /**
   * Protobuf type {@code WidgetGadgetData}
   */
  public static final class WidgetGadgetData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetGadgetData)
      WidgetGadgetDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetGadgetData.newBuilder() to construct.
    private WidgetGadgetData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetGadgetData() {
      gadgetEntityIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetGadgetData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.class, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder.class);
    }

    public static final int GADGETENTITYIDLIST_FIELD_NUMBER = 15;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList gadgetEntityIdList_;
    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @return A list containing the gadgetEntityIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getGadgetEntityIdListList() {
      return gadgetEntityIdList_;
    }
    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @return The count of gadgetEntityIdList.
     */
    public int getGadgetEntityIdListCount() {
      return gadgetEntityIdList_.size();
    }
    /**
     * <code>repeated uint32 gadgetEntityIdList = 15;</code>
     * @param index The index of the element to return.
     * @return The gadgetEntityIdList at the given index.
     */
    public int getGadgetEntityIdList(int index) {
      return gadgetEntityIdList_.getInt(index);
    }
    private int gadgetEntityIdListMemoizedSerializedSize = -1;

    public static final int GADGETID_FIELD_NUMBER = 9;
    private int gadgetId_ = 0;
    /**
     * <code>uint32 gadgetId = 9;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
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
      getSerializedSize();
      if (gadgetId_ != 0) {
        output.writeUInt32(9, gadgetId_);
      }
      if (getGadgetEntityIdListList().size() > 0) {
        output.writeUInt32NoTag(122);
        output.writeUInt32NoTag(gadgetEntityIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < gadgetEntityIdList_.size(); i++) {
        output.writeUInt32NoTag(gadgetEntityIdList_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gadgetId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < gadgetEntityIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(gadgetEntityIdList_.getInt(i));
        }
        size += dataSize;
        if (!getGadgetEntityIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        gadgetEntityIdListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData other = (emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData) obj;

      if (!getGadgetEntityIdListList()
          .equals(other.getGadgetEntityIdListList())) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
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
      if (getGadgetEntityIdListCount() > 0) {
        hash = (37 * hash) + GADGETENTITYIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getGadgetEntityIdListList().hashCode();
      }
      hash = (37 * hash) + GADGETID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData prototype) {
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
     * Protobuf type {@code WidgetGadgetData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetGadgetData)
        emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.class, emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.newBuilder()
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
        gadgetEntityIdList_ = emptyIntList();
        gadgetId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.internal_static_WidgetGadgetData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData build() {
        emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData buildPartial() {
        emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData result = new emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          gadgetEntityIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.gadgetEntityIdList_ = gadgetEntityIdList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.gadgetId_ = gadgetId_;
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
        if (other instanceof emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData other) {
        if (other == emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData.getDefaultInstance()) return this;
        if (!other.gadgetEntityIdList_.isEmpty()) {
          if (gadgetEntityIdList_.isEmpty()) {
            gadgetEntityIdList_ = other.gadgetEntityIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGadgetEntityIdListIsMutable();
            gadgetEntityIdList_.addAll(other.gadgetEntityIdList_);
          }
          onChanged();
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
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
              case 72: {
                gadgetId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
              case 120: {
                int v = input.readUInt32();
                ensureGadgetEntityIdListIsMutable();
                gadgetEntityIdList_.addInt(v);
                break;
              } // case 120
              case 122: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureGadgetEntityIdListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  gadgetEntityIdList_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 122
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

      private com.google.protobuf.Internal.IntList gadgetEntityIdList_ = emptyIntList();
      private void ensureGadgetEntityIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          gadgetEntityIdList_ = mutableCopy(gadgetEntityIdList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @return A list containing the gadgetEntityIdList.
       */
      public java.util.List<java.lang.Integer>
          getGadgetEntityIdListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(gadgetEntityIdList_) : gadgetEntityIdList_;
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @return The count of gadgetEntityIdList.
       */
      public int getGadgetEntityIdListCount() {
        return gadgetEntityIdList_.size();
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @param index The index of the element to return.
       * @return The gadgetEntityIdList at the given index.
       */
      public int getGadgetEntityIdList(int index) {
        return gadgetEntityIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @param index The index to set the value at.
       * @param value The gadgetEntityIdList to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityIdList(
          int index, int value) {
        
        ensureGadgetEntityIdListIsMutable();
        gadgetEntityIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @param value The gadgetEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addGadgetEntityIdList(int value) {
        
        ensureGadgetEntityIdListIsMutable();
        gadgetEntityIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @param values The gadgetEntityIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllGadgetEntityIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureGadgetEntityIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, gadgetEntityIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 gadgetEntityIdList = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityIdList() {
        gadgetEntityIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadgetId = 9;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadgetId = 9;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        gadgetId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetGadgetData)
    }

    // @@protoc_insertion_point(class_scope:WidgetGadgetData)
    private static final emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData();
    }

    public static emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetGadgetData>
        PARSER = new com.google.protobuf.AbstractParser<WidgetGadgetData>() {
      @java.lang.Override
      public WidgetGadgetData parsePartialFrom(
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

    public static com.google.protobuf.Parser<WidgetGadgetData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetGadgetData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetGadgetDataOuterClass.WidgetGadgetData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetGadgetData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetGadgetData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026WidgetGadgetData.proto\"@\n\020WidgetGadget" +
      "Data\022\032\n\022gadgetEntityIdList\030\017 \003(\r\022\020\n\010gadg" +
      "etId\030\t \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WidgetGadgetData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetGadgetData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetGadgetData_descriptor,
        new java.lang.String[] { "GadgetEntityIdList", "GadgetId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
