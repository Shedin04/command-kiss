package command;

public class Runner {
    public static void main(String[] args) {
        Database database = new Database();

        Developer dev1 = new Developer(new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database));

        dev1.insertData();
        dev1.updateData();
        dev1.selectData();
        dev1.deleteData();
    }
}
