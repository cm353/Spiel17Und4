package com.example.spiel17und4

enum class FrenchCards(val cardVal: Int, val color: String, val cardName: String) {

    NULLCARD(0,FrenchCardColor.NONE.color, ""),
    HEARTTWO(2, FrenchCardColor.HEART.color, "Two"),
    HEARTTHREE(3, FrenchCardColor.HEART.color, "Three"),
    HEARTFOUR(4, FrenchCardColor.HEART.color, "Four"),
    HEARTFIVE(5, FrenchCardColor.HEART.color, "Five"),
    HEARTSIX(6, FrenchCardColor.HEART.color, "Six"),
    HEARTSEVEN(7, FrenchCardColor.HEART.color, "Seven"),
    HEARTEIGHT(8, FrenchCardColor.HEART.color, "Eight"),
    HEARTNINE(9, FrenchCardColor.HEART.color, "Nine"),
    HEARTTEN(10, FrenchCardColor.HEART.color, "Ten"),
    HEARTJACK(10, FrenchCardColor.HEART.color, "Jack"),
    HEARTLADY(10, FrenchCardColor.HEART.color, "Lady"),
    HEARTKING(10, FrenchCardColor.HEART.color, "King"),
    HEARTASS(11, FrenchCardColor.HEART.color, "Ass"),
    TILESTWO(2, FrenchCardColor.TILES.color, "Two"),
    TILESTHREE(3, FrenchCardColor.TILES.color, "Three"),
    TILESFOUR(4, FrenchCardColor.TILES.color, "Four"),
    TILESFIVE(5, FrenchCardColor.TILES.color, "Five"),
    TILESSIX(6, FrenchCardColor.TILES.color, "Six"),
    TILESSEVEN(7, FrenchCardColor.TILES.color, "Seven"),
    TILESEIGHT(8, FrenchCardColor.TILES.color, "Eight"),
    TILESNINE(9, FrenchCardColor.TILES.color, "Nine"),
    TILESTEN(10, FrenchCardColor.TILES.color, "Ten"),
    TILESJACK(10, FrenchCardColor.TILES.color, "Jack"),
    TILESLADY(10, FrenchCardColor.TILES.color, "Lady"),
    TILESKING(10, FrenchCardColor.TILES.color, "King"),
    TILESASS(11, FrenchCardColor.TILES.color, "Ass"),
    CLOVERSTWO(2, FrenchCardColor.CLOVERS.color, "Two"),
    CLOVERSTHREE(3, FrenchCardColor.CLOVERS.color, "Three"),
    CLOVERSFOUR(4, FrenchCardColor.CLOVERS.color, "Four"),
    CLOVERSFIVE(5, FrenchCardColor.CLOVERS.color, "Five"),
    CLOVERSSIX(6, FrenchCardColor.CLOVERS.color, "Six"),
    CLOVERSSEVEN(7, FrenchCardColor.CLOVERS.color, "Seven"),
    CLOVERSEIGHT(8, FrenchCardColor.CLOVERS.color, "Eight"),
    CLOVERSNINE(9, FrenchCardColor.CLOVERS.color, "Nine"),
    CLOVERSTEN(10, FrenchCardColor.CLOVERS.color, "Ten"),
    CLOVERSJACK(10, FrenchCardColor.CLOVERS.color, "Jack"),
    CLOVERSLADY(10, FrenchCardColor.CLOVERS.color, "Lady"),
    CLOVERSKING(10, FrenchCardColor.CLOVERS.color, "King"),
    CLOVERSASS(11, FrenchCardColor.CLOVERS.color, "Ass"),
    PIKESTWO(2, FrenchCardColor.PIKES.color, "Two"),
    PIKESTHREE(3, FrenchCardColor.PIKES.color, "Three"),
    PIKESFOUR(4, FrenchCardColor.PIKES.color, "Four"),
    PIKESFIVE(5, FrenchCardColor.PIKES.color, "Five"),
    PIKESSIX(6, FrenchCardColor.PIKES.color, "Six"),
    PIKESSEVEN(7, FrenchCardColor.PIKES.color, "Seven"),
    PIKESEIGHT(8, FrenchCardColor.PIKES.color, "Eight"),
    PIKESNINE(9, FrenchCardColor.PIKES.color, "Nine"),
    PIKESTEN(10, FrenchCardColor.PIKES.color, "Ten"),
    PIKESJACK(10, FrenchCardColor.PIKES.color, "Jack"),
    PIKESLADY(10, FrenchCardColor.PIKES.color, "Lady"),
    PIKESKING(10, FrenchCardColor.PIKES.color, "King"),
    PIKESASS(11, FrenchCardColor.PIKES.color, "Ass");

    override fun toString(): String {
        return super.toString() + " {Cardname: $cardName, Cardvalue: $cardVal, Color: $color}"
    }

companion object {
    fun arrayOfCards(): Array<FrenchCards> {
       val list : ArrayList<FrenchCards> = ArrayList()
        for (frenchcard in FrenchCards.values()){
            list.add(frenchcard)
        }
        return list.toTypedArray()
        }
    }
}

enum class FrenchCardColor(val color:String) {
    HEART("Heart"),
    TILES("Tiles"),
    CLOVERS("Clovers"),
    PIKES("Pikes"),
    NONE("");
}

