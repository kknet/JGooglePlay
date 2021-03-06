// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Purchase.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class CheckoutOptionProto extends Message {

  public static final String DEFAULT_FORMOFPAYMENT = "";
  public static final String DEFAULT_ENCODEDADJUSTEDCART = "";
  public static final String DEFAULT_INSTRUMENTID = "";
  public static final List<LineItem> DEFAULT_ITEM = Collections.emptyList();
  public static final List<LineItem> DEFAULT_SUBITEM = Collections.emptyList();
  public static final List<String> DEFAULT_FOOTERHTML = Collections.emptyList();
  public static final Integer DEFAULT_INSTRUMENTFAMILY = 0;
  public static final List<Integer> DEFAULT_DEPRECATEDINSTRUMENTINAPPLICABLEREASON = Collections.emptyList();
  public static final Boolean DEFAULT_SELECTEDINSTRUMENT = false;
  public static final List<String> DEFAULT_FOOTNOTEHTML = Collections.emptyList();
  public static final String DEFAULT_PURCHASECOOKIE = "";
  public static final List<String> DEFAULT_DISABLEDREASON = Collections.emptyList();

  @ProtoField(tag = 6, type = STRING)
  public final String formOfPayment;

  @ProtoField(tag = 7, type = STRING)
  public final String encodedAdjustedCart;

  @ProtoField(tag = 15, type = STRING)
  public final String instrumentId;

  @ProtoField(tag = 16, label = REPEATED)
  public final List<LineItem> item;

  @ProtoField(tag = 17, label = REPEATED)
  public final List<LineItem> subItem;

  @ProtoField(tag = 18)
  public final LineItem total;

  @ProtoField(tag = 19, type = STRING, label = REPEATED)
  public final List<String> footerHtml;

  @ProtoField(tag = 29, type = INT32)
  public final Integer instrumentFamily;

  @ProtoField(tag = 30, type = INT32, label = REPEATED)
  public final List<Integer> deprecatedInstrumentInapplicableReason;

  @ProtoField(tag = 32, type = BOOL)
  public final Boolean selectedInstrument;

  @ProtoField(tag = 33)
  public final LineItem summary;

  @ProtoField(tag = 35, type = STRING, label = REPEATED)
  public final List<String> footnoteHtml;

  @ProtoField(tag = 43)
  public final Instrument instrument;

  @ProtoField(tag = 45, type = STRING)
  public final String purchaseCookie;

  @ProtoField(tag = 48, type = STRING, label = REPEATED)
  public final List<String> disabledReason;

  public CheckoutOptionProto(String formOfPayment, String encodedAdjustedCart, String instrumentId, List<LineItem> item, List<LineItem> subItem, LineItem total, List<String> footerHtml, Integer instrumentFamily, List<Integer> deprecatedInstrumentInapplicableReason, Boolean selectedInstrument, LineItem summary, List<String> footnoteHtml, Instrument instrument, String purchaseCookie, List<String> disabledReason) {
    this.formOfPayment = formOfPayment;
    this.encodedAdjustedCart = encodedAdjustedCart;
    this.instrumentId = instrumentId;
    this.item = immutableCopyOf(item);
    this.subItem = immutableCopyOf(subItem);
    this.total = total;
    this.footerHtml = immutableCopyOf(footerHtml);
    this.instrumentFamily = instrumentFamily;
    this.deprecatedInstrumentInapplicableReason = immutableCopyOf(deprecatedInstrumentInapplicableReason);
    this.selectedInstrument = selectedInstrument;
    this.summary = summary;
    this.footnoteHtml = immutableCopyOf(footnoteHtml);
    this.instrument = instrument;
    this.purchaseCookie = purchaseCookie;
    this.disabledReason = immutableCopyOf(disabledReason);
  }

  private CheckoutOptionProto(Builder builder) {
    this(builder.formOfPayment, builder.encodedAdjustedCart, builder.instrumentId, builder.item, builder.subItem, builder.total, builder.footerHtml, builder.instrumentFamily, builder.deprecatedInstrumentInapplicableReason, builder.selectedInstrument, builder.summary, builder.footnoteHtml, builder.instrument, builder.purchaseCookie, builder.disabledReason);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CheckoutOptionProto)) return false;
    CheckoutOptionProto o = (CheckoutOptionProto) other;
    return equals(formOfPayment, o.formOfPayment)
        && equals(encodedAdjustedCart, o.encodedAdjustedCart)
        && equals(instrumentId, o.instrumentId)
        && equals(item, o.item)
        && equals(subItem, o.subItem)
        && equals(total, o.total)
        && equals(footerHtml, o.footerHtml)
        && equals(instrumentFamily, o.instrumentFamily)
        && equals(deprecatedInstrumentInapplicableReason, o.deprecatedInstrumentInapplicableReason)
        && equals(selectedInstrument, o.selectedInstrument)
        && equals(summary, o.summary)
        && equals(footnoteHtml, o.footnoteHtml)
        && equals(instrument, o.instrument)
        && equals(purchaseCookie, o.purchaseCookie)
        && equals(disabledReason, o.disabledReason);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = formOfPayment != null ? formOfPayment.hashCode() : 0;
      result = result * 37 + (encodedAdjustedCart != null ? encodedAdjustedCart.hashCode() : 0);
      result = result * 37 + (instrumentId != null ? instrumentId.hashCode() : 0);
      result = result * 37 + (item != null ? item.hashCode() : 1);
      result = result * 37 + (subItem != null ? subItem.hashCode() : 1);
      result = result * 37 + (total != null ? total.hashCode() : 0);
      result = result * 37 + (footerHtml != null ? footerHtml.hashCode() : 1);
      result = result * 37 + (instrumentFamily != null ? instrumentFamily.hashCode() : 0);
      result = result * 37 + (deprecatedInstrumentInapplicableReason != null ? deprecatedInstrumentInapplicableReason.hashCode() : 1);
      result = result * 37 + (selectedInstrument != null ? selectedInstrument.hashCode() : 0);
      result = result * 37 + (summary != null ? summary.hashCode() : 0);
      result = result * 37 + (footnoteHtml != null ? footnoteHtml.hashCode() : 1);
      result = result * 37 + (instrument != null ? instrument.hashCode() : 0);
      result = result * 37 + (purchaseCookie != null ? purchaseCookie.hashCode() : 0);
      result = result * 37 + (disabledReason != null ? disabledReason.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CheckoutOptionProto> {

    public String formOfPayment;
    public String encodedAdjustedCart;
    public String instrumentId;
    public List<LineItem> item;
    public List<LineItem> subItem;
    public LineItem total;
    public List<String> footerHtml;
    public Integer instrumentFamily;
    public List<Integer> deprecatedInstrumentInapplicableReason;
    public Boolean selectedInstrument;
    public LineItem summary;
    public List<String> footnoteHtml;
    public Instrument instrument;
    public String purchaseCookie;
    public List<String> disabledReason;

    public Builder() {
    }

    public Builder(CheckoutOptionProto message) {
      super(message);
      if (message == null) return;
      this.formOfPayment = message.formOfPayment;
      this.encodedAdjustedCart = message.encodedAdjustedCart;
      this.instrumentId = message.instrumentId;
      this.item = copyOf(message.item);
      this.subItem = copyOf(message.subItem);
      this.total = message.total;
      this.footerHtml = copyOf(message.footerHtml);
      this.instrumentFamily = message.instrumentFamily;
      this.deprecatedInstrumentInapplicableReason = copyOf(message.deprecatedInstrumentInapplicableReason);
      this.selectedInstrument = message.selectedInstrument;
      this.summary = message.summary;
      this.footnoteHtml = copyOf(message.footnoteHtml);
      this.instrument = message.instrument;
      this.purchaseCookie = message.purchaseCookie;
      this.disabledReason = copyOf(message.disabledReason);
    }

    public Builder formOfPayment(String formOfPayment) {
      this.formOfPayment = formOfPayment;
      return this;
    }

    public Builder encodedAdjustedCart(String encodedAdjustedCart) {
      this.encodedAdjustedCart = encodedAdjustedCart;
      return this;
    }

    public Builder instrumentId(String instrumentId) {
      this.instrumentId = instrumentId;
      return this;
    }

    public Builder item(List<LineItem> item) {
      this.item = checkForNulls(item);
      return this;
    }

    public Builder subItem(List<LineItem> subItem) {
      this.subItem = checkForNulls(subItem);
      return this;
    }

    public Builder total(LineItem total) {
      this.total = total;
      return this;
    }

    public Builder footerHtml(List<String> footerHtml) {
      this.footerHtml = checkForNulls(footerHtml);
      return this;
    }

    public Builder instrumentFamily(Integer instrumentFamily) {
      this.instrumentFamily = instrumentFamily;
      return this;
    }

    public Builder deprecatedInstrumentInapplicableReason(List<Integer> deprecatedInstrumentInapplicableReason) {
      this.deprecatedInstrumentInapplicableReason = checkForNulls(deprecatedInstrumentInapplicableReason);
      return this;
    }

    public Builder selectedInstrument(Boolean selectedInstrument) {
      this.selectedInstrument = selectedInstrument;
      return this;
    }

    public Builder summary(LineItem summary) {
      this.summary = summary;
      return this;
    }

    public Builder footnoteHtml(List<String> footnoteHtml) {
      this.footnoteHtml = checkForNulls(footnoteHtml);
      return this;
    }

    public Builder instrument(Instrument instrument) {
      this.instrument = instrument;
      return this;
    }

    public Builder purchaseCookie(String purchaseCookie) {
      this.purchaseCookie = purchaseCookie;
      return this;
    }

    public Builder disabledReason(List<String> disabledReason) {
      this.disabledReason = checkForNulls(disabledReason);
      return this;
    }

    @Override
    public CheckoutOptionProto build() {
      return new CheckoutOptionProto(this);
    }
  }
}
