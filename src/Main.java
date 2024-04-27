//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int account = 100; // начальный счет миль
        int ticket = 5_000; // стоимость авиабилета
        int miles = ticket / 20; // расчет миль 1/20
        int total = account + miles;

        System.out.println("Счет: " + account);
        System.out.println("Сумма покупки: " + ticket);
        System.out.println("Начислено миль: " + miles);
        System.out.println("Текущий счет: " + total);


    }
}