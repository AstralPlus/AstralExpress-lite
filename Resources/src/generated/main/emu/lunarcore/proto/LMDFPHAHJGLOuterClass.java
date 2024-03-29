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
import us.hebi.quickbuf.RepeatedInt;

public final class LMDFPHAHJGLOuterClass {
  /**
   * Protobuf type {@code LMDFPHAHJGL}
   */
  public static final class LMDFPHAHJGL extends ProtoMessage<LMDFPHAHJGL> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     */
    private final RepeatedInt pFOIMEJPCIP = RepeatedInt.newEmptyInstance();

    private LMDFPHAHJGL() {
    }

    /**
     * @return a new empty instance of {@code LMDFPHAHJGL}
     */
    public static LMDFPHAHJGL newInstance() {
      return new LMDFPHAHJGL();
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     * @return whether the pFOIMEJPCIP field is set
     */
    public boolean hasPFOIMEJPCIP() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     * @return this
     */
    public LMDFPHAHJGL clearPFOIMEJPCIP() {
      bitField0_ &= ~0x00000001;
      pFOIMEJPCIP.clear();
      return this;
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePFOIMEJPCIP()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getPFOIMEJPCIP() {
      return pFOIMEJPCIP;
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutablePFOIMEJPCIP() {
      bitField0_ |= 0x00000001;
      return pFOIMEJPCIP;
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     * @param value the pFOIMEJPCIP to add
     * @return this
     */
    public LMDFPHAHJGL addPFOIMEJPCIP(final int value) {
      bitField0_ |= 0x00000001;
      pFOIMEJPCIP.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 PFOIMEJPCIP = 12;</code>
     * @param values the pFOIMEJPCIP to add
     * @return this
     */
    public LMDFPHAHJGL addAllPFOIMEJPCIP(final int... values) {
      bitField0_ |= 0x00000001;
      pFOIMEJPCIP.addAll(values);
      return this;
    }

    @Override
    public LMDFPHAHJGL copyFrom(final LMDFPHAHJGL other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        pFOIMEJPCIP.copyFrom(other.pFOIMEJPCIP);
      }
      return this;
    }

    @Override
    public LMDFPHAHJGL mergeFrom(final LMDFPHAHJGL other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasPFOIMEJPCIP()) {
        getMutablePFOIMEJPCIP().addAll(other.pFOIMEJPCIP);
      }
      return this;
    }

    @Override
    public LMDFPHAHJGL clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      pFOIMEJPCIP.clear();
      return this;
    }

    @Override
    public LMDFPHAHJGL clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      pFOIMEJPCIP.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof LMDFPHAHJGL)) {
        return false;
      }
      LMDFPHAHJGL other = (LMDFPHAHJGL) o;
      return bitField0_ == other.bitField0_
        && (!hasPFOIMEJPCIP() || pFOIMEJPCIP.equals(other.pFOIMEJPCIP));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < pFOIMEJPCIP.length(); i++) {
          output.writeRawByte((byte) 96);
          output.writeUInt32NoTag(pFOIMEJPCIP.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * pFOIMEJPCIP.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(pFOIMEJPCIP);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LMDFPHAHJGL mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 98: {
            // pFOIMEJPCIP [packed=true]
            input.readPackedUInt32(pFOIMEJPCIP, tag);
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
          case 96: {
            // pFOIMEJPCIP [packed=false]
            tag = input.readRepeatedUInt32(pFOIMEJPCIP, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.pFOIMEJPCIP, pFOIMEJPCIP);
      }
      output.endObject();
    }

    @Override
    public LMDFPHAHJGL mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 387398332: {
            if (input.isAtField(FieldNames.pFOIMEJPCIP)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(pFOIMEJPCIP);
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
    public LMDFPHAHJGL clone() {
      return new LMDFPHAHJGL().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LMDFPHAHJGL parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LMDFPHAHJGL(), data).checkInitialized();
    }

    public static LMDFPHAHJGL parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LMDFPHAHJGL(), input).checkInitialized();
    }

    public static LMDFPHAHJGL parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LMDFPHAHJGL(), input).checkInitialized();
    }

    /**
     * @return factory for creating LMDFPHAHJGL messages
     */
    public static MessageFactory<LMDFPHAHJGL> getFactory() {
      return LMDFPHAHJGLFactory.INSTANCE;
    }

    private enum LMDFPHAHJGLFactory implements MessageFactory<LMDFPHAHJGL> {
      INSTANCE;

      @Override
      public LMDFPHAHJGL create() {
        return LMDFPHAHJGL.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName pFOIMEJPCIP = FieldName.forField("PFOIMEJPCIP");
    }
  }
}
