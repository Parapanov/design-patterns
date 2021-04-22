public class DisplayBoard implements  Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("DISPLAYBOARD - The Price of "+stock.getSockName()+" has changed:"+stock.getStockPrice());
    }
}
