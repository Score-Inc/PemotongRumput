// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HachiInfo.proto

package emu.grasscutter.net.proto;

public final class HachiInfoOuterClass {
  private HachiInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HachiInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HachiInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    int getStageMapCount();
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    boolean containsStageMap(
        int key);
    /**
     * Use {@link #getStageMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
    getStageMap();
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
    getStageMapMap();
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo defaultValue);
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code HachiInfo}
   */
  public static final class HachiInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HachiInfo)
      HachiInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HachiInfo.newBuilder() to construct.
    private HachiInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HachiInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HachiInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 9:
          return internalGetStageMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.class, emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.Builder.class);
    }

    public static final int STAGEMAP_FIELD_NUMBER = 9;
    private static final class StageMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>newDefaultInstance(
                  emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_StageMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.MESSAGE,
                  emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo.getDefaultInstance());
    }
    @SuppressWarnings("serial")
    private com.google.protobuf.MapField<
        java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> stageMap_;
    private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
    internalGetStageMap() {
      if (stageMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            StageMapDefaultEntryHolder.defaultEntry);
      }
      return stageMap_;
    }
    public int getStageMapCount() {
      return internalGetStageMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    @java.lang.Override
    public boolean containsStageMap(
        int key) {
      
      return internalGetStageMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getStageMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> getStageMap() {
      return getStageMapMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> getStageMapMap() {
      return internalGetStageMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    @java.lang.Override
    public /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrDefault(
        int key,
        /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> map =
          internalGetStageMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> map =
          internalGetStageMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetStageMap(),
          StageMapDefaultEntryHolder.defaultEntry,
          9);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> entry
           : internalGetStageMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
        stageMap__ = StageMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(9, stageMap__);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo other = (emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo) obj;

      if (!internalGetStageMap().equals(
          other.internalGetStageMap())) return false;
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
      if (!internalGetStageMap().getMap().isEmpty()) {
        hash = (37 * hash) + STAGEMAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetStageMap().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo prototype) {
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
     * Protobuf type {@code HachiInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HachiInfo)
        emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 9:
            return internalGetMutableStageMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.class, emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.newBuilder()
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
        internalGetMutableStageMap().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HachiInfoOuterClass.internal_static_HachiInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo build() {
        emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo buildPartial() {
        emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo result = new emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.stageMap_ = internalGetStageMap();
          result.stageMap_.makeImmutable();
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
        if (other instanceof emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo) {
          return mergeFrom((emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo other) {
        if (other == emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo.getDefaultInstance()) return this;
        internalGetMutableStageMap().mergeFrom(
            other.internalGetStageMap());
        bitField0_ |= 0x00000001;
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
              case 74: {
                com.google.protobuf.MapEntry<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
                stageMap__ = input.readMessage(
                    StageMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableStageMap().getMutableMap().put(
                    stageMap__.getKey(), stageMap__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 74
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

      private com.google.protobuf.MapField<
          java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> stageMap_;
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
          internalGetStageMap() {
        if (stageMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              StageMapDefaultEntryHolder.defaultEntry);
        }
        return stageMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
          internalGetMutableStageMap() {
        if (stageMap_ == null) {
          stageMap_ = com.google.protobuf.MapField.newMapField(
              StageMapDefaultEntryHolder.defaultEntry);
        }
        if (!stageMap_.isMutable()) {
          stageMap_ = stageMap_.copy();
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return stageMap_;
      }
      public int getStageMapCount() {
        return internalGetStageMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      @java.lang.Override
      public boolean containsStageMap(
          int key) {
        
        return internalGetStageMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getStageMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> getStageMap() {
        return getStageMapMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      @java.lang.Override
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> getStageMapMap() {
        return internalGetStageMap().getMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      @java.lang.Override
      public /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrDefault(
          int key,
          /* nullable */
emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo defaultValue) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> map =
            internalGetStageMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo getStageMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> map =
            internalGetStageMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }
      public Builder clearStageMap() {
        bitField0_ = (bitField0_ & ~0x00000001);
        internalGetMutableStageMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      public Builder removeStageMap(
          int key) {
        
        internalGetMutableStageMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo>
          getMutableStageMap() {
        bitField0_ |= 0x00000001;
        return internalGetMutableStageMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      public Builder putStageMap(
          int key,
          emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo value) {
        
        if (value == null) { throw new NullPointerException("map value"); }
        internalGetMutableStageMap().getMutableMap()
            .put(key, value);
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <code>map&lt;uint32, .HachiStageInfo&gt; stageMap = 9;</code>
       */
      public Builder putAllStageMap(
          java.util.Map<java.lang.Integer, emu.grasscutter.net.proto.HachiStageInfoOuterClass.HachiStageInfo> values) {
        internalGetMutableStageMap().getMutableMap()
            .putAll(values);
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:HachiInfo)
    }

    // @@protoc_insertion_point(class_scope:HachiInfo)
    private static final emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo();
    }

    public static emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HachiInfo>
        PARSER = new com.google.protobuf.AbstractParser<HachiInfo>() {
      @java.lang.Override
      public HachiInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<HachiInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HachiInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HachiInfoOuterClass.HachiInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HachiInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HachiInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HachiInfo_StageMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HachiInfo_StageMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017HachiInfo.proto\032\024HachiStageInfo.proto\"" +
      "y\n\tHachiInfo\022*\n\010stageMap\030\t \003(\0132\030.HachiIn" +
      "fo.StageMapEntry\032@\n\rStageMapEntry\022\013\n\003key" +
      "\030\001 \001(\r\022\036\n\005value\030\002 \001(\0132\017.HachiStageInfo:\002" +
      "8\001B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HachiStageInfoOuterClass.getDescriptor(),
        });
    internal_static_HachiInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HachiInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HachiInfo_descriptor,
        new java.lang.String[] { "StageMap", });
    internal_static_HachiInfo_StageMapEntry_descriptor =
      internal_static_HachiInfo_descriptor.getNestedTypes().get(0);
    internal_static_HachiInfo_StageMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HachiInfo_StageMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    emu.grasscutter.net.proto.HachiStageInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
