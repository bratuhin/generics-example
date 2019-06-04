package com.github.bratuhin.page;

import com.github.bratuhin.base.BaseTest;

@SuppressWarnings("unchecked")
public class CardForm<T extends CardForm> extends BaseTest<T> {

  public T enterSenderCardNumber(String senderCard) {
    System.out.println("==> enterSenderCardNumber, senderCard = " + senderCard);
    return (T) this;
  }

  public T enterReceiverCardNumber(String receiverCard) {
    System.out.println("==> enterReceiverCardNumber, receiverCard = " + receiverCard);
    return (T) this;
  }
}