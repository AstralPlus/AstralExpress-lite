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

public final class ItemOuterClass {
  /**
   * Protobuf type {@code Item}
   */
  public static final class Item extends ProtoMessage<Item> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     */
    private int mainAffixId;

    /**
     * <code>optional uint32 unique_id = 5;</code>
     */
    private int uniqueId;

    /**
     * <code>optional uint32 item_id = 6;</code>
     */
    private int itemId;

    /**
     * <code>optional uint32 num = 11;</code>
     */
    private int num;

    /**
     * <code>optional uint32 level = 13;</code>
     */
    private int level;

    /**
     * <code>optional uint32 rank = 14;</code>
     */
    private int rank;

    /**
     * <code>optional uint32 promotion = 15;</code>
     */
    private int promotion;

    private Item() {
    }

    /**
     * @return a new empty instance of {@code Item}
     */
    public static Item newInstance() {
      return new Item();
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return whether the mainAffixId field is set
     */
    public boolean hasMainAffixId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return this
     */
    public Item clearMainAffixId() {
      bitField0_ &= ~0x00000001;
      mainAffixId = 0;
      return this;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @return the mainAffixId
     */
    public int getMainAffixId() {
      return mainAffixId;
    }

    /**
     * <code>optional uint32 main_affix_id = 4;</code>
     * @param value the mainAffixId to set
     * @return this
     */
    public Item setMainAffixId(final int value) {
      bitField0_ |= 0x00000001;
      mainAffixId = value;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return whether the uniqueId field is set
     */
    public boolean hasUniqueId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return this
     */
    public Item clearUniqueId() {
      bitField0_ &= ~0x00000002;
      uniqueId = 0;
      return this;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @return the uniqueId
     */
    public int getUniqueId() {
      return uniqueId;
    }

    /**
     * <code>optional uint32 unique_id = 5;</code>
     * @param value the uniqueId to set
     * @return this
     */
    public Item setUniqueId(final int value) {
      bitField0_ |= 0x00000002;
      uniqueId = value;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 6;</code>
     * @return whether the itemId field is set
     */
    public boolean hasItemId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 item_id = 6;</code>
     * @return this
     */
    public Item clearItemId() {
      bitField0_ &= ~0x00000004;
      itemId = 0;
      return this;
    }

    /**
     * <code>optional uint32 item_id = 6;</code>
     * @return the itemId
     */
    public int getItemId() {
      return itemId;
    }

    /**
     * <code>optional uint32 item_id = 6;</code>
     * @param value the itemId to set
     * @return this
     */
    public Item setItemId(final int value) {
      bitField0_ |= 0x00000004;
      itemId = value;
      return this;
    }

    /**
     * <code>optional uint32 num = 11;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 num = 11;</code>
     * @return this
     */
    public Item clearNum() {
      bitField0_ &= ~0x00000008;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 11;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 11;</code>
     * @param value the num to set
     * @return this
     */
    public Item setNum(final int value) {
      bitField0_ |= 0x00000008;
      num = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return this
     */
    public Item clearLevel() {
      bitField0_ &= ~0x00000010;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 13;</code>
     * @param value the level to set
     * @return this
     */
    public Item setLevel(final int value) {
      bitField0_ |= 0x00000010;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 rank = 14;</code>
     * @return whether the rank field is set
     */
    public boolean hasRank() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 rank = 14;</code>
     * @return this
     */
    public Item clearRank() {
      bitField0_ &= ~0x00000020;
      rank = 0;
      return this;
    }

    /**
     * <code>optional uint32 rank = 14;</code>
     * @return the rank
     */
    public int getRank() {
      return rank;
    }

    /**
     * <code>optional uint32 rank = 14;</code>
     * @param value the rank to set
     * @return this
     */
    public Item setRank(final int value) {
      bitField0_ |= 0x00000020;
      rank = value;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 15;</code>
     * @return whether the promotion field is set
     */
    public boolean hasPromotion() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>optional uint32 promotion = 15;</code>
     * @return this
     */
    public Item clearPromotion() {
      bitField0_ &= ~0x00000040;
      promotion = 0;
      return this;
    }

    /**
     * <code>optional uint32 promotion = 15;</code>
     * @return the promotion
     */
    public int getPromotion() {
      return promotion;
    }

    /**
     * <code>optional uint32 promotion = 15;</code>
     * @param value the promotion to set
     * @return this
     */
    public Item setPromotion(final int value) {
      bitField0_ |= 0x00000040;
      promotion = value;
      return this;
    }

    @Override
    public Item copyFrom(final Item other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mainAffixId = other.mainAffixId;
        uniqueId = other.uniqueId;
        itemId = other.itemId;
        num = other.num;
        level = other.level;
        rank = other.rank;
        promotion = other.promotion;
      }
      return this;
    }

    @Override
    public Item mergeFrom(final Item other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMainAffixId()) {
        setMainAffixId(other.mainAffixId);
      }
      if (other.hasUniqueId()) {
        setUniqueId(other.uniqueId);
      }
      if (other.hasItemId()) {
        setItemId(other.itemId);
      }
      if (other.hasNum()) {
        setNum(other.num);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasRank()) {
        setRank(other.rank);
      }
      if (other.hasPromotion()) {
        setPromotion(other.promotion);
      }
      return this;
    }

    @Override
    public Item clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainAffixId = 0;
      uniqueId = 0;
      itemId = 0;
      num = 0;
      level = 0;
      rank = 0;
      promotion = 0;
      return this;
    }

    @Override
    public Item clearQuick() {
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
      if (!(o instanceof Item)) {
        return false;
      }
      Item other = (Item) o;
      return bitField0_ == other.bitField0_
        && (!hasMainAffixId() || mainAffixId == other.mainAffixId)
        && (!hasUniqueId() || uniqueId == other.uniqueId)
        && (!hasItemId() || itemId == other.itemId)
        && (!hasNum() || num == other.num)
        && (!hasLevel() || level == other.level)
        && (!hasRank() || rank == other.rank)
        && (!hasPromotion() || promotion == other.promotion);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(itemId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 88);
        output.writeUInt32NoTag(num);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(rank);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(promotion);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(uniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(itemId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rank);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(promotion);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Item mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // mainAffixId
            mainAffixId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // uniqueId
            uniqueId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // itemId
            itemId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // rank
            rank = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // promotion
            promotion = input.readUInt32();
            bitField0_ |= 0x00000040;
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
        output.writeUInt32(FieldNames.mainAffixId, mainAffixId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.uniqueId, uniqueId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.itemId, itemId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.num, num);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.rank, rank);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeUInt32(FieldNames.promotion, promotion);
      }
      output.endObject();
    }

    @Override
    public Item mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1973876974:
          case -1426712144: {
            if (input.isAtField(FieldNames.mainAffixId)) {
              if (!input.trySkipNullValue()) {
                mainAffixId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -294460212:
          case -538310583: {
            if (input.isAtField(FieldNames.uniqueId)) {
              if (!input.trySkipNullValue()) {
                uniqueId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1178662002:
          case 2116204999: {
            if (input.isAtField(FieldNames.itemId)) {
              if (!input.trySkipNullValue()) {
                itemId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 3492908: {
            if (input.isAtField(FieldNames.rank)) {
              if (!input.trySkipNullValue()) {
                rank = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -799212381: {
            if (input.isAtField(FieldNames.promotion)) {
              if (!input.trySkipNullValue()) {
                promotion = input.readUInt32();
                bitField0_ |= 0x00000040;
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
    public Item clone() {
      return new Item().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Item parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Item(), data).checkInitialized();
    }

    public static Item parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Item(), input).checkInitialized();
    }

    public static Item parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Item(), input).checkInitialized();
    }

    /**
     * @return factory for creating Item messages
     */
    public static MessageFactory<Item> getFactory() {
      return ItemFactory.INSTANCE;
    }

    private enum ItemFactory implements MessageFactory<Item> {
      INSTANCE;

      @Override
      public Item create() {
        return Item.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mainAffixId = FieldName.forField("mainAffixId", "main_affix_id");

      static final FieldName uniqueId = FieldName.forField("uniqueId", "unique_id");

      static final FieldName itemId = FieldName.forField("itemId", "item_id");

      static final FieldName num = FieldName.forField("num");

      static final FieldName level = FieldName.forField("level");

      static final FieldName rank = FieldName.forField("rank");

      static final FieldName promotion = FieldName.forField("promotion");
    }
  }
}
