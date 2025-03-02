

import java.util.*;
class Orders{
    private int orderId;
    private String orderName;
    private int noOfProduct;
    private List<String> productNames;
    private List<Integer> quantities;


    // const
    public Orders(int orderId,String orderName,int noOfProduct,List<String> productNames ,List<Integer> quantities){
        this.orderId = orderId;
        this.orderName = orderName;
        this.noOfProduct = noOfProduct;
        this.productNames = productNames;
        this.quantities = quantities;

    }

    // getter
    public int getorderId(){
        return orderId;
    }
    public String getOrderName(){
        return orderName;
    }
    public int getNoofpro(){
        return noOfProduct;
    }
    public List<String> getProductName(){
        return productNames;
    }
    public List<Integer> getquantities(){
        return quantities;
    }
}

class OrderServices{
    private List<Orders> ordersList;

    // cosntructor
    public OrderServices(List<Orders> ordersList){
        this.ordersList = ordersList;
    }

    public String findmax(int serachId){
        for(int i =0;i<ordersList.size();i++){
         if(ordersList.get(i).getorderId()==serachId){
           List<String> products = ordersList.get(i).getProductName();
           List<Integer> quantities = ordersList.get(i).getquantities();

           if(products.isEmpty()){
            System.out.println("orderid not found");
            return null;
           }
        //    int maxIndex =0;
        //    for(int j =1;j<quantities.size();j++){
        //     if(quantities.get(j)>quantities.get(maxIndex)){
        //         maxIndex = j;
        //     }
        //    }
        int max =0;
        int maxIndex =0;
        for(int j =0;j<quantities.size();j++){
           if(quantities.get(j)>max){
            max = quantities.get(j);
            maxIndex = j;
           }
        }
        return products.get(maxIndex);
         }
        }
        System.out.println("order id not found");
        return null;
    }
}

public class Mock {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        List<Orders> ordersList  = new ArrayList<>();
        for(int i =0;i<size;i++){
            int orderId = sc.nextInt();
            sc.nextLine();
             String orderName = sc.nextLine();
             int noOfProduct = sc.nextInt();
             sc.nextLine();

             List<String> productNames = new ArrayList<>();
             List<Integer> quantities = new ArrayList<>();

             for(int j =0;j<noOfProduct;j++){
                productNames.add(sc.nextLine());
                quantities.add(sc.nextInt());
                sc.nextLine();
             }
             ordersList.add(new Orders(orderId,orderName,noOfProduct,productNames,quantities));
            
        }
        OrderServices service = new OrderServices(ordersList);
        int serachId = sc.nextInt();
        sc.nextLine();
       String maxPr =  service.findmax(serachId);
       if(maxPr!=null){
        System.out.println(maxPr);
       }
       sc.close();
     }
}
