package ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObserverPattern.Observer.NotificationAlertObserver;

public class IPhoneObservableImpl implements StocksObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    
    private int stockCount = 0; 
    
    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    public void setStockCount(int newStockAdded) {
        // this will send a notification that a particular product is available now
        if(stockCount == 0) {
            notifySubscribers();
        }
        this.stockCount += newStockAdded;
    }

    public int getStockCount() {
        return stockCount;
    }

}
