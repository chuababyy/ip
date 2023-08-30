public class ToDos extends Task {
    public ToDos(String description) {
        super(description);
    }

    public ToDos(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String toFileString() {
        return "T" + super.toFileString();
    }

    @Override
    public String toString() {
        return "[T] " + super.toString();
    }
}
