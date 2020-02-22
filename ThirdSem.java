package CSE;

public class ThirdSem  {
    void methodDefault(){
        System.out.println("Inside Default Method");
    }
    private void methodPrivate(){
        System.out.println("Inside private method");
    }
    protected void methodProtected(){
        System.out.println("Inside Protected Method");
    }
    public void WelcomeMsg(){
        System.out.println("Inside public method \n Welcome to CSE-DEPT 3rd Sem young budding Engineers");
    }

    public static void main(String[] args){
        System.out.println("Section:Same Class");

        ThirdSem thirdSem = new ThirdSem();

        thirdSem.methodDefault();
        thirdSem.methodPrivate();
        thirdSem.methodProtected();
        thirdSem.WelcomeMsg();
    }
}

class IseDept extends ThirdSem{
    public static void main(String[] args){
        System.out.println("Section:Same Package Sub-Class");
        IseDept iseDept = new IseDept();

        iseDept.AccessSpecifiersChecking();
    }


    public void AccessSpecifiersChecking(){
        super.methodDefault();
        this.methodDefault();
//        super.methodPrivate();
        super.methodProtected();
        this.methodProtected();
        super.WelcomeMsg();
        this.WelcomeMsg();
    }


    @Override
    void methodDefault(){
        System.out.println("Inside Overridden Default method.");
    }


    @Override
    protected void methodProtected(){
        System.out.println("Inside Overridden protected method.");
    }


    @Override
    public void WelcomeMsg(){

        System.out.println("Inside Overridden public method.");
    }



}

class EceDept {
    public static void main(String[] args){
        System.out.println("Section:Same Package Non-Sub-Class");
        ThirdSem thirdSem = new ThirdSem();
        thirdSem.methodDefault();
//        thirdSem.methodPrivate();
        thirdSem.methodProtected();
        thirdSem.WelcomeMsg();
    }

}
