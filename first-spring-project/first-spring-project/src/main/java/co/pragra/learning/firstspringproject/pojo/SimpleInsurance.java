package co.pragra.learning.firstspringproject.pojo;

public class SimpleInsurance implements Insure{
    @Override
    public double getQuote(int age, String postalCode) {
        switch(postalCode){
            case "L6Y": return 2000;
        }
        return 1500;
    }
    public void initialization(){
        System.out.println("*************** BEAN IS GETTING INITIALIZED *****************");
    }
    public void destroy(){
        System.out.println("*************** BEAN IS GETTING DESTROYED *****************");
    }
}
