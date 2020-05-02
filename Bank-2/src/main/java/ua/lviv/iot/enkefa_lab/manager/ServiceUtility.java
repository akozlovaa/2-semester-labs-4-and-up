package main.java.ua.lviv.iot.enkefa_lab.manager;

import java.util.Comparator;
import java.util.List;
import main.java.ua.lviv.iot.enkefa_lab.model.Service;
import main.java.ua.lviv.iot.enkefa_lab.model.SortType;

public class ServiceUtility {

  private static final ServiceSortByInterestRate SERVICE_SORTER_BY_INTEREST_RATE = 
      new ServiceSortByInterestRate();

  private static final ServiceSortByDuration SERVICE_SORTER_BY_DURATION = 
      new ServiceUtility().new ServiceSortByDuration();

  //sortServicesByInterestRate
  public static void sortServicesByInterestRate(List<Service> services, SortType sortType) {
    services.sort(sortType == SortType.ASCENDING ? SERVICE_SORTER_BY_INTEREST_RATE 
        : SERVICE_SORTER_BY_INTEREST_RATE.reversed());
  }


  /**
   * sortServicesByDuration.
   * @param services services
   * @param sortType sortType
   */
  public static void sortServicesByDuration(List<Service> services, SortType sortType) {
    services.sort(
        sortType == SortType.ASCENDING ? SERVICE_SORTER_BY_DURATION 
        : SERVICE_SORTER_BY_DURATION.reversed());
  }

  //sortServiceByInterestRate
  public static void sortServiceByInterestRate(List<Service> services, SortType sortType) {
    Comparator<Service> comparator = Comparator.comparing(Service::getInterestRate);
    services.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  /**
   * serviceSortByDurationAndInterestRate.
   * @param services services
   * @param sortType sortType
   */
  public static void serviceSortByDurationAndInterestRate(List<Service> services, 
      SortType sortType) {
	  //anon
    Comparator<Service> comparator = new Comparator<Service>() {
      @Override
      public int compare(Service serviceOne, Service serviceTwo) {
        double interestRateComparisonResult = serviceOne.getInterestRate() 
            - serviceTwo.getInterestRate();
        if (interestRateComparisonResult == 0) {
          return (int) (interestRateComparisonResult);
        }
        return serviceOne.getDuration().compareTo(serviceTwo.getDuration());
      }
    };
    services.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  /**
   * serviceSortByInterestRateLambdaStyle.
   * @param services services
   * @param sortType sortType
   */
  public static void serviceSortByInterestRateLambdaStyle(List<Service> services, 
      SortType sortType) {
    Comparator<Service> comparator = (serviceOne, serviceTwo) -> serviceOne.getInterestRate()
        - serviceTwo.getInterestRate();
    services.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  static class ServiceSortByInterestRate implements Comparator<Service> {
    @Override
    public int compare(Service serviceOne, Service serviceTwo) {
      return (int) (serviceOne.getInterestRate() - serviceTwo.getInterestRate());
    }
  }

  class ServiceSortByDuration implements Comparator<Service> {
    @Override
    public int compare(Service serviceOne, Service serviceTwo) {
      return serviceOne.getDuration().compareTo(serviceTwo.getDuration());
    }
  }

}
