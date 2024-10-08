package lesson_02_inner_class;

public class Letter {
    private String sender;
    public Letter(String sender) {
        this.sender = sender;
    }
    public String toString() {
        return "Letter [sender="+ sender +"]";
    }
    public class Address {
        private int postCode;

        public String getLetterSender() {
            return sender;
        }
        public Address (int postCode) {
            this.postCode = postCode;
        }

        @Override
        public String toString() {
            return "Address [postcode= " + postCode +"]" + Letter.this.toString();
        }
    }
}
