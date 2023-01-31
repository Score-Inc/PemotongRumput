// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopInfoChangeNotify.proto

package emu.grasscutter.net.proto;

public final class HomeLimitedShopInfoChangeNotifyOuterClass {
  private HomeLimitedShopInfoChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeLimitedShopInfoChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeLimitedShopInfoChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> 
        getGoodsListList();
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoodsList(int index);
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    int getGoodsListCount();
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> 
        getGoodsListOrBuilderList();
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HomeLimitedShopInfoChangeNotify}
   */
  public static final class HomeLimitedShopInfoChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeLimitedShopInfoChangeNotify)
      HomeLimitedShopInfoChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeLimitedShopInfoChangeNotify.newBuilder() to construct.
    private HomeLimitedShopInfoChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeLimitedShopInfoChangeNotify() {
      goodsList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeLimitedShopInfoChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.internal_static_HomeLimitedShopInfoChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.internal_static_HomeLimitedShopInfoChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.class, emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeLimitedShopInfoChangeNotify.ALMFKCPBAGI}
     */
    public enum ALMFKCPBAGI
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4552;</code>
       */
      PEPPOHPHJOJ(1, 4552),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ALMFKCPBAGI DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4552;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4552;
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
      public static ALMFKCPBAGI valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ALMFKCPBAGI forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4552: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ALMFKCPBAGI>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ALMFKCPBAGI> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ALMFKCPBAGI>() {
              public ALMFKCPBAGI findValueByNumber(int number) {
                return ALMFKCPBAGI.forNumber(number);
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
        return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final ALMFKCPBAGI[] VALUES = getStaticValuesArray();
      private static ALMFKCPBAGI[] getStaticValuesArray() {
        return new ALMFKCPBAGI[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static ALMFKCPBAGI valueOf(
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

      private ALMFKCPBAGI(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeLimitedShopInfoChangeNotify.ALMFKCPBAGI)
    }

    public static final int GOODSLIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> goodsList_;
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> getGoodsListList() {
      return goodsList_;
    }
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> 
        getGoodsListOrBuilderList() {
      return goodsList_;
    }
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    @java.lang.Override
    public int getGoodsListCount() {
      return goodsList_.size();
    }
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoodsList(int index) {
      return goodsList_.get(index);
    }
    /**
     * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsListOrBuilder(
        int index) {
      return goodsList_.get(index);
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
      for (int i = 0; i < goodsList_.size(); i++) {
        output.writeMessage(1, goodsList_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < goodsList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, goodsList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify other = (emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify) obj;

      if (!getGoodsListList()
          .equals(other.getGoodsListList())) return false;
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
      if (getGoodsListCount() > 0) {
        hash = (37 * hash) + GOODSLIST_FIELD_NUMBER;
        hash = (53 * hash) + getGoodsListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify prototype) {
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
     * Protobuf type {@code HomeLimitedShopInfoChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeLimitedShopInfoChangeNotify)
        emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.internal_static_HomeLimitedShopInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.internal_static_HomeLimitedShopInfoChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.class, emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.newBuilder()
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
        if (goodsListBuilder_ == null) {
          goodsList_ = java.util.Collections.emptyList();
        } else {
          goodsList_ = null;
          goodsListBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.internal_static_HomeLimitedShopInfoChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify build() {
        emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify buildPartial() {
        emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify result = new emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify result) {
        if (goodsListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            goodsList_ = java.util.Collections.unmodifiableList(goodsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.goodsList_ = goodsList_;
        } else {
          result.goodsList_ = goodsListBuilder_.build();
        }
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify result) {
        int from_bitField0_ = bitField0_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify other) {
        if (other == emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify.getDefaultInstance()) return this;
        if (goodsListBuilder_ == null) {
          if (!other.goodsList_.isEmpty()) {
            if (goodsList_.isEmpty()) {
              goodsList_ = other.goodsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGoodsListIsMutable();
              goodsList_.addAll(other.goodsList_);
            }
            onChanged();
          }
        } else {
          if (!other.goodsList_.isEmpty()) {
            if (goodsListBuilder_.isEmpty()) {
              goodsListBuilder_.dispose();
              goodsListBuilder_ = null;
              goodsList_ = other.goodsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              goodsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getGoodsListFieldBuilder() : null;
            } else {
              goodsListBuilder_.addAllMessages(other.goodsList_);
            }
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
              case 10: {
                emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods m =
                    input.readMessage(
                        emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.parser(),
                        extensionRegistry);
                if (goodsListBuilder_ == null) {
                  ensureGoodsListIsMutable();
                  goodsList_.add(m);
                } else {
                  goodsListBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> goodsList_ =
        java.util.Collections.emptyList();
      private void ensureGoodsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          goodsList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods>(goodsList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> goodsListBuilder_;

      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> getGoodsListList() {
        if (goodsListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(goodsList_);
        } else {
          return goodsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public int getGoodsListCount() {
        if (goodsListBuilder_ == null) {
          return goodsList_.size();
        } else {
          return goodsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoodsList(int index) {
        if (goodsListBuilder_ == null) {
          return goodsList_.get(index);
        } else {
          return goodsListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder setGoodsList(
          int index, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods value) {
        if (goodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsListIsMutable();
          goodsList_.set(index, value);
          onChanged();
        } else {
          goodsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder setGoodsList(
          int index, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder builderForValue) {
        if (goodsListBuilder_ == null) {
          ensureGoodsListIsMutable();
          goodsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          goodsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder addGoodsList(emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods value) {
        if (goodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsListIsMutable();
          goodsList_.add(value);
          onChanged();
        } else {
          goodsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder addGoodsList(
          int index, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods value) {
        if (goodsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGoodsListIsMutable();
          goodsList_.add(index, value);
          onChanged();
        } else {
          goodsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder addGoodsList(
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder builderForValue) {
        if (goodsListBuilder_ == null) {
          ensureGoodsListIsMutable();
          goodsList_.add(builderForValue.build());
          onChanged();
        } else {
          goodsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder addGoodsList(
          int index, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder builderForValue) {
        if (goodsListBuilder_ == null) {
          ensureGoodsListIsMutable();
          goodsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          goodsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder addAllGoodsList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods> values) {
        if (goodsListBuilder_ == null) {
          ensureGoodsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, goodsList_);
          onChanged();
        } else {
          goodsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder clearGoodsList() {
        if (goodsListBuilder_ == null) {
          goodsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          goodsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public Builder removeGoodsList(int index) {
        if (goodsListBuilder_ == null) {
          ensureGoodsListIsMutable();
          goodsList_.remove(index);
          onChanged();
        } else {
          goodsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder getGoodsListBuilder(
          int index) {
        return getGoodsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsListOrBuilder(
          int index) {
        if (goodsListBuilder_ == null) {
          return goodsList_.get(index);  } else {
          return goodsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> 
           getGoodsListOrBuilderList() {
        if (goodsListBuilder_ != null) {
          return goodsListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(goodsList_);
        }
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder addGoodsListBuilder() {
        return getGoodsListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder addGoodsListBuilder(
          int index) {
        return getGoodsListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeLimitedShopGoods goodsList = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder> 
           getGoodsListBuilderList() {
        return getGoodsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> 
          getGoodsListFieldBuilder() {
        if (goodsListBuilder_ == null) {
          goodsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder>(
                  goodsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          goodsList_ = null;
        }
        return goodsListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeLimitedShopInfoChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:HomeLimitedShopInfoChangeNotify)
    private static final emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify();
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeLimitedShopInfoChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomeLimitedShopInfoChangeNotify>() {
      @java.lang.Override
      public HomeLimitedShopInfoChangeNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeLimitedShopInfoChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeLimitedShopInfoChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopInfoChangeNotifyOuterClass.HomeLimitedShopInfoChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeLimitedShopInfoChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeLimitedShopInfoChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%HomeLimitedShopInfoChangeNotify.proto\032" +
      "\032HomeLimitedShopGoods.proto\"\234\001\n\037HomeLimi" +
      "tedShopInfoChangeNotify\022(\n\tgoodsList\030\001 \003" +
      "(\0132\025.HomeLimitedShopGoods\"O\n\013ALMFKCPBAGI" +
      "\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\310#\022\017\n\013DCDNILFD" +
      "FLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.getDescriptor(),
        });
    internal_static_HomeLimitedShopInfoChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeLimitedShopInfoChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeLimitedShopInfoChangeNotify_descriptor,
        new java.lang.String[] { "GoodsList", });
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
