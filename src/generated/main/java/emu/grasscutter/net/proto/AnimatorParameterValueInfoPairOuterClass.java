// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnimatorParameterValueInfoPair.proto

package emu.grasscutter.net.proto;

public final class AnimatorParameterValueInfoPairOuterClass {
  private AnimatorParameterValueInfoPairOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnimatorParameterValueInfoPairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnimatorParameterValueInfoPair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 nameId = 1;</code>
     * @return The nameId.
     */
    int getNameId();

    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     * @return Whether the animatorPara field is set.
     */
    boolean hasAnimatorPara();
    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     * @return The animatorPara.
     */
    emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara();
    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     */
    emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder();
  }
  /**
   * Protobuf type {@code AnimatorParameterValueInfoPair}
   */
  public static final class AnimatorParameterValueInfoPair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnimatorParameterValueInfoPair)
      AnimatorParameterValueInfoPairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnimatorParameterValueInfoPair.newBuilder() to construct.
    private AnimatorParameterValueInfoPair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnimatorParameterValueInfoPair() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnimatorParameterValueInfoPair();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.class, emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder.class);
    }

    public static final int NAMEID_FIELD_NUMBER = 1;
    private int nameId_ = 0;
    /**
     * <code>int32 nameId = 1;</code>
     * @return The nameId.
     */
    @java.lang.Override
    public int getNameId() {
      return nameId_;
    }

    public static final int ANIMATORPARA_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo animatorPara_;
    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     * @return Whether the animatorPara field is set.
     */
    @java.lang.Override
    public boolean hasAnimatorPara() {
      return animatorPara_ != null;
    }
    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     * @return The animatorPara.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara() {
      return animatorPara_ == null ? emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : animatorPara_;
    }
    /**
     * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder() {
      return animatorPara_ == null ? emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : animatorPara_;
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
      if (nameId_ != 0) {
        output.writeInt32(1, nameId_);
      }
      if (animatorPara_ != null) {
        output.writeMessage(2, getAnimatorPara());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, nameId_);
      }
      if (animatorPara_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAnimatorPara());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair other = (emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair) obj;

      if (getNameId()
          != other.getNameId()) return false;
      if (hasAnimatorPara() != other.hasAnimatorPara()) return false;
      if (hasAnimatorPara()) {
        if (!getAnimatorPara()
            .equals(other.getAnimatorPara())) return false;
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
      hash = (37 * hash) + NAMEID_FIELD_NUMBER;
      hash = (53 * hash) + getNameId();
      if (hasAnimatorPara()) {
        hash = (37 * hash) + ANIMATORPARA_FIELD_NUMBER;
        hash = (53 * hash) + getAnimatorPara().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair prototype) {
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
     * Protobuf type {@code AnimatorParameterValueInfoPair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnimatorParameterValueInfoPair)
        emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.class, emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.newBuilder()
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
        nameId_ = 0;
        animatorPara_ = null;
        if (animatorParaBuilder_ != null) {
          animatorParaBuilder_.dispose();
          animatorParaBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair build() {
        emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair buildPartial() {
        emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair result = new emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.nameId_ = nameId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.animatorPara_ = animatorParaBuilder_ == null
              ? animatorPara_
              : animatorParaBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair) {
          return mergeFrom((emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair other) {
        if (other == emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance()) return this;
        if (other.getNameId() != 0) {
          setNameId(other.getNameId());
        }
        if (other.hasAnimatorPara()) {
          mergeAnimatorPara(other.getAnimatorPara());
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
                nameId_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 18: {
                input.readMessage(
                    getAnimatorParaFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

      private int nameId_ ;
      /**
       * <code>int32 nameId = 1;</code>
       * @return The nameId.
       */
      @java.lang.Override
      public int getNameId() {
        return nameId_;
      }
      /**
       * <code>int32 nameId = 1;</code>
       * @param value The nameId to set.
       * @return This builder for chaining.
       */
      public Builder setNameId(int value) {
        
        nameId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 nameId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nameId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo animatorPara_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> animatorParaBuilder_;
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       * @return Whether the animatorPara field is set.
       */
      public boolean hasAnimatorPara() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       * @return The animatorPara.
       */
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara() {
        if (animatorParaBuilder_ == null) {
          return animatorPara_ == null ? emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : animatorPara_;
        } else {
          return animatorParaBuilder_.getMessage();
        }
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public Builder setAnimatorPara(emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
        if (animatorParaBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          animatorPara_ = value;
        } else {
          animatorParaBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public Builder setAnimatorPara(
          emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder builderForValue) {
        if (animatorParaBuilder_ == null) {
          animatorPara_ = builderForValue.build();
        } else {
          animatorParaBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public Builder mergeAnimatorPara(emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
        if (animatorParaBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
            animatorPara_ != null &&
            animatorPara_ != emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance()) {
            getAnimatorParaBuilder().mergeFrom(value);
          } else {
            animatorPara_ = value;
          }
        } else {
          animatorParaBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public Builder clearAnimatorPara() {
        bitField0_ = (bitField0_ & ~0x00000002);
        animatorPara_ = null;
        if (animatorParaBuilder_ != null) {
          animatorParaBuilder_.dispose();
          animatorParaBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder getAnimatorParaBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getAnimatorParaFieldBuilder().getBuilder();
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      public emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder() {
        if (animatorParaBuilder_ != null) {
          return animatorParaBuilder_.getMessageOrBuilder();
        } else {
          return animatorPara_ == null ?
              emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : animatorPara_;
        }
      }
      /**
       * <code>.AnimatorParameterValueInfo animatorPara = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> 
          getAnimatorParaFieldBuilder() {
        if (animatorParaBuilder_ == null) {
          animatorParaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder>(
                  getAnimatorPara(),
                  getParentForChildren(),
                  isClean());
          animatorPara_ = null;
        }
        return animatorParaBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AnimatorParameterValueInfoPair)
    }

    // @@protoc_insertion_point(class_scope:AnimatorParameterValueInfoPair)
    private static final emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair();
    }

    public static emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnimatorParameterValueInfoPair>
        PARSER = new com.google.protobuf.AbstractParser<AnimatorParameterValueInfoPair>() {
      @java.lang.Override
      public AnimatorParameterValueInfoPair parsePartialFrom(
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

    public static com.google.protobuf.Parser<AnimatorParameterValueInfoPair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnimatorParameterValueInfoPair> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnimatorParameterValueInfoPair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$AnimatorParameterValueInfoPair.proto\032 " +
      "AnimatorParameterValueInfo.proto\"c\n\036Anim" +
      "atorParameterValueInfoPair\022\016\n\006nameId\030\001 \001" +
      "(\005\0221\n\014animatorPara\030\002 \001(\0132\033.AnimatorParam" +
      "eterValueInfoB\033\n\031emu.grasscutter.net.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.getDescriptor(),
        });
    internal_static_AnimatorParameterValueInfoPair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnimatorParameterValueInfoPair_descriptor,
        new java.lang.String[] { "NameId", "AnimatorPara", });
    emu.grasscutter.net.proto.AnimatorParameterValueInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
