package co.pragra.learning.firstspringproject.pojo;

public class QuoteGenerator {
    private String name;
    private Insure insure;
    private String postalCode;

    public QuoteGenerator(String name, Insure insure) {
        this.name = name;
        this.insure = insure;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }
    public void printQuote(){
        String format = "Dear %s, your insurance quote is %.2f, Thank you for using insurance.";
        System.out.println(String.format(format, name, insure.getQuote(0, postalCode)));

    }
}
