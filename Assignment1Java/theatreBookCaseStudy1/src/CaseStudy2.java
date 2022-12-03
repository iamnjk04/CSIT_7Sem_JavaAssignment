public class CaseStudy2 {
    public static void main (String [] args)
    {
        String Golden, Silver,ticket="Golden";
        int price=0,num=2;
        if(ticket=="Golden")
        {
            System.out.println("John and Paul bought Golden ticket.");
            price=num*200;
        }
        else if( ticket =="Silver")
        {
            System.out.println("John and Paul bought Silver ticket.");
            price = num*150;
        }
        System.out.println("The amount is "+ price);
    }
}
