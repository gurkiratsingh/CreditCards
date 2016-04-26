package Person;

import Wallet.Pocket;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gurkirat on 4/26/16.
 */
public class Person {

        private List<Pocket> pockets = new ArrayList<>();
        private double interest = 0;

        public Person() {}

        public Person(List<Pocket> pockets) {
            setWallet(pockets);
            calcInterest();
        }

        public void calcInterest() {
            for( Pocket pocket : pockets)
                this.interest += pocket.getInterest();
        }

        public List<Pocket> pockets() {
            return pockets;
        }

        public void setWallet(List<Pocket> pockets) {
            this.pockets = pockets;
        }

        public double getInterest() {
            return interest;
        }

        public void setInterest(double interest) {
            this.interest = interest;
        }


}
