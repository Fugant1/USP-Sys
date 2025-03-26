import Manager.DataManager;

public class DataStorage {
    public static void main(String[] args) {
        DataManager dm = new DataManager();
        dm.add_student("Rogerio", "rogerio@usp.br", "icmc", 1, 5);
        dm.add_professor("Cleber", "cleber@usp.br", "icmc", 0, true);

        dm.list_professors_per_institute("icmc");
    }
}