import java.security.SecureRandom;
public class DeckOfCards {
    private static final SecureRandom randomNumbers= new SecureRandom();
    //burda java.security paketi içe aktarılır
    //"SecureRandom" kriptografik olarak güvenli rastegele sayı üretmek için kullanılır
    private static final int NUMBER_OF_CARDS=52;  //kart sayısı değişmediğinden final değişkeni kullanılmıştır
    private Card[] deck= new Card[NUMBER_OF_CARDS];//burda bir dize oluşturularak parametre olarak card sayısı verilmiştir yani dizinin uzunluğıu da kart sayısı kadar olmuştur.
    private int currenCard=0;
    //bu satır kart dağıtımı sırasında hangi kartın dağıtılacağını izlemek için bir sayaç gibi kullanılacaktır.

    public DeckOfCards(){
        String[] faces= {"ace","deuce","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
        String[] suits= {"hearts","diamonds","clubs","spades"};

        for (int count =0; count< deck.length; count++){
            deck[count]=new Card(faces[count%13], suits[count/13]);
        }/*bu döngü DeckOfCards nesnesinin oluşturulması sırasında tüm kartları oluşturur
        ve deck dizisine yerleştirir*/
    }
    public void shuffle(){  //bu metot desteyi kariştırmak için kullnaılır.
        currenCard=0; //kartların sıfırdan başlayarak dağıtılacağını belirtir
        for (int first= 0 ; first< deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            //üstteki satır randomNumbers nesnesinin nextInt aracılığıyla 0 ile "NUMBERSOFCADS-1" araında rastgele bir tamsayı elde eder

            Card temp= deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Card dealCard(){  //bu metot desteden bir kar çekmek için kullanılır
        if(currenCard<deck.length){
            return deck[currenCard++];
        }else{
            return null;
        }
    }

}
