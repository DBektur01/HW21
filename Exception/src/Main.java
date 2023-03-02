import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    Кайсы форманын аянтын жана көлөмүн эсептегиңиз келет?
                    1-Parallelepiped 
                    2-Cylinder""");
            try {
                int num = scanner.nextInt();

                if (num == 1) {
                    System.out.print("Параллелепипедтин узундугун (double) жазыныз: ");
                    double length = scanner.nextDouble();
                    System.out.print("Параллелепипедтин туурасын (double)  жазыныз: ");
                    double width = scanner.nextDouble();
                    System.out.print("Параллелепипедтин бийиктигин (double)  жазыныз: ");
                    double height = scanner.nextDouble();
                    if (length < 0 || width < 0 || height < 0 || length > 20 || width > 20 || height > 20) {
                        throw new RuntimeException("");
                    }
                    for (int i = 'a'; i < 'z'; i++) {
                        if (length == i || width == i || height == i) {
                            throw new InputMismatchException("err ");
                        }
                    }
                    Parallelepiped p = new Parallelepiped(length, width, height);
                    System.out.println("Параллелепипедтин аянты: " + p.calculateArea());
                    System.out.println("Параллелепипедтин көлөмү: " + p.calculateVolume());
                }
                if (num == 2) {
                    System.out.print("Цилиндрдин бийиктигин (double) жазыныз: ");
                    double height = scanner.nextDouble();
                    System.out.print("Цилиндрдин радиусун (double) жазыныз: ");
                    double radius = scanner.nextDouble();
                    if (radius < 0 || height < 0 || radius > 20 || height > 20) {
                        throw new RuntimeException(" ");
                    }
                    for (int i = 'a'; i < 'z'; i++) {
                        if (radius == i || height == i) {
                            throw new InputMismatchException(" ");
                        }
                    }
                    Cylinder c = new Cylinder(height, radius);
                    System.out.println("Цилиндрдин аянты: " + c.calculateArea());
                    System.out.println("Цилиндрдин көлөмү: " + c.calculateVolume());
                    throw new InputMismatchException();
                }
            }
            catch (InputMismatchException e) {
                System.out.println("""
                        ------------------------------------------------
                        Сан жазыныз
                        """);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + """
                        ------------------------------------------------
                        Параллелепипедтин узундугу, туурасы жана бийиктиги 0-дон чон жана 20-дан кичине сан болушу керек
                                """);
            }
      }
}
