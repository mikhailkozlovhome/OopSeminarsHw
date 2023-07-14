import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;
import Classes.PromotionClient;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident", 1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay", 1111);
        iActorBehaviuor tax = new TaxService();

        iActorBehaviuor promoCl1 = new PromotionClient("promoCl1", 2001, "Promo1");
        iActorBehaviuor promoCl2 = new PromotionClient("promoCl2", 2002, "Promo1");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.acceptToMarket(promoCl1);
        magnit.acceptToMarket(promoCl2);

        magnit.update();

        iReturnOrder OrdClient = new OrdinaryClient("Sergey");
        iReturnOrder PromoClient = new PromotionClient("promoCl3", 2003, "Promo1");

        if (OrdClient.isReturnable()) {
            OrdClient.returnOrder();
        } else {
            System.out.println("Клиент " + OrdClient.getActor().getName() + " не может делать возврат!");
        }

        if (PromoClient.isReturnable()) {
            PromoClient.returnOrder();
        } else {
            System.out.println("Клиент " + PromoClient.getActor().getName() + " не может делать возврат!");
        }

    }
}
