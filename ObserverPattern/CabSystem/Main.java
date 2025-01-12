public class Main {
    public static void main(String[] args){
        BluSmart blueCab = new BluSmart("BlueCab");
        Ola olaCab = new Ola("OlaCab");

        GOI goi = new GOI("Govt of India");

        goi.addSubscribers(blueCab);
        goi.addSubscribers(olaCab);

        for(int i=0; i<6;i++){
            goi.changeStats("HSR-"+i, (double)20*i+12);
            if(i==4){
                goi.removeSubscribers(olaCab);
            }
        }
    }

}
