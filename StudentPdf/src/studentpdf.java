import java.io.File;

class Pdf {
    private File file;


    public Pdf(String filename) {
        this.file = new File(filename);
    }


    public Pdf() {
        this.file = null;
    }

    // Method to check if the file exists
    public boolean exists() {
        if (file != null) {
            return file.exists();
        } else {
            System.out.println("No file initialized.");
            return false;
        }
    }
}

 class StudentPdf {
    public static void main(String[] args) {
        // Create a Pdf object with the filename "abc.txt"
        Pdf p1 = new Pdf("abc.txt");

        // Check if the file exists and print the result
        System.out.println("File exists: " + p1.exists());

        Pdf p2 = new Pdf( );

        // Check if the file exists and print the result
        System.out.println("File exists: " + p2.exists());
    }
}
