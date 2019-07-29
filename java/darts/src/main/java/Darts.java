class Darts {
    double x, y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double r = Math.pow(x, 2) + Math.pow(y, 2);
        if (r > 100)
            return 0;
        else if (r > 25)
            return 1;
        else if (r > 1)
            return 5;
        else
            return 10;
    }

}
