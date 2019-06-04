package com.github.bratuhin.page;

import java.math.BigDecimal;

@SuppressWarnings("unchecked")
public class p2pPage<T extends p2pPage> extends CardForm<T> {

  public p2pPage(Object webdriver) {
    System.out.println("типа передали сюда драйвер");
  }

  public T gotoP2P(){
    System.out.println("==> gotoP2P. Что-то тут делаем ещё, сначала принял его за void тип");
    return (T) this;
  }

  public T enterAmount(BigDecimal amount){
    System.out.println("==> enterAmount, amount = " + amount.toString());
    return (T) this;
  }

  public void verifyAmountField(){
    System.out.println("==> verifyAmountField, похоже что тут void, но в принципе все равно");
  }

  public void verifyComission(BigDecimal amount, BigDecimal comissionPercent, BigDecimal comissionFixed){
    System.out.println("==> verifyComission, amount = " + amount + ", comissionPercent = " + comissionPercent + ", comissionFixed = " + comissionFixed);
  }

}
