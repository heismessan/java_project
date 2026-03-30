public class App 
{
    public static void main(String[] args)
    {
        int option = 16;
        // if(value == 24 || value == 16)
        //     System.out.println(value + " est la vraie valeur");

        Switch(option)
        {
            case 12:
                System.out.println("c'est 12");
                break;
            case 16: 
                System.out.println("c'est 16");
                break;
            default: 
            System.out.println("non trouvé");
        }
    }
}