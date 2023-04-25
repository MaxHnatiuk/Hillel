import java.util.*;

public class FigureSorter {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        FigureArgumentReader argumentReader = new FigureArgumentReader();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the type of figure (triangle, circle, isosceles triangle, quadrilateral): ");
            String figureType = scanner.nextLine().toLowerCase();

            Map<String, Double> arguments = argumentReader.readArguments(figureType);

            if (arguments == null) {
                System.out.println("Invalid figure type. Please try again.");
                continue;
            }

            Figure figure;
            figure = FigureFactory.createFigure(figureType, arguments);
            figures.add(figure);

            System.out.print("Do you want to add another figure? (yes/no): ");
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("no")) {
                break;
            }
        }

        Collections.sort(figures, new FigureAreaComparator().thenComparing(new FigurePerimeterComparator()));

        System.out.println("============= Figure list: ===============");
        for (int i = 0; i < figures.size(); i++) {
            System.out.println((i + 1) + ". " + figures.get(i).toString());
        }
    }
}
