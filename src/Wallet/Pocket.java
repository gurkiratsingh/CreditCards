package Wallet;

import CardInformation.CreditCards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gurkirat on 4/22/16.
 */
public class Pocket {
    private List<CreditCards> creditCards = new ArrayList<>();
    private double interest = 0;
    private Pocket(){}

    public Pocket(List<CreditCards> creditCards){
    setCreditCards(creditCards);
        calculateInterest();
    }

    public void calculateInterest(){
        for(CreditCards cards : creditCards)
            this.interest += cards.getInterest();
    }

    public List<CreditCards> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCards> creditCards) {
        this.creditCards = creditCards;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }


}