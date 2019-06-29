// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order_submission.proto

package com.microservices.laundrymanagementapi.messages;

public final class OrderSubmissionProto {
  private OrderSubmissionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderSubmissionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OrderSubmission)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 orderId = 1;</code>
     */
    int getOrderId();

    /**
     * <code>int32 laundryId = 2;</code>
     */
    int getLaundryId();

    /**
     * <code>int32 bucket = 3;</code>
     */
    int getBucket();

    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> 
        getDetailsList();
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail getDetails(int index);
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    int getDetailsCount();
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    java.util.List<? extends com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder> 
        getDetailsOrBuilderList();
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder getDetailsOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code OrderSubmission}
   */
  public  static final class OrderSubmission extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OrderSubmission)
      OrderSubmissionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OrderSubmission.newBuilder() to construct.
    private OrderSubmission(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OrderSubmission() {
      details_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OrderSubmission();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OrderSubmission(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              orderId_ = input.readInt32();
              break;
            }
            case 16: {

              laundryId_ = input.readInt32();
              break;
            }
            case 24: {

              bucket_ = input.readInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                details_ = new java.util.ArrayList<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail>();
                mutable_bitField0_ |= 0x00000001;
              }
              details_.add(
                  input.readMessage(com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          details_ = java.util.Collections.unmodifiableList(details_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.internal_static_OrderSubmission_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.internal_static_OrderSubmission_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.class, com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.Builder.class);
    }

    public static final int ORDERID_FIELD_NUMBER = 1;
    private int orderId_;
    /**
     * <code>int32 orderId = 1;</code>
     */
    public int getOrderId() {
      return orderId_;
    }

    public static final int LAUNDRYID_FIELD_NUMBER = 2;
    private int laundryId_;
    /**
     * <code>int32 laundryId = 2;</code>
     */
    public int getLaundryId() {
      return laundryId_;
    }

    public static final int BUCKET_FIELD_NUMBER = 3;
    private int bucket_;
    /**
     * <code>int32 bucket = 3;</code>
     */
    public int getBucket() {
      return bucket_;
    }

    public static final int DETAILS_FIELD_NUMBER = 4;
    private java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> details_;
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    public java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> getDetailsList() {
      return details_;
    }
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    public java.util.List<? extends com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder> 
        getDetailsOrBuilderList() {
      return details_;
    }
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    public int getDetailsCount() {
      return details_.size();
    }
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail getDetails(int index) {
      return details_.get(index);
    }
    /**
     * <code>repeated .OrderDetail details = 4;</code>
     */
    public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder getDetailsOrBuilder(
        int index) {
      return details_.get(index);
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
      if (orderId_ != 0) {
        output.writeInt32(1, orderId_);
      }
      if (laundryId_ != 0) {
        output.writeInt32(2, laundryId_);
      }
      if (bucket_ != 0) {
        output.writeInt32(3, bucket_);
      }
      for (int i = 0; i < details_.size(); i++) {
        output.writeMessage(4, details_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (orderId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, orderId_);
      }
      if (laundryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, laundryId_);
      }
      if (bucket_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, bucket_);
      }
      for (int i = 0; i < details_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, details_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission)) {
        return super.equals(obj);
      }
      com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission other = (com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission) obj;

      if (getOrderId()
          != other.getOrderId()) return false;
      if (getLaundryId()
          != other.getLaundryId()) return false;
      if (getBucket()
          != other.getBucket()) return false;
      if (!getDetailsList()
          .equals(other.getDetailsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ORDERID_FIELD_NUMBER;
      hash = (53 * hash) + getOrderId();
      hash = (37 * hash) + LAUNDRYID_FIELD_NUMBER;
      hash = (53 * hash) + getLaundryId();
      hash = (37 * hash) + BUCKET_FIELD_NUMBER;
      hash = (53 * hash) + getBucket();
      if (getDetailsCount() > 0) {
        hash = (37 * hash) + DETAILS_FIELD_NUMBER;
        hash = (53 * hash) + getDetailsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parseFrom(
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
    public static Builder newBuilder(com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission prototype) {
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
     * Protobuf type {@code OrderSubmission}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OrderSubmission)
        com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmissionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.internal_static_OrderSubmission_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.internal_static_OrderSubmission_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.class, com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.Builder.class);
      }

      // Construct using com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getDetailsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        orderId_ = 0;

        laundryId_ = 0;

        bucket_ = 0;

        if (detailsBuilder_ == null) {
          details_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          detailsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.internal_static_OrderSubmission_descriptor;
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission getDefaultInstanceForType() {
        return com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.getDefaultInstance();
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission build() {
        com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission buildPartial() {
        com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission result = new com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission(this);
        int from_bitField0_ = bitField0_;
        result.orderId_ = orderId_;
        result.laundryId_ = laundryId_;
        result.bucket_ = bucket_;
        if (detailsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            details_ = java.util.Collections.unmodifiableList(details_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.details_ = details_;
        } else {
          result.details_ = detailsBuilder_.build();
        }
        onBuilt();
        return result;
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
        if (other instanceof com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission) {
          return mergeFrom((com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission other) {
        if (other == com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission.getDefaultInstance()) return this;
        if (other.getOrderId() != 0) {
          setOrderId(other.getOrderId());
        }
        if (other.getLaundryId() != 0) {
          setLaundryId(other.getLaundryId());
        }
        if (other.getBucket() != 0) {
          setBucket(other.getBucket());
        }
        if (detailsBuilder_ == null) {
          if (!other.details_.isEmpty()) {
            if (details_.isEmpty()) {
              details_ = other.details_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureDetailsIsMutable();
              details_.addAll(other.details_);
            }
            onChanged();
          }
        } else {
          if (!other.details_.isEmpty()) {
            if (detailsBuilder_.isEmpty()) {
              detailsBuilder_.dispose();
              detailsBuilder_ = null;
              details_ = other.details_;
              bitField0_ = (bitField0_ & ~0x00000001);
              detailsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getDetailsFieldBuilder() : null;
            } else {
              detailsBuilder_.addAllMessages(other.details_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int orderId_ ;
      /**
       * <code>int32 orderId = 1;</code>
       */
      public int getOrderId() {
        return orderId_;
      }
      /**
       * <code>int32 orderId = 1;</code>
       */
      public Builder setOrderId(int value) {
        
        orderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 orderId = 1;</code>
       */
      public Builder clearOrderId() {
        
        orderId_ = 0;
        onChanged();
        return this;
      }

      private int laundryId_ ;
      /**
       * <code>int32 laundryId = 2;</code>
       */
      public int getLaundryId() {
        return laundryId_;
      }
      /**
       * <code>int32 laundryId = 2;</code>
       */
      public Builder setLaundryId(int value) {
        
        laundryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 laundryId = 2;</code>
       */
      public Builder clearLaundryId() {
        
        laundryId_ = 0;
        onChanged();
        return this;
      }

      private int bucket_ ;
      /**
       * <code>int32 bucket = 3;</code>
       */
      public int getBucket() {
        return bucket_;
      }
      /**
       * <code>int32 bucket = 3;</code>
       */
      public Builder setBucket(int value) {
        
        bucket_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 bucket = 3;</code>
       */
      public Builder clearBucket() {
        
        bucket_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> details_ =
        java.util.Collections.emptyList();
      private void ensureDetailsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          details_ = new java.util.ArrayList<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail>(details_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder> detailsBuilder_;

      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> getDetailsList() {
        if (detailsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(details_);
        } else {
          return detailsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public int getDetailsCount() {
        if (detailsBuilder_ == null) {
          return details_.size();
        } else {
          return detailsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail getDetails(int index) {
        if (detailsBuilder_ == null) {
          return details_.get(index);
        } else {
          return detailsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder setDetails(
          int index, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.set(index, value);
          onChanged();
        } else {
          detailsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder setDetails(
          int index, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.set(index, builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder addDetails(com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.add(value);
          onChanged();
        } else {
          detailsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder addDetails(
          int index, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail value) {
        if (detailsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureDetailsIsMutable();
          details_.add(index, value);
          onChanged();
        } else {
          detailsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder addDetails(
          com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.add(builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder addDetails(
          int index, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder builderForValue) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.add(index, builderForValue.build());
          onChanged();
        } else {
          detailsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder addAllDetails(
          java.lang.Iterable<? extends com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail> values) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, details_);
          onChanged();
        } else {
          detailsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder clearDetails() {
        if (detailsBuilder_ == null) {
          details_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          detailsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public Builder removeDetails(int index) {
        if (detailsBuilder_ == null) {
          ensureDetailsIsMutable();
          details_.remove(index);
          onChanged();
        } else {
          detailsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder getDetailsBuilder(
          int index) {
        return getDetailsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder getDetailsOrBuilder(
          int index) {
        if (detailsBuilder_ == null) {
          return details_.get(index);  } else {
          return detailsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public java.util.List<? extends com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder> 
           getDetailsOrBuilderList() {
        if (detailsBuilder_ != null) {
          return detailsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(details_);
        }
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder addDetailsBuilder() {
        return getDetailsFieldBuilder().addBuilder(
            com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder addDetailsBuilder(
          int index) {
        return getDetailsFieldBuilder().addBuilder(
            index, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.getDefaultInstance());
      }
      /**
       * <code>repeated .OrderDetail details = 4;</code>
       */
      public java.util.List<com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder> 
           getDetailsBuilderList() {
        return getDetailsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder> 
          getDetailsFieldBuilder() {
        if (detailsBuilder_ == null) {
          detailsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetail.Builder, com.microservices.laundrymanagementapi.messages.OrderDetailProto.OrderDetailOrBuilder>(
                  details_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          details_ = null;
        }
        return detailsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:OrderSubmission)
    }

    // @@protoc_insertion_point(class_scope:OrderSubmission)
    private static final com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission();
    }

    public static com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrderSubmission>
        PARSER = new com.google.protobuf.AbstractParser<OrderSubmission>() {
      @java.lang.Override
      public OrderSubmission parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderSubmission(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OrderSubmission> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrderSubmission> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.microservices.laundrymanagementapi.messages.OrderSubmissionProto.OrderSubmission getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderSubmission_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderSubmission_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026order_submission.proto\032\022order_detail.p" +
      "roto\"d\n\017OrderSubmission\022\017\n\007orderId\030\001 \001(\005" +
      "\022\021\n\tlaundryId\030\002 \001(\005\022\016\n\006bucket\030\003 \001(\005\022\035\n\007d" +
      "etails\030\004 \003(\0132\014.OrderDetailBG\n/com.micros" +
      "ervices.laundrymanagementapi.messagesB\024O" +
      "rderSubmissionProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.microservices.laundrymanagementapi.messages.OrderDetailProto.getDescriptor(),
        });
    internal_static_OrderSubmission_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderSubmission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderSubmission_descriptor,
        new java.lang.String[] { "OrderId", "LaundryId", "Bucket", "Details", });
    com.microservices.laundrymanagementapi.messages.OrderDetailProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
