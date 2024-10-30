import java.awt.*;

public class BlueBall extends Ball {
    private boolean lastIntersect = false;

    public BlueBall(int xSpeed, int ySpeed, int ballSize) {
        super(Color.BLUE, xSpeed, ySpeed, ballSize);
    }

    @Override
    public void notify(char keyChar) {
        setXSpeed(-1 * getXSpeed());
        setYSpeed(-1 * getYSpeed());
    }

    @Override
    public void checkIntersect(Ball b) {
        boolean intersect = this.isIntersect(b);
        if (intersect) {
            this.setVisible(true);
            if (!lastIntersect) {
                setXSpeed(-1 * getXSpeed());
                setYSpeed(-1 * getYSpeed());
            }
        } else {
            this.setVisible(false);
        }
        lastIntersect = intersect;
    }
}
