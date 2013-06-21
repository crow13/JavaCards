import java.lang.String;

public class Main {
    public static void main(String[] args) {
        deck Spade = new deck();
        System.out.println("Deck Made");
        System.out.println(Spade.Deck[0].suit + " " + Spade.Deck[0].number);
    }
}

class deck{
    public card Deck[] = new card[52];

    public deck(){
        String[] suitOptions = {"Diamond","Club","Heart","Spade"};
        String[] numberOptions = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int cardCount = 0;
        for(int i=0; i<suitOptions.length;i++){
            for(int x = 0; x<numberOptions.length; x++){
                Deck[cardCount] = new card(suitOptions[i],numberOptions[x]);
                cardCount++;
            }
        }

    }
}

class card{
    public String suit;
    public String number;

    public card(String inputSuit, String inputNumber){
        suit = inputSuit;
        number = inputNumber;
    }

    public card() {
        String[] suitOptions = {"Diamond","Club","Heart","Spade"};
        String[] numberOptions = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        int randomSuit = 1 + (int)(Math.random()*(suitOptions.length - 1));
        int randomNumber = 1 + (int)(Math.random()*(numberOptions.length - 1));
        suit = suitOptions[randomSuit];
        number = numberOptions[randomNumber];
    }
}