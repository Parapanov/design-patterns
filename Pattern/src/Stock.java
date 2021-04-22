import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Stock {
    private List<Observer> observerList;

    public Stock(){
        observerList = new ArrayList<Observer>();
    }

    private  String name;
    private  int price;

    public String getSockName(){
    return name;
    }

    public void registerObserver(Observer observer){
        if(observer != null){
            this.observerList.add(observer);
        }
    }

    public void notifyObservers(){
        Iterator<Observer> it = observerList.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(this);
        }
    }

    public void removeObserver(Observer observer) {
        if(observer != null){
            this.observerList.remove(observer);
        }
    }
    public int getStockPrice(){
        return price;
    }
    public void updateStockPrice(int updatedPrice){
        this.price = updatedPrice;
        this.notifyObservers();
    }
    public void setName(String stockName){
        this.name = stockName;
    }
}
