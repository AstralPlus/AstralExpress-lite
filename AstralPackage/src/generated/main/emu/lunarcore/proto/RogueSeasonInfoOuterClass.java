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

public final class RogueSeasonInfoOuterClass {
  /**
   * Protobuf type {@code RogueSeasonInfo}
   */
  public static final class RogueSeasonInfo extends ProtoMessage<RogueSeasonInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional int64 begin_time = 9;</code>
     */
    private long beginTime;

    /**
     * <code>optional int64 end_time = 14;</code>
     */
    private long endTime;

    /**
     * <code>optional uint32 season_id = 13;</code>
     */
    private int seasonId;

    private RogueSeasonInfo() {
    }

    /**
     * @return a new empty instance of {@code RogueSeasonInfo}
     */
    public static RogueSeasonInfo newInstance() {
      return new RogueSeasonInfo();
    }

    /**
     * <code>optional int64 begin_time = 9;</code>
     * @return whether the beginTime field is set
     */
    public boolean hasBeginTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional int64 begin_time = 9;</code>
     * @return this
     */
    public RogueSeasonInfo clearBeginTime() {
      bitField0_ &= ~0x00000001;
      beginTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 begin_time = 9;</code>
     * @return the beginTime
     */
    public long getBeginTime() {
      return beginTime;
    }

    /**
     * <code>optional int64 begin_time = 9;</code>
     * @param value the beginTime to set
     * @return this
     */
    public RogueSeasonInfo setBeginTime(final long value) {
      bitField0_ |= 0x00000001;
      beginTime = value;
      return this;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return whether the endTime field is set
     */
    public boolean hasEndTime() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return this
     */
    public RogueSeasonInfo clearEndTime() {
      bitField0_ &= ~0x00000002;
      endTime = 0L;
      return this;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @return the endTime
     */
    public long getEndTime() {
      return endTime;
    }

    /**
     * <code>optional int64 end_time = 14;</code>
     * @param value the endTime to set
     * @return this
     */
    public RogueSeasonInfo setEndTime(final long value) {
      bitField0_ |= 0x00000002;
      endTime = value;
      return this;
    }

    /**
     * <code>optional uint32 season_id = 13;</code>
     * @return whether the seasonId field is set
     */
    public boolean hasSeasonId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 season_id = 13;</code>
     * @return this
     */
    public RogueSeasonInfo clearSeasonId() {
      bitField0_ &= ~0x00000004;
      seasonId = 0;
      return this;
    }

    /**
     * <code>optional uint32 season_id = 13;</code>
     * @return the seasonId
     */
    public int getSeasonId() {
      return seasonId;
    }

    /**
     * <code>optional uint32 season_id = 13;</code>
     * @param value the seasonId to set
     * @return this
     */
    public RogueSeasonInfo setSeasonId(final int value) {
      bitField0_ |= 0x00000004;
      seasonId = value;
      return this;
    }

    @Override
    public RogueSeasonInfo copyFrom(final RogueSeasonInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        beginTime = other.beginTime;
        endTime = other.endTime;
        seasonId = other.seasonId;
      }
      return this;
    }

    @Override
    public RogueSeasonInfo mergeFrom(final RogueSeasonInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasBeginTime()) {
        setBeginTime(other.beginTime);
      }
      if (other.hasEndTime()) {
        setEndTime(other.endTime);
      }
      if (other.hasSeasonId()) {
        setSeasonId(other.seasonId);
      }
      return this;
    }

    @Override
    public RogueSeasonInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      beginTime = 0L;
      endTime = 0L;
      seasonId = 0;
      return this;
    }

    @Override
    public RogueSeasonInfo clearQuick() {
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
      if (!(o instanceof RogueSeasonInfo)) {
        return false;
      }
      RogueSeasonInfo other = (RogueSeasonInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasBeginTime() || beginTime == other.beginTime)
        && (!hasEndTime() || endTime == other.endTime)
        && (!hasSeasonId() || seasonId == other.seasonId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 72);
        output.writeInt64NoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 112);
        output.writeInt64NoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(seasonId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeInt64SizeNoTag(endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(seasonId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueSeasonInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 72: {
            // beginTime
            beginTime = input.readInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // endTime
            endTime = input.readInt64();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // seasonId
            seasonId = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeInt64(FieldNames.beginTime, beginTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeInt64(FieldNames.endTime, endTime);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.seasonId, seasonId);
      }
      output.endObject();
    }

    @Override
    public RogueSeasonInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1072839914:
          case 1112183971: {
            if (input.isAtField(FieldNames.beginTime)) {
              if (!input.trySkipNullValue()) {
                beginTime = input.readInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1607243192:
          case 1725551537: {
            if (input.isAtField(FieldNames.endTime)) {
              if (!input.trySkipNullValue()) {
                endTime = input.readInt64();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 889931614:
          case 1818097655: {
            if (input.isAtField(FieldNames.seasonId)) {
              if (!input.trySkipNullValue()) {
                seasonId = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public RogueSeasonInfo clone() {
      return new RogueSeasonInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueSeasonInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueSeasonInfo(), data).checkInitialized();
    }

    public static RogueSeasonInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueSeasonInfo(), input).checkInitialized();
    }

    public static RogueSeasonInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueSeasonInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueSeasonInfo messages
     */
    public static MessageFactory<RogueSeasonInfo> getFactory() {
      return RogueSeasonInfoFactory.INSTANCE;
    }

    private enum RogueSeasonInfoFactory implements MessageFactory<RogueSeasonInfo> {
      INSTANCE;

      @Override
      public RogueSeasonInfo create() {
        return RogueSeasonInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName beginTime = FieldName.forField("beginTime", "begin_time");

      static final FieldName endTime = FieldName.forField("endTime", "end_time");

      static final FieldName seasonId = FieldName.forField("seasonId", "season_id");
    }
  }
}
