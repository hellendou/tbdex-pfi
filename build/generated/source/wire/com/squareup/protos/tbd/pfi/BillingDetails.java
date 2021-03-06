// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.tbd.pfi.BillingDetails in pfi.proto
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

public final class BillingDetails extends Message<BillingDetails, BillingDetails.Builder> {
  public static final ProtoAdapter<BillingDetails> ADAPTER = new ProtoAdapter_BillingDetails();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_CITY = "";

  public static final String DEFAULT_COUNTRY = "";

  public static final String DEFAULT_LINE1 = "";

  public static final String DEFAULT_POSTALCODE = "";

  public static final String DEFAULT_DISTRICT = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String city;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String country;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String line1;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String postalCode;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String district;

  public BillingDetails(String name, String city, String country, String line1, String postalCode,
      String district) {
    this(name, city, country, line1, postalCode, district, ByteString.EMPTY);
  }

  public BillingDetails(String name, String city, String country, String line1, String postalCode,
      String district, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.name = name;
    this.city = city;
    this.country = country;
    this.line1 = line1;
    this.postalCode = postalCode;
    this.district = district;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.name = name;
    builder.city = city;
    builder.country = country;
    builder.line1 = line1;
    builder.postalCode = postalCode;
    builder.district = district;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BillingDetails)) return false;
    BillingDetails o = (BillingDetails) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(name, o.name)
        && Internal.equals(city, o.city)
        && Internal.equals(country, o.country)
        && Internal.equals(line1, o.line1)
        && Internal.equals(postalCode, o.postalCode)
        && Internal.equals(district, o.district);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (city != null ? city.hashCode() : 0);
      result = result * 37 + (country != null ? country.hashCode() : 0);
      result = result * 37 + (line1 != null ? line1.hashCode() : 0);
      result = result * 37 + (postalCode != null ? postalCode.hashCode() : 0);
      result = result * 37 + (district != null ? district.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (name != null) builder.append(", name=").append(Internal.sanitize(name));
    if (city != null) builder.append(", city=").append(Internal.sanitize(city));
    if (country != null) builder.append(", country=").append(Internal.sanitize(country));
    if (line1 != null) builder.append(", line1=").append(Internal.sanitize(line1));
    if (postalCode != null) builder.append(", postalCode=").append(Internal.sanitize(postalCode));
    if (district != null) builder.append(", district=").append(Internal.sanitize(district));
    return builder.replace(0, 2, "BillingDetails{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<BillingDetails, Builder> {
    public String name;

    public String city;

    public String country;

    public String line1;

    public String postalCode;

    public String district;

    public Builder() {
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder city(String city) {
      this.city = city;
      return this;
    }

    public Builder country(String country) {
      this.country = country;
      return this;
    }

    public Builder line1(String line1) {
      this.line1 = line1;
      return this;
    }

    public Builder postalCode(String postalCode) {
      this.postalCode = postalCode;
      return this;
    }

    public Builder district(String district) {
      this.district = district;
      return this;
    }

    @Override
    public BillingDetails build() {
      return new BillingDetails(name, city, country, line1, postalCode, district, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_BillingDetails extends ProtoAdapter<BillingDetails> {
    public ProtoAdapter_BillingDetails() {
      super(FieldEncoding.LENGTH_DELIMITED, BillingDetails.class, "type.googleapis.com/squareup.protos.tbd.pfi.BillingDetails", Syntax.PROTO_2, null, "pfi.proto");
    }

    @Override
    public int encodedSize(BillingDetails value) {
      int result = 0;
      result += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name);
      result += ProtoAdapter.STRING.encodedSizeWithTag(2, value.city);
      result += ProtoAdapter.STRING.encodedSizeWithTag(3, value.country);
      result += ProtoAdapter.STRING.encodedSizeWithTag(4, value.line1);
      result += ProtoAdapter.STRING.encodedSizeWithTag(5, value.postalCode);
      result += ProtoAdapter.STRING.encodedSizeWithTag(6, value.district);
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, BillingDetails value) throws IOException {
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.city);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.country);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.line1);
      ProtoAdapter.STRING.encodeWithTag(writer, 5, value.postalCode);
      ProtoAdapter.STRING.encodeWithTag(writer, 6, value.district);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public void encode(ReverseProtoWriter writer, BillingDetails value) throws IOException {
      writer.writeBytes(value.unknownFields());
      ProtoAdapter.STRING.encodeWithTag(writer, 6, value.district);
      ProtoAdapter.STRING.encodeWithTag(writer, 5, value.postalCode);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.line1);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.country);
      ProtoAdapter.STRING.encodeWithTag(writer, 2, value.city);
      ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name);
    }

    @Override
    public BillingDetails decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.city(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.country(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.line1(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.postalCode(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.district(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public BillingDetails redact(BillingDetails value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
