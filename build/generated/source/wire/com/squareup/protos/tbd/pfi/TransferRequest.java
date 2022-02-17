// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.tbd.pfi.TransferRequest in pfi.proto
package com.squareup.protos.tbd.pfi;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class TransferRequest extends Message<TransferRequest, TransferRequest.Builder> {
  public static final ProtoAdapter<TransferRequest> ADAPTER = new ProtoAdapter_TransferRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_IDEMPOTENCYKEY = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.protos.tbd.pfi.Source#ADAPTER"
  )
  public final Source source;

  @WireField(
      tag = 2,
      adapter = "com.squareup.protos.tbd.pfi.Destination#ADAPTER"
  )
  public final Destination destination;

  @WireField(
      tag = 3,
      adapter = "com.squareup.protos.tbd.pfi.Amount#ADAPTER"
  )
  public final Amount amount;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String idempotencyKey;

  public TransferRequest(Source source, Destination destination, Amount amount,
      String idempotencyKey) {
    this(source, destination, amount, idempotencyKey, ByteString.EMPTY);
  }

  public TransferRequest(Source source, Destination destination, Amount amount,
      String idempotencyKey, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.source = source;
    this.destination = destination;
    this.amount = amount;
    this.idempotencyKey = idempotencyKey;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.source = source;
    builder.destination = destination;
    builder.amount = amount;
    builder.idempotencyKey = idempotencyKey;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof TransferRequest)) return false;
    TransferRequest o = (TransferRequest) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(source, o.source)
        && Internal.equals(destination, o.destination)
        && Internal.equals(amount, o.amount)
        && Internal.equals(idempotencyKey, o.idempotencyKey);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (source != null ? source.hashCode() : 0);
      result = result * 37 + (destination != null ? destination.hashCode() : 0);
      result = result * 37 + (amount != null ? amount.hashCode() : 0);
      result = result * 37 + (idempotencyKey != null ? idempotencyKey.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (source != null) builder.append(", source=").append(source);
    if (destination != null) builder.append(", destination=").append(destination);
    if (amount != null) builder.append(", amount=").append(amount);
    if (idempotencyKey != null) builder.append(", idempotencyKey=").append(Internal.sanitize(idempotencyKey));
    return builder.replace(0, 2, "TransferRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<TransferRequest, Builder> {
    public Source source;

    public Destination destination;

    public Amount amount;

    public String idempotencyKey;

    public Builder() {
    }

    public Builder source(Source source) {
      this.source = source;
      return this;
    }

    public Builder destination(Destination destination) {
      this.destination = destination;
      return this;
    }

    public Builder amount(Amount amount) {
      this.amount = amount;
      return this;
    }

    public Builder idempotencyKey(String idempotencyKey) {
      this.idempotencyKey = idempotencyKey;
      return this;
    }

    @Override
    public TransferRequest build() {
      return new TransferRequest(source, destination, amount, idempotencyKey, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_TransferRequest extends ProtoAdapter<TransferRequest> {
    public ProtoAdapter_TransferRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, TransferRequest.class, "type.googleapis.com/squareup.protos.tbd.pfi.TransferRequest", Syntax.PROTO_2, null, "pfi.proto");
    }

    @Override
    public int encodedSize(TransferRequest value) {
      int result = 0;
      result += Source.ADAPTER.encodedSizeWithTag(1, value.source);
      result += Destination.ADAPTER.encodedSizeWithTag(2, value.destination);
      result += Amount.ADAPTER.encodedSizeWithTag(3, value.amount);
      result += ProtoAdapter.STRING.encodedSizeWithTag(4, value.idempotencyKey);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, TransferRequest value) throws IOException {
      Source.ADAPTER.encodeWithTag(writer, 1, value.source);
      Destination.ADAPTER.encodeWithTag(writer, 2, value.destination);
      Amount.ADAPTER.encodeWithTag(writer, 3, value.amount);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.idempotencyKey);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, TransferRequest value) throws IOException {
      writer.writeBytes(value.unknownFields());
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.idempotencyKey);
      Amount.ADAPTER.encodeWithTag(writer, 3, value.amount);
      Destination.ADAPTER.encodeWithTag(writer, 2, value.destination);
      Source.ADAPTER.encodeWithTag(writer, 1, value.source);
    }

    @Override
    public TransferRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.source(Source.ADAPTER.decode(reader)); break;
          case 2: builder.destination(Destination.ADAPTER.decode(reader)); break;
          case 3: builder.amount(Amount.ADAPTER.decode(reader)); break;
          case 4: builder.idempotencyKey(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public TransferRequest redact(TransferRequest value) {
      Builder builder = value.newBuilder();
      if (builder.source != null) builder.source = Source.ADAPTER.redact(builder.source);
      if (builder.destination != null) builder.destination = Destination.ADAPTER.redact(builder.destination);
      if (builder.amount != null) builder.amount = Amount.ADAPTER.redact(builder.amount);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
