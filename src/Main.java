public class Main {
    public static void main(String[] args) {


        int initialAccount = 100; // начальный счет клиента
        int refillAmount = 1200; // сумма пополнения
        int bonus = refillAmount / 100; // количество начисленных бонусов

        if (refillAmount > 1000) {
            System.out.println("На Вашем счету " + (initialAccount + refillAmount + bonus) + " рублей , количество бонусов " + bonus);

        } else {

            System.out.println("На Вашем счету " + (initialAccount + refillAmount) + " рублей , количество бонусов 0 ");
        }
    }
}
