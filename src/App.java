import java.util.Scanner;

public class App {
    
    

    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        
        
        while (option != 5)
        {
                    System.out.println("");
                    System.out.println("");
                    System.out.println("╔═══════════════  OPTIONS MENU  ════════════════╗    ");
                    System.out.println("║ 1  DOUBLE                                     ║    ");
                    System.out.println("║                                               ║    ");
                    System.out.println("║ 2  SECONDS CONVERSOR                          ║    ");
                    System.out.println("║                                               ║    ");
                    System.out.println("║ 3 FAHRENHEIT CONVERSOR                        ║    ");
                    System.out.println("║                                               ║    ");
                    System.out.println("║ 4 CYLINDER VOLUME                             ║    ");
                    System.out.println("║                                               ║    ");
                    System.out.println("║ 5 SAIR                                        ║    ");
                    System.out.println("╚═══════════════════════════════════════════════╝    ");
                    System.out.println(" ");

                    System.out.print("DIGITE UMA OPÇÃO : ");
                    option = scanner.nextInt();   
                    
                    switch(option)
                    {
                        case 1:
                            do{
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.printf("═══════════════  1 DOUBLE  ════════════════  %n%n%n");                                
                                System.out.print("Enter a number: ");
                                System.out.println("double the number is " + dobro(scanner.nextInt()));                                
                                System.out.println("Choose 1 to try again and 2 for return to menu");
                                option = scanner.nextInt();
                            }while(option != 2);

                            option = 0;
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            break;
                            
                        case 2:
                            do{
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.printf("═══════════════  2 SECONDS CONVERSOR  ════════════════  %n%n%n");
                                System.out.print("Enter a number of hours: ");
                                int hours = scanner.nextInt();
                                System.out.print("Enter a number of minuts: ");
                                int minuts = scanner.nextInt();
                                System.out.print("Enter a number of seconds: ");
                                int seconds = scanner.nextInt();
                                System.out.println("The total of seconds is " + ConvertInSeconds(hours, minuts, seconds));
                                System.out.println("Choose 1 to try again and 2 for return to menu");
                                option = scanner.nextInt();
                            }while(option != 2);

                            option = 0;
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            break;

                        case 3:
                            do
                            {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.printf("═══════════════  3 FAHRENHEIT CONVERSOR  ════════════════  %n%n%n");
                                System.out.print("Enter the temperature in celsius ");
                                double celsius = scanner.nextDouble();
                                System.out.println("The temperature in fahrenheit is " + ConvertFahrenheit(celsius));
                        
                                System.out.println("Choose 1 to try again and 2 for return to menu");
                                option = scanner.nextInt();
                            }while(option != 2);

                            option = 0;
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            break;

                            case 4:
                            do
                            {
                                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                System.out.printf("═══════════════  4 CYLINDER VOLUME  ════════════════  %n%n%n");
                                System.out.print("Enter the heith of cylinder: ");
                                double heith = scanner.nextDouble();
                                System.out.print("Enter the radius of cylinder: ");
                                double radius = scanner.nextDouble();
                                CylinderVolume(heith, radius);
                        
                                System.out.println("Choose 1 to try again and 2 for return to menu");
                                option = scanner.nextInt();
                            }while(option != 2);

                            option = 0;
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                            break;
                    }
        }

        scanner.close();
    }

        public static int dobro(int num)
        {
            return num * 2;
        }

        public static int ConvertInSeconds(int hours, int minuts, int seconds)
        {       
            return hours * 3600 + minuts * 60 + seconds;
        }

        public static double ConvertFahrenheit(double celcius)
        {
            return celcius * 1.8 + 32;
        }

        public static void CylinderVolume(double height, double radius)
        {
            System.out.printf("The volume of cilynder is %.2f%n", 3.14 * radius * height);
        }      
    
}   
