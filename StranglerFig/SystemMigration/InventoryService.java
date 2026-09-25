public class InventoryService {

    public static class LegacyInventoryService implements InventoryServiceInterface{
        @Override
        public void pushInventory(String id){
            System.out.println("Pushing inventory for " + id + " via : " + LegacyInventoryService.class.getSimpleName());
        }
    }

    public static class ModernInventoryService implements InventoryServiceInterface {
        @Override
        public void pushInventory(String id) {
            System.out.println("Push inventory for " + id + " via : "+ ModernInventoryService.class.getSimpleName());
        }
    }

    public interface InventoryServiceInterface {
        public void pushInventory(String id);
    }

    public static class InventoryRouter {

        private InventoryServiceInterface legacyInventoryService;
        private InventoryServiceInterface modernInventoryService;
        Boolean useNewService;

        public InventoryRouter (InventoryServiceInterface legacyInventoryService, InventoryServiceInterface modernInventoryService, boolean useNewService){
            this.legacyInventoryService = legacyInventoryService;
            this.modernInventoryService = modernInventoryService;
            this.useNewService = useNewService;
        }

        public void pushInventory(String id) {
            if(useNewService){
                modernInventoryService.pushInventory(id);
            } else 
                legacyInventoryService.pushInventory(id);
        }
    }

    public static void main(String[] args){
        LegacyInventoryService inventoryService = new LegacyInventoryService();
        // inventoryService.pushInventory();

        ModernInventoryService modernInventoryService = new ModernInventoryService();

        InventoryRouter inventoryRouter = new InventoryRouter(inventoryService, modernInventoryService, false);

        String inventory1 = "inventory1";
        String inventory2 = "inventory2";

        inventoryRouter.pushInventory(inventory1);
        inventoryRouter.pushInventory(inventory2);
    }

}

