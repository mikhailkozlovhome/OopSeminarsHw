package Classes;

public class PromotionClient extends Actor {
    private String promotionName;
    private int idPromoCl;
    private static int numberOfPart;

    public PromotionClient(String name, Integer id, String promoName) {
        super(name);
        this.idPromoCl = id;
        this.promotionName = promoName;
        numberOfPart++;
        this.name = this.name + " " + numberOfPart;
    }

    @Override
    public String getName() {
        return super.name;
    }


    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }


    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }


    public void setTakeOrder(boolean takeOder) {
        super.isTakeOrder = takeOder;
    }


    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public Actor getActor() {
        return this;
    }

    public void returnOrder() {
        System.out.println(this.name + " клиент вернул товар");
    }

    public boolean isReturnable() {
        return false;
    }
}
