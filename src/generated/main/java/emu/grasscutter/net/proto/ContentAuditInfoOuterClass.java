// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ContentAuditInfo.proto

package emu.grasscutter.net.proto;

public final class ContentAuditInfoOuterClass {
  private ContentAuditInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ContentAuditInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ContentAuditInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    java.lang.String getContent();
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    com.google.protobuf.ByteString
        getContentBytes();

    /**
     * <code>uint32 submitCount = 3;</code>
     * @return The submitCount.
     */
    int getSubmitCount();

    /**
     * <code>.AuditState auditState = 4;</code>
     * @return The enum numeric value on the wire for auditState.
     */
    int getAuditStateValue();
    /**
     * <code>.AuditState auditState = 4;</code>
     * @return The auditState.
     */
    emu.grasscutter.net.proto.AuditStateOuterClass.AuditState getAuditState();

    /**
     * <code>uint32 submitLimit = 5;</code>
     * @return The submitLimit.
     */
    int getSubmitLimit();
  }
  /**
   * Protobuf type {@code ContentAuditInfo}
   */
  public static final class ContentAuditInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ContentAuditInfo)
      ContentAuditInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ContentAuditInfo.newBuilder() to construct.
    private ContentAuditInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ContentAuditInfo() {
      content_ = "";
      auditState_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ContentAuditInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.internal_static_ContentAuditInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.internal_static_ContentAuditInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.class, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder.class);
    }

    public static final int ISOPEN_FIELD_NUMBER = 1;
    private boolean isOpen_ = false;
    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int CONTENT_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object content_ = "";
    /**
     * <code>string content = 2;</code>
     * @return The content.
     */
    @java.lang.Override
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      }
    }
    /**
     * <code>string content = 2;</code>
     * @return The bytes for content.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SUBMITCOUNT_FIELD_NUMBER = 3;
    private int submitCount_ = 0;
    /**
     * <code>uint32 submitCount = 3;</code>
     * @return The submitCount.
     */
    @java.lang.Override
    public int getSubmitCount() {
      return submitCount_;
    }

    public static final int AUDITSTATE_FIELD_NUMBER = 4;
    private int auditState_ = 0;
    /**
     * <code>.AuditState auditState = 4;</code>
     * @return The enum numeric value on the wire for auditState.
     */
    @java.lang.Override public int getAuditStateValue() {
      return auditState_;
    }
    /**
     * <code>.AuditState auditState = 4;</code>
     * @return The auditState.
     */
    @java.lang.Override public emu.grasscutter.net.proto.AuditStateOuterClass.AuditState getAuditState() {
      emu.grasscutter.net.proto.AuditStateOuterClass.AuditState result = emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.forNumber(auditState_);
      return result == null ? emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.UNRECOGNIZED : result;
    }

    public static final int SUBMITLIMIT_FIELD_NUMBER = 5;
    private int submitLimit_ = 0;
    /**
     * <code>uint32 submitLimit = 5;</code>
     * @return The submitLimit.
     */
    @java.lang.Override
    public int getSubmitLimit() {
      return submitLimit_;
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
      if (isOpen_ != false) {
        output.writeBool(1, isOpen_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
      }
      if (submitCount_ != 0) {
        output.writeUInt32(3, submitCount_);
      }
      if (auditState_ != emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.AUDIT_STATE_NONE.getNumber()) {
        output.writeEnum(4, auditState_);
      }
      if (submitLimit_ != 0) {
        output.writeUInt32(5, submitLimit_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isOpen_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
      }
      if (submitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, submitCount_);
      }
      if (auditState_ != emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.AUDIT_STATE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, auditState_);
      }
      if (submitLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, submitLimit_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo other = (emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo) obj;

      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (!getContent()
          .equals(other.getContent())) return false;
      if (getSubmitCount()
          != other.getSubmitCount()) return false;
      if (auditState_ != other.auditState_) return false;
      if (getSubmitLimit()
          != other.getSubmitLimit()) return false;
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
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getContent().hashCode();
      hash = (37 * hash) + SUBMITCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitCount();
      hash = (37 * hash) + AUDITSTATE_FIELD_NUMBER;
      hash = (53 * hash) + auditState_;
      hash = (37 * hash) + SUBMITLIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitLimit();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo prototype) {
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
     * Protobuf type {@code ContentAuditInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ContentAuditInfo)
        emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.internal_static_ContentAuditInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.internal_static_ContentAuditInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.class, emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.newBuilder()
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
        isOpen_ = false;
        content_ = "";
        submitCount_ = 0;
        auditState_ = 0;
        submitLimit_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.internal_static_ContentAuditInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo build() {
        emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo buildPartial() {
        emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo result = new emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isOpen_ = isOpen_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.content_ = content_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.submitCount_ = submitCount_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.auditState_ = auditState_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.submitLimit_ = submitLimit_;
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
        if (other instanceof emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo other) {
        if (other == emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo.getDefaultInstance()) return this;
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (!other.getContent().isEmpty()) {
          content_ = other.content_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getSubmitCount() != 0) {
          setSubmitCount(other.getSubmitCount());
        }
        if (other.auditState_ != 0) {
          setAuditStateValue(other.getAuditStateValue());
        }
        if (other.getSubmitLimit() != 0) {
          setSubmitLimit(other.getSubmitLimit());
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
                isOpen_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                submitCount_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                auditState_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                submitLimit_ = input.readUInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
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

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 1;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isOpen_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object content_ = "";
      /**
       * <code>string content = 2;</code>
       * @return The content.
       */
      public java.lang.String getContent() {
        java.lang.Object ref = content_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          content_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @return The bytes for content.
       */
      public com.google.protobuf.ByteString
          getContentBytes() {
        java.lang.Object ref = content_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          content_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string content = 2;</code>
       * @param value The content to set.
       * @return This builder for chaining.
       */
      public Builder setContent(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        content_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearContent() {
        content_ = getDefaultInstance().getContent();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string content = 2;</code>
       * @param value The bytes for content to set.
       * @return This builder for chaining.
       */
      public Builder setContentBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        content_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int submitCount_ ;
      /**
       * <code>uint32 submitCount = 3;</code>
       * @return The submitCount.
       */
      @java.lang.Override
      public int getSubmitCount() {
        return submitCount_;
      }
      /**
       * <code>uint32 submitCount = 3;</code>
       * @param value The submitCount to set.
       * @return This builder for chaining.
       */
      public Builder setSubmitCount(int value) {
        
        submitCount_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 submitCount = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubmitCount() {
        bitField0_ = (bitField0_ & ~0x00000004);
        submitCount_ = 0;
        onChanged();
        return this;
      }

      private int auditState_ = 0;
      /**
       * <code>.AuditState auditState = 4;</code>
       * @return The enum numeric value on the wire for auditState.
       */
      @java.lang.Override public int getAuditStateValue() {
        return auditState_;
      }
      /**
       * <code>.AuditState auditState = 4;</code>
       * @param value The enum numeric value on the wire for auditState to set.
       * @return This builder for chaining.
       */
      public Builder setAuditStateValue(int value) {
        auditState_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>.AuditState auditState = 4;</code>
       * @return The auditState.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.AuditStateOuterClass.AuditState getAuditState() {
        emu.grasscutter.net.proto.AuditStateOuterClass.AuditState result = emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.forNumber(auditState_);
        return result == null ? emu.grasscutter.net.proto.AuditStateOuterClass.AuditState.UNRECOGNIZED : result;
      }
      /**
       * <code>.AuditState auditState = 4;</code>
       * @param value The auditState to set.
       * @return This builder for chaining.
       */
      public Builder setAuditState(emu.grasscutter.net.proto.AuditStateOuterClass.AuditState value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        auditState_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.AuditState auditState = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuditState() {
        bitField0_ = (bitField0_ & ~0x00000008);
        auditState_ = 0;
        onChanged();
        return this;
      }

      private int submitLimit_ ;
      /**
       * <code>uint32 submitLimit = 5;</code>
       * @return The submitLimit.
       */
      @java.lang.Override
      public int getSubmitLimit() {
        return submitLimit_;
      }
      /**
       * <code>uint32 submitLimit = 5;</code>
       * @param value The submitLimit to set.
       * @return This builder for chaining.
       */
      public Builder setSubmitLimit(int value) {
        
        submitLimit_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 submitLimit = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearSubmitLimit() {
        bitField0_ = (bitField0_ & ~0x00000010);
        submitLimit_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ContentAuditInfo)
    }

    // @@protoc_insertion_point(class_scope:ContentAuditInfo)
    private static final emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo();
    }

    public static emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ContentAuditInfo>
        PARSER = new com.google.protobuf.AbstractParser<ContentAuditInfo>() {
      @java.lang.Override
      public ContentAuditInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ContentAuditInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ContentAuditInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ContentAuditInfoOuterClass.ContentAuditInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ContentAuditInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ContentAuditInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ContentAuditInfo.proto\032\020AuditState.pro" +
      "to\"~\n\020ContentAuditInfo\022\016\n\006isOpen\030\001 \001(\010\022\017" +
      "\n\007content\030\002 \001(\t\022\023\n\013submitCount\030\003 \001(\r\022\037\n\n" +
      "auditState\030\004 \001(\0162\013.AuditState\022\023\n\013submitL" +
      "imit\030\005 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AuditStateOuterClass.getDescriptor(),
        });
    internal_static_ContentAuditInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ContentAuditInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ContentAuditInfo_descriptor,
        new java.lang.String[] { "IsOpen", "Content", "SubmitCount", "AuditState", "SubmitLimit", });
    emu.grasscutter.net.proto.AuditStateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
