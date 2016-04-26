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
public class TestCase2 {


        private List<CreditCards> creditCards = Arrays.asList(new Visa(100), new Discover(100));
        private List<CreditCards> creditCards1 = Arrays.asList(new MasterCard(100));
        private List<Pocket> doubleWallet = Arrays.asList(new Pocket(creditCards), new Pocket(creditCards1) );
        private Person person = new Person(doubleWallet);

        @Test
        public void totalInterestOfAPersonWithTwoWallet() {
            Assert.assertEquals(16.0, person.getInterest());
        }

        @Test
        public void totalInterestOfAPersonOnWalletOne() {
            Assert.assertEquals(11.0, doubleWallet.get(0).getInterest());
        }
         @Test
        public void totalInterestOfAPersonOnSecondWallet() {
             Assert.assertEquals(5.0, doubleWallet.get(1).getInterest());
    }


}
