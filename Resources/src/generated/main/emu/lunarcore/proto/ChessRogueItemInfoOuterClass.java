// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class ChessRogueItemInfoOuterClass {
  /**
   * Protobuf type {@code ChessRogueItemInfo}
   */
  public static final class ChessRogueItemInfo extends ProtoMessage<ChessRogueItemInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     */
    private final RepeatedMessage<ItemsEntry> items = RepeatedMessage.newEmptyInstance(ItemsEntry.getFactory());

    private ChessRogueItemInfo() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueItemInfo}
     */
    public static ChessRogueItemInfo newInstance() {
      return new ChessRogueItemInfo();
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     * @return whether the items field is set
     */
    public boolean hasItems() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     * @return this
     */
    public ChessRogueItemInfo clearItems() {
      bitField0_ &= ~0x00000001;
      items.clear();
      return this;
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableItems()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<ItemsEntry> getItems() {
      return items;
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<ItemsEntry> getMutableItems() {
      bitField0_ |= 0x00000001;
      return items;
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     * @param value the items to add
     * @return this
     */
    public ChessRogueItemInfo addItems(final ItemsEntry value) {
      bitField0_ |= 0x00000001;
      items.add(value);
      return this;
    }

    /**
     * <code>repeated .ChessRogueItemInfo.ItemsEntry items = 4;</code>
     * @param values the items to add
     * @return this
     */
    public ChessRogueItemInfo addAllItems(final ItemsEntry... values) {
      bitField0_ |= 0x00000001;
      items.addAll(values);
      return this;
    }

    @Override
    public ChessRogueItemInfo copyFrom(final ChessRogueItemInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        items.copyFrom(other.items);
      }
      return this;
    }

    @Override
    public ChessRogueItemInfo mergeFrom(final ChessRogueItemInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasItems()) {
        getMutableItems().addAll(other.items);
      }
      return this;
    }

    @Override
    public ChessRogueItemInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      items.clear();
      return this;
    }

    @Override
    public ChessRogueItemInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      items.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueItemInfo)) {
        return false;
      }
      ChessRogueItemInfo other = (ChessRogueItemInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasItems() || items.equals(other.items));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < items.length(); i++) {
          output.writeRawByte((byte) 34);
          output.writeMessageNoTag(items.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * items.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(items);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueItemInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 34: {
            // items
            tag = input.readRepeatedMessage(items, tag);
            bitField0_ |= 0x00000001;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedMessage(FieldNames.items, items);
      }
      output.endObject();
    }

    @Override
    public ChessRogueItemInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 100526016: {
            if (input.isAtField(FieldNames.items)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(items);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public ChessRogueItemInfo clone() {
      return new ChessRogueItemInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueItemInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueItemInfo(), data).checkInitialized();
    }

    public static ChessRogueItemInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueItemInfo(), input).checkInitialized();
    }

    public static ChessRogueItemInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueItemInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueItemInfo messages
     */
    public static MessageFactory<ChessRogueItemInfo> getFactory() {
      return ChessRogueItemInfoFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code ItemsEntry}
     */
    public static final class ItemsEntry extends ProtoMessage<ItemsEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private ItemsEntry() {
      }

      /**
       * @return a new empty instance of {@code ItemsEntry}
       */
      public static ItemsEntry newInstance() {
        return new ItemsEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public ItemsEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public ItemsEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public ItemsEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public ItemsEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public ItemsEntry copyFrom(final ItemsEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public ItemsEntry mergeFrom(final ItemsEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public ItemsEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public ItemsEntry clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof ItemsEntry)) {
          return false;
        }
        ItemsEntry other = (ItemsEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public ItemsEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public ItemsEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public ItemsEntry clone() {
        return new ItemsEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static ItemsEntry parseFrom(final byte[] data) throws InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new ItemsEntry(), data).checkInitialized();
      }

      public static ItemsEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new ItemsEntry(), input).checkInitialized();
      }

      public static ItemsEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new ItemsEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating ItemsEntry messages
       */
      public static MessageFactory<ItemsEntry> getFactory() {
        return ItemsEntryFactory.INSTANCE;
      }

      private enum ItemsEntryFactory implements MessageFactory<ItemsEntry> {
        INSTANCE;

        @Override
        public ItemsEntry create() {
          return ItemsEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum ChessRogueItemInfoFactory implements MessageFactory<ChessRogueItemInfo> {
      INSTANCE;

      @Override
      public ChessRogueItemInfo create() {
        return ChessRogueItemInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName items = FieldName.forField("items");
    }
  }
}
