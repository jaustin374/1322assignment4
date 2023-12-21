public abstract class Media {
    private String fileName;
    private int id;
    private static int nextId = 1;

    public Media() {
        id = nextId;
        nextId ++;
    }

    public Media(String f) {
        fileName = f;
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }
}
