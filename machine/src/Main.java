



class Drinkmachine {
    int drink;
    private int won;
    
    
    
    public Drinkmachine(int drink1) {
        drink = drink1;
        won = 0;
    }

    public void inwon(int amount) {
        won += amount;
        System.out.println(amount + "원을 넣엇습니다 남은 금액: " + won + "원");
    }

    public void displaywon() {
        System.out.println("현재 잔액: " + won + "원");
    }

    public void purchase(String item, int price) {
        if (drink <= 0) {
            System.out.println("상품이 없습니다.");
            return;
        }

        if (won >= price) {
            System.out.println(item + " 구매 완료");
            won -= price;
            drink--;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public void showitem() {
        System.out.println("남은 상품 수: " + drink);
    }
    
}
//드링크머신에서 드링크머신2로 상속해줌
class Drinkmachine2 extends Drinkmachine {
    public Drinkmachine2(int drink1) {  
        super(drink1); 
    }

}

public class Main {
    public static void main(String[] args) {
        Drinkmachine2 Drinkmachine = new Drinkmachine2(5);

        Drinkmachine.inwon(1000);  //1000원을 투입
        Drinkmachine.displaywon(); // 디스플레이에 남은 금액 표시
        Drinkmachine.showitem(); //남은 상품 수 
        Drinkmachine.purchase("콜라",1000);
    }
}
