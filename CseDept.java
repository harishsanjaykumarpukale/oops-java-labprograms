package RVCE;

import CSE.ThirdSem;

public class CseDept extends ThirdSem {


    public static void main(String[] args) {
        System.out.println("Section:Different Package Sub-class");

        CseDept cseDept = new CseDept();
        cseDept.AccessSpecifiersChecking();
    }

    public void AccessSpecifiersChecking(){
//        super.methodDefault();
//        super.methodPrivate();
        super.methodProtected();
        this.methodProtected();
        super.WelcomeMsg();
        this.WelcomeMsg();
    }


    @Override
    public void WelcomeMsg(){

        System.out.println("Inside Overridden public method.");
    }


    @Override
    protected void methodProtected(){
        System.out.println("Inside Overridden protected method.");
    }

}

class AseDept {
    public static void main(String[] args) {
        System.out.println("Section:Different Package Non-Sub-class");

        ThirdSem thirdSem = new ThirdSem();
        thirdSem.WelcomeMsg();
    }


}
