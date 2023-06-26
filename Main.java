public class Main {
    public static void main(String[] args){
       /*ToyQueue toyQueue = new ToyQueue("1 2 Конструктор", "2 2 Робот", "3 6 Кукла");
        toyQueue.addToQueue(new Toy(4, "машина", 4));
        toyQueue.addToQueue(new Toy(5, "мячик", 5));

        toyQueue.getAndWriteToFile(10, "output.txt"); */
        ToyQueue q = new ToyQueue();
        boolean flag = true;
        while (flag) {
            String inputData = InOut.Input("Войти:\n" +
                    "add - Добавить игрушку в магазин\n" +
                    "get - Розыгрыш\n" +
                    "shop - Показать ассортимент\n" +
                    "exit - Выход\n" + ": ");
            System.out.println();
            inputData.toLowerCase();
            switch (inputData){
                case "add":
                q.AddToy(new Toy(InOut.Input("Введите название игрушки и вероятность: ")));
                break;
                case "get":
                q.GetResult(Integer.parseInt(InOut.Input("Введите количество попыток: ")));
                System.out.println(q.resultToString());
                InOut.Save("result.txt", q.resultToString());
                break;
                case "shop":
                q.ShowToys();
                break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("неверная команда! ");
                    break;
            }
            System.out.println();
        }
    }
}
