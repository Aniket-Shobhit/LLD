import ObserverPattern.Observer.NotificationAlertObserver;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observable.IPhoneObservableImpl;


public class App {
    public static void main(String args[]) {
        StocksObservable iPhoneStockObservable = new IPhoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("abc1", iPhoneStockObservable);


        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStockCount(10);
        // iPhoneStockObservable.setStockCount(-10);
        // iPhoneStockObservable.setStockCount(100);

    }
}
