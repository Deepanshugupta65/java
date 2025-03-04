

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
    public List<Orders> serachfororder(String productnameSearch) {
        List<Orders> resultOrder = new ArrayList<>();
        for(int i =0;i<ordersList.size();i++){
            List<String> products = ordersList.get(i).getProductName();
            for(int j =0;j<products.size();j++){
                if(products.get(j).equalsIgnoreCase(productnameSearch)){
                    resultOrder.add(ordersList.get(i));
                    break;
                }
            }
        }
        if(resultOrder.isEmpty()){
            // throw new productnotfoundexception("not found id");
            System.out.println("not foind");
        }
        return resultOrder;
    }
  
}

// class productnotfoundexception extends Exception{
//     public productnotfoundexception (String message){
//         super(message);
//     }
// }
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
        String productnameSearch = sc.nextLine();
        sc.close();
       String maxPr =  service.findmax(serachId);
       if(maxPr!=null){
        System.out.println(maxPr);
       }
    //    try {
           List<Orders>ans = service.serachfororder(productnameSearch);
          for(int i =0;i<ans.size();i++){
            System.out.println(ans.get(i).getorderId());
            System.out.println(ans.get(i).getOrderName());
        //   }
    //    } catch (productnotfoundexception e) {
    //     // TODO: handle exception
    //     System.out.println(e.getMessage());
    //    }
      
     }
}
}
