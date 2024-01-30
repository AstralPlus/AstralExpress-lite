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

public final class SyncRogueFinishScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncRogueFinishScNotify}
   */
  public static final class SyncRogueFinishScNotify extends ProtoMessage<SyncRogueFinishScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     */
    private final RogueFinishInfoOuterClass.RogueFinishInfo finishInfo = RogueFinishInfoOuterClass.RogueFinishInfo.newInstance();

    private SyncRogueFinishScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncRogueFinishScNotify}
     */
    public static SyncRogueFinishScNotify newInstance() {
      return new SyncRogueFinishScNotify();
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     * @return whether the finishInfo field is set
     */
    public boolean hasFinishInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     * @return this
     */
    public SyncRogueFinishScNotify clearFinishInfo() {
      bitField0_ &= ~0x00000001;
      finishInfo.clear();
      return this;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFinishInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RogueFinishInfoOuterClass.RogueFinishInfo getFinishInfo() {
      return finishInfo;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RogueFinishInfoOuterClass.RogueFinishInfo getMutableFinishInfo() {
      bitField0_ |= 0x00000001;
      return finishInfo;
    }

    /**
     * <code>optional .RogueFinishInfo finish_info = 11;</code>
     * @param value the finishInfo to set
     * @return this
     */
    public SyncRogueFinishScNotify setFinishInfo(
        final RogueFinishInfoOuterClass.RogueFinishInfo value) {
      bitField0_ |= 0x00000001;
      finishInfo.copyFrom(value);
      return this;
    }

    @Override
    public SyncRogueFinishScNotify copyFrom(final SyncRogueFinishScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        finishInfo.copyFrom(other.finishInfo);
      }
      return this;
    }

    @Override
    public SyncRogueFinishScNotify mergeFrom(final SyncRogueFinishScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFinishInfo()) {
        getMutableFinishInfo().mergeFrom(other.finishInfo);
      }
      return this;
    }

    @Override
    public SyncRogueFinishScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      finishInfo.clear();
      return this;
    }

    @Override
    public SyncRogueFinishScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      finishInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncRogueFinishScNotify)) {
        return false;
      }
      SyncRogueFinishScNotify other = (SyncRogueFinishScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasFinishInfo() || finishInfo.equals(other.finishInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 90);
        output.writeMessageNoTag(finishInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(finishInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncRogueFinishScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 90: {
            // finishInfo
            input.readMessage(finishInfo);
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
        output.writeMessage(FieldNames.finishInfo, finishInfo);
      }
      output.endObject();
    }

    @Override
    public SyncRogueFinishScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1151198177:
          case 1347581146: {
            if (input.isAtField(FieldNames.finishInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(finishInfo);
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
    public SyncRogueFinishScNotify clone() {
      return new SyncRogueFinishScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncRogueFinishScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncRogueFinishScNotify(), data).checkInitialized();
    }

    public static SyncRogueFinishScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueFinishScNotify(), input).checkInitialized();
    }

    public static SyncRogueFinishScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncRogueFinishScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncRogueFinishScNotify messages
     */
    public static MessageFactory<SyncRogueFinishScNotify> getFactory() {
      return SyncRogueFinishScNotifyFactory.INSTANCE;
    }

    private enum SyncRogueFinishScNotifyFactory implements MessageFactory<SyncRogueFinishScNotify> {
      INSTANCE;

      @Override
      public SyncRogueFinishScNotify create() {
        return SyncRogueFinishScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName finishInfo = FieldName.forField("finishInfo", "finish_info");
    }
  }
}
