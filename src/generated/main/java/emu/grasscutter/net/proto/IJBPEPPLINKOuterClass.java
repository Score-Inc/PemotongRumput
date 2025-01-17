// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IJBPEPPLINK.proto

package emu.grasscutter.net.proto;

public final class IJBPEPPLINKOuterClass {
  private IJBPEPPLINKOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code IJBPEPPLINK}
   */
  public enum IJBPEPPLINK
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>IJBPEPPLINK_None = 0;</code>
     */
    IJBPEPPLINK_None(0),
    /**
     * <code>IJBPEPPLINK_StarredDungeon = 1;</code>
     */
    IJBPEPPLINK_StarredDungeon(1),
    /**
     * <code>IJBPEPPLINK_StarredRoom = 2;</code>
     */
    IJBPEPPLINK_StarredRoom(2),
    /**
     * <code>IJBPEPPLINK_Owner = 3;</code>
     */
    IJBPEPPLINK_Owner(3),
    /**
     * <code>IJBPEPPLINK_History = 4;</code>
     */
    IJBPEPPLINK_History(4),
    /**
     * <code>IJBPEPPLINK_Search = 5;</code>
     */
    IJBPEPPLINK_Search(5),
    /**
     * <code>IJBPEPPLINK_Official = 6;</code>
     */
    IJBPEPPLINK_Official(6),
    /**
     * <code>IJBPEPPLINK_Template = 7;</code>
     */
    IJBPEPPLINK_Template(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>IJBPEPPLINK_None = 0;</code>
     */
    public static final int IJBPEPPLINK_None_VALUE = 0;
    /**
     * <code>IJBPEPPLINK_StarredDungeon = 1;</code>
     */
    public static final int IJBPEPPLINK_StarredDungeon_VALUE = 1;
    /**
     * <code>IJBPEPPLINK_StarredRoom = 2;</code>
     */
    public static final int IJBPEPPLINK_StarredRoom_VALUE = 2;
    /**
     * <code>IJBPEPPLINK_Owner = 3;</code>
     */
    public static final int IJBPEPPLINK_Owner_VALUE = 3;
    /**
     * <code>IJBPEPPLINK_History = 4;</code>
     */
    public static final int IJBPEPPLINK_History_VALUE = 4;
    /**
     * <code>IJBPEPPLINK_Search = 5;</code>
     */
    public static final int IJBPEPPLINK_Search_VALUE = 5;
    /**
     * <code>IJBPEPPLINK_Official = 6;</code>
     */
    public static final int IJBPEPPLINK_Official_VALUE = 6;
    /**
     * <code>IJBPEPPLINK_Template = 7;</code>
     */
    public static final int IJBPEPPLINK_Template_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
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
    public static IJBPEPPLINK valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static IJBPEPPLINK forNumber(int value) {
      switch (value) {
        case 0: return IJBPEPPLINK_None;
        case 1: return IJBPEPPLINK_StarredDungeon;
        case 2: return IJBPEPPLINK_StarredRoom;
        case 3: return IJBPEPPLINK_Owner;
        case 4: return IJBPEPPLINK_History;
        case 5: return IJBPEPPLINK_Search;
        case 6: return IJBPEPPLINK_Official;
        case 7: return IJBPEPPLINK_Template;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<IJBPEPPLINK>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        IJBPEPPLINK> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<IJBPEPPLINK>() {
            public IJBPEPPLINK findValueByNumber(int number) {
              return IJBPEPPLINK.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.IJBPEPPLINKOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final IJBPEPPLINK[] VALUES = values();

    public static IJBPEPPLINK valueOf(
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

    private final int value;

    private IJBPEPPLINK(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:IJBPEPPLINK)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IJBPEPPLINK.proto*\334\001\n\013IJBPEPPLINK\022\024\n\020I" +
      "JBPEPPLINK_None\020\000\022\036\n\032IJBPEPPLINK_Starred" +
      "Dungeon\020\001\022\033\n\027IJBPEPPLINK_StarredRoom\020\002\022\025" +
      "\n\021IJBPEPPLINK_Owner\020\003\022\027\n\023IJBPEPPLINK_His" +
      "tory\020\004\022\026\n\022IJBPEPPLINK_Search\020\005\022\030\n\024IJBPEP" +
      "PLINK_Official\020\006\022\030\n\024IJBPEPPLINK_Template" +
      "\020\007B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
