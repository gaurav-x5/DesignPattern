// Image Interface - Defines the operations used by the Client
public interface Image {

    // Image Border Functionality
    boolean getBorder();
    void setBorder(boolean border);

    // Image Location Functionality
    double[] getLocation();
    void setLocation(double x, double y);

    // Image Display Functionality
    void display();
}
