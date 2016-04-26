package CardInformation;

/**
 * Created by gurkirat on 4/26/16.
 */
public class MasterCard implements CreditCards {

        private static final double RATE_OF_INTEREST = 0.05;
        private double accountBalance;
        private double interest;


        public MasterCard(double balance) {
            setAccountBalance(balance);
            setInterest();
        }

        @Override
        public double getInterestRate() {
            return RATE_OF_INTEREST;
        }
        @Override
        public double getInterest() {
            return interest;
        }
        @Override
        public void setInterest() {
            this.interest = accountBalance * RATE_OF_INTEREST;
        }
        public double getAccountBalance() {
            return accountBalance;
        }
        public void setAccountBalance(double accountBalance) {
            this.accountBalance = accountBalance;
        }

    }
