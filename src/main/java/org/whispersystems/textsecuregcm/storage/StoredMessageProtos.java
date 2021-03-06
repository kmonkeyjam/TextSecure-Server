// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoredMessage.proto

package org.whispersystems.textsecuregcm.storage;

public final class StoredMessageProtos {
  private StoredMessageProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface StoredMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional .textsecure.StoredMessage.Type type = 1;
    /**
     * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
     */
    boolean hasType();
    /**
     * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
     */
    org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type getType();

    // optional bytes content = 2;
    /**
     * <code>optional bytes content = 2;</code>
     */
    boolean hasContent();
    /**
     * <code>optional bytes content = 2;</code>
     */
    com.google.protobuf.ByteString getContent();
  }
  /**
   * Protobuf type {@code textsecure.StoredMessage}
   */
  public static final class StoredMessage extends
      com.google.protobuf.GeneratedMessage
      implements StoredMessageOrBuilder {
    // Use StoredMessage.newBuilder() to construct.
    private StoredMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private StoredMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final StoredMessage defaultInstance;
    public static StoredMessage getDefaultInstance() {
      return defaultInstance;
    }

    public StoredMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private StoredMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type value = org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                type_ = value;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              content_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.internal_static_textsecure_StoredMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.internal_static_textsecure_StoredMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.class, org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<StoredMessage> PARSER =
        new com.google.protobuf.AbstractParser<StoredMessage>() {
      public StoredMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StoredMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<StoredMessage> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code textsecure.StoredMessage.Type}
     */
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0, 0),
      /**
       * <code>MESSAGE = 1;</code>
       */
      MESSAGE(1, 1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>MESSAGE = 1;</code>
       */
      public static final int MESSAGE_VALUE = 1;


      public final int getNumber() { return value; }

      public static Type valueOf(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return MESSAGE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.valueOf(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final Type[] VALUES = values();

      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Type(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:textsecure.StoredMessage.Type)
    }

    private int bitField0_;
    // optional .textsecure.StoredMessage.Type type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type type_;
    /**
     * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
     */
    public org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type getType() {
      return type_;
    }

    // optional bytes content = 2;
    public static final int CONTENT_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString content_;
    /**
     * <code>optional bytes content = 2;</code>
     */
    public boolean hasContent() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bytes content = 2;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }

    private void initFields() {
      type_ = org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type.UNKNOWN;
      content_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, content_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, content_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code textsecure.StoredMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.internal_static_textsecure_StoredMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.internal_static_textsecure_StoredMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.class, org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Builder.class);
      }

      // Construct using org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type.UNKNOWN;
        bitField0_ = (bitField0_ & ~0x00000001);
        content_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.internal_static_textsecure_StoredMessage_descriptor;
      }

      public org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage getDefaultInstanceForType() {
        return org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.getDefaultInstance();
      }

      public org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage build() {
        org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage buildPartial() {
        org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage result = new org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.content_ = content_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage) {
          return mergeFrom((org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage other) {
        if (other == org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasContent()) {
          setContent(other.getContent());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional .textsecure.StoredMessage.Type type = 1;
      private org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type type_ = org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type.UNKNOWN;
      /**
       * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
       */
      public org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type getType() {
        return type_;
      }
      /**
       * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
       */
      public Builder setType(org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .textsecure.StoredMessage.Type type = 1;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = org.whispersystems.textsecuregcm.storage.StoredMessageProtos.StoredMessage.Type.UNKNOWN;
        onChanged();
        return this;
      }

      // optional bytes content = 2;
      private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes content = 2;</code>
       */
      public boolean hasContent() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bytes content = 2;</code>
       */
      public com.google.protobuf.ByteString getContent() {
        return content_;
      }
      /**
       * <code>optional bytes content = 2;</code>
       */
      public Builder setContent(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        content_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes content = 2;</code>
       */
      public Builder clearContent() {
        bitField0_ = (bitField0_ & ~0x00000002);
        content_ = getDefaultInstance().getContent();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:textsecure.StoredMessage)
    }

    static {
      defaultInstance = new StoredMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:textsecure.StoredMessage)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_textsecure_StoredMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_textsecure_StoredMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023StoredMessage.proto\022\ntextsecure\"p\n\rSto" +
      "redMessage\022,\n\004type\030\001 \001(\0162\036.textsecure.St" +
      "oredMessage.Type\022\017\n\007content\030\002 \001(\014\" \n\004Typ" +
      "e\022\013\n\007UNKNOWN\020\000\022\013\n\007MESSAGE\020\001B?\n(org.whisp" +
      "ersystems.textsecuregcm.storageB\023StoredM" +
      "essageProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_textsecure_StoredMessage_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_textsecure_StoredMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_textsecure_StoredMessage_descriptor,
              new java.lang.String[] { "Type", "Content", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
