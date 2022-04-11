public class Serv {
    public static void main(String[] args) {
        ServiceCenter c = new ServiceCenter("АП-СЕРВИС",
                "Остаповский пр 6 стр 1", "Porsche Cayman",
                "Диагностика подкапотного пространства", "10.04");
        c.setDateout("22.04");
        c.setResultname("Замкна ремня ГРМ и шкива колечатого вала.");
        c.setSurnamepers("Асафьев С.А.");
        c.setCost("53451");
        System.out.println(c);
    }
}
