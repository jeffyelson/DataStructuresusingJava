public class TriangleProgram {
    public static void main(String[] args) {
        // The code below shows how to create an image and fill it with color.
        // Replace the code with the algorithm from the task description.
        int width = 1000;
        int height = 1000;
        PNGImage image = new PNGImage(width, height);
        Point point0 = new Point(0, 0);
        Point point1 = new Point(width - 1, 0);
        Point point2 = new Point(width / 2, height - 1);
        Point point3 = new Point(width / 2, height / 2);
        int count = 0, n = 0;
        int rand;
        Point p;
        while (n < 1000050) {
            rand = (int) Math.floor(Math.random() * 3);
            if (rand == 0) {
                p = point0;
            } else if (rand == 1) {
                p = point1;
            } else p = point2;
            Line line = new Line(p, point3);
            point3 = line.getCenterPoint();
            //image.draw_pixel_at(point3);

            count++;
        }


        // ToDo: add your code

    }
}
