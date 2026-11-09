import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {

    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "Aquarium Project");
        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(0);

        drawBackground(canvas, painter);

        drawSeaweedCluster(painter, -320);
        drawSeaweedCluster(painter, -200);
        drawSeaweedCluster(painter, 180);
        drawSeaweedCluster(painter, 280);

        drawBubbles(painter);

        drawStarfish(painter, -150, -220, 65);
        drawCrab(painter);

        drawShark(painter);
        drawTealFish(painter);
        drawOrangeFish(painter);
        drawPurpleJellyfish(painter);
    }

    // circle method
    public static void drawFilledCircle(PainterAPI painter, double radius, Color color) {
        painter.setPenColor(color);
        painter.startFill(color);
        painter.circle(radius);
        painter.finishFill();
    }

    // triangle method
    public static void drawFilledTriangle(PainterAPI painter, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
        painter.setPenColor(color);
        painter.startFill(color);
        painter.moveTo(x1, y1);
        painter.moveTo(x2, y2);
        painter.moveTo(x3, y3);
        painter.moveTo(x1, y1);
        painter.finishFill();
    }

    //backround
    public static int drawBackground(CanvasAPI canvas, PainterAPI painter) {
        canvas.setBackgroundColor(new Color(83, 134, 212));

        Color sandColor = new Color(238, 214, 175);

        painter.liftPen();
        painter.moveTo(-400, -300);
        painter.lowerPen();

        painter.setPenColor(sandColor);
        painter.startFill(sandColor);

        painter.forward(800);
        painter.turnLeft(90);
        painter.forward(150);
        painter.turnLeft(90);
        painter.forward(800);
        painter.turnLeft(90);
        painter.forward(150);
        painter.turnLeft(90);

        painter.finishFill();
        painter.liftPen();

        return 0;
    }

    // seaweed cluster
    public static void drawSeaweedCluster(PainterAPI painter, double baseX) {
        painter.setPenColor(Color.GREEN);
        painter.setPenWidth(5);

        double[] heights = {110, 160, 130};
        double[] offsets = {-8, 0, 8};

        for (int i = 0; i < 3; i++) {
            painter.liftPen();

            double x = baseX + offsets[i];

            if (baseX == -320) {
                if (i == 0) painter.moveTo(-328, -150);
                if (i == 1) painter.moveTo(-320, -150);
                if (i == 2) painter.moveTo(-312, -150);
            } else if (baseX == -200) {
                if (i == 0) painter.moveTo(-208, -150);
                if (i == 1) painter.moveTo(-200, -150);
                if (i == 2) painter.moveTo(-192, -150);
            } else if (baseX == 180) {
                if (i == 0) painter.moveTo(172, -150);
                if (i == 1) painter.moveTo(180, -150);
                if (i == 2) painter.moveTo(188, -150);
            } else if (baseX == 280) {
                if (i == 0) painter.moveTo(272, -150);
                if (i == 1) painter.moveTo(280, -150);
                if (i == 2) painter.moveTo(288, -150);
            }

            painter.lowerPen();
            painter.turnLeft(90);
            painter.forward(heights[i]);
            painter.turnRight(90);
        }

        painter.liftPen();
        painter.setPenWidth(1);
    }

    // bubbles
    public static void drawBubbles(PainterAPI painter) {

        // bubbles teal fish
        painter.liftPen();
        painter.moveTo(-257, 155);
        painter.lowerPen();
        drawFilledCircle(painter, 5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-254, 173);
        painter.lowerPen();
        drawFilledCircle(painter, 4.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-256, 191);
        painter.lowerPen();
        drawFilledCircle(painter, 4, Color.WHITE);

        // bubbles shark
        painter.liftPen();
        painter.moveTo(-60, 160);
        painter.lowerPen();
        drawFilledCircle(painter, 5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-61, 178);
        painter.lowerPen();
        drawFilledCircle(painter, 4.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-59, 196);
        painter.lowerPen();
        drawFilledCircle(painter, 4, Color.WHITE);

        // bubbles orange fish
        painter.liftPen();
        painter.moveTo(107, 35);
        painter.lowerPen();
        drawFilledCircle(painter, 5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(106, 53);
        painter.lowerPen();
        drawFilledCircle(painter, 4.5, Color.WHITE);

        // bubbles crab
        painter.liftPen();
        painter.moveTo(200, -190);
        painter.lowerPen();
        drawFilledCircle(painter, 5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(204, -172);
        painter.lowerPen();
        drawFilledCircle(painter, 4.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(208, -154);
        painter.lowerPen();
        drawFilledCircle(painter, 4, Color.WHITE);

        painter.liftPen();
    }

    // fish teal
    public static void drawTealFish(PainterAPI painter) {
        Color teal = new Color(41, 128, 171);

        // back circle
        painter.liftPen();
        painter.moveTo(-295, 130);
        painter.lowerPen();
        drawFilledCircle(painter, 12, teal);

        // main circle
        painter.liftPen();
        painter.moveTo(-280, 130);
        painter.lowerPen();
        drawFilledCircle(painter, 16, teal);

        // eye
        painter.liftPen();
        painter.moveTo(-273, 150);
        painter.lowerPen();
        drawFilledCircle(painter, 2.5, Color.BLACK);

        // :)
        painter.liftPen();
        painter.moveTo(-271, 140);
        painter.lowerPen();
        painter.setPenColor(Color.BLACK);
        painter.moveTo(-269, 138);
        painter.moveTo(-267, 140);

        painter.liftPen();
    }

    // fish orange
    public static void drawOrangeFish(PainterAPI painter) {
        // back circle
        painter.liftPen();
        painter.moveTo(160, 10);
        painter.lowerPen();
        drawFilledCircle(painter, 18, Color.ORANGE);

        // main circle
        painter.liftPen();
        painter.moveTo(140, 10);
        painter.lowerPen();
        drawFilledCircle(painter, 24, Color.ORANGE);

        // eye
        painter.liftPen();
        painter.moveTo(130, 40);
        painter.lowerPen();
        drawFilledCircle(painter, 3, Color.BLACK);

        // :)
        painter.liftPen();
        painter.moveTo(128, 23);
        painter.lowerPen();
        painter.setPenColor(Color.BLACK);
        painter.moveTo(126, 21);
        painter.moveTo(124, 23);

        painter.liftPen();
    }

    //shark teeth
    public static void drawSharkTeeth(PainterAPI painter) {
        for (int i = 0; i < 5; i++) {
            int x = -47 + (i * 5);
            drawFilledTriangle(painter, x, 145, x + 4, 145, x + 2, 138, Color.WHITE);
        }
    }

    // shark
    public static void drawShark(PainterAPI painter) {
        Color gray = Color.GRAY;

        // back fin
        painter.liftPen();
        drawFilledTriangle(painter, 50, 140, 85, 168, 85, 112, gray);

        // top fin
        painter.liftPen();
        drawFilledTriangle(painter, -15, 165, 5, 205, 25, 163, gray);

        // bottom fin
        painter.liftPen();
        drawFilledTriangle(painter, -10, 130, 8, 103, 30, 133, gray);

        // butt circle
        painter.liftPen();
        painter.moveTo(50, 130);
        painter.lowerPen();
        drawFilledCircle(painter, 17, gray);

        // middle circle
        painter.liftPen();
        painter.moveTo(25, 125);
        painter.lowerPen();
        drawFilledCircle(painter, 24, gray);

        // head circle
        painter.liftPen();
        painter.moveTo(-20, 120);
        painter.lowerPen();
        drawFilledCircle(painter, 32, gray);
        painter.liftPen();

        // sharp teeth
        drawSharkTeeth(painter);

        // eye
        painter.liftPen();
        painter.moveTo(-35, 155);
        painter.lowerPen();
        drawFilledCircle(painter, 3, Color.BLACK);

        // eyebrow
        painter.liftPen();
        painter.moveTo(-41, 165);
        painter.lowerPen();
        painter.setPenColor(Color.BLACK);
        painter.setPenWidth(3);
        painter.moveTo(-30, 160);

        painter.liftPen();
        painter.setPenWidth(1);
    }

    // jelllyfish
    public static void drawPurpleJellyfish(PainterAPI painter) {
        Color purple = new Color(70, 6, 107);

        // Tentacles
        painter.setPenColor(purple);
        painter.setPenWidth(2);

        painter.liftPen();
        painter.moveTo(-133, 10);
        painter.lowerPen();
        painter.moveTo(-133, -15);

        painter.liftPen();
        painter.moveTo(-127, 10);
        painter.lowerPen();
        painter.moveTo(-127, -15);

        painter.liftPen();
        painter.moveTo(-120, 10);
        painter.lowerPen();
        painter.moveTo(-120, -15);

        painter.liftPen();
        painter.moveTo(-113, 10);
        painter.lowerPen();
        painter.moveTo(-113, -15);

        painter.liftPen();
        painter.moveTo(-107, 10);
        painter.lowerPen();
        painter.moveTo(-107, -15);

        // circle body
        painter.liftPen();
        painter.moveTo(-120, 15);
        painter.lowerPen();
        drawFilledCircle(painter, 22, purple);

        // white dots
        painter.liftPen();
        painter.moveTo(-133, 12);
        painter.lowerPen();
        drawFilledCircle(painter, 2.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-125, 9);
        painter.lowerPen();
        drawFilledCircle(painter, 2.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-115, 9);
        painter.lowerPen();
        drawFilledCircle(painter, 2.5, Color.WHITE);

        painter.liftPen();
        painter.moveTo(-107, 12);
        painter.lowerPen();
        drawFilledCircle(painter, 2.5, Color.WHITE);

        painter.liftPen();
        painter.setPenWidth(1);
    }

    // starfish
    public static void drawStarfish(PainterAPI painter, int xPosition, int yPosition, double size) {
        painter.liftPen();

        if (size == 65) {
            painter.moveTo(-150, -220);
        } else {
            painter.moveTo(-80, -240);
        }

        painter.lowerPen();

        Color pink = new Color(219, 15, 219);
        painter.setPenColor(pink);
        painter.startFill(pink);

        for (int i = 0; i < 5; i++) {
            painter.forward(size);
            painter.turnRight(144);
        }

        painter.finishFill();
        painter.liftPen();
    }

    // crab
    public static void drawCrab(PainterAPI painter) {
        Color red = Color.RED;

        painter.setPenColor(red);
        painter.setPenWidth(2);

        // left legs
        painter.liftPen();
        painter.moveTo(192, -206);
        painter.lowerPen();
        painter.moveTo(178, -198);

        painter.liftPen();
        painter.moveTo(192, -208);
        painter.lowerPen();
        painter.moveTo(178, -222);

        // right legs
        painter.liftPen();
        painter.moveTo(208, -206);
        painter.lowerPen();
        painter.moveTo(222, -198);

        painter.liftPen();
        painter.moveTo(208, -208);
        painter.lowerPen();
        painter.moveTo(222, -222);

        // circle body
        painter.liftPen();
        painter.moveTo(200, -210);
        painter.lowerPen();
        drawFilledCircle(painter, 16, red);

        // eyes
        painter.liftPen();
        painter.moveTo(195, -188);
        painter.lowerPen();
        drawFilledCircle(painter, 2, Color.BLACK);

        painter.liftPen();
        painter.moveTo(205, -188);
        painter.lowerPen();
        drawFilledCircle(painter, 2, Color.BLACK);
    }
}