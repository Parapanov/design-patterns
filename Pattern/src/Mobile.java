public class Mobile implements Observer{
    @Override
    public void update(Stock stock) {
        System.out.println("MOBILE - The Price of "+stock.getSockName()+" has changed:"+stock.getStockPrice());
    }
    }
