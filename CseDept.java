package com.company.RVCE;

import com.company.CSE.ThirdSem;

public class CseDept extends ThirdSem {


    public static void main(String[] args) {
        System.out.println("Section:Different Package sub-class");

        CseDept cseDept = new CseDept();
        cseDept.AccessSpecifiersChecking();
    }

    public void AccessSpecifiersChecking(){
//        super.methodDefault();
//        super.methodPrivate();
        super.WelcomeMsg();
        this.WelcomeMsg();
        super.methodProtected();
        this.methodProtected();
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
