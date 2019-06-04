package card;

import com.github.bratuhin.base.BaseTest;
import com.github.bratuhin.page.p2pPage;
import org.junit.Test;

import java.math.BigDecimal;

public class P2PCardTest {

  private Object driver = new Object();
  private String senderCard = "1111111111111";
  private String receiverCard = "222222222222";
  private double amount = 100.00;
  private BigDecimal comissionPercent = BigDecimal.ONE;
  private BigDecimal comissionFixed = BigDecimal.ZERO;

  @Test
  public void pLimits() {
    p2pPage<p2pPage> p2pPage = new p2pPage<>(driver);
    p2pPage.gotoP2P();
    p2pPage.enterSenderCardNumber(senderCard);
    p2pPage.enterReceiverCardNumber(receiverCard);
    p2pPage.enterAmount(BigDecimal.valueOf(amount));
    p2pPage.verifyAmountField();
  }

  @Test
  public void pComissions() {
    p2pPage<p2pPage> p2pPage = new p2pPage<>(driver);
    p2pPage.gotoP2P()
            .enterSenderCardNumber(senderCard)
            .enterReceiverCardNumber(receiverCard)
//            .enterAmount(BigDecimal.valueOf(amount))
//            .verifyComission(amount, comissionPercent, comissionFixed)
            ;
  }

  @Test
  public void zasada(){
    BaseTest<p2pPage> p2pPage = new p2pPage<>(driver);
//    p2pPage.gotoP2P();
//    p2pPage.enterSenderCardNumber(senderCard);
  }

}
