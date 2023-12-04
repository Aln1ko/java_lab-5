/*
Створити клас Лінія. Поля - координати початку і кінця.
Функції-члени обчислюють довжину лінії, переміщують її,
встановлюють і повертають значення полів.
 */
/**
 * Клас, що представляє лінію з координатами початку і кінця.
 */
public class ex15 implements ex15interface {

    private double[] startPoint;
    private double[] endPoint;

    /**
     * Конструктор для створення лінії з заданими координатами початку і кінця.
     *
     * @param startX координата X початку лінії
     * @param startY координата Y початку лінії
     * @param endX   координата X кінця лінії
     * @param endY   координата Y кінця лінії
     */
    public ex15(double startX, double startY, double endX, double endY) {
        startPoint = new double[]{startX, startY};
        endPoint = new double[]{endX, endY};
    }

    /**
     * Конструктор для створення лінії з початком у точці (0,0) та кінцем у точці (1,1).
     */
    public ex15() {
        startPoint = new double[]{0, 0};
        endPoint = new double[]{1, 1};
    }

    /**
     * Обчислює довжину лінії за допомогою формули відстані між двома точками.
     *
     * @return довжина лінії
     */
    @Override
    public double calculateLength() {
        double xDiff = endPoint[0] - startPoint[0];
        double yDiff = endPoint[1] - startPoint[1];
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    /**
     * Переміщує лінію на вказану кількість координат по осі X та Y.
     *
     * @param xOffset зміщення по осі X
     * @param yOffset зміщення по осі Y
     */
    @Override
    public void moveLine(double xOffset, double yOffset) {
        startPoint[0] += xOffset;
        startPoint[1] += yOffset;
        endPoint[0] += xOffset;
        endPoint[1] += yOffset;
    }

    /**
     * Встановлює координати початку лінії.
     *
     * @param x координата X початку лінії
     * @param y координата Y початку лінії
     */
    @Override
    public void setStartPoint(double x, double y) {
        startPoint[0] = x;
        startPoint[1] = y;
    }

    /**
     * Встановлює координати кінця лінії.
     *
     * @param x координата X кінця лінії
     * @param y координата Y кінця лінії
     */
    @Override
    public void setEndPoint(double x, double y) {
        endPoint[0] = x;
        endPoint[1] = y;
    }

    /**
     * Повертає координати початку лінії.
     *
     * @return масив з координатами X та Y початку лінії
     */
    @Override
    public double[] getStartPoint() {
        return startPoint;
    }

    /**
     * Повертає координати кінця лінії.
     *
     * @return масив з координатами X та Y кінця лінії
     */
    @Override
    public double[] getEndPoint() {
        return endPoint;
    }
}
