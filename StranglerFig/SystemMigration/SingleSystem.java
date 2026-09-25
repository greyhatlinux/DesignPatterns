public class SingleSystem {

    public static class LegacyOrderService implements OrderService {

        @Override 
        public void createOrder(String orderId){
            System.out.println("Created order for " + orderId + " via " + LegacyOrderService.class.getSimpleName());
        }
    }

    public static class ModernOrderService implements OrderService{

        @Override 
        public void createOrder(String orderId){
            System.out.println("Created Order for : " + orderId + " via " + ModernOrderService.class.getSimpleName());
        }
    }

    public interface OrderService {
        public void createOrder(String orderId);
    }

    public static class OrderRouter implements OrderService {
        private final OrderService legacyOrderService;
        private final OrderService modernOrderService;
        private Boolean useNewService;

        public OrderRouter(OrderService legacyOrderService, OrderService modernOrderService, Boolean useNewService){
            this.legacyOrderService = legacyOrderService;
            this.modernOrderService = modernOrderService;
            this.useNewService = useNewService;
        }

        @Override 
        public void createOrder(String orderId){
            if(this.useNewService){
                modernOrderService.createOrder(orderId);
            } else
                legacyOrderService.createOrder(orderId);
        }
    }

    public static void main(String[] args){
        LegacyOrderService legacyOrderService = new LegacyOrderService();
        ModernOrderService modernOrderService = new ModernOrderService();

        OrderRouter orderRouter = new OrderRouter(legacyOrderService, modernOrderService, false);

        String orderid1 = "order123";
        String orderid2 = "order987";

        orderRouter.createOrder(orderid1);
        orderRouter.createOrder(orderid2);

    }
}