package sub1;

public class GenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("�ѱ�", 3000);
		Banana b = new Banana("�븸", 2000);
		
		FruitBox<Apple> appleBox = new FruitBox<>();
		appleBox.setFruit(a);
		
		FruitBox<Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(b);
	}

}
