package test.java.ua.lviv.iot.enkefa_lab.manager;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.java.ua.lviv.iot.enkefa_lab.manager.ServiceUtility;
import main.java.ua.lviv.iot.enkefa_lab.model.Duration;
import main.java.ua.lviv.iot.enkefa_lab.model.SortType;
import org.junit.jupiter.api.Test;

class ServiceManagerUtilityTest extends ServiceManagerTest {

  @Test
  public void testSortServiceByDuration() {
//    createServices(); fix before each
    ServiceUtility.sortServicesByDuration(deposits, SortType.ASCENDING);
    assertEquals(Duration.MEDIUM, deposits.get(0).getDuration());
    assertEquals(Duration.LONG, deposits.get(1).getDuration());
  }

  @Test
  public void testSortServicesByInterestRate() {
//    createServices();
    ServiceUtility.sortServicesByInterestRate(credits, SortType.ASCENDING);
    assertEquals(2, credits.get(0).getInterestRate());
    assertEquals(3, credits.get(1).getInterestRate());
  }

  @Test
  public void testSortServiceByInterestRate() {
//    createServices();
    ServiceUtility.sortServiceByInterestRate(deposits, SortType.ASCENDING);
    assertEquals(5, deposits.get(0).getInterestRate());
    assertEquals(10, deposits.get(1).getInterestRate());
  }

  @Test
  public void testServiceSortByDurationAndInterestRate() {
//    createServices();
    ServiceUtility.serviceSortByDurationAndInterestRate(deposits, SortType.ASCENDING);
    assertEquals(Duration.MEDIUM, deposits.get(0).getDuration());
    assertEquals(Duration.LONG, deposits.get(1).getDuration());
    assertEquals(5, deposits.get(0).getInterestRate());
    assertEquals(10, deposits.get(1).getInterestRate());
  }

  @Test
  public void testServiceSortByInterestRateLambdaStyle() {
    ServiceUtility.serviceSortByInterestRateLambdaStyle(credits, SortType.ASCENDING);
    assertEquals(2, credits.get(0).getInterestRate());
    assertEquals(3, credits.get(1).getInterestRate());
  }

}
4,