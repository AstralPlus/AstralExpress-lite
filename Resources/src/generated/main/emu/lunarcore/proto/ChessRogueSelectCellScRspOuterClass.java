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

public final class ChessRogueSelectCellScRspOuterClass {
  /**
   * Protobuf type {@code ChessRogueSelectCellScRsp}
   */
  public static final class ChessRogueSelectCellScRsp extends ProtoMessage<ChessRogueSelectCellScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 JNBHLHFBBBJ = 5;</code>
     */
    private int jNBHLHFBBBJ;

    /**
     * <code>optional uint32 retcode = 7;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 cell_id = 13;</code>
     */
    private int cellId;

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     */
    private final LLJFPKKLGAKOuterClass.LLJFPKKLGAK nDGOHDPDKAD = LLJFPKKLGAKOuterClass.LLJFPKKLGAK.newInstance();

    private ChessRogueSelectCellScRsp() {
    }

    /**
     * @return a new empty instance of {@code ChessRogueSelectCellScRsp}
     */
    public static ChessRogueSelectCellScRsp newInstance() {
      return new ChessRogueSelectCellScRsp();
    }

    /**
     * <code>optional uint32 JNBHLHFBBBJ = 5;</code>
     * @return whether the jNBHLHFBBBJ field is set
     */
    public boolean hasJNBHLHFBBBJ() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 JNBHLHFBBBJ = 5;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearJNBHLHFBBBJ() {
      bitField0_ &= ~0x00000001;
      jNBHLHFBBBJ = 0;
      return this;
    }

    /**
     * <code>optional uint32 JNBHLHFBBBJ = 5;</code>
     * @return the jNBHLHFBBBJ
     */
    public int getJNBHLHFBBBJ() {
      return jNBHLHFBBBJ;
    }

    /**
     * <code>optional uint32 JNBHLHFBBBJ = 5;</code>
     * @param value the jNBHLHFBBBJ to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setJNBHLHFBBBJ(final int value) {
      bitField0_ |= 0x00000001;
      jNBHLHFBBBJ = value;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearRetcode() {
      bitField0_ &= ~0x00000002;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 7;</code>
     * @param value the retcode to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000002;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 13;</code>
     * @return whether the cellId field is set
     */
    public boolean hasCellId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cell_id = 13;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearCellId() {
      bitField0_ &= ~0x00000004;
      cellId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cell_id = 13;</code>
     * @return the cellId
     */
    public int getCellId() {
      return cellId;
    }

    /**
     * <code>optional uint32 cell_id = 13;</code>
     * @param value the cellId to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setCellId(final int value) {
      bitField0_ |= 0x00000004;
      cellId = value;
      return this;
    }

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     * @return whether the nDGOHDPDKAD field is set
     */
    public boolean hasNDGOHDPDKAD() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     * @return this
     */
    public ChessRogueSelectCellScRsp clearNDGOHDPDKAD() {
      bitField0_ &= ~0x00000008;
      nDGOHDPDKAD.clear();
      return this;
    }

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableNDGOHDPDKAD()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public LLJFPKKLGAKOuterClass.LLJFPKKLGAK getNDGOHDPDKAD() {
      return nDGOHDPDKAD;
    }

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public LLJFPKKLGAKOuterClass.LLJFPKKLGAK getMutableNDGOHDPDKAD() {
      bitField0_ |= 0x00000008;
      return nDGOHDPDKAD;
    }

    /**
     * <code>optional .LLJFPKKLGAK NDGOHDPDKAD = 10;</code>
     * @param value the nDGOHDPDKAD to set
     * @return this
     */
    public ChessRogueSelectCellScRsp setNDGOHDPDKAD(final LLJFPKKLGAKOuterClass.LLJFPKKLGAK value) {
      bitField0_ |= 0x00000008;
      nDGOHDPDKAD.copyFrom(value);
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp copyFrom(final ChessRogueSelectCellScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        jNBHLHFBBBJ = other.jNBHLHFBBBJ;
        retcode = other.retcode;
        cellId = other.cellId;
        nDGOHDPDKAD.copyFrom(other.nDGOHDPDKAD);
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp mergeFrom(final ChessRogueSelectCellScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasJNBHLHFBBBJ()) {
        setJNBHLHFBBBJ(other.jNBHLHFBBBJ);
      }
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasCellId()) {
        setCellId(other.cellId);
      }
      if (other.hasNDGOHDPDKAD()) {
        getMutableNDGOHDPDKAD().mergeFrom(other.nDGOHDPDKAD);
      }
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      jNBHLHFBBBJ = 0;
      retcode = 0;
      cellId = 0;
      nDGOHDPDKAD.clear();
      return this;
    }

    @Override
    public ChessRogueSelectCellScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      nDGOHDPDKAD.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ChessRogueSelectCellScRsp)) {
        return false;
      }
      ChessRogueSelectCellScRsp other = (ChessRogueSelectCellScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasJNBHLHFBBBJ() || jNBHLHFBBBJ == other.jNBHLHFBBBJ)
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasCellId() || cellId == other.cellId)
        && (!hasNDGOHDPDKAD() || nDGOHDPDKAD.equals(other.nDGOHDPDKAD));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(jNBHLHFBBBJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 56);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(cellId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 82);
        output.writeMessageNoTag(nDGOHDPDKAD);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(jNBHLHFBBBJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(cellId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(nDGOHDPDKAD);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChessRogueSelectCellScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // jNBHLHFBBBJ
            jNBHLHFBBBJ = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 56) {
              break;
            }
          }
          case 56: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // cellId
            cellId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // nDGOHDPDKAD
            input.readMessage(nDGOHDPDKAD);
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
        output.writeUInt32(FieldNames.jNBHLHFBBBJ, jNBHLHFBBBJ);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.cellId, cellId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeMessage(FieldNames.nDGOHDPDKAD, nDGOHDPDKAD);
      }
      output.endObject();
    }

    @Override
    public ChessRogueSelectCellScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 480596488: {
            if (input.isAtField(FieldNames.jNBHLHFBBBJ)) {
              if (!input.trySkipNullValue()) {
                jNBHLHFBBBJ = input.readUInt32();
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
          case -1364082147:
          case 663147800: {
            if (input.isAtField(FieldNames.cellId)) {
              if (!input.trySkipNullValue()) {
                cellId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -939934496: {
            if (input.isAtField(FieldNames.nDGOHDPDKAD)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(nDGOHDPDKAD);
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
    public ChessRogueSelectCellScRsp clone() {
      return new ChessRogueSelectCellScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChessRogueSelectCellScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), data).checkInitialized();
    }

    public static ChessRogueSelectCellScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), input).checkInitialized();
    }

    public static ChessRogueSelectCellScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChessRogueSelectCellScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChessRogueSelectCellScRsp messages
     */
    public static MessageFactory<ChessRogueSelectCellScRsp> getFactory() {
      return ChessRogueSelectCellScRspFactory.INSTANCE;
    }

    private enum ChessRogueSelectCellScRspFactory implements MessageFactory<ChessRogueSelectCellScRsp> {
      INSTANCE;

      @Override
      public ChessRogueSelectCellScRsp create() {
        return ChessRogueSelectCellScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName jNBHLHFBBBJ = FieldName.forField("JNBHLHFBBBJ");

      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName cellId = FieldName.forField("cellId", "cell_id");

      static final FieldName nDGOHDPDKAD = FieldName.forField("NDGOHDPDKAD");
    }
  }
}
