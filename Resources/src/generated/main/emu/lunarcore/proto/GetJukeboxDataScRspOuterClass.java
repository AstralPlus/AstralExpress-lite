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

public final class GetJukeboxDataScRspOuterClass {
  /**
   * Protobuf type {@code GetJukeboxDataScRsp}
   */
  public static final class GetJukeboxDataScRsp extends ProtoMessage<GetJukeboxDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 playing_id = 9;</code>
     */
    private int playingId;

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     */
    private final RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> musicList = RepeatedMessage.newEmptyInstance(UnlockedMusicOuterClass.UnlockedMusic.getFactory());

    private GetJukeboxDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetJukeboxDataScRsp}
     */
    public static GetJukeboxDataScRsp newInstance() {
      return new GetJukeboxDataScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public GetJukeboxDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetJukeboxDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 playing_id = 9;</code>
     * @return whether the playingId field is set
     */
    public boolean hasPlayingId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 playing_id = 9;</code>
     * @return this
     */
    public GetJukeboxDataScRsp clearPlayingId() {
      bitField0_ &= ~0x00000002;
      playingId = 0;
      return this;
    }

    /**
     * <code>optional uint32 playing_id = 9;</code>
     * @return the playingId
     */
    public int getPlayingId() {
      return playingId;
    }

    /**
     * <code>optional uint32 playing_id = 9;</code>
     * @param value the playingId to set
     * @return this
     */
    public GetJukeboxDataScRsp setPlayingId(final int value) {
      bitField0_ |= 0x00000002;
      playingId = value;
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     * @return whether the musicList field is set
     */
    public boolean hasMusicList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     * @return this
     */
    public GetJukeboxDataScRsp clearMusicList() {
      bitField0_ &= ~0x00000004;
      musicList.clear();
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMusicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> getMusicList() {
      return musicList;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<UnlockedMusicOuterClass.UnlockedMusic> getMutableMusicList() {
      bitField0_ |= 0x00000004;
      return musicList;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     * @param value the musicList to add
     * @return this
     */
    public GetJukeboxDataScRsp addMusicList(final UnlockedMusicOuterClass.UnlockedMusic value) {
      bitField0_ |= 0x00000004;
      musicList.add(value);
      return this;
    }

    /**
     * <code>repeated .UnlockedMusic music_list = 10;</code>
     * @param values the musicList to add
     * @return this
     */
    public GetJukeboxDataScRsp addAllMusicList(
        final UnlockedMusicOuterClass.UnlockedMusic... values) {
      bitField0_ |= 0x00000004;
      musicList.addAll(values);
      return this;
    }

    @Override
    public GetJukeboxDataScRsp copyFrom(final GetJukeboxDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        playingId = other.playingId;
        musicList.copyFrom(other.musicList);
      }
      return this;
    }

    @Override
    public GetJukeboxDataScRsp mergeFrom(final GetJukeboxDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasPlayingId()) {
        setPlayingId(other.playingId);
      }
      if (other.hasMusicList()) {
        getMutableMusicList().addAll(other.musicList);
      }
      return this;
    }

    @Override
    public GetJukeboxDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      playingId = 0;
      musicList.clear();
      return this;
    }

    @Override
    public GetJukeboxDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      musicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetJukeboxDataScRsp)) {
        return false;
      }
      GetJukeboxDataScRsp other = (GetJukeboxDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasPlayingId() || playingId == other.playingId)
        && (!hasMusicList() || musicList.equals(other.musicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(playingId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < musicList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(musicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(playingId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * musicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(musicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetJukeboxDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // playingId
            playingId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // musicList
            tag = input.readRepeatedMessage(musicList, tag);
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.playingId, playingId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.musicList, musicList);
      }
      output.endObject();
    }

    @Override
    public GetJukeboxDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1868462615:
          case -2087744820: {
            if (input.isAtField(FieldNames.playingId)) {
              if (!input.trySkipNullValue()) {
                playingId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 389904483:
          case -780236168: {
            if (input.isAtField(FieldNames.musicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(musicList);
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
    public GetJukeboxDataScRsp clone() {
      return new GetJukeboxDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetJukeboxDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetJukeboxDataScRsp(), data).checkInitialized();
    }

    public static GetJukeboxDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetJukeboxDataScRsp(), input).checkInitialized();
    }

    public static GetJukeboxDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetJukeboxDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetJukeboxDataScRsp messages
     */
    public static MessageFactory<GetJukeboxDataScRsp> getFactory() {
      return GetJukeboxDataScRspFactory.INSTANCE;
    }

    private enum GetJukeboxDataScRspFactory implements MessageFactory<GetJukeboxDataScRsp> {
      INSTANCE;

      @Override
      public GetJukeboxDataScRsp create() {
        return GetJukeboxDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName playingId = FieldName.forField("playingId", "playing_id");

      static final FieldName musicList = FieldName.forField("musicList", "music_list");
    }
  }
}
