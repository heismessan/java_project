public class Cat
{
    public Cat(String Name, int Age)
    {
        this.mName = Name;
        this.mAge = Age;
        System.out.println("Je viens de créer: " + this.mName + " qui a " + this.mAge + " ans.");
    }
    private String mName;
    private int mAge;
}