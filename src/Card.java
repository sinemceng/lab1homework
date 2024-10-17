public class Card {
    private final String face; /*final anahtar kelimesi bu değişkenlerin
                                  bir kez başlatıldıktan sonra değiştirilemeyeciğini belirtir*/
    private final String suit;

    public Card(String cardFace, String cardSuit){
        this.face=cardFace;
        this.suit=cardSuit;
    }
    public String toString(){
        return face+ " of "+ suit;  //toString ile iki değer birleştirilip geriye döner.
    }
    /*bir nesne dizeye dönüştürüldüğünde otomatik olarak toString metodu çağrılır*/
    //bu methodun amacı bir kartın dize temsilini oluşturmaktır.
    //yani burda kartın yüzü ve türünü içeren bir dizeye döndürme vardır

}
