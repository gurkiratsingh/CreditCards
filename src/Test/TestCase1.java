package Test;

import CardInformation.CreditCards;
import CardInformation.Discover;
import CardInformation.MasterCard;
import CardInformation.Visa;
import Person.Person;
import Wallet.Pocket;
import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gurkirat on 4/26/16.
 */
public class TestCase1 {

    private List<CreditCards> creditCards = Arrays.asList(new MasterCard(100),new Visa(100),new Discover(100));
    private List<Pocket> pocketWithAllTheCards = Arrays.asList(new Pocket(creditCards));
    private Person person = new Person(pocketWithAllTheCards);

    @Test
    public void personWithOneWalletAndThreeCreditCards(){
        Assert.assertEquals(16.0, person.getInterest());
    }
    @Test
    public void personWithMasterCard(){
        Assert.assertEquals(5.0, creditCards.get(0).getInterest());
    }
    @Test
    public void personWithVisaCard(){
        Assert.assertEquals(10.0, creditCards.get(1).getInterest());
    }
    @Test
    public void personWithDiscoverCard(){
        Assert.assertEquals(1.0, creditCards.get(2).getInterest());
    }

}
