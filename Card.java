public class Card {
        private String name;
        private String lastname;

        private int numbers;

        private int cvc;

        public Card(String name, String lastname, int numbers, int cvc){
            this.name = name;
            this.lastname = lastname;
            this.numbers = numbers;
            this.cvc = cvc;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }
        public String getNumbers(){

            return null;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
            System.out.println(" name " + name + " lastname " + lastname + " numbers " + numbers + " cvc " + cvc);
        }
    }


