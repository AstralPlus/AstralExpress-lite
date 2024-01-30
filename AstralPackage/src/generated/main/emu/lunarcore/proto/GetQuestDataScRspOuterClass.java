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

public final class GetQuestDataScRspOuterClass {
  /**
   * Protobuf type {@code GetQuestDataScRsp}
   */
  public static final class GetQuestDataScRsp extends ProtoMessage<GetQuestDataScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 total_achievement_exp = 1;</code>
     */
    private int totalAchievementExp;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     */
    private final RepeatedMessage<QuestOuterClass.Quest> questList = RepeatedMessage.newEmptyInstance(QuestOuterClass.Quest.getFactory());

    private GetQuestDataScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetQuestDataScRsp}
     */
    public static GetQuestDataScRsp newInstance() {
      return new GetQuestDataScRsp();
    }

    /**
     * <code>optional uint32 total_achievement_exp = 1;</code>
     * @return whether the totalAchievementExp field is set
     */
    public boolean hasTotalAchievementExp() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 total_achievement_exp = 1;</code>
     * @return this
     */
    public GetQuestDataScRsp clearTotalAchievementExp() {
      bitField0_ &= ~0x00000001;
      totalAchievementExp = 0;
      return this;
    }

    /**
     * <code>optional uint32 total_achievement_exp = 1;</code>
     * @return the totalAchievementExp
     */
    public int getTotalAchievementExp() {
      return totalAchievementExp;
    }

    /**
     * <code>optional uint32 total_achievement_exp = 1;</code>
     * @param value the totalAchievementExp to set
     * @return this
     */
    public GetQuestDataScRsp setTotalAchievementExp(final int value) {
      bitField0_ |= 0x00000001;
      totalAchievementExp = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public GetQuestDataScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetQuestDataScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     * @return whether the questList field is set
     */
    public boolean hasQuestList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     * @return this
     */
    public GetQuestDataScRsp clearQuestList() {
      bitField0_ &= ~0x00000004;
      questList.clear();
      return this;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableQuestList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<QuestOuterClass.Quest> getQuestList() {
      return questList;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<QuestOuterClass.Quest> getMutableQuestList() {
      bitField0_ |= 0x00000004;
      return questList;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     * @param value the questList to add
     * @return this
     */
    public GetQuestDataScRsp addQuestList(final QuestOuterClass.Quest value) {
      bitField0_ |= 0x00000004;
      questList.add(value);
      return this;
    }

    /**
     * <code>repeated .Quest quest_list = 10;</code>
     * @param values the questList to add
     * @return this
     */
    public GetQuestDataScRsp addAllQuestList(final QuestOuterClass.Quest... values) {
      bitField0_ |= 0x00000004;
      questList.addAll(values);
      return this;
    }

    @Override
    public GetQuestDataScRsp copyFrom(final GetQuestDataScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        totalAchievementExp = other.totalAchievementExp;
        retcode = other.retcode;
        questList.copyFrom(other.questList);
      }
      return this;
    }

    @Override
    public GetQuestDataScRsp mergeFrom(final GetQuestDataScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTotalAchievementExp()) {
        setTotalAchievementExp(other.totalAchievementExp);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasQuestList()) {
        getMutableQuestList().addAll(other.questList);
      }
      return this;
    }

    @Override
    public GetQuestDataScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      totalAchievementExp = 0;
      retcode = 0;
      questList.clear();
      return this;
    }

    @Override
    public GetQuestDataScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      questList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetQuestDataScRsp)) {
        return false;
      }
      GetQuestDataScRsp other = (GetQuestDataScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasTotalAchievementExp() || totalAchievementExp == other.totalAchievementExp)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasQuestList() || questList.equals(other.questList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(totalAchievementExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < questList.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(questList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(totalAchievementExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * questList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(questList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetQuestDataScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // totalAchievementExp
            totalAchievementExp = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // questList
            tag = input.readRepeatedMessage(questList, tag);
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
        output.writeUInt32(FieldNames.totalAchievementExp, totalAchievementExp);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.questList, questList);
      }
      output.endObject();
    }

    @Override
    public GetQuestDataScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 255336658:
          case -1295039982: {
            if (input.isAtField(FieldNames.totalAchievementExp)) {
              if (!input.trySkipNullValue()) {
                totalAchievementExp = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1783104352:
          case 575966683: {
            if (input.isAtField(FieldNames.questList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(questList);
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
    public GetQuestDataScRsp clone() {
      return new GetQuestDataScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetQuestDataScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetQuestDataScRsp(), data).checkInitialized();
    }

    public static GetQuestDataScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetQuestDataScRsp(), input).checkInitialized();
    }

    public static GetQuestDataScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetQuestDataScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetQuestDataScRsp messages
     */
    public static MessageFactory<GetQuestDataScRsp> getFactory() {
      return GetQuestDataScRspFactory.INSTANCE;
    }

    private enum GetQuestDataScRspFactory implements MessageFactory<GetQuestDataScRsp> {
      INSTANCE;

      @Override
      public GetQuestDataScRsp create() {
        return GetQuestDataScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName totalAchievementExp = FieldName.forField("totalAchievementExp", "total_achievement_exp");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName questList = FieldName.forField("questList", "quest_list");
    }
  }
}
