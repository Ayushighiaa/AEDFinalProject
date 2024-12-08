package model;

/**
 * Represents a workshop entry in the system.
 */
public class Workshop {
    private int id;
    private String title;
    private String date;
    private String coordinator;

    /**
     * Constructor for Workshop.
     *
     * @param id          The unique ID of the workshop.
     * @param title       The title of the workshop.
     * @param date        The date of the workshop.
     * @param coordinator The name of the workshop coordinator.
     */
    public Workshop(int id, String title, String date, String coordinator) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.coordinator = coordinator;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(String coordinator) {
        this.coordinator = coordinator;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", coordinator='" + coordinator + '\'' +
                '}';
    }
}
