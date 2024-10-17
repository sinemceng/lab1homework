public class CardTest {
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards= new DeckOfCards();
        myDeckOfCards.shuffle(); //oluşturulan desteyi karıştırır.

        for(int i=1; i<=52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if(i%4==0){ //bu satır he dört karttan sonra bir satır atlamak için kullanılır
                System.out.println();
            }
        }
    }
}