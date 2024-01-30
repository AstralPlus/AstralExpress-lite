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

public final class ChallengeStoryInfoOuterClass {
  /**
   * Protobuf type {@code ChallengeStoryInfo}
   */
  public static final class ChallengeStoryInfo extends ProtoMessage<ChallengeStoryInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     */
    private final ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo curStoryBuffs = ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo.newInstance();

    private ChallengeStoryInfo() {
    }

    /**
     * @return a new empty instance of {@code ChallengeStoryInfo}
     */
    public static ChallengeStoryInfo newInstance() {
      return new ChallengeStoryInfo();
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     * @return whether the curStoryBuffs field is set
     */
    public boolean hasCurStoryBuffs() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     * @return this
     */
    public ChallengeStoryInfo clearCurStoryBuffs() {
      bitField0_ &= ~0x00000001;
      curStoryBuffs.clear();
      return this;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableCurStoryBuffs()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo getCurStoryBuffs() {
      return curStoryBuffs;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo getMutableCurStoryBuffs() {
      bitField0_ |= 0x00000001;
      return curStoryBuffs;
    }

    /**
     * <code>optional .ChallengeStoryBuffInfo cur_story_buffs = 6;</code>
     * @param value the curStoryBuffs to set
     * @return this
     */
    public ChallengeStoryInfo setCurStoryBuffs(
        final ChallengeStoryBuffInfoOuterClass.ChallengeStoryBuffInfo value) {
      bitField0_ |= 0x00000001;
      curStoryBuffs.copyFrom(value);
      return this;
    }

    @Override
    public ChallengeStoryInfo copyFrom(final ChallengeStoryInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        curStoryBuffs.copyFrom(other.curStoryBuffs);
      }
      return this;
    }

    @Override
    public ChallengeStoryInfo mergeFrom(final ChallengeStoryInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasCurStoryBuffs()) {
        getMutableCurStoryBuffs().mergeFrom(other.curStoryBuffs);
      }
      return this;
    }

    @Override
    public ChallengeStoryInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curStoryBuffs.clear();
      return this;
    }

    @Override
    public ChallengeStoryInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      curStoryBuffs.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChallengeStoryInfo)) {
        return false;
      }
      ChallengeStoryInfo other = (ChallengeStoryInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasCurStoryBuffs() || curStoryBuffs.equals(other.curStoryBuffs));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(curStoryBuffs);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(curStoryBuffs);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChallengeStoryInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 50: {
            // curStoryBuffs
            input.readMessage(curStoryBuffs);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.curStoryBuffs, curStoryBuffs);
      }
      output.endObject();
    }

    @Override
    public ChallengeStoryInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -587091733:
          case -738440393: {
            if (input.isAtField(FieldNames.curStoryBuffs)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(curStoryBuffs);
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
    public ChallengeStoryInfo clone() {
      return new ChallengeStoryInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChallengeStoryInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), data).checkInitialized();
    }

    public static ChallengeStoryInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), input).checkInitialized();
    }

    public static ChallengeStoryInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChallengeStoryInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChallengeStoryInfo messages
     */
    public static MessageFactory<ChallengeStoryInfo> getFactory() {
      return ChallengeStoryInfoFactory.INSTANCE;
    }

    private enum ChallengeStoryInfoFactory implements MessageFactory<ChallengeStoryInfo> {
      INSTANCE;

      @Override
      public ChallengeStoryInfo create() {
        return ChallengeStoryInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName curStoryBuffs = FieldName.forField("curStoryBuffs", "cur_story_buffs");
    }
  }
}
