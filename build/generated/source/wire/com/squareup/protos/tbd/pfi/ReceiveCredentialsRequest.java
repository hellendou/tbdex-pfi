// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.tbd.pfi.ReceiveCredentialsRequest in pfi.proto
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

public final class ReceiveCredentialsRequest extends Message<ReceiveCredentialsRequest, ReceiveCredentialsRequest.Builder> {
  public static final ProtoAdapter<ReceiveCredentialsRequest> ADAPTER = new ProtoAdapter_ReceiveCredentialsRequest();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCOUNT_NUMBER = "";

  public static final String DEFAULT_ROUTING_NUMBER = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String account_number;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String routing_number;

  @WireField(
      tag = 3,
      adapter = "com.squareup.protos.tbd.pfi.BankAddress#ADAPTER"
  )
  public final BankAddress bank_address;

  @WireField(
      tag = 4,
      adapter = "com.squareup.protos.tbd.pfi.BillingDetails#ADAPTER"
  )
  public final BillingDetails billing_details;

  public ReceiveCredentialsRequest(String account_number, String routing_number,
      BankAddress bank_address, BillingDetails billing_details) {
    this(account_number, routing_number, bank_address, billing_details, ByteString.EMPTY);
  }

  public ReceiveCredentialsRequest(String account_number, String routing_number,
      BankAddress bank_address, BillingDetails billing_details, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.account_number = account_number;
    this.routing_number = routing_number;
    this.bank_address = bank_address;
    this.billing_details = billing_details;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.account_number = account_number;
    builder.routing_number = routing_number;
    builder.bank_address = bank_address;
    builder.billing_details = billing_details;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ReceiveCredentialsRequest)) return false;
    ReceiveCredentialsRequest o = (ReceiveCredentialsRequest) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(account_number, o.account_number)
        && Internal.equals(routing_number, o.routing_number)
        && Internal.equals(bank_address, o.bank_address)
        && Internal.equals(billing_details, o.billing_details);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (account_number != null ? account_number.hashCode() : 0);
      result = result * 37 + (routing_number != null ? routing_number.hashCode() : 0);
      result = result * 37 + (bank_address != null ? bank_address.hashCode() : 0);
      result = result * 37 + (billing_details != null ? billing_details.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (account_number != null) builder.append(", account_number=").append(Internal.sanitize(account_number));
    if (routing_number != null) builder.append(", routing_number=").append(Internal.sanitize(routing_number));
    if (bank_address != null) builder.append(", bank_address=").append(bank_address);
    if (billing_details != null) builder.append(", billing_details=").append(billing_details);
    return builder.replace(0, 2, "ReceiveCredentialsRequest{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<ReceiveCredentialsRequest, Builder> {
    public String account_number;

    public String routing_number;

    public BankAddress bank_address;

    public BillingDetails billing_details;

    public Builder() {
    }

    public Builder account_number(String account_number) {
      this.account_number = account_number;
      return this;
    }

    public Builder routing_number(String routing_number) {
      this.routing_number = routing_number;
      return this;
    }

    public Builder bank_address(BankAddress bank_address) {
      this.bank_address = bank_address;
      return this;
    }

    public Builder billing_details(BillingDetails billing_details) {
      this.billing_details = billing_details;
      return this;
    }

    @Override
    public ReceiveCredentialsRequest build() {
      return new ReceiveCredentialsRequest(account_number, routing_number, bank_address, billing_details, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_ReceiveCredentialsRequest extends ProtoAdapter<ReceiveCredentialsRequest> {
    public ProtoAdapter_ReceiveCredentialsRequest() {
      super(FieldEncoding.LENGTH_DELIMITED, ReceiveCredentialsRequest.class, "type.googleapis.com/squareup.protos.tbd.pfi.ReceiveCredentialsRequest", Syntax.PROTO_2, null, "pfi.proto");
    }

    @Override
    public int encodedSize(ReceiveCredentialsRequest value) {
      int result = 0;
      result += ProtoAdapter.STRING.encodedSizeWithTag(1, value.account_number);
      result += ProtoAdapter.STRING.encodedSizeWithTag(2, value.routing_number);
      result += BankAddress.ADAPTER.encodedSizeWithTag(3, value.bank_address);
      result += BillingDetails.ADAPTER.encodedSizeWithTag(4, value.billing_details);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, ReceiveCredentialsRequest value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.account_number);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.routing_number);
      BankAddress.ADAPTER.encodeWithTag(writer, 3, value.bank_address);
      BillingDetails.ADAPTER.encodeWithTag(writer, 4, value.billing_details);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, ReceiveCredentialsRequest value) throws
        IOException {
      writer.writeBytes(value.unknownFields());
      BillingDetails.ADAPTER.encodeWithTag(writer, 4, value.billing_details);
      BankAddress.ADAPTER.encodeWithTag(writer, 3, value.bank_address);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.routing_number);
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.account_number);
    }

    @Override
    public ReceiveCredentialsRequest decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.account_number(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.routing_number(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.bank_address(BankAddress.ADAPTER.decode(reader)); break;
          case 4: builder.billing_details(BillingDetails.ADAPTER.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public ReceiveCredentialsRequest redact(ReceiveCredentialsRequest value) {
      Builder builder = value.newBuilder();
      if (builder.bank_address != null) builder.bank_address = BankAddress.ADAPTER.redact(builder.bank_address);
      if (builder.billing_details != null) builder.billing_details = BillingDetails.ADAPTER.redact(builder.billing_details);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}