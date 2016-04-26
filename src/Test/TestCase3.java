package Test;

import CardInformation.CreditCards;
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
public class TestCase3 {

    private List<CreditCards> creditCards = Arrays.asList(new Visa(100), new MasterCard(100));
    private List<CreditCards> creditCards1 = Arrays.asList(new MasterCard(100), new Visa(100));
    private List<Pocket> wallet = Arrays.asList(new Pocket(creditCards) );
    private List<Pocket> wallet1 = Arrays.asList(new Pocket(creditCards) );
    private Person person = new Person(wallet);
    private Person person1 = new Person(wallet1);

    @Test
    public void rateOfInterestOnWalletOnVisaAndMasterCard() {
        Assert.assertEquals(15.0, person.getInterest());
    }
    @Test
    public void rateOfInterestOnWalletMasterCardAndVisa() {
        Assert.assertEquals(15.0, person1.getInterest());
    }@Test
    public void rateOfInterestOnWalletMasterCardAndVisaPerWalletOne() {
        Assert.assertEquals(15.0, wallet.get(0).getInterest());
    }@Test
    public void rateOfInterestOnWalletMasterCardAndVisaPerWalletTwo() {
        Assert.assertEquals(15.0, wallet.get(0).getInterest());
    }
}
