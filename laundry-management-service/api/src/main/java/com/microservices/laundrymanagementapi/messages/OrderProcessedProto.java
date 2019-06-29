// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order_processed.proto

package com.microservices.laundrymanagementapi.messages;

public final class OrderProcessedProto {
  private OrderProcessedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OrderProcessedOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OrderProcessed)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 orderId = 1;</code>
     */
    int getOrderId();

    /**
     * <code>.LaudryState state = 2;</code>
     */
    boolean hasState();
    /**
     * <code>.LaudryState state = 2;</code>
     */
    com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState getState();
    /**
     * <code>.LaudryState state = 2;</code>
     */
    com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder getStateOrBuilder();

    /**
     * <code>int64 completeTime = 3;</code>
     */
    long getCompleteTime();
  }
  /**
   * Protobuf type {@code OrderProcessed}
   */
  public  static final class OrderProcessed extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OrderProcessed)
      OrderProcessedOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OrderProcessed.newBuilder() to construct.
    private OrderProcessed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OrderProcessed() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OrderProcessed();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OrderProcessed(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 18: {
              com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder subBuilder = null;
              if (state_ != null) {
                subBuilder = state_.toBuilder();
              }
              state_ = input.readMessage(com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(state_);
                state_ = subBuilder.buildPartial();
              }

              break;
            }
            case 24: {

              completeTime_ = input.readInt64();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.internal_static_OrderProcessed_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.internal_static_OrderProcessed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.class, com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.Builder.class);
    }

    public static final int ORDERID_FIELD_NUMBER = 1;
    private int orderId_;
    /**
     * <code>int32 orderId = 1;</code>
     */
    public int getOrderId() {
      return orderId_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState state_;
    /**
     * <code>.LaudryState state = 2;</code>
     */
    public boolean hasState() {
      return state_ != null;
    }
    /**
     * <code>.LaudryState state = 2;</code>
     */
    public com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState getState() {
      return state_ == null ? com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.getDefaultInstance() : state_;
    }
    /**
     * <code>.LaudryState state = 2;</code>
     */
    public com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder getStateOrBuilder() {
      return getState();
    }

    public static final int COMPLETETIME_FIELD_NUMBER = 3;
    private long completeTime_;
    /**
     * <code>int64 completeTime = 3;</code>
     */
    public long getCompleteTime() {
      return completeTime_;
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
      if (state_ != null) {
        output.writeMessage(2, getState());
      }
      if (completeTime_ != 0L) {
        output.writeInt64(3, completeTime_);
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
      if (state_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getState());
      }
      if (completeTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, completeTime_);
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
      if (!(obj instanceof com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed)) {
        return super.equals(obj);
      }
      com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed other = (com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed) obj;

      if (getOrderId()
          != other.getOrderId()) return false;
      if (hasState() != other.hasState()) return false;
      if (hasState()) {
        if (!getState()
            .equals(other.getState())) return false;
      }
      if (getCompleteTime()
          != other.getCompleteTime()) return false;
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
      if (hasState()) {
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getState().hashCode();
      }
      hash = (37 * hash) + COMPLETETIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCompleteTime());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parseFrom(
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
    public static Builder newBuilder(com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed prototype) {
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
     * Protobuf type {@code OrderProcessed}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OrderProcessed)
        com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessedOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.internal_static_OrderProcessed_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.internal_static_OrderProcessed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.class, com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.Builder.class);
      }

      // Construct using com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        orderId_ = 0;

        if (stateBuilder_ == null) {
          state_ = null;
        } else {
          state_ = null;
          stateBuilder_ = null;
        }
        completeTime_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.internal_static_OrderProcessed_descriptor;
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed getDefaultInstanceForType() {
        return com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.getDefaultInstance();
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed build() {
        com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed buildPartial() {
        com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed result = new com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed(this);
        result.orderId_ = orderId_;
        if (stateBuilder_ == null) {
          result.state_ = state_;
        } else {
          result.state_ = stateBuilder_.build();
        }
        result.completeTime_ = completeTime_;
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
        if (other instanceof com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed) {
          return mergeFrom((com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed other) {
        if (other == com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed.getDefaultInstance()) return this;
        if (other.getOrderId() != 0) {
          setOrderId(other.getOrderId());
        }
        if (other.hasState()) {
          mergeState(other.getState());
        }
        if (other.getCompleteTime() != 0L) {
          setCompleteTime(other.getCompleteTime());
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
        com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

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

      private com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState state_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder> stateBuilder_;
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public boolean hasState() {
        return stateBuilder_ != null || state_ != null;
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState getState() {
        if (stateBuilder_ == null) {
          return state_ == null ? com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.getDefaultInstance() : state_;
        } else {
          return stateBuilder_.getMessage();
        }
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public Builder setState(com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState value) {
        if (stateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          state_ = value;
          onChanged();
        } else {
          stateBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public Builder setState(
          com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder builderForValue) {
        if (stateBuilder_ == null) {
          state_ = builderForValue.build();
          onChanged();
        } else {
          stateBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public Builder mergeState(com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState value) {
        if (stateBuilder_ == null) {
          if (state_ != null) {
            state_ =
              com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.newBuilder(state_).mergeFrom(value).buildPartial();
          } else {
            state_ = value;
          }
          onChanged();
        } else {
          stateBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public Builder clearState() {
        if (stateBuilder_ == null) {
          state_ = null;
          onChanged();
        } else {
          state_ = null;
          stateBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder getStateBuilder() {
        
        onChanged();
        return getStateFieldBuilder().getBuilder();
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      public com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder getStateOrBuilder() {
        if (stateBuilder_ != null) {
          return stateBuilder_.getMessageOrBuilder();
        } else {
          return state_ == null ?
              com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.getDefaultInstance() : state_;
        }
      }
      /**
       * <code>.LaudryState state = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder> 
          getStateFieldBuilder() {
        if (stateBuilder_ == null) {
          stateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryState.Builder, com.microservices.laundrymanagementapi.messages.LaudryStateProto.LaudryStateOrBuilder>(
                  getState(),
                  getParentForChildren(),
                  isClean());
          state_ = null;
        }
        return stateBuilder_;
      }

      private long completeTime_ ;
      /**
       * <code>int64 completeTime = 3;</code>
       */
      public long getCompleteTime() {
        return completeTime_;
      }
      /**
       * <code>int64 completeTime = 3;</code>
       */
      public Builder setCompleteTime(long value) {
        
        completeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 completeTime = 3;</code>
       */
      public Builder clearCompleteTime() {
        
        completeTime_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:OrderProcessed)
    }

    // @@protoc_insertion_point(class_scope:OrderProcessed)
    private static final com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed();
    }

    public static com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OrderProcessed>
        PARSER = new com.google.protobuf.AbstractParser<OrderProcessed>() {
      @java.lang.Override
      public OrderProcessed parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OrderProcessed(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OrderProcessed> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OrderProcessed> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.microservices.laundrymanagementapi.messages.OrderProcessedProto.OrderProcessed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OrderProcessed_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OrderProcessed_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025order_processed.proto\032\022laudry_state.pr" +
      "oto\"T\n\016OrderProcessed\022\017\n\007orderId\030\001 \001(\005\022\033" +
      "\n\005state\030\002 \001(\0132\014.LaudryState\022\024\n\014completeT" +
      "ime\030\003 \001(\003BF\n/com.microservices.laundryma" +
      "nagementapi.messagesB\023OrderProcessedProt" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.microservices.laundrymanagementapi.messages.LaudryStateProto.getDescriptor(),
        });
    internal_static_OrderProcessed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OrderProcessed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OrderProcessed_descriptor,
        new java.lang.String[] { "OrderId", "State", "CompleteTime", });
    com.microservices.laundrymanagementapi.messages.LaudryStateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
