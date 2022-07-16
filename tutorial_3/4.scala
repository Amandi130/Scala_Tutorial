object scala_4{
    def price_of_cover(quantity:Int):Double=24.95*quantity;
    def discount(quantity:Int):Double=price_of_cover(quantity)*0.4;
    def shipping_cost(quantity:Int):Double=(3*50)+(0.75*(quantity-50));
    def cost(quantity:Int):Double=price_of_cover(quantity)-discount(quantity)+shipping_cost(quantity);

    def main(arg:Array[String]):Unit={
        print(cost(60));
    }
}