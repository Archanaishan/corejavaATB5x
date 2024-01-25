package src.jan23.customexception;

public class Bank {

    private String Currency;
    private Integer Amount;

    public Bank(String currency, Integer amount) {
       this.Currency = currency;
        this.Amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        this.Currency = currency;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer amount) {
        this.Amount = amount;
    }

public Integer add(Bank bname)throws CustomException
{
    if(!bname.Currency.equalsIgnoreCase("INR"))
    {
        throw new CustomException("USD to INR not Supported");
    }
        Integer sum=this.Amount+bname.Amount;
        return sum;
}


}
