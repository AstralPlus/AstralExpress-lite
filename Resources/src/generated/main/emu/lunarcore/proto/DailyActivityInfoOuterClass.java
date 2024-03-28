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

public final class DailyActivityInfoOuterClass {
  /**
   * Protobuf type {@code DailyActivityInfo}
   */
  public static final class DailyActivityInfo extends ProtoMessage<DailyActivityInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 world_level = 4;</code>
     */
    private int worldLevel;

    /**
     * <code>optional uint32 daily_active_point = 5;</code>
     */
    private int dailyActivePoint;

    /**
     * <code>optional uint32 level = 10;</code>
     */
    private int level;

    /**
     * <code>optional bool is_has_taken = 2;</code>
     */
    private boolean isHasTaken;

    private DailyActivityInfo() {
    }

    /**
     * @return a new empty instance of {@code DailyActivityInfo}
     */
    public static DailyActivityInfo newInstance() {
      return new DailyActivityInfo();
    }

    /**
     * <code>optional uint32 world_level = 4;</code>
     * @return whether the worldLevel field is set
     */
    public boolean hasWorldLevel() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 world_level = 4;</code>
     * @return this
     */
    public DailyActivityInfo clearWorldLevel() {
      bitField0_ &= ~0x00000001;
      worldLevel = 0;
      return this;
    }

    /**
     * <code>optional uint32 world_level = 4;</code>
     * @return the worldLevel
     */
    public int getWorldLevel() {
      return worldLevel;
    }

    /**
     * <code>optional uint32 world_level = 4;</code>
     * @param value the worldLevel to set
     * @return this
     */
    public DailyActivityInfo setWorldLevel(final int value) {
      bitField0_ |= 0x00000001;
      worldLevel = value;
      return this;
    }

    /**
     * <code>optional uint32 daily_active_point = 5;</code>
     * @return whether the dailyActivePoint field is set
     */
    public boolean hasDailyActivePoint() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 daily_active_point = 5;</code>
     * @return this
     */
    public DailyActivityInfo clearDailyActivePoint() {
      bitField0_ &= ~0x00000002;
      dailyActivePoint = 0;
      return this;
    }

    /**
     * <code>optional uint32 daily_active_point = 5;</code>
     * @return the dailyActivePoint
     */
    public int getDailyActivePoint() {
      return dailyActivePoint;
    }

    /**
     * <code>optional uint32 daily_active_point = 5;</code>
     * @param value the dailyActivePoint to set
     * @return this
     */
    public DailyActivityInfo setDailyActivePoint(final int value) {
      bitField0_ |= 0x00000002;
      dailyActivePoint = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return this
     */
    public DailyActivityInfo clearLevel() {
      bitField0_ &= ~0x00000004;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 10;</code>
     * @param value the level to set
     * @return this
     */
    public DailyActivityInfo setLevel(final int value) {
      bitField0_ |= 0x00000004;
      level = value;
      return this;
    }

    /**
     * <code>optional bool is_has_taken = 2;</code>
     * @return whether the isHasTaken field is set
     */
    public boolean hasIsHasTaken() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional bool is_has_taken = 2;</code>
     * @return this
     */
    public DailyActivityInfo clearIsHasTaken() {
      bitField0_ &= ~0x00000008;
      isHasTaken = false;
      return this;
    }

    /**
     * <code>optional bool is_has_taken = 2;</code>
     * @return the isHasTaken
     */
    public boolean getIsHasTaken() {
      return isHasTaken;
    }

    /**
     * <code>optional bool is_has_taken = 2;</code>
     * @param value the isHasTaken to set
     * @return this
     */
    public DailyActivityInfo setIsHasTaken(final boolean value) {
      bitField0_ |= 0x00000008;
      isHasTaken = value;
      return this;
    }

    @Override
    public DailyActivityInfo copyFrom(final DailyActivityInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        worldLevel = other.worldLevel;
        dailyActivePoint = other.dailyActivePoint;
        level = other.level;
        isHasTaken = other.isHasTaken;
      }
      return this;
    }

    @Override
    public DailyActivityInfo mergeFrom(final DailyActivityInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasWorldLevel()) {
        setWorldLevel(other.worldLevel);
      }
      if (other.hasDailyActivePoint()) {
        setDailyActivePoint(other.dailyActivePoint);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasIsHasTaken()) {
        setIsHasTaken(other.isHasTaken);
      }
      return this;
    }

    @Override
    public DailyActivityInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      worldLevel = 0;
      dailyActivePoint = 0;
      level = 0;
      isHasTaken = false;
      return this;
    }

    @Override
    public DailyActivityInfo clearQuick() {
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
      if (!(o instanceof DailyActivityInfo)) {
        return false;
      }
      DailyActivityInfo other = (DailyActivityInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasWorldLevel() || worldLevel == other.worldLevel)
        && (!hasDailyActivePoint() || dailyActivePoint == other.dailyActivePoint)
        && (!hasLevel() || level == other.level)
        && (!hasIsHasTaken() || isHasTaken == other.isHasTaken);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(dailyActivePoint);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 16);
        output.writeBoolNoTag(isHasTaken);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(dailyActivePoint);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 2;
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DailyActivityInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // worldLevel
            worldLevel = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 40) {
              break;
            }
          }
          case 40: {
            // dailyActivePoint
            dailyActivePoint = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // isHasTaken
            isHasTaken = input.readBool();
            bitField0_ |= 0x00000008;
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
        output.writeUInt32(FieldNames.worldLevel, worldLevel);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.dailyActivePoint, dailyActivePoint);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeBool(FieldNames.isHasTaken, isHasTaken);
      }
      output.endObject();
    }

    @Override
    public DailyActivityInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 440007442:
          case 1305257111: {
            if (input.isAtField(FieldNames.worldLevel)) {
              if (!input.trySkipNullValue()) {
                worldLevel = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 859671121:
          case 1952864125: {
            if (input.isAtField(FieldNames.dailyActivePoint)) {
              if (!input.trySkipNullValue()) {
                dailyActivePoint = input.readUInt32();
                bitField0_ |= 0x00000002;
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
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -663154281:
          case -1240296947: {
            if (input.isAtField(FieldNames.isHasTaken)) {
              if (!input.trySkipNullValue()) {
                isHasTaken = input.readBool();
                bitField0_ |= 0x00000008;
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
    public DailyActivityInfo clone() {
      return new DailyActivityInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DailyActivityInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DailyActivityInfo(), data).checkInitialized();
    }

    public static DailyActivityInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DailyActivityInfo(), input).checkInitialized();
    }

    public static DailyActivityInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new DailyActivityInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating DailyActivityInfo messages
     */
    public static MessageFactory<DailyActivityInfo> getFactory() {
      return DailyActivityInfoFactory.INSTANCE;
    }

    private enum DailyActivityInfoFactory implements MessageFactory<DailyActivityInfo> {
      INSTANCE;

      @Override
      public DailyActivityInfo create() {
        return DailyActivityInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName worldLevel = FieldName.forField("worldLevel", "world_level");

      static final FieldName dailyActivePoint = FieldName.forField("dailyActivePoint", "daily_active_point");

      static final FieldName level = FieldName.forField("level");

      static final FieldName isHasTaken = FieldName.forField("isHasTaken", "is_has_taken");
    }
  }
}
