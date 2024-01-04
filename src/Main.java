import models.Order;
import models.Tshirt;




public class Main {
    public static void main(String[] args) {

        // Tshirt class ma naya 3 object haru define garera order nam deko

        Tshirt order1 = new Tshirt("Gorkhali Batman","123",1200,"thulo","You either die hero or live long enough to see yourself as a villan",new String[]{"XL","L","M"});
        Tshirt order2 = new Tshirt("Nepal Classic","123",1300,"kappa","I love Nepal",new String[]{"XL","L","M"});
        Tshirt order3 = new Tshirt("Gautam Buddha","123",1400,"lew","Nothing is permanent",new String[]{"XL","L","M"});
// order bhanne class m a naya 3 object define garera customer haru lekheko
        Order customer1=new Order("Aadrsha",123423424,new int[]{12,33,42},new int[]{1200,1300,1000});
        Order customer2=new Order("Ram",123423423,new int[]{10,30,43},new int[]{1200,1350,1800});
        Order customer3=new Order("Sam",1234234,new int[]{12,34,45},new int[]{1230,1350,1400});

        order1.displayInformation(); // object haru call gareko
        customer1.displayTotal();
        order2.displayInformation();
        customer2.displayTotal();
        order3.displayInformation();
        customer3.displayTotal();



    }

}
